package by.mts.brest.java;

import java.util.Arrays;

public class lesson4 {
    public static void main(String[] args) {

        int nash_massive0[];
        nash_massive0 = new int[3];
        System.out.println("nash_massive0: "+ Arrays.toString(nash_massive0));

        int nash_massive1[] = new int[5];   // int[] nash_massive;
        System.out.println("nash_massive1: "+ Arrays.toString(nash_massive1));

        int nash_massive2[] = new int[5];   // {1,22,11,2,747,6,7}};
        System.out.println("nash_massive2: "+ Arrays.toString(nash_massive2));

        int nash_massive3[] = new int[5];
        nash_massive3[0] = 98;
        nash_massive3[1] = 34;
        nash_massive3[2] = 1;
        nash_massive3[3] = 1928;
        System.out.println("nash_massive3: "+ Arrays.toString(nash_massive3));

        int i;
        for(i = 0; i <= 4; i++) {
            System.out.println(nash_massive3[i]);
        }

        char chars_array[] = new char[] {'a','h','m'};
        System.out.println("chars_array massive: "+ Arrays.toString(chars_array));

        String strings_array[] = new String[] {"пропр", "эауа", "холера"};
        strings_array[1] = "stroshka drugaya";
        System.out.println("strings_array massive: "+ Arrays.toString(strings_array));

        String strings_array2[] = new String[5];
        System.out.println("strings_array2 massive: "+ Arrays.toString(strings_array2));


        System.out.println("dlina1: "+ strings_array2.length);

        for(int z=0; z< strings_array2.length; z++)
        {strings_array2[z] = "stroka" + Integer.toString(z);} //заполнение массва

        for(int z=0; z< strings_array2.length; z++) {
        System.out.println(strings_array2[z]);} // вывод массива */


        int dvumern[][] = new int[3][];
        dvumern[0] = new int[5];
        dvumern[1] = new int[55];
        dvumern[2] = new int[1];

        String dvumernString[][] = new String[][]
                {{"Stroka01", "Stroka02"},{"Stroka 11", "Stroka12"}};
        System.out.println("dvumernString massive: "+ Arrays.toString(dvumernString[0]));
        System.out.println("dvumernString massive: "+ Arrays.toString(dvumernString[1]));

        int dvumerni[][] = new int[3][3];
        dvumerni[0][0] = 1;
        dvumerni[0][1] = 2;
        dvumerni[2][1] = 44;
        dvumerni[2][2] = 55;
        System.out.println("dvumernString massive: "+ Arrays.deepToString(dvumerni));

        //ArrayList<int> intsList = new ArrayList<int>();
    }
}
