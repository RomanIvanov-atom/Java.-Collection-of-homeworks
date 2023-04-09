package HW7_1;


public class Main {
    public static void main(String[] args) {

        Person ivan = new Person();
        ivan.name = "Ivan";
        ivan.age = 18;
        ivan.sex = "male";

        Person alex = new Person();
        alex.name = "Alex";
        alex.age = 20;
        alex.sex = "male";

        Person irina = new Person();
        irina.name = "Irina";
        irina.age = 17;
        irina.sex = "female";

        Person lena = new Person();
        lena.name = "Elena";
        lena.age = 20;
        lena.sex = "female";

        System.out.println(ivan.getName());
        System.out.println(alex.getName());
        System.out.println(irina.getName());
        System.out.println(lena.getName());



        Employee vitalik = new Employee();
        vitalik.name = "Vitaliy";
        vitalik.age = 16;
        vitalik.sex = "male";
        vitalik.salary = 1800;

        Employee nikita = new Employee();
        nikita.name = "Nikita";
        nikita.age = 21;
        nikita.sex = "male";
        nikita.salary = 1000;

        Employee valbe = new Employee();
        valbe.name = "Vitaliy";
        valbe.age = 15;
        valbe.sex = "male";
        valbe.salary = 2100;


        System.out.println("Names are equals?(n) -- " + nikita.isSameName(valbe));
        System.out.println("Names are equals?(y) -- " + valbe.isSameName(vitalik));

        Employee[] employeeArray = {vitalik, nikita, valbe};

        Salary salary = new Salary();  ///// ЧТО ЭТО ТАКОЕ, ПОЧЕМУ Я ЗАБЫЛ ЭТО НАПИСАТЬ? КАКАЯ ФУНКЦИЯ У ЭТОЙ СТРОКИ
        int totalSum = salary.getSum(employeeArray);

        System.out.println("Summa of salaries: " + totalSum );
    }
}