package HW_9;

//поиск сотрудника в массиве по его имени
//поиск сотрудника в массиве по вхождению указанной строки в его имени
//подсчет зарплатного бюджета для всех сотрудников в массиве
//поиск наименьшей зарплаты в массиве
//поиск наибольшей зарплаты в массиве
//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров


import java.awt.*;

public class Instruments {

//поиск сотрудника в массиве по его имени

    static Boolean findEmployeeByName(String findName, Employee[] employees){
        for (int i = 1; i < employees.length; i++) {
            if (findName.equals(employees[i].getName())){
                return true;
            }
        }
        return null;
    }


//поиск сотрудника в массиве по вхождению указанной строки в его имени

    static Boolean findEmployeeByPartName(String partName, Employee[] employees){
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getName().contains(partName)){
                return true;
            }
        }
        return null;
    }


    //подсчет зарплатного бюджета для всех сотрудников в массиве
    static double calculateTotalSalary(Employee[] employees){
        double totalSalary = 0.0;

        for (int i = 0; i < employees.length; i++){
            totalSalary += employees[i].getSalary();

        }
        return totalSalary;
    }


    //поиск наименьшей зарплаты в массиве
    static double findMinSalary(Employee[] employees){
        double minSalary = Double.MAX_VALUE;

        for (int i = 1; i < employees.length; i++){
            if(employees[i].getSalary() < minSalary){
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }


//поиск наибольшей зарплаты в массиве
    static double findMaxSalary(Employee[] employees){
        double maxSalary = Double.MIN_VALUE;

        for (int i = 1; i < employees.length; i++){
            if(employees[i].getSalary() > maxSalary){
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }


//поиск наименьшего количества подчиненных в массиве менеджеров

    static int findMinNumOfSubordinates(Employee[] employee){
        int minNumOfSubordinates = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++){
            if (employee[i] instanceof Manager || employee[i] instanceof Director){
                if(((Manager) employee[i]).getNumberOfSubordinates() < minNumOfSubordinates){
                    minNumOfSubordinates = ((Manager) employee[i]).getNumberOfSubordinates();
                }
            }
        }
        return minNumOfSubordinates;
    }


    //поиск наибольшего количества подчиненных в массиве менеджеров

    static int findMaxNumOfSubordinates(Employee[] employee){
        int maxNumOfSubordinates = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++){
            if (employee[i] instanceof Manager || employee[i] instanceof Director){
                if(((Manager) employee[i]).getNumberOfSubordinates() > maxNumOfSubordinates){
                    maxNumOfSubordinates = ((Manager) employee[i]).getNumberOfSubordinates();
                }
            }
        }
        return maxNumOfSubordinates;
    }


    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    static double findMaxExtraMoney(Employee[] employee){
        double maxExtraMoney = Double.MIN_VALUE;

        for (int i = 0; i < employee.length; i++ ){
            if( employee[i] instanceof Director || employee[i] instanceof Manager ){
                if( employee[i].getSalary() - employee[i].getBaseSalary() > maxExtraMoney){
                    maxExtraMoney = employee[i].getSalary() - employee[i].getBaseSalary();
                }
            }
        }
        return maxExtraMoney;
    }

    //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    static double findMinExtraMoney(Employee[] employee){
        double minExtraMoney = Double.MAX_VALUE;

        for (int i = 0; i < employee.length; i++ ){
            if( employee[i] instanceof Director || employee[i] instanceof Manager ){
                if( employee[i].getSalary() - employee[i].getBaseSalary() < minExtraMoney){
                    minExtraMoney = employee[i].getSalary() - employee[i].getBaseSalary();
                }
            }
        }
        return minExtraMoney;
    }



}
