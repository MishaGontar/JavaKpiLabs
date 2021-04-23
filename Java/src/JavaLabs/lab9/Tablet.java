package JavaLabs.lab9;

public class Tablet extends Medicine {
    int count ;
    Tablet(String name, int price, int count) {
        super(name, price);
        this.count = count;
    }
    Tablet(String name, int price,int count,String MadeIn){
        super(name, price, MadeIn);
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
