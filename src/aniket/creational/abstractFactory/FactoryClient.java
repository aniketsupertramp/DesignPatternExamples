package aniket.creational.abstractFactory;

public class FactoryClient {
    public static void main(String[] args) {
        AbstractProductFactory pf = FactoryMaker.getProductFactory("1");
        AbstractProductA productA = pf.getProductA();
        AbstractProductB productB = pf.getProductB();
    }
}
