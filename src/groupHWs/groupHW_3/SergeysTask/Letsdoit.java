package groupHWs.groupHW_3.SergeysTask;

import static java.lang.Math.pow;

public class Letsdoit {
    public static String letsDoIt(int powerOf2){
        StringBuffer str = new StringBuffer("a");
        if (powerOf2 < 0){
            return "Vvedite chislo bolshe 0 !";
        } else if (powerOf2 == 0) {
            return str.toString();
        } else {
            int lengthOut = (int) pow(2, powerOf2);

            for(int i = 0; i<powerOf2; i++){
                str.append(str); //a //ab //abaa // abaaabab ...

                if ( str.charAt(str.length()-1) == 'a' ){
                    str.setCharAt(str.length()-1, 'b');
                } else {
                    str.setCharAt(str.length()-1, 'a');
                }
            }
            return "There are " + lengthOut + " symbols in output string: \n" + str.toString();
        }
    }

}
