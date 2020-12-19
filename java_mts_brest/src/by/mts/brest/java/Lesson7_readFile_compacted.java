package by.mts.brest.java;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson7_readFile_compacted {
    public static void main(String[] args) throws IOException {

        // Читаем файл (можно простым FileReader, но тогда файл посимвольно читается)
        BufferedReader reader =
                new BufferedReader(new FileReader("C:\\my\\file1.txt"));
        //FileReader reader = new FileReader("C:\\my\\file1.txt");

        // ОБЫЧНЫЙ ВАРИАНТ: Читаем строки из файла, парсим их и заполняем двумерный массив строк ----------------------
        ArrayList<List<String>> myStringArray = new ArrayList<List<String>>();
        StringBuilder currentString = new StringBuilder();
        A: for(int x=0;true;x++) {
            myStringArray.add(new ArrayList<String>());
            B: for(int i=0;true;i++){
                while(true) {
                    int current = reader.read();
                    if(current == -1) break A;
                    if(current == (int)';') break;
                    else currentString.append((char) current);
                    if(current == (int)'\n') {
                        currentString.setLength(currentString.length()-2);
                        myStringArray.get(x).add(currentString.toString());
                        currentString.delete(0, currentString.length());
                        break B;
                    }
                }
                myStringArray.get(x).add(currentString.toString());
                currentString.delete(0, currentString.length());
            }
        }

/*        // Вывод строк ПО  КЛАССИЧЕСКИМ ЦИКЛАМ
        System.out.println("################# Simple for in for #################");
            for(int i=0; i<myStringArray.size(); i++)
                for(int j=0; j<myStringArray.get(i).size(); j++)
                    System.out.println(myStringArray.get(i).get(j));

        // Вывод строк через foreach
        System.out.println("################# foreach #################");
            for(List<String> bigBox:myStringArray)
                for (String stroka:bigBox)
                    System.out.println(stroka);*/

        // Вывод строк через ЛЯМБДУ
        // System.out.println("------------------- ВЫВОД \"ОБЫЧНОГО ВАРИАНТА\" -------------------");
        myStringArray.forEach(bigBox -> bigBox.forEach(string -> System.out.println(string)));


        // ------------------------------------------------------------------------------------------------------------
        // СОКРАЩЕННЫЙ ВАРИАНТ: Сбрасываем ридер на начало файла и снова парсим и заполняем массив --------------------
        reader.mark(0);
        reader.reset();
        // Собственно сам сокращенный вариант:
        String str;
        while((str = reader.readLine()) != null) {
            String[] strings = str.split(";");
            myStringArray.add(Arrays.asList(strings));
        }

        // Вывод строк через ЛЯМБДУ
        System.out.println("------------------- ВЫВОД \"СОКРАЩЕННОГО ВАРИАНТА\" -------------------");
        myStringArray.forEach(bigBoxes -> bigBoxes.forEach(strings -> System.out.println(strings)));
    }
}
