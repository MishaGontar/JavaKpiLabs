package JavaLabs.lab6;

import java.time.Duration;
import java.time.Instant;

public class FormulaSum {
    public FormulaSum(long a1 , long aLast ){

        Instant starts = Instant.now();

        long a = a1 + (aLast*a1);
        long b = aLast/2;
        long result = a*b;

        Instant ends = Instant.now();
        System.out.println("Результат за допомогою формули розрахунку суми арифметичної прогресії :" + result +
                " виконано за " +  Duration.between(starts, ends).toNanos() + " ns; (Millis) :" + Duration.between(starts, ends).toMillis() + " ms ");
    }
}
