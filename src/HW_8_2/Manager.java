package HW_8_2;

public class Manager extends Employee {
    private int numberOfSubordinates = 0;


    void setNumberOfSubordinates(int subordinates){
        this.numberOfSubordinates = subordinates;
    }

    int getNumberOfSubordinates(){
        return this.numberOfSubordinates;
    }

    double getSalaryManager(){
        double salaryManager = 0.0;

        if (getNumberOfSubordinates() != 0){
            salaryManager = ( this.getBaseSalary() ) + ( this.getBaseSalary() * this.getNumberOfSubordinates() * 0.03 ) ;
        } else {
            salaryManager = getBaseSalary();
        }

        return salaryManager;
    }




}
