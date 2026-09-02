package herencia.figure;

public class Circle extends Figure {
    private double radio;

    public Circle(String name, String colour, double radio) {
        super(name, colour);
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radio, 2);
    }

}
