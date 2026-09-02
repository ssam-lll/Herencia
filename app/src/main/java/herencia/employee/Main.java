package herencia.employee;

import java.util.ArrayList;
import java.util.List;
import herencia.employee.payroll.PayrollGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 2: Nomina de Empleados ===");
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Carlos", 2500.0));
        employees.add(new HourlyEmployee("Ana", 20.0, 80));

        PayrollGenerator payrollGen = new PayrollGenerator();
        double totalPayroll = payrollGen.calculatePayroll(employees);
        System.out.println("Total a pagar en nomina: $" + totalPayroll);
    }
}
