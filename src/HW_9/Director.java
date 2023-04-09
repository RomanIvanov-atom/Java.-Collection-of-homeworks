package HW_9;

public class Director extends Manager{

    public Director(String name, double baseSalary, int numberOfSubordinates){
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        double director_salary = 0.0;

        if (getNumberOfSubordinates() != 0){
            director_salary = ( this.getBaseSalary() ) + ( this.getBaseSalary() * this.getNumberOfSubordinates() * 0.09 ) ;
        } else {
            director_salary = getBaseSalary();
        }
        return director_salary;
    }
}
