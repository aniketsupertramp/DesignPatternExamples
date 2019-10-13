package aniket.creational.abstractFactory;

public class ConcreteProductFactory1 extends AbstractProductFactory {

    @Override
    AbstractProductA getProductA() {
        return new ConcreteProductA1();
    }

    @Override
    AbstractProductB getProductB() {
        return new ConcreteProductB1();
    }
}
