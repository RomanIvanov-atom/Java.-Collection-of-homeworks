package groupHWs.groupHW_2.NataliaRamanenka;

//Write a method that returns string argument n times separated by comma, and
// number of characters in new string
//Example: “abc”, 5 → “abc, abc, abc, abc, abc”
public class Main {
    public static void main(String[] args) {
        System.out.println(stringNtimes("abc", 5) );
    }

    static String stringNtimes(String inputString, int number){
        StringBuilder outString = new StringBuilder();

        for (int i = 0; i < number; i++){
            outString.append(inputString).append(", ");
        }

        return outString.substring(0, outString.length()-2);
    }
}
