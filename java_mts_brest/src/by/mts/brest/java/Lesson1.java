package by.mts.brest.java;
public class Lesson1 {
    ///ffffdfgfdg9999999999
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        float truy = 2.535467657687698768f;
        double llgfhgf = 2.3333;
        char somechar = 'd';
        boolean one;
        String myname = "Serega";

        x = y + 1;  // = 21
        x = x + 1;  // = 22

        x = 1;
        System.out.println("Hello world!!!: "+(x++));  // 1, x=1+1
        System.out.println("Hello world!!!: "+(++x));  // x=2+1, 3

        y = 5;
        x = y * 2;
        System.out.println("Multiply: "+x);
        x = y / 2;
        System.out.println("Divide: "+x);
        x = y % 2;
        System.out.println("Hello worldXX: "+x);

        System.out.println("7 % 2: "+(7%2));    // = 1
        System.out.println("7 % 3: "+(7%4));    // = 3

        int z = 3;
        System.out.println("z--: "+z--);
        z = 3;
        System.out.println("z--: "+--z);

        double d2 = 2.9333;
        int i3 = (int) d2;
        int i4 = (int) Math.round(d2);
        System.out.println("i3="+i3+" d2="+d2+" i4 ROUNDED ="+i4);    // 2, 2.93333, 3

        int i = 893274982;
        System.out.println("OUT OF RANGE: "+i*9999);

        double a_strange = 222.2222;
        double b_strange = 222.2222;
        System.out.println("D: "+a_strange+b_strange);



    }
}



