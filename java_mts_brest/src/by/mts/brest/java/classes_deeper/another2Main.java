package by.mts.brest.java.classes_deeper;

public class another2Main {
    public static void main(String[] args) {

        Human leha = new Human(33);

        //leha.decreaseWeight();
        leha.doDiet();
        leha.setWeight(5);
        //leha.weight = 99;
        leha.doDiet();
        //leha.classId++;

        System.out.println(leha.getWeight());

        System.out.println(leha.humansCount);
        System.out.println(Human.humansCount);

    }
}
