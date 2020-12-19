package by.mts.brest.java;

import java.util.Scanner;

public class Lesson6_input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Input a number: ");

        int num;

        long start;

        try {
            num = in.nextInt();
        } catch (Exception e) {
            num = 0;
            System.out.println("Ошибка, в числе буковки!");
        }

/*      String s = in.nextLine();
        if(s.matches("[0-9]+"))
            num = Integer.parseInt(s);
        else  {
            System.out.println("Ошибка, в числе буковки!");
            num = 0;
        }*/

        System.out.printf("Your number: %d \n", num);
        // printf - вывод с маской (%d - вывод целочисленного значение далее указанной переменной num
        in.nextLine();



        System.out.print("Input a string: ");
        String someString = in.nextLine();
        System.out.printf("Your string: %s \n", someString);

        in.close();

    }
}
