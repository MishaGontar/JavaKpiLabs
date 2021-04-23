package JavaLabs.lab10;

import java.util.Comparator;

public interface ProInterface {

    default Comparator<Medicine> comparatorPrice(){
        return (o1, o2) -> o1.getPrice()-o2.getPrice();
    }

    default Comparator<Medicine> thenComparing(){
        return Comparator
                .comparing(Medicine::getPrice , Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparing(Medicine::getName,Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparing(Medicine::getMadeIn,Comparator.nullsFirst(Comparator.naturalOrder()));
    }

    default Comparator<Medicine> comparatorReversed() {
        return comparatorPrice().reversed();
    }
}
