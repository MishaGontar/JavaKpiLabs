package JavaLabs.lab10;

public class Drops extends Medicine {
    double ml;

    Drops(String name, int price , double ml) {
        super(name, price);
        this.ml = ml;
    }

    Drops(String name, int price, String MadeIn, double ml) {
        super(name, price,MadeIn);
        this.ml = ml;
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
