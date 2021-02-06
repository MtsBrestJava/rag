package by.mts.brest.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class two_x {
    public static int a =0;

    public static synchronized void plusA(){a++;}

    public static void main(String[] args) throws InterruptedException, IOException {
           Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
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
                for(int i = 0; i < 100; i++) {
                    plusA();
                    System.out.println("syncronized two= " + a);
                }
            }
        }
        );
        second.start();
        System.out.println("second runned");
        System.out.println("End of part 1");
      // String name1 = "C:\\my\\my_"+ LocalDate.now().toString()+"\\file2.txt";
      //  new File(name1).getParentFile().mkdirs();
        //FileWriter writer = new FileWriter(name1);
      //  writer.write(someInts+System.getProperty("line.separator"));
      //  writer.close();
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
