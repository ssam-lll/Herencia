package herencia.figure;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle("Rectangulo A", "Rojo", 4, 6);
        Figure circle = new Circle("Circulo B", "Azul", 3.0);

        System.out.println("=== Ejercicio 1: Figuras Geometricas ===");
        rectangle.selfDescribe();
        System.out.println();
        circle.selfDescribe();
    }
}
