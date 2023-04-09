package HW_from1_to6;

public class HW_4_2 {
    public static void main(String[] args) {
        int x = 5;
        int res = 1;
        int i = 1;
        while (res * x < 10_000){

            res = res * x;


            System.out.println(x + " в степени " + i + "= " + res);
            i++;
        }

    }
}
