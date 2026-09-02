package herencia.vehicle;

public class Motorcycle extends Vehicle {
    private int cylinderCapacity;

    public Motorcycle(String brand, String model, int maxSpeed, int cylinderCapacity) {
        super(brand, model, maxSpeed);
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public void selfDescribe() {
        super.selfDescribe();
        System.out.println(this.cylinderCapacity);
    }

}
