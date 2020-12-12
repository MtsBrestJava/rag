package by.mts.brest.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class job1 {
    public static void main(String[] args) {
        String someString;  // Объявляем строку с именем 'someString'
        // Объявляем два массива (числовой и строчный)
        ArrayList<Integer> someInts = new ArrayList<Integer>();
        ArrayList<String> someName = new ArrayList<String>();

        Scanner in = new Scanner(System.in);    // Объявляем сканер строки

        while (true) {      // бесконечный цикл
            System.out.print("Input a name: ");
            someString = in.nextLine();     // Ожидаем ввод СТРОКИ, пишем его в someString
            if(someString.contains("stop")) break;  // Если в строке содержится "stop" - выходим из цикла
            // printf - вывод с маской (%s - подставляет строку someString вместо %s)
            System.out.printf("Your name: %s \n", someString);
            someName.add(someString);       // Добавляем введенную строку someString в массив someName

            System.out.printf("Input a oklad: ");
            int num = in.nextInt(); // Ожидаем ввод ЧИСЛА, пишем его в num
            System.out.printf("Your oklad: %d \n", num);
            // printf - вывод с маской (%d - вывод целочисленного значение далее указанной переменной num
            in.nextLine();      // "Съедаем" ENTER
            someInts.add(num);  // Добавляем введенное число num в массив someName
            System.out.print("\n");     // Перевод строки (для визуального отделения)
            //System.out.println("");     // То же самое
        }

        in.close();     // закрываем поток "in" - поток ввода (с клавиатуры)

        System.out.println("Prisol naschalnike i vse pereipal");
        Collections.sort(someInts);     // Сортировка someInts массива по возрастанию
        Collections.sort(someName, Collections.reverseOrder()); // Сортировка someName массива по возрастанию
        int i = someInts.size();    // Объявляем переменную i и присваиваем ей РАЗМЕР МАССИВА (сколько элементов)
        for (int k=0; k < i; k++) {     // Циклом проходим по каждому элементу массивов от 0 до РАЗМЕРА МАССИВА
            System.out.println(someName.get(k)+" "+someInts.get(k));
            //массивы - someName и someInts, метод .get(k) - получает k-й элемент массива
        }
    }
}
