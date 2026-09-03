package herencia.animal;

public class Eagle extends Animal implements Flyable {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("hola aguila");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " volando");
    }
}
