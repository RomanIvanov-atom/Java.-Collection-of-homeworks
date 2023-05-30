package TasksWithExceptions.Task1;

import java.util.Scanner;


/*
    Task: Пользователь вводит целое число с клавиатуры. Если введенное значение не является числом, программа должна
          выдать сообщение об этом
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter integer number: ");

        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("You just entered: " + number);
        } catch (Exception e) {
            System.out.println("ERROR! It's not integer!");
        }
    }
}
