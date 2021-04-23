package JavaLabs.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ComT implements ProInterface {
    private  TreeSet<Tablet> TabletTree = new TreeSet<>();

    public void printMain(){
       System.out.println(" +++++++++++++++ Tablets : \n");

        List<Tablet> tablets = new ArrayList(List.of(
                new Tablet(null , 16 , 1,"Kikol"),
                new Tablet("Bololo" , 11 , 119,"Anana"),
                new Tablet("1" , 8 , 119,"Nono"),
                new Tablet("Lorin" , 92, 12,"Livo"),
                new Tablet("Lorin" , 92, 12,"Vovo"),
                new Tablet("Lorin" , 92, 12,null)
        ));
        System.out.println("Our Array : ");
        print(tablets);

        System.out.println("* Sort by lambda (price) : ");
        tablets.sort(comparatorPrice());
        print(tablets);

        System.out.println("* Reverse (price)  : ");
        tablets.sort(comparatorReversed());
        print(tablets);

        System.out.println("Multi Comparator (1.price -> 2. Name -> 3.MadeIn): ");
        tablets.sort(thenComparing());
        print(tablets);

        addToTree(tablets);
    }
    private  void print(List<Tablet> tablets){
        tablets.forEach(d -> System.out.println("Tablet :" + d.name + " price : " + d.price + " | Made in : "+d.MadeIn));
        System.out.println("\n");
    }
    private  void addToTree(List<Tablet>tablets){
        tablets.forEach(d ->TabletTree.add(d));
    }

    public  void printTree(){
       System.out.println("==========| TreeSet for Tablets |=================");
       TabletTree.forEach(d ->System.out.println("Tablet :" + d.name + " price : " + d.price ));
       System.out.println("===============================================\n");
   }
}
