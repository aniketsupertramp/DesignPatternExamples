package aniket.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Prototype prototypeA = PrototypeFactory.getPrototype("a");
        Prototype prototypeB = PrototypeFactory.getPrototype("b");
        prototypeA.printName();
        prototypeB.printName();
    }
}
