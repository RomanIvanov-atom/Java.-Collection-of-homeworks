package HW_1_to_6;

import java.util.Arrays;

public class HW_6_1 {
    public static void main(String[] args) {

//        Задача №1
//
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести сумму всех значений массива.
//Задача №2
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
//Задача №3
//
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести минимальное значение массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = Arrays.stream(array).sum();
        System.out.println("Summa: " + sum);

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Max number: " + max);

        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Min number: " + min);

        //Задача №4
        //
        //Дан массив:
        //int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double avg = Arrays.stream(array1).average().getAsDouble();
        System.out.println("Srednee arifmeticheskoe: " + avg);

        //Задача №5
        //
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum_dvumer = 0;

        for (int i=0; i<array2.length; i++){
            for(int j=0; j < array2[i].length; j++){
                sum_dvumer+=array2[i][j];
            }
        }

        System.out.println("Summa dvemer massiva:" + sum_dvumer);


        //Задача №6
        //
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести максимальное значение массива.

        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max_dvumer = array3[0][0];

        for (int i=0; i<array3.length; i++){
            for(int j=0; j < array3[i].length; j++){
                if (array3[i][j] > max_dvumer) {
                    max_dvumer = array3[i][j];
                }
            }
        }
        System.out.println("Max element dvumer massiva:" + max_dvumer);


        //Задача №7
        //
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести количество элементов в массиве.

        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int kol = 0;

        for (int i=0; i<array4.length; i++){
            for(int j=0; j < array4[i].length; j++){
                kol++;
            }
        }
        System.out.println("Kol-vo elementov v dvumer massive:" + kol);
    }
}
