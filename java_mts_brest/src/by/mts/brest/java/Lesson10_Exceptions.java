package by.mts.brest.java;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lesson10_Exceptions {

    public static void main(String[] args) throws Exception {

        // Читаем файл (можно простым FileReader, но тогда файл посимвольно читается)
        try {
            // if(.. файлик есть) .. else НАПЕЧАТАТЬ_ОШИБКУ
            // if(.. файлика нету) .. else НАПЕЧАТАТЬ_ОШИБКУ
            BufferedReader reader =
                    new BufferedReader(new FileReader("C:\\my\\file122.txt"));
            System.out.println("reader.readLine() = " + reader.readLine());
            reader.close();
        }
        catch(Exception exc) {
            // System.out.println("BufferedReader exception: " + exc);
            System.out.println("Что-то пошло не так: ");
            System.out.println(exc.getMessage());
        }
        // ---------------------------------------------------------------------------


        System.out.println("Какое-нить действие 1");

        int b = 2;
        b = 2+3 - 5;
        // if(b != 0 || B != 3 || b != 99) { int a = 2 / b; ....... }
        // if(b != 3) { int a = 2 / b; ....... }
        // if(b != 99) { int a = 2 / b; ....... }
        // if(b != -1) { int a = 2 / b; ....... }
        try {
            int a = 2 / b;
            //....
        }
        catch (ArithmeticException ddd) {
           // System.out.println("ddd = " + ddd);
            System.out.println("Деление на ноль, ай-яй-яй!");
            ddd.getMessage();
            // a = ...
        }
        catch (ArrayIndexOutOfBoundsException df) {

        }

        // ----------------------------------------------

        int[] digits = {33,6,7,8,9};
        // ...
        try {
            System.out.println("final: " + digits[3]);
            if(digits[0] == 33)
                throw new Exception("Ай 33 ваще не число");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Вышли за пределы массива");
            System.out.println("ex.getStackTrace() = " + ex.getMessage());
        }
        catch (Exception ex2) {
            System.out.println("Своя ошибка");
            System.out.println("ex2.getMessage() = " + ex2.getMessage());
        }

        System.out.println("Какое-нить действие 4");

    }

}
