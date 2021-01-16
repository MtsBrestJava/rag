package by.mts.brest.java;

public class magazine_structure {

    int price;
    int rom;
    int ram;
    int screen;
    String color;
    String name;

    public magazine_structure(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
        this.rom=0;
        this.ram=0;
        this.screen=0;

    }

    public magazine_structure(String name, String color, int price, int rom, int ram, int screen) {
        this.name = name;
        this.color = color;
        this.rom = rom;
        this.ram = ram;
        this.screen = screen;
        this.price = price;

    }

}
