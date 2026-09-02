package herencia.animal;

import java.util.ArrayList;
import java.util.List;
import herencia.animal.exception.InvalidAgeException;
import herencia.animal.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 5: Simulador de Zoologico ===");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 5));
        animals.add(new Penguin("Pingu", 3));
        animals.add(new Eagle("Aquila", 4));

        Zoo zoo = new Zoo();
        System.out.println("Animales voladores:");
        zoo.showFlyingAnimals(animals);

        System.out.println("\nPrueba de excepcion por edad negativa:");
        try {
            new Lion("Scar", -1);
        } catch (InvalidAgeException e) {
            System.out.println("Capturada excepcion correctamente: " + e.getMessage());
        }
    }
}
