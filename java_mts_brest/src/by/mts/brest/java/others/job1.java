package by.mts.brest.java.others;

import java.awt.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Class;

public class job1 {

    public job1() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        // write your code here
      ArrayList<List<String>> vvodArray = new ArrayList<List<String>>();

/*      Scanner in = new Scanner(System.in);
      int k = 0;
      while (true) {
          vvodArray.add(new ArrayList<String>());
          System.out.print("Input name: ");
          String tempName = in.nextLine();
          vvodArray.get(k).add(tempName.toString());
          System.out.print("Input famile: ");
          String tempFamile = in.nextLine();
          vvodArray.get(k).add(tempFamile.toString());
          while (true) {
              System.out.print("Input god rogdenia: ");
              String tempGod = in.nextLine();
              if (Integer.parseInt(tempGod) > 1900) { vvodArray.get(k).add(tempGod); break; }
              else System.out.println("Povtorite vvod > 1900");
          }

          k++;
          System.out.println("  " + vvodArray);
          System.out.print("NEXT y/n: ");
          String exit = in.nextLine();
          if (exit.contains("n")) break;
      }

      in.close();*/

      //String nameFile = "C:\\alldostup\\my\\my_" + LocalDate.now().toString() + "\\dz78.txt";
/*      String nameFile = "C:\\my\\dz78.txt";
      new File(nameFile).getParentFile().mkdirs();
      FileWriter writer = new FileWriter(nameFile);
      writer.write(vvodArray.toString());
      writer.close();*/

        BufferedReader reader = new BufferedReader(new FileReader("C:\\my\\dz78.txt"));
        //    (new FileReader("C:\\alldostup\\my\\my_" + LocalDate.now().toString() + "\\dz78.txt"));
        ArrayList<List<String>> outArray = new ArrayList<List<String>>();
        outArray.add(new ArrayList<String>());
        // outArray.add(reader.read());

        File myFile = new File("C:\\my\\dz78.txt");
        System.out.println("File name: " + myFile.getName());
        //System.out.println("File name: " + name);

        try (FileInputStream fin = new FileInputStream("C:\\my\\dz78.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            StringBuffer znach = new StringBuffer();
            int q=0;
            int symbol = reader.read();      //[ [ 1,2,3], [], [] ]
            //symbol = reader.read();
            while (symbol!=(int)']'){
                outArray.add(new ArrayList<String>());
                for (int i = 0; i < fin.available()-4; i++) {
                    //System.out.print(i);
                    while(symbol!=(int)'[') symbol = reader.read();
                    if(symbol==(int)'[') symbol = reader.read();
                    while(symbol!=(int)',')
                    {
                        symbol = reader.read();
                        if(symbol!=(int)']') {
                            znach.append((char)symbol);
                        }
                        //System.out.print(znach);
                            //
                            //outArray.set(0,) //.add(znach.toString());
                            //pechat(znach.toString());
                    }
                    znach.substring(0, znach.length() - 1);
                    outArray.get(q).add(i,znach.toString()); // еще убрать запятую
                    symbol = reader.read();

                    if(symbol==(int)']') break;
                }
                q++;
                pechat(znach.toString());
            }

        }
    }
    public static void pechat (String str) {
        for (int t = 0; t < 3; t++) {
            System.out.println("___________________");
            System.out.print("|" + (str));
            for (int r = 0; r < 20 - str.length(); r++, System.out.print(" "));
            System.out.println("|");
            System.out.println("____________________");
        }
        System.out.println("");
    }

}
