package HW_9;

public class Manager extends Worker{

    private int numberOfSubordinates;



    public Manager(String name, double baseSalary, int numberOfSubordinates){
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }


    @Override
    public double getSalary() {
        double salaryManager = 0.0;

        if (getNumberOfSubordinates() != 0){
            salaryManager = ( this.getBaseSalary() ) + ( this.getBaseSalary() * this.getNumberOfSubordinates() * 0.03 ) ;
        } else {
            salaryManager = getBaseSalary();
        }
        return salaryManager;
    }
}
