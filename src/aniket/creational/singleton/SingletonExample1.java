package aniket.creational.singleton;

public class SingletonExample1 {

    private static SingletonExample1 sgObject;

    private SingletonExample1() {

    }

    public static synchronized SingletonExample1 getInstance() {
        if (sgObject == null) {
            sgObject = new SingletonExample1();
        }
        return sgObject;
    }
}
