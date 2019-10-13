package aniket.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private Long expirationTime;

    private Hashtable<T, Long> lockedResource, unlockedResource;

    public ObjectPool() {
        expirationTime = 1500l;
        lockedResource = new Hashtable<>();
        unlockedResource = new Hashtable<>();
    }

    abstract T create();

    abstract boolean validate(T obj);

    abstract void destroy(T obj);

    public synchronized T getObject() {
        long now = System.currentTimeMillis();
        T obj;
        if (unlockedResource.size() > 0) { // if has any unlocked resource
            Enumeration<T> enumeration = unlockedResource.keys();
            while (enumeration.hasMoreElements()) {
                obj = enumeration.nextElement();
                if (now - unlockedResource.get(obj) > expirationTime) { // if unlockedResource is expired
                    unlockedResource.remove(obj); //remove the object from unlockedResource
                    destroy(obj); // close the connection
                    obj = null;
                } else {
                    if (validate(obj)) { // if connection is still open
                        unlockedResource.remove(obj);
                        lockedResource.put(obj, now); //add to locked resource and return the same obj for use
                        return obj;
                    } else {
                        unlockedResource.remove(obj);
                        destroy(obj);
                        obj = null;
                    }
                }
            }
        }
        obj = create();
        return obj;
    }

    public synchronized void release(T obj) {
        lockedResource.remove(obj);
        unlockedResource.put(obj, System.currentTimeMillis());
    }
}
