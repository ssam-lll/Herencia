package herencia.vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private double maxSpeed;

    public Vehicle(String brand, String model, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void selfDescribe() {
        System.out.println(this.brand + " " + this.model + " " + this.maxSpeed);
    }

}
