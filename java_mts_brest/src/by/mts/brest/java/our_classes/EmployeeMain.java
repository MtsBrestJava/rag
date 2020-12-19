package by.mts.brest.java.our_classes;

public class EmployeeMain {
    public static void main(String[] args) {

        EmployeeTeh teh = new EmployeeTeh();
        EmployeeProdazhi prod = new EmployeeProdazhi();
        Human hum = new Human();
        Human hum2 = new Human("dsf", "fdgsa", 5, 7);
        System.out.println(Human.NASHA_STROKA);

        System.out.println("hum2.getVes() = " + hum2.getVes());
        hum2.setVes(5);
        System.out.println("hum2.getVes() = " + hum2.getVes());
        hum2.setVes(-356765);
        System.out.println("hum2.getVes() = " + hum2.getVes());
        int a = hum2.getVes();
        System.out.println("a = " + a);
        hum2.doSomethingT();
        hum2.doDieta();

        System.out.println("hum. = " + Human.myCount);

    }



}


