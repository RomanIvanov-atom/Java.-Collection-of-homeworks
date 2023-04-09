package groupHWs.groupHW_3.MyTask_ReversedWords;

public class ReverseWords{
    public static String reverseWords(String str){
        String[] arrayStr = str.split(" ");
        String[] revArray = new String[arrayStr.length];
        for (int i=0; i < revArray.length; i++){
            revArray[i] = arrayStr[arrayStr.length-i-1];          // обратить внимение на -1 !!!!
        }
        String out = String.join(" ",revArray);
        return out;
    }
}
