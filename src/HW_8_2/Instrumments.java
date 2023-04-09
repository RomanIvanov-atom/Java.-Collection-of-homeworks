package HW_8_2;

public class Instrumments {

    //Задача №3
//Необходимо создать класс со следующими методами:
//поиск сотрудника в массиве по его имени
     Employee findEmployeeByName( String name, Employee[] employees ) {
         for (int i = 1; i < employees.length; i++){
             if ( employees[i].getName().equals(name) ){
                 return employees[i];
             }
         }
         return null;
     }

     Employee findEmployeeByPartName ( String partName, Employee[] employees ){
         for ( int i = 1; i < employees.length; i++){
             if ( employees[i].getName().contains(partName) ){
                 return employees[i];
             }

         }
         return null;
     }




//подсчет зарплатного бюджета для всех сотрудников в массиве
     double calculateTotalSalary (Employee[] employees){
         double totalSalary = 0.0;

         for ( int i = 1; i < employees.length; i++){
             totalSalary += employees[i].getBaseSalary();

             /*
             if ( employees[i].getClass().toString().contains("Director") ){
                 totalSalary += employees[i].getSalaryDirector;
             }
             */

         }
         return totalSalary;
     }




//поиск наименьшей зарплаты в массиве

    double findMinSalary (Employee[] employees) {
        double minSalary = employees[1].getBaseSalary();
        for (int i = 1; i < employees.length; i++){
            if (minSalary > employees[i].getBaseSalary() ){
                minSalary = employees[i].getBaseSalary();
            }
        }
        return minSalary;
    }



    //поиск наибольшей зарплаты в массиве
    double findMaxSalary (Employee[] employees) {
        double maxSalary = Double.MIN_VALUE;
        for (int i = 1; i < employees.length; i++){
            if (maxSalary < employees[i].getBaseSalary() ){
                maxSalary = employees[i].getBaseSalary();
            }
        }
        return maxSalary;
    }






    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров


}

