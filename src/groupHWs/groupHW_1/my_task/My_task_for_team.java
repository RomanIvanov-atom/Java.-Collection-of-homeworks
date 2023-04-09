package groupHWs.groupHW_1.my_task;

public class My_task_for_team {


    public static String removeExclamationMarks(String s) {


        s = s.replaceAll("!", "");

        return s;
    }
}







//        char[] chars = s.toCharArray();
//        for (int i = 0; i < s.length(); i++){
//            if ( chars[i] == '!') chars[i] = '';
//        }
//        s = String.valueOf(chars);
//        return s;

