package HW_8_1;

public class Manager extends Employee{
    private int subordinates;


    public double getManagerSalary(int days){
        double slry = days * getSalary() + subordinates*0.01*getSalary() ;
        return slry;
    }



    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }
}
