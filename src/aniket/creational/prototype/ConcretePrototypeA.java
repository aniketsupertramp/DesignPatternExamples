package aniket.creational.prototype;

public class ConcretePrototypeA implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototypeA();
    }

    @Override
    public void printName() {
        System.out.println("ConcretePrototypeA");
    }
}
