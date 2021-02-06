package by.mts.brest.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
public class two_x_not_syncro {
    public static int a =0;
    public static void main(String[] args) throws InterruptedException, IOException {
        Thread three = new Thread(new Runnable() {
            @Override
            public void run() {
                a=0;
                for(int i = 0; i < 100; i++) {
                    a++;
                    System.out.println("not syncronized three= " + a);
                }
            }
        });
        three.start();
        System.out.println("three runned");

        Thread four = new Thread(new Runnable() {
            @Override
            public void run() {
                a=0;
                for(int i = 0; i < 100; i++) {
                    a++;
                    System.out.println("not syncronized four= " + a);
                }
            }
        }
        );
        four.start();
        System.out.println("four runned");
        System.out.println("voobshe End of the end");



    }
}
