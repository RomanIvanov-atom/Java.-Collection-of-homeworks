package HW_9;

public class Employee {
    private String name;
    private double baseSalary;



    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }






    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary(){
        return getBaseSalary();
    }
}
