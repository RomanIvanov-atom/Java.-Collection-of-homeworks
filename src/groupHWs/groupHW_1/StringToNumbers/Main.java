package groupHWs.groupHW_1.StringToNumbers;

import java.util.Arrays;

//Написать алгоритм StringToNumbers, который принимает
//строку, и возвращает массив чисел:
//Test Data:
//“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
public class Main {
    public static void main(String[] args) {
        String s = "1, 2, 3, 4, 5";

        int[] intArray = new int[s.length()];

        intArray = StringToNumbers(s);

        String arrayString = Arrays.toString(intArray);

        System.out.println(arrayString);
    }

    public static int[] StringToNumbers(String strInput){
        String[] inputString = strInput.split(", ");

        int[] arrayInput = new int[inputString.length];

        for (int i = 0; i < inputString.length; i++) {
            arrayInput[i] = Integer.valueOf(inputString[i]);
        }

        return arrayInput;

    }

}
