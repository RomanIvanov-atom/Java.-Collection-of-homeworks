package HW_1_to_6;

public class HW_2_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("Summa: " + (a + b));
        System.out.println("Rasnost': " + (a - b));
        System.out.println("Proizvedenie: " + (a * b));
        System.out.println("Chastnoe: " + (a / b));

        //extra zadachka: vivesti ostatok posle delenia
        int c = 328;
        System.out.println("Ostatok delenia: " + a % c);

        //extra zadachka: sdelat' proverku na chetnost'
        if ((c % 2) == 0)
            System.out.println("C -- chetnoe");
        else
            System.out.println("C -- nechetnoe");


        //extra zadachka: vivesti smailik ( NE :),   a normalniy a-lya ☺☻♥)
        char n = (char) 0x1f604;
        char v = '\uF600';
        char z = '☺';
        char x = '☻';

        System.out.println(n);
        System.out.println(v);
        System.out.println(z);
        System.out.println(x);
    }
}
