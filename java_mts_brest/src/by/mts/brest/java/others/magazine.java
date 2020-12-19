package by.mts.brest.java.others;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class magazine {

    public static void main(String[] args) throws IOException {
        // Объявляем два массива (числовой и строчный)
        ArrayList<Integer> somePrice = new ArrayList<Integer>();
        ArrayList<String> someName = new ArrayList<String>();

        try (FileReader reader = new FileReader("C:\\my\\file1.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String someString1;
        Scanner in = new Scanner(System.in);    // Объявляем сканер строки
        while (true) {
            System.out.println("Enter Your Command 1;2;3;4.");
            someString1 = in.nextLine();     // Ожидаем ввод СТРОКИ, пишем его в someString
            if (someString1.contains("stop")) break;

            if (someString1.contains("1")) ENTERING_NOMENCLATURE(in, someName, somePrice);
        }
        in.close();
    }

    public static void ENTERING_NOMENCLATURE(Scanner in, ArrayList<String> blaName, ArrayList<Integer> blaPrice)
    {

        String someString;  // Объявляем строку с именем 'someString'
        //Scanner in = new Scanner(System.in);    // Объявляем сканер строки
        while (true) {      // бесконечный цикл
            System.out.print("Enter product name: ");
            someString = in.nextLine();     // Ожидаем ввод СТРОКИ, пишем его в someString
            if (someString.contains("stop")) break;  // Если в строке содержится "stop" - выходим из цикла
            // printf - вывод с маской (%s - подставляет строку someString вместо %s)
            //System.out.printf("Наименование: %s \n", someString);
            blaName.add(someString);       // Добавляем введенную строку someString в массив someName
            System.out.printf("Enter price: ");
            int num = in.nextInt(); // Ожидаем ввод ЧИСЛА, пишем его в num
            // printf - вывод с маской (%s - подставляет строку someString вместо %s)
            System.out.printf("product name: %s \n", someString);
            System.out.printf("price: %d \n", num);
            // printf - вывод с маской (%d - вывод целочисленного значение далее указанной переменной num
            in.nextLine();      // "Съедаем" ENTER
            blaPrice.add(num);  // Добавляем введенное число num в массив someName
            System.out.print("\n");     // Перевод строки (для визуального отделения)
            //System.out.println("");     // То же самое
        }
        //in.close();     // закрываем поток "in" - поток ввода (с клавиатуры)
    }

}



