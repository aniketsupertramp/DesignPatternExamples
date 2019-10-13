package aniket.creational.factory.example2;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static VehicleFactory vehicleFactoryObj;
    private Map<String, Vehicle> vehicleMap;

    private VehicleFactory() {
        vehicleMap = new HashMap<>();
    }

    public static VehicleFactory getFactoryObj() {
        if (vehicleFactoryObj == null) {
            vehicleFactoryObj = new VehicleFactory();
        }
        return vehicleFactoryObj;
    }

    public void registerVehicle(String type, Vehicle vehicle) {
        vehicleMap.put(type, vehicle);
    }

    public Vehicle getVehicle(String vehicleType) {
        return vehicleMap.get(vehicleType);
    }
}
