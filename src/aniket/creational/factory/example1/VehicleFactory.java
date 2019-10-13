package aniket.creational.factory.example1;

public class VehicleFactory {
    private static VehicleFactory vehicleFactoryObj;

    private VehicleFactory() {

    }

    public static VehicleFactory getFactoryObj() {
        if (vehicleFactoryObj == null) {
            vehicleFactoryObj = new VehicleFactory();
        }
        return vehicleFactoryObj;
    }

    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "vehicle":
                return new Bike();
            default:
                throw new IllegalArgumentException("Invalid Vehicle type Specified");
        }
    }
}
