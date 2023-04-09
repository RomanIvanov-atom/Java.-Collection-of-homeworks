package HW_9;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Emplosha1", 100.0);
        Employee emp2 = new Employee("Emplosha2", 130.0);

        Worker work1 = new Worker("Workasha1", 150.0);
        Worker work2 = new Worker("Workasha2", 180.0);

        Manager manag1 = new Manager("Managsher1", 300.0, 5);
        Manager manag2 = new Manager("Managsher2", 300.0, 10);

        Director direc1 = new Director("Direcosha1", 500, 22);
        Director direc2 = new Director("Direcosha2", 600, 20);



        Employee[] employees = new Employee[]{emp1, emp2, work1, work2, manag1, manag2, direc1, direc2};



        //поиск сотрудника в массиве по его имени
        System.out.println("Is 'Workasha1' on array or not?: " + Instruments.findEmployeeByName("Workasha1", employees));
        System.out.println("Is 'Wirkasha1' on array or not?: " + Instruments.findEmployeeByName("Wirkasha1", employees) + "\n");

        //поиск сотрудника в массиве по вхождению указанной строки в его имени
        System.out.println("Is 'recosh' a part of some1's name or not?: " + Instruments.findEmployeeByPartName("recosh", employees));
        System.out.println("Is 'asala' a part of some1's name or not?: " + Instruments.findEmployeeByPartName("asala", employees) + "\n");

        //подсчет зарплатного бюджета для всех сотрудников в массиве
        System.out.println("Total money for all employees: " + Instruments.calculateTotalSalary(employees) + "\n");

        //поиск наименьшей зарплаты в массиве
        System.out.println("Min employees's salary is: " + Instruments.findMinSalary(employees));

        //поиск наибольшей зарплаты в массиве
        System.out.println("Max employees's salary is: " + Instruments.findMaxSalary(employees) + "\n");

        //поиск наименьшего количества подчиненных в массиве менеджеров
        System.out.println("Min number of subordinates among managers and directors: " + Instruments.findMinNumOfSubordinates(employees));

        //поиск наибольшего количества подчиненных в массиве менеджеров
        System.out.println("Max number of subordinates among managers and directors: " + Instruments.findMaxNumOfSubordinates(employees) + "\n");

        //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
        System.out.println("Max value of extra money: " + Instruments.findMaxExtraMoney(employees));

        //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
        System.out.println("Min value of extra money: " + Instruments.findMinExtraMoney(employees));


    }
}
