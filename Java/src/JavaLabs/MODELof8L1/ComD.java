package JavaLabs.MODELof8L1;

import java.util.*;

public class ComD {
    private TreeSet<Drops> tabletTree = new TreeSet<Drops>();

    public class DropsComparator implements Comparator<Drops> {
        @Override
        public int compare(Drops s1, Drops s2) {
            return s1.price - s2.price;
        }
    }

    public void camD (){
        System.out.println(" +++++++++++++++ Drops : \n");
        Drops [] drops = new Drops[5];
        drops[0] = new Drops("New 1" , 9 , 10.2);
        drops[1] = new Drops("Koko" , 23 , 1);
        drops[2] = new Drops("Molo" , 15 , 2.3);
        drops[3] = new Drops("Joro" , 78, 48);
        drops[4] = new Drops("Kiva" , 99, 14);

        System.out.println("Before comparator : ");
        print(drops);

        Arrays.sort(drops,new DropsComparator());

        System.out.println("After comparator : ");
        print(drops);
        addToTree(drops);

    }
    private  void print(Drops[] drops){
        for (Drops d : drops){
            System.out.println("Drop :" + d.name + " price : " + d.price );
        }
        System.out.println("\n");
    }
    private void  addToTree(Drops[] drops){
        for (Drops d : drops){
           tabletTree.add(d);
        }
    }

    public void printTree(){
        System.out.println("==========| TreeSet for Drops |=================");
        tabletTree.forEach(element -> System.out.println("Drop: " + element.name + " Price : " + element.price + " Ml : " + element.ml));
        System.out.println("===============================================\n");
    }
}
