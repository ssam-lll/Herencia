package herencia.vehicle.inventory;

import java.util.List;

import herencia.vehicle.Vehicle;

public class Dealership {
    public void inventoryReport(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.selfDescribe();
        }

    }

}
