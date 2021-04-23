package JavaLabs.MODELof8L1;

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

    @Override
    public int compareTo(Medicine o) {
        return Comparator.comparing(Medicine::getPrice).compare(this,o);
    }

    public int getPrice() {
        return price;
    }
}
