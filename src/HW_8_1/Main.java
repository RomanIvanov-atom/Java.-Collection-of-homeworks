package HW_8_1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("Sanya");
        employee1.setAge(17);
        employee1.setSex("male");
        employee1.setSalary(500);

        System.out.println(employee1.getSalary(5));

        Manager manager1 = new Manager();
        manager1.setSalary(600);
        manager1.setSubordinates(50);

        System.out.println(manager1.getManagerSalary(3));
    }
}
