package herencia.employee.payroll;

import java.util.List;

import herencia.employee.Employee;

public class PayrollGenerator {
    public double calculatePayroll(List<Employee> employees) {
        double total = 0;

        for (Employee emp : employees) {
            total += emp.calculatePayment();
        }
        return total;
    }

}
