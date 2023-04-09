package groupHWs.groupHW_3.DoIgetABonus;

public class Kata{
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus) {
            int x = salary*10;

            return "\u00A3" + String.valueOf(x);   //can be written as: return "£" + x*10; (with deleting prev row ofc)
        } else {
            return "\u00A3" + String.valueOf(salary);
        }
    }
}
