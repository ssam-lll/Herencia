package herencia.vehicle;

import java.util.ArrayList;
import java.util.List;
import herencia.vehicle.inventory.Dealership;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Corolla", 180, 4));
        vehicles.add(new Motorcycle("Yamaha", "MT-07", 200, 689));

        Dealership dealership = new Dealership();
        dealership.inventoryReport(vehicles);
    }
}
