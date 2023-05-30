package HW_7_1;
//Задача №2
//
//Необходимо создать класс Employee с полями как у Person
// (из предыдущего задания) и поле зарплата.
// Класс должен иметь метод isSameName(Employee employee) который возвращает true,
// если у сотрудника у которого был вызван метод и сотрудника который был передан
// как параметр, одинаковое имя.
public class Employee {
    String name;

    int age;

    String sex;

    int salary;

    Boolean isSameName(Employee employee){
        return (this.name == employee.name);
    }

}

