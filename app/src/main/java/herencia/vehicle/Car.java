package herencia.vehicle;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int maxSpeed, int doors) {
        super(brand, model, maxSpeed);
        this.doors = doors;
    }

    @Override
    public void selfDescribe() {
        super.selfDescribe();
        System.out.println(this.doors);
    }

}
