package JavaLabs.lab11;

import java.util.ArrayList;
import java.util.List;

public class ComT {
    public ComT() {
       System.out.println(" +++++++++++++++ Tablets : \n");

        List<Tablet> tablets = new ArrayList(List.of(
                new Tablet("Bololo" , 11 , 119,"Anana"),
                new Tablet("1" , 8 , 119,"Nono"),
                new Tablet("Lorin" , 92, 12,"Livo"),
                new Tablet("Lorin" , 92, 12,"Vovo")
        ));
        System.out.println("* Посилання на статичний метод класу : ");
        VoidInterface inter = Medicine::documentation;
        inter.accept();

        System.out.println("\n* Посилання на нестатичний метод об’єкта :");
        StringInterface stringInterfaces = tablets.get(0)::getName;
        System.out.println(stringInterfaces.getStringInterface());

        System.out.println("\n* Посилання на нестатичний метод класу :");
        tablets.forEach(Tablet::print);
    }
}
