package by.mts.brest.java;

import java.util.ArrayList;
import java.util.Collections;

public class arraystwo {
    public static int a;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> someInts = new ArrayList<Integer>();
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    someInts.add(i);
                    System.out.println("someInts = " + someInts);
                }
            }
        });
        one.start();
        System.out.println("one runned");

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("someInts unsorted = " + someInts);
                Collections.sort(someInts);
                System.out.println("someInts sorted = " + someInts);
                Collections.sort(someInts, Collections.reverseOrder());
                System.out.println("someInts sorted = " + someInts);
                System.out.println("someInts max = " + Collections.max(someInts));
                }
            }
        );
        second.start();
        System.out.println("second runned");
        System.out.println("End of program");
    }
}
