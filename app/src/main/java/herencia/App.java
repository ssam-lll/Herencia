package herencia;

import java.util.ArrayList;
import java.util.List;

// Ejercicio 1
import herencia.figure.Circle;
import herencia.figure.Figure;
import herencia.figure.Rectangle;

// Ejercicio 2
import herencia.employee.Employee;
import herencia.employee.FullTimeEmployee;
import herencia.employee.HourlyEmployee;
import herencia.employee.payroll.PayrollGenerator;

// Ejercicio 3
import herencia.vehicle.Car;
import herencia.vehicle.Motorcycle;
import herencia.vehicle.Vehicle;
import herencia.vehicle.inventory.Dealership;

// Ejercicio 4
import herencia.account.BankAccount;
import herencia.account.CheckingAccount;
import herencia.account.PremiumSavingsAccount;
import herencia.account.SavingsAccount;
import herencia.account.transaction.Bank;

// Ejercicio 5
import herencia.animal.Animal;
import herencia.animal.Eagle;
import herencia.animal.Lion;
import herencia.animal.Penguin;
import herencia.animal.exception.InvalidAgeException;
import herencia.animal.zoo.Zoo;

public class App {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       EJERCICIO 1: FIGURAS GEOMETRICAS           ");
        System.out.println("==================================================");
        Figure rectangle = new Rectangle("Rectangulo A", "Rojo", 4, 6);
        Figure circle = new Circle("Circulo B", "Azul", 3.0);
        
        rectangle.selfDescribe();
        System.out.println();
        circle.selfDescribe();

        System.out.println("\n==================================================");
        System.out.println("       EJERCICIO 2: NOMINA DE EMPLEADOS           ");
        System.out.println("==================================================");
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Carlos", 2500.0));
        employees.add(new HourlyEmployee("Ana", 20.0, 80));

        PayrollGenerator payrollGen = new PayrollGenerator();
        double totalPayroll = payrollGen.calculatePayroll(employees);
        System.out.println("Total a pagar en nomina: $" + totalPayroll);

        System.out.println("\n==================================================");
        System.out.println("       EJERCICIO 3: VEHICULOS DE CONCESIONARIA    ");
        System.out.println("==================================================");
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Corolla", 180, 4));
        vehicles.add(new Motorcycle("Yamaha", "MT-07", 200, 689));

        Dealership dealership = new Dealership();
        dealership.inventoryReport(vehicles);

        System.out.println("\n==================================================");
        System.out.println("       EJERCICIO 4: SISTEMA BANCARIO              ");
        System.out.println("==================================================");
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("AH-101", 1000.0, 0.05));
        accounts.add(new CheckingAccount("CC-202", 2500.0));
        accounts.add(new PremiumSavingsAccount("PR-303", 5000.0, 0.05, 0.03));

        Bank bank = new Bank();
        bank.applyInterests(accounts);

        System.out.println("\n==================================================");
        System.out.println("       EJERCICIO 5: SIMULADOR DE ZOOLOGICO        ");
        System.out.println("==================================================");
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
        System.out.println("==================================================");
    }
}
