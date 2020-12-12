package by.mts.brest.java;

public class Lesson1 {
    public static void main(String[] args) {
        // ТИП ИМЯ=ЗНАЧЕНИЕ
     int x = 10; // -2 147 483 647 до 2 147 483 647
        int y = 20;
        float f = 2.53f; // значение с плавающей точкой float 32 от 1.4-45f до 3.4+38f
        double d = 2.3333; // 64 от 4.9е-324 до 1.7е+308
        char somechar = 'd';
        String someString = "someString";

        char mychar;
        mychar = 'a';
        boolean one;
        x=y+1; // 21
        x=x+1;  // 22

        x=1;
        x+=1; // x=x+1
        System.out.println("Hello World " +x);
        x=1;
        x=+1;
        System.out.println("Hello World " +x);
        System.out.println("Hello World: "+someString+" "+f+" "+somechar);

        x=1;
        x=x++; //
        System.out.println("Hello World " +x);
        x=1;
        x=++x;
        System.out.println("Hello World " +x);
        System.out.println("Hello World: "+someString+" "+f+" "+somechar);

        x=1;
        x+=2;  // x=x+2
        System.out.println("Hello World " +x);
        x=1;
        System.out.println("Hello World " +(x+=2));

        x=1;
        x=+2;  // x=x+2
        System.out.println("Hello World " +x);
        System.out.println("Hello World " +(x=+2));
        System.out.println("Hello World " +x);

    }
}
