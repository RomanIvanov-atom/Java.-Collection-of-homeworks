package groupHWs.groupHW_2.SumBezMinAndMax;
//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest
// element ( by value, not by index! ).
//
//The highest or lowest element respectively is a single element at each edge,
// even if there are more than one with the same value.
//
//Mind the input validation.
//
//Example
//{ 6, 2, 1, 8, 10 } => 16
//{ 1, 1, 11, 2, 3 } => 6
//Input validation
//If an empty value ( null, None, Nothing etc. ) is given instead of an array,
// or the given array is an empty list or a list with only 1 element, return 0.
public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 7, 88, 4, 4};
        System.out.println(sum(numbers));
    }

    public static int sum(int[] numbers) {
        if (numbers != null && numbers.length>1){
            int min = numbers[0];
            int max = numbers[0];
            int sum = 0;


            for (int i = 0; i<numbers.length; i++){
                sum += numbers[i];

                if (numbers[i] > max){
                    max = numbers[i];
                } else if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            return sum - max - min;
        } else {
            return 0;
        }
    }
}