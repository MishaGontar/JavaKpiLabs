package JavaLabs.lab10.task1;

public class Task1 {
    Task1(double a1 , double b1 , double c1 , double d1){
        Consumer<Double> calculate = (a, b, c, d) -> System.out.println((Math.pow(Math.tan(a),1.0/c))/(1.0 + (Math.sinh(b)/Math.log(Math.abs(d+c))))+ "\n");
        calculate.math(a1,b1,c1,d1);
    }
}
