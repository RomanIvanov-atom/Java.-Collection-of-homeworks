package HW_1_to_6;
    public class task_from_javaRush_0 {
        public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        public static int[] resultArray;
        public static int res_len=0, x=0;

        public static void main(String[] args) {
            //напишите тут ваш код
            resultArray = new int[firstArray.length + secondArray.length];

            for (int i = 0; i < firstArray.length; i++) {
                resultArray[i] = firstArray [i];
                //res_len = i;
            }

            for (int i = 0; i < secondArray.length; i++ ) {
                //int x = 0;
                //System.out.println(secondArray.length);  // проверял(узнавал), передается ли длина массива в цикл
                resultArray[firstArray.length + x] = secondArray[i];  // мой варик
                //resultArray[resultArray.length - secondArray.length + i] = secondArray[i];   // правильный варик


                x = x+1;
            }

            // НАШЕЛ РЕШЕНИЕ!!!. НУЖНО х прописать наровне с i в условие цикла 'for':  for (int i = 0, x = 0; i < secondArray.length; i++, x++ )




            for (int i = 0; i < resultArray.length; i++) {
                System.out.print(resultArray[i] + ", ");
            }
        }
}
