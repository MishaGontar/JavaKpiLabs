package JavaLabs.lab10.task1;

public class Task3 {
    Task3(double a1 , double b1 , double c1 , double d1){
        Consumer<Double> calculate = (a, b, c, d) -> System.out.println(3*(Math.log(Math.abs(a/b)) + Math.sqrt(Math.cos(c) + Math.pow(Math.E,d)))+ "\n");
        calculate.math(a1,b1,c1,d1);
    }
}
