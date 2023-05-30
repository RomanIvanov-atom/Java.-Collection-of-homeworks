package HW_7_1;
//Задача №3
//
//Необходимо создать класс Salary с единственным методом -
// - getSum(Employee[] employeeArray), метод должен возвращать
// сумму зарплат всех сотрудников из массива переданного
// в качестве аргумента вызова метода.

public class Salary {
    int sum = 0;
    int getSum(Employee[] employeeArray){
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].salary;
        }

        return sum;
    }




}
