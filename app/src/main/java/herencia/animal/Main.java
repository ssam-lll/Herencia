package herencia.animal;

import java.util.ArrayList;
import java.util.List;
import herencia.animal.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("leon", 5));
        animals.add(new Penguin("pinguino", 3));
        animals.add(new Eagle("aguila", 4));

        Zoo zoo = new Zoo();
        zoo.showFlyingAnimals(animals);

    }
}
