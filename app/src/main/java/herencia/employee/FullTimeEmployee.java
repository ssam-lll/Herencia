package herencia.employee;

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculatePayment() {
        return this.salary;
    }

}
