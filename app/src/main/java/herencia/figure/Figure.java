package herencia.figure;

public class Figure {
    private String name;
    private String colour;

    public Figure(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public double calculateArea() {
        return 0;
    }

    public void selfDescribe() {
        System.out.println(this.name + " " + this.colour);
        System.out.println("Area: " + calculateArea());
    }

}
