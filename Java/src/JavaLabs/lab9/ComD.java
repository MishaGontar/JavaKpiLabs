package JavaLabs.lab9;
import java.util.*;

public class ComD implements ProInterface {

    private TreeSet<Drops> dropTree = new TreeSet<>();

    public void printMain(){
        System.out.println(" +++++++++++++++ Drops : \n");

        List<Drops> drop = new ArrayList(List.of(
                new Drops("New 1" , 9 , 10.2),
                new Drops("Koko" , 23 , 1),
                new Drops("Molo" , 15 , 2.3),
                new Drops("Joro" , 78, 48),
                new Drops("Kiva" , 99, 14)
        ));
        List<Drops> drop2 = new ArrayList(List.of(
                new Drops("Ahalai" , 99 ,"Inrona", 10.2),
                new Drops("Banana" , 99 , "Zora",50),
                new Drops("Banana" , 99 , "German",120),
                new Drops(null , 99, "Canada",48),
                new Drops("Mahalai" , 19,"Lomolo", 14),
                new Drops("WosSho" , 89,"WHere?", 10)
        ));

        System.out.println("Our Array : ");
        print(drop);

        System.out.println("* Sort by lambda (price) : ");
        drop.sort(comparatorPrice());
        print(drop);

        System.out.println("* Reverse (price)  : ");
        drop.sort(comparatorReversed());
        print(drop);

        System.out.println("Then Comparator (1.price -> 2. Name -> 3.MadeIn): ");
        drop2.sort(thenComparing());
        print(drop2);

        addToTree(drop);

    }
    private  void print(List<Drops>  drops){
        for (Drops d : drops){
            System.out.println("Drop :" + d.name + " price : " + d.price + " | Made in : "+d.MadeIn );
        }
        System.out.println("\n");
    }
    private void  addToTree(List<Drops> drops){
        for (Drops d : drops){
           dropTree.add(d);
        }
    }

    public void printTree(){
        System.out.println("\n==========| TreeSet for Drops |=================");
        dropTree.forEach(element -> System.out.println("Drop: " + element.name + " Price : " + element.price + " Ml : " + element.ml));
        System.out.println("===============================================\n");
    }
}
