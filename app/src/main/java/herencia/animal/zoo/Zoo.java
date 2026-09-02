package herencia.animal.zoo;

import java.util.List;

import herencia.animal.Animal;
import herencia.animal.Flyable;

public class Zoo {
    public void showFlyingAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
        }
    }
}
