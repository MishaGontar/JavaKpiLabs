package JavaLabs.MODELof8L1;
import java.util.*;

public class ComT {
    private static TreeSet<Tablet> DropsTree = new TreeSet<>();

    public static class TablesComparator implements Comparator<Tablet> {
        @Override
        public int compare(Tablet t1, Tablet t2) {
            return t1.price - t2.price;
        }
    }

    public static void camT (){
       System.out.println(" +++++++++++++++ Tablets : \n");
       Tablet [] tablets = new Tablet[5];
       tablets[0] = new Tablet("Kiko",16,19);
       tablets[1] =  new Tablet("Jok",8,119);
       tablets[2] =  new Tablet("Yoga",11,9);
       tablets[3] =  new Tablet("Homichok",16,29);
       tablets[4] =  new Tablet("Queue",92,100);
        System.out.println("Before : ");
        print(tablets);

        Arrays.sort(tablets,new TablesComparator());

        System.out.println("After : ");
        print(tablets);
        addToTree(tablets);
    }
    private static void print(Tablet[] tablets){
        for (Tablet d : tablets){
            System.out.println("Tablet :" + d.name + " price : " + d.price );
        }
        System.out.println("\n");
    }
    private static void addToTree(Tablet[] tablets){
        for (Tablet d : tablets){
            DropsTree.add(d);
        }
    }

    public static void printTree(){
       System.out.println("==========| TreeSet for Tablets |=================");
        for(Tablet d: DropsTree){
            System.out.println("Tablet :" + d.name + " price : " + d.price );
        }
       System.out.println("===============================================\n");
   }
}
