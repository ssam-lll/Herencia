package herencia.figure;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String name, String colour, int sideA, int sideB) {
        super(name, colour);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }
}
