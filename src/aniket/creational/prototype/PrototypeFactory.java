package aniket.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static PrototypeFactory prototypeFactory;
    private static final Map<String, Prototype> prototypeMap = new HashMap<>();

    static {
        prototypeMap.put("a", new ConcretePrototypeA());
        prototypeMap.put("b", new ConcretePrototypeB());
    }

    private PrototypeFactory() {

    }

    // basically , contrary to singleton pattern,in prototype pattern an object is created each time clone  method is invoked
    public static Prototype getPrototype(String type) {
        if (prototypeMap.containsKey(type.toLowerCase())) {
            return prototypeMap.get(type).clone();
        }
        return null;
    }
}
