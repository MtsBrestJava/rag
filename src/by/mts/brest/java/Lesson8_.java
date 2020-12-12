package by.mts.brest.java;

public class Lesson8_ {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z;
        z = y + 1;
        System.out.println("z = " + z);

        // Vvod dannyh ili chtenie fajla
        // *****

        // !!!! Obrabotka i itog #1
/*        int poditog, itog;
        poditog = (z * x + y)*22;
        System.out.print("poditog = " + poditog + "; ");
        itog = poditog*64 - y%2;
        System.out.println("itog = " + itog);*/

        // !!!! Obrabotka i itog #2
        // --/--

        // !!!! Obrabotka i itog #3 с другими данными
        // --/--

        calculateItog(z, y, x);
        calculateItog(z + 5, y + 5, x + 5);
        calculateItog(z + 5, y + 5, x + 5);

    }

    // ТипВозвращаемогоЗначения НазваниеМетода(передаваемые МЕТОДУ переменные) {
    //    САМО тело метода
    // }
    public static void calculateItog(int a, int b, int c) {
        int itog;
/*        int poditog;
        poditog = (c * a + b)*22;
        poditog = poditog - 74; */
        int poditog;
        poditog = calculatePoditog(a, b, c);

        vyvodNaEkran(poditog);
        itog = poditog * 64 - b % 2;
        vyvodNaEkran(itog);
    }

    public static int calculatePoditog(int m, int n, int o) {
        int poditog2;
        poditog2 = (m * n + o) * 22;
        poditog2 = poditog2 - 74;
        return poditog2;
    }

    public static void vyvodNaEkran(int vyvod) {
        System.out.println("-------------------");
        System.out.println("poditog = " + vyvod);
        System.out.println("-------------------");
    }
}