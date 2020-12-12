package by.mts.brest.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class home2 {
    public static void main(String[] args) throws IOException{
        String name1 = "C:\\my\\file2.txt";
        String someString;
        ArrayList<Integer> someInts = new ArrayList<Integer>();
        ArrayList<String> someName = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        FileWriter writer = new FileWriter(name1);
        while (true) {
            System.out.print("Input a name: ");
            someString = in.nextLine();
            if (someString.contains("stop")) break;
            System.out.printf("Your name: %s \n", someString);
            someName.add(someString);
            writer.write(someString+System.getProperty("line.separator"));   // Записываем в файл строки

            System.out.printf("Input a oklad: ");
            int num = in.nextInt(); // Ожидаем ввод ЧИСЛА, пишем его в num
            System.out.printf("Your oklad: %d \n", num);
            // printf - вывод с маской (%d - вывод целочисленного значение далее указанной переменной num
            in.nextLine();      // "Съедаем" ENTER
            someInts.add(num);  // Добавляем введенное число num в массив someName
            System.out.print("\n");     // Перевод строки (для визуального отделения)
            writer.write(num+System.getProperty("line.separator"));   // Записываем в файл строки
        }
        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\my\\file2.txt"));
        System.out.println("stroka1 = " + reader.read());   // Выводим первую строчку с файла в консоль
    }
}
