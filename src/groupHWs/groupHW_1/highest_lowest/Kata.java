package groupHWs.groupHW_1.highest_lowest;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] stringInput = numbers.split(" ");  // разбили строку на массив строк

        int[] arrayInput = new int[stringInput.length];

        for (int i = 0; i < stringInput.length; i++) {
            arrayInput[i] = Integer.valueOf(stringInput[i]);   // arrayInput[] -  уже красивый массив с интиками
        }
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;

        //int max_value = arrayInput[0];
        //int min_value = arrayInput[0];

        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] > max_value){
                max_value = arrayInput[i];               // запоминаем новое max значение
            }
            if (arrayInput[i] < min_value){
                min_value = arrayInput[i];               // запоминаем новое min значение
            }
        }

        String strOutput = max_value + " " + min_value ;  // из-за пробела в строке " " и приведения типов к сложному, будет нужный формат String

        return strOutput;
    }
}

