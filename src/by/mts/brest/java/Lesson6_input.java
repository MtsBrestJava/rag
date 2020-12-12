package by.mts.brest.java;

import java.util.Scanner;

public class Lesson6_input {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.printf("input a number: ");
        int num = in.nextInt();
        System.out.printf("Yoir number: %d \n", num);
        in.nextLine();
        System.out.printf("Input a string: ");
        String somesString = in.nextLine();
        System.out.printf("Yoir string: %s \n", somesString);
        in.close(); */

        Scanner in = new Scanner(System.in);

        System.out.printf("Input a number: ");
        int num = in.nextInt();
        System.out.printf("Your number: %d \n", num);
        // printf - вывод с маской (%d - вывод целочисленного значение далее указанной переменной num
        in.nextLine();

        System.out.print("Input a string: ");
        String someString = in.nextLine();
        System.out.printf("Your string: %s \n", someString);

        in.close();
    }
}
