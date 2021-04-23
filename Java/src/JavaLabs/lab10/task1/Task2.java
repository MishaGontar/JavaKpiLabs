package JavaLabs.lab10.task1;

public class Task2 {
    Task2(double a1 , double b1 , double c1 , double d1){
        Consumer<Double> calculate = (a, b, c, d) -> System.out.println(2*Math.log(Math.pow(b,a)) + Math.abs(Math.asin(-(Math.sqrt(d/c)))) + "\n");
        calculate.math(a1,b1,c1,d1);
    }
}
