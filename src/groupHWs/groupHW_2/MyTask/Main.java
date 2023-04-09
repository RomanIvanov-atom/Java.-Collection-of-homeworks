package groupHWs.groupHW_2.MyTask;

import java.util.Arrays;

//Write a function that accepts an array of 10 integers (between 0 and 9),
// that returns a string of those numbers in the form of a phone number.
//
//Example
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
public class Main {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Input is: " + Arrays.toString(arrayNumbers) + "\nOutput is: ");

        System.out.println(createPhoneNumber(arrayNumbers));
    }

    static String createPhoneNumber(int[] inputArray){
        StringBuilder outputString= new StringBuilder("(");  // mutable(изменяемый) class, не пораждает много мусора при работе с ним
        for (int i = 0; i < 3; i++){
            outputString.append(inputArray[i]);
        }

        outputString.append(") ");           //"(123) "

        for (int i = 3; i < 6; i++){
            outputString.append(inputArray[i]);
        }

        outputString.append("-");           //"(123) 456-"

        for (int i = 6; i < 10; i++){
            outputString.append(inputArray[i]);  //"(123) 456-7890"
        }

        return outputString.toString();
    }
}
