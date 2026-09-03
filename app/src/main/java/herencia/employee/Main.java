package herencia.employee;

import java.util.ArrayList;
import java.util.List;
import herencia.employee.payroll.PayrollGenerator;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Carlos", 2500000.0));
        employees.add(new HourlyEmployee("Ana", 5000.0, 20));

        PayrollGenerator payrollGen = new PayrollGenerator();
        double totalPayroll = payrollGen.calculatePayroll(employees);
        System.out.println("Total: " + totalPayroll);
    }
}
