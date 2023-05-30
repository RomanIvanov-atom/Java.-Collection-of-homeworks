package HW_1_to_6;

public class HW_5_3 {
    public static void main(String[] args) {

//        Задача №3

//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//              6 5 4 3 2 1 0 1 2 3 4 5 6
//                5 4 3 2 1 0 1 2 3 4 5
//                  4 3 2 1 0 1 2 3 4
//                    3 2 1 0 1 2 3
//                      2 1 0 1 2
//                        1 0 1
//                          0
        for (int i = 10; i >= 0; i--) {

            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }

            for (int k=0, j = i-k-1;     k < i;       j--,k++) {
                System.out.print(j + " ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}