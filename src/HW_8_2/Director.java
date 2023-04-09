package HW_8_2;

public class Director extends Manager{


    double getSalaryDirector(){
        double director_salary = 0.0;

        if (getNumberOfSubordinates() != 0){
            director_salary = ( this.getBaseSalary() ) + ( this.getBaseSalary() * this.getNumberOfSubordinates() * 0.09 ) ;
        } else {
            director_salary = getBaseSalary();
        }

        return director_salary;
    }
}
