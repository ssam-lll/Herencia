package herencia.employee;

public class HourlyEmployee extends Employee {
    private double hourlyPay;
    private int hours;

    public HourlyEmployee(String name, double hourlyPay, int hours) {
        super(name);
        this.hourlyPay = hourlyPay;
        this.hours = hours;
    }

    @Override
    public double calculatePayment() {
        return this.hourlyPay * this.hours;
    }

}
