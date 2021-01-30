package by.mts.brest.java;
import java.util.ArrayList;

public class two {
    ArrayList<Integer> someInts = new ArrayList<Integer>();
    public static int a;

    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("one -1: "+i);
                }
            }
        });

        one.start();
        System.out.println("one runned");

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 156; i++) {
                    System.out.println("second ##2: "+i);
                }
            }
        });
        second.start();

        System.out.println("second runned");
        System.out.println("End of program");
    }

}