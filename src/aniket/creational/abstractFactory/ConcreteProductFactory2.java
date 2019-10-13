package aniket.creational.abstractFactory;

public class ConcreteProductFactory2 extends AbstractProductFactory {
    @Override
    AbstractProductA getProductA() {
        return new ConcreteProductA2();
    }

    @Override
    AbstractProductB getProductB() {
        return new ConcreteProductB2();
    }
}
