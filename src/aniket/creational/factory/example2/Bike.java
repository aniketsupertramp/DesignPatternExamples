package aniket.creational.factory.example2;

public class Bike implements Vehicle {

    static {
        VehicleFactory.getFactoryObj().registerVehicle("bike", new Car());
    }

    @Override
    public void drive() {
        System.out.println("bike driving");
    }
}
