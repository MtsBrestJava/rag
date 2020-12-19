package by.mts.brest.java;

public class Lesson3 {
    //3333333333333333333
    public static void main(String[] args) {

        int i;
        int y = 10;

        // for (V1 ; V2 ; V3) { V4 }
        // V1 -> V2? -> V4 -> V3. -> V2 -> V4 -> V3. -> ...
        // Debug in intelliJ IDEA: слева тыкаем (красный кружок),
        // далее Run -> Debug, F7 - проходим по строчкам выполнение проги
        for(i = 0;
            i < 10;
            i++) {
            System.out.print(" for:"+i);
        }
        System.out.println("");

        i = 0;  // Этот while эквивалентен for'у выше
        while(i < 10) {
            System.out.print(" while:"+i);
            i++;
        }
        System.out.println("");

        i = 0;  // Этот while эквивалентен for'у выше
        while(i < 10) {
            System.out.print(" while:"+i);
            if(i == 7) break;   // Прерывает весь цикл
            i++;
            // if(i == 7) continue;
            // Продолжает цикл с этого места
            // (без выполнения того что после этой строчки)
        }

        i = 0;  // do{} while() хотябы
        do {
            System.out.print(" do_while:" + i+(i==9?"\n":""));
            i++;
        } while (i < 10);


/*        System.out.println(" END");
        System.out.print(" END\n");
        System.out.print(" END\\n");
        System.out.print(" C:\\Program files\\dsfdsfds");
        System.out.print(" END123");*/
    }
}
