package HW_7_1;
//Задача №1
//
//Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName, метод возвращает имя
// с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ”
// если женский.
public class Person {
    String name;

    int age;

    String sex;

    String prefix = "";
    String getName(){

        if (sex == "male"){
            prefix = "Mr.";
        } else if (sex == "female"){
            prefix = "Mrs.";
        } else {
            System.out.println("There is an error in sex definition");
        }
        return prefix + name;
    }
}
