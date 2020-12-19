package by.mts.brest.java.classes_deeper;

public class anotherMain {
    public static void main(String[] args) {

 Human sasha = new Human("Sasha","Levchenko");
 Human petya = new Human();




        sasha.surname = "Tehnar";
        sasha.age = 22;
        sasha.Human();
        // sasha.classId = 15;
        sasha.doDiet();
        System.out.println(sasha.humansCount); //2

        System.out.println(sasha.toString());
        System.out.println("Human{ name = ...");


    }
}
