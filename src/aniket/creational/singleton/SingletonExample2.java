package aniket.creational.singleton;

public class SingletonExample2 {

    // “volatile” tells the compiler that the value of a variable must never be cached
    // so that two threads run on different processors won't have their own local copy in cache
    private volatile static SingletonExample2 sgObject;

    private SingletonExample2() {

    }

    public static SingletonExample2 getInstance() {
        if (sgObject == null) {
            synchronized (SingletonExample2.class) {

            }
            if (sgObject == null) {
                sgObject = new SingletonExample2();
            }
        }
        return sgObject;
    }

}
