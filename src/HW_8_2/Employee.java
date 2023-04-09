package HW_8_2;

public class Employee {
    String name;         // не private, чтобы потомки могли юзать

    double baseSalary;   // не private, чтобы потомки могли юзать




    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }



    void setBaseSalary (double baseSalary){
        this.baseSalary=baseSalary;
    }

    double getBaseSalary() {
        return baseSalary;
    }
}
