package HW_8_2;
import java.util.List;
import java.util.ArrayList;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public Employee[] findEmployeesByNameContains(String name) {
        List<Employee> matchedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                matchedEmployees.add(employee);
            }
        }
        return matchedEmployees.toArray(new Employee[0]);
    }

    public double calculateTotalSalaryBudget() {
        double totalSalaryBudget = 0;
        for (Employee employee : employees) {
            totalSalaryBudget += employee.getBaseSalary();
        }
        return totalSalaryBudget;
    }

    public double findMinSalary() {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getBaseSalary() < minSalary) {
                minSalary = employee.getBaseSalary();
            }
        }
        return minSalary;
    }

    public int findMinSubordinates() {
        int minSubordinates = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee instanceof Manager && ((Manager) employee).getNumberOfSubordinates() < minSubordinates) {
                minSubordinates = ((Manager) employee).getNumberOfSubordinates();
            }
        }
        return minSubordinates;
    }

    public double findMaxSalaryIncrement() {
        double maxSalaryIncrement = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                double salaryIncrement = ((Manager) employee).getSalaryManager() - employee.getBaseSalary();
                if (salaryIncrement > maxSalaryIncrement) {
                    maxSalaryIncrement = salaryIncrement;
                }
            }
        }
        return maxSalaryIncrement;
    }
}

