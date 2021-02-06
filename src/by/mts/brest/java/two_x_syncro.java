package by.mts.brest.java;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class two_x_syncro {
    public static int a =0;

    public static synchronized void plusA(){a++;}

    public static void main(String[] args) throws InterruptedException, IOException {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    plusA();
                    System.out.println("syncronized one = " + a);
                }
            }
        });
        one.start();
        System.out.println("one runned");

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    plusA();
                    System.out.println("syncronized two= " + a);
                }
            }
        }
        );
        second.start();
        System.out.println("second runned");
        System.out.println("End of part 1");
    }

}
