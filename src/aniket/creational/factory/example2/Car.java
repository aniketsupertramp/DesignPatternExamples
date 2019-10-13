package aniket.creational.factory.example2;

public class Car implements Vehicle {

    static {
        VehicleFactory.getFactoryObj().registerVehicle("car", new Car());
    }

    @Override
    public void drive() {
        System.out.println("card driving");
    }
}
