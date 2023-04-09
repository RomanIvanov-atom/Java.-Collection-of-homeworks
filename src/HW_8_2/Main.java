package HW_8_2;

public class Main {
    public static void main(String[] args) {
        Employee emplo1 = new Employee();
        emplo1.setName("Alex");
        emplo1.setBaseSalary(1000.0);

        Employee emplo2 = new Employee();
        emplo2.setName("Peter");
        emplo2.setBaseSalary(1500.0);

        System.out.println("Employee1: " + "\t" +  emplo1.getName() +  " \t" + emplo1.getBaseSalary() );
        System.out.println("Employee2: " + "\t" + emplo2.getName()  + "\t" + emplo2.getBaseSalary() );

        Worker work1 = new Worker();
        work1.setName("Jordan");
        work1.setBaseSalary(1700.0);

        Worker work2 = new Worker();
        work2.setName("Sima");
        work2.setBaseSalary(1800.0);

        System.out.println("Worker1: " + "\t" + work1.getName() +  " \t" + work1.getBaseSalary() );
        System.out.println("Worker2: " + "\t" + work2.getName()  + "\t" + work2.getSalaryWorker() ) ;

        Manager manager1 = new Manager();
        manager1.setName("Felix_Manager");
        manager1.setBaseSalary(1750.0);
        manager1.setNumberOfSubordinates(13);
        System.out.println("Manager1: " + "\t" + manager1.getName() + "\t" + manager1.getSalaryManager());

        Director dir1 = new Director();
        dir1.setName("Sergey");
        dir1.setBaseSalary(1450);
        dir1.setNumberOfSubordinates(13);
        System.out.println("Director : " + "\t" + dir1.getName() + "\t" + dir1.getSalaryDirector());

        Employee[] employees = new Employee[6];
        for (int i = 1; i < employees.length; i++){
            Employee employee = new Employee();
            employee.setName("Employ " + i);
            employee.setBaseSalary(Math.random() * 10_000);
            employees[i] = employee;
        }

        for (int i = 1; i< employees.length; i++){
            System.out.println("Name: " + employees[i].getName() + " Zarplata: " + employees[i].getBaseSalary() );
        }
//Задача №3
//
//Необходимо создать класс со следующими методами:
//поиск сотрудника в массиве по его имени
        Instrumments findName = new Instrumments();



        Employee isFoundOnName = findName.findEmployeeByName("Employ 6", employees );
        if (isFoundOnName != null){
            System.out.println("est' takoy sotrudnik " );
        } else {
            System.out.println("Ne naiden");
        }
        //THE END of Задача №3_1



// Задача №3_2
// поиск сотрудника в массиве по вхождению указанной строки в его имени


        Employee isFoundOnPartName = findName.findEmployeeByPartName("ploy", employees );

        if ( isFoundOnPartName != null ){
            System.out.println("Est' sotrudnik s takoy podstrokoy v imeni");
        } else {
            System.out.println("Ne naideno takogo sotrudnika");
        }





        //подсчет зарплатного бюджета для всех сотрудников в массиве

        double totalSalary = 0.0;
        Instrumments totlSlr = new Instrumments();

        totalSalary = totlSlr.calculateTotalSalary(employees);
        System.out.println("Total budget on base salaries: " + totalSalary);





        //поиск наименьшей зарплаты в массиве

        Instrumments instrumments = new Instrumments();
        System.out.println("Min salary u rabotnikov: " + instrumments.findMinSalary(employees));




        //поиск наибольшей зарплаты в массиве
        // Instruments instruments = new Instruments();
        System.out.println("Max salary u rabotnikov: " + instrumments.findMaxSalary(employees));





        //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров


    }
}











//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getName - получить имя
//setName
//getBaseSalary - базовая ставка
//setBaseSalary
//
//
//Задача №2
//
//Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.
//
//Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
//
//в классе, метод getSalaryManager будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.
//
//Необходимо создать класс Director, метод getSalaryDirector должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
//
//
//Задача №3
//
//Необходимо создать класс со следующими методами:
//поиск сотрудника в массиве по его имени
//поиск сотрудника в массиве по вхождению указанной строки в его имени
//подсчет зарплатного бюджета для всех сотрудников в массиве
//поиск наименьшей зарплаты в массиве
//поиск наибольшей зарплаты в массиве
//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров