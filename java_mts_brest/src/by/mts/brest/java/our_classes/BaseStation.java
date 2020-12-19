package by.mts.brest.java.our_classes;

public class BaseStation {

    int Number;
    String Oblast;
    String Rayon;
    String Adres;
    String Konstrukciya;

    @Override
    public String toString() {
        return "BaseStation{" +
                "Number=" + Number +
                ", Oblast='" + Oblast + '\'' +
                ", Rayon='" + Rayon + '\'' +
                ", Adres='" + Adres + '\'' +
                ", Konstrukciya='" + Konstrukciya + '\'' +
                '}';
    }

    public BaseStation(int num, String obl, String ray, String adr, String konstrukt) {
        Number = num;
        Oblast = obl;
        Rayon = ray;
        Adres = adr;
        Konstrukciya = konstrukt;
    }


}