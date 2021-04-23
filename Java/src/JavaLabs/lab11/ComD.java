package JavaLabs.lab11;

import java.util.ArrayList;
import java.util.List;

public class ComD {
    public ComD() {
        System.out.println("+++++++++++++++ Drops : \n");

        List<Drops> drop = new ArrayList(List.of(
                new Drops("New 1" , 9 , 10.2),
                new Drops("Koko" , 23 , 1),
                new Drops("Molo" , 15 , 2.3),
                new Drops("Joro" , 78, 48),
                new Drops("Kiva" , 99, 14)
        ));

        System.out.println("* Посилання на статичний метод класу : ");
        VoidInterface inter = Medicine::documentation;
        inter.accept();

        System.out.println("\n* Посилання на нестатичний метод об’єкта :");
        StringInterface stringInterfaces = drop.get(0)::getName;
        System.out.println(stringInterfaces.getStringInterface());

        System.out.println("\n* Посилання на нестатичний метод класу :");
        drop.forEach(Drops::print);

    }
}
