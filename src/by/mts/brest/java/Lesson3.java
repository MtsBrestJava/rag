package by.mts.brest.java;

public class Lesson3 {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 10; i++) {
            System.out.print(" for:"+i);
        }

        System.out.println("");
        i = 0;
        while(i<10) {
            System.out.print(" while:"+i);
            i++;
        }
        System.out.println("");
        i = 0;
        do {
            System.out.print(" do_while:"+i);
            i++;
        } while (i < 10);
        System.out.println("");
        /*
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

        i = 0;
        do {
            System.out.print(" do_while:" + i);
            i++;
        } while (i < 10); */
        i = 0;
        do {
            System.out.print(" do_while1:" + i+(i==9?"\n":""));
            i++;
        } while (i < 10);
        System.out.println("");
        System.out.println(" END");
        System.out.print(" END\n");
        System.out.print(" END\\n");
        System.out.print(" END123");
        System.out.println("");

        i = 0;  // Этот while эквивалентен for'у выше
        while(i < 10) {
            System.out.print(" while:"+i);
            if(i == 7) break; // if(i==7) continue;  продолжает цикл с этого места
            i++;}
            System.out.println("");

        System.out.println(" пиздец");
    }
}