package herencia.animal;

import herencia.animal.exception.InvalidAgeException;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (age < 0) {
            throw new InvalidAgeException("Edad inválida: " + age);
        }
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;

    }

    public int getAge(){
        return this.age;

    }

    public void makeSound() {
        
    }
}
