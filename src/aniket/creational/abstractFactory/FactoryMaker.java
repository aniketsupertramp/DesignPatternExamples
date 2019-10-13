package aniket.creational.abstractFactory;

public class FactoryMaker {
    private static AbstractProductFactory abstractProductFactory;

    private FactoryMaker() {

    }

    public static AbstractProductFactory getProductFactory(String type) {
        switch (type.toLowerCase()) {
            case "1":
                abstractProductFactory = new ConcreteProductFactory1();
                break;
            case "2":
                abstractProductFactory = new ConcreteProductFactory2();
                break;
            default:
                throw new IllegalArgumentException("Invalid Product type Specified");
        }
        return abstractProductFactory;
    }
}
