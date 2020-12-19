package by.mts.brest.java.our_classes;

public class Human {

    // Переменные (поля) класса
    public String name;
    String familie;
    protected int vozrast;
    private int ves;

    public static int myCount = 0;
    public final int MOE_CHISLO;
    public final static int MOE_CHISLO_OBSHEE = 2;
    public final static String NASHA_STROKA = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";

    {
        MOE_CHISLO = 5;
        myCount++;
    }


    public Human() {
        //
    }

    // Конструктор
    public Human(String name, String familie, int vozrast) {
        this.name = name;
        this.familie = familie;
        this.vozrast = vozrast;
    }

    public Human(String name, String familie, int vozrast, int ves) {
        this.name = name;
        this.familie = familie;
        this.vozrast = vozrast;
        this.ves = ves;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if(ves > 0)
            this.ves = ves;
        else this.ves = 1;
    }



    public void doSomethingT() {
        //
        System.out.println("treniruetsya name !" + name);
        if(vozrast > 60)
            System.out.println("" + name + ", posmotri na svoi " + vozrast + "!!! Peredohni");
        decreaseWeight();
    }

    public void doDieta() {
        System.out.println("" + name + " na diete");
        decreaseWeight();
    }

    private void decreaseWeight() {
        if(ves > 0)
            this.ves--;
        else System.out.println("Ves itak malenkiy!!!!");
    }



    public void calculateStazh() {
        ///
    }




    public void walk() {
        System.out.println("Human idet");
    }

    public void printHuman(String name) {
        System.out.println("Human: ...");
    }

    public void printHuman(String name, int age) {
        System.out.println("Human name i age: ...");
    }

    public void printHuman(String name, int age, int weight) {
        System.out.println("Human name i age i ves: ...");
    }

}
