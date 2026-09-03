package herencia.figure;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle("Rectangulo", "Rojo", 4, 6);
        Figure circle = new Circle("Circulo", "Azul", 3.0);

        rectangle.selfDescribe();
        System.out.println();
        circle.selfDescribe();
    }
}
