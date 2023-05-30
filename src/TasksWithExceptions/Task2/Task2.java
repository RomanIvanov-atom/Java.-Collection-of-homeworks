package TasksWithExceptions.Task2;


/*
    Task: Написать метод, который делит одно число на другое. Если второе число = 0,
    метод должен выбросить ошибку ArithmeticException
*/

public class Task2 {
    public static void divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by 0 !");
        }
        int result = dividend / divisor;
        System.out.println("Result is: " + result);
    }

    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}
