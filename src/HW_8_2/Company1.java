//package HW_8_2;
//
//public class Company {
//
//    Employee[] employees;
//
//    public Company(Employee[] employees) {
//        this.employees = employees;
//    }
//
//    public Employee findEmployeeByName(String name) {
//        for (Employee employee : employees) {
//            if (employee.getName().equals(name)) {
//                return employee;
//            }
//        }
//        return null;
//    }
//
//    public Employee[] findEmployeeBySubstring(String substring) {
//        List<Employee> matchingEmployees = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getName().contains(substring)) {
//                matchingEmployees.add(employee);
//            }
//        }
//        return matchingEmployees.toArray(new Employee[0]);
//    }
//
//    public double calculateSalaryBudget() {
//        double totalSalary = 0.0;
//        for (Employee employee : employees) {
//            totalSalary += employee.getBaseSalary();
//        }
//        return totalSalary;
//    }
//
//    public double findMinimumSalary() {
//        double minSalary = Double.MAX_VALUE;
//        for (Employee employee : employees) {
//            if (employee.getBaseSalary() < minSalary) {
//                minSalary = employee.getBaseSalary();
//            }
//        }
//        return minSalary;
//    }
//
//    public int findMinimumSubordinates() {
//        int minSubordinates = Integer.MAX_VALUE;
//        for (Employee employee : employees) {
//            if (employee instanceof Manager) {
//                Manager manager = (Manager) employee;
//                if (manager.getNumberOfSubordinates() < minSubordinates) {
//                    minSubordinates = manager.getNumberOfSubordinates();
//                }
//            }
//        }
//        return minSubordinates;
//    }
//
//    public double findMaximumSalaryIncrease() {
//        double maxSalaryIncrease = Double.MIN_VALUE;
//        for (Employee employee : employees) {
//            if (employee instanceof Manager) {
//                Manager manager = (Manager) employee;
//                double salaryIncrease = manager.getSalaryManager() - manager.getBaseSalary();
//                if (salaryIncrease > maxSalaryIncrease) {
//                    maxSalaryIncrease = salaryIncrease;
//                }
//            }
//        }
//        return maxSalaryIncrease;
//    }
//}
//
