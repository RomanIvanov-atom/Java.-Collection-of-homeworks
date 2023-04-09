package HW_from1_to6;

public class HW_6_2 {
    public static void main(String[] args) {
        //Задача №1
        //
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";
        for ( int i=0; i<s.length(); i++ ){
            if( s.charAt(i) == 'о' ){
                System.out.print('о');
            }
        }

        //Задача №2
        //
        //Дана строка:
        //
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.
        System.out.println();


        String ss = "Перевыборы выбранного президента";

        int kol_bukv_e = 0;
        for (int i = 0; i < ss.length(); i++ ){
            if ( ss.charAt(i) == 'е') {
                kol_bukv_e++;
            }
        }

        System.out.println("kol-vo E : " + kol_bukv_e);

        //Задача №3
        //
        //Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.

        String sss = "Посмотрите как Рите нравится ритм";
        String pattern = "рит";
        sss = sss.toLowerCase();

        int lastIndex = 0;

        while (lastIndex != -1){


            lastIndex = sss.indexOf(pattern, lastIndex+1);

            if (lastIndex != -1) {
                System.out.print(lastIndex);
                if (lastIndex < sss.length() - 3) {
                    System.out.print(", ");
                }
//            lastIndex++;
            }else {
                System.out.println(".");
            }

        }



        //Экстра задача
        //
        //Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”. Otvet: 4

        String[][] array1 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        String pattern1 = "е";

        int lastIndex1 = 0;
        int cnt = 0;
        int kol = 0;
        int kol_e = 0;

        // в kol засовывается кол-во вообще слов в двум массиве
        for (int i=0; i<array1.length; i++){
            for(int j=0; j < array1[i].length; j++){
                kol++;
            }
        }




        for(int i=0; i < array1.length; i++){
            for(int j=0; j <array1[i].length; j++){
                for (int k=0; k < array1[i][j].length(); k++){
                    if( array1[i][j].charAt(k) == 'е' ){
                        kol_e++;
                        break;
                    }
                }

            }
        }

        cnt = kol - kol_e;


        System.out.println("Kov-vo strok bez 'e': "+ cnt);

    }
}
