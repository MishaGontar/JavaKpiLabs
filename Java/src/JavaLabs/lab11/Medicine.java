package JavaLabs.lab11;

import java.util.Comparator;

public class Medicine implements Comparable<Medicine> {
     String name ;
     int price ;
     String MadeIn;

    Medicine(String name, int price){
       this.name = name;
       this.price = price;
    }
    Medicine(String name, int price , String MadeIn){
        this.name = name;
        this.price = price;
        this.MadeIn = MadeIn;
    }

    public static void documentation() {
        System.out.println("This Method create documentation for Medicine !");
    }
    public void print() {
        System.out.println("Name : " + name + " Price : " + price);
    }

    @Override
    public int compareTo(Medicine o) {
        return Comparator.comparing(Medicine::getPrice).compare(this,o);
    }

    public  String getName() {
        return name;
    }

    public String getMadeIn() {
        return MadeIn;
    }

    public int getPrice() {
        return price;
    }

}
