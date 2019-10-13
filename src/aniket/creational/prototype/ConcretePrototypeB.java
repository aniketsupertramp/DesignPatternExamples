package aniket.creational.prototype;

public class ConcretePrototypeB implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototypeB();
    }

    @Override
    public void printName() {
        System.out.println("ConcretePrototypeB");
    }
}
