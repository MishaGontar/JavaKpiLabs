package JavaLabs.lab6;

public class Main {
    public static void main(String[] args) {
        long n = 7;
        long N = 1000000000;

        new FormulaSum(n,N);
        new CalculateByThread(n,N).calc();
    }
}