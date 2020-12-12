package by.mts.brest.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lesson7_readFile {
    public static void main(String[] args) throws IOException {

        // Читаем файл (можно простым FileReader, но тогда файл посимвольно читается)
        BufferedReader reader =
                new BufferedReader(new FileReader("C:\\my\\file1.txt"));
        //FileReader reader = new FileReader("C:\\my\\file1.txt");

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
        System.out.println("myStringArray = " + myStringArray);
        System.out.println("myStringArray = " + myStringArray.get(0));
        System.out.println("myStringArray = " + myStringArray.get(1));


        /* Читаем файл (можно простым FileReader, но тогда файл посимвольно читается)
        BufferedReader reader =
                new BufferedReader(new FileReader("C:\\my\\file1.txt"));

        System.out.println("stroka1 = " + reader.read());   // Выводим первую строчку с файла в консоль
        System.out.println("stroka2 = " + reader.readLine());   // ... вторую
        System.out.println("stroka3 = " + (char)reader.read());   // ... Только первую букву

        // ... for()? while()?
        reader.close();     // Закрываем файл

        // Создаем файл
        String name1 = "C:\\my\\file1.txt";
        FileWriter writer = new FileWriter(name1);
        writer.write("bbbbbb"+System.getProperty("line.separator"));   // Записываем в файл строки
        writer.write("333333"+System.getProperty("line.separator"));
        writer.close();     // Закрываем файл*/


    }
}