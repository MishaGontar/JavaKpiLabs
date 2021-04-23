package JavaLabs.lab6;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class CalculateByThread {
    private long n = 0 ;
    private long N = 0 ;

    public CalculateByThread(long n , long N){
        this.n = n;
        this.N = N;
    }
    public void calc() {

        int[] arrThreadsCounts = {1, 2, 4, 8, 16, 32};

        for (int thCount : arrThreadsCounts) {
            Instant starts = Instant.now();
            long res = calculateArithmeticProgress(n, N, thCount);
            Instant ends = Instant.now();
            System.out.println("Відповідь: " + res +
                    " кількість трейдов " + thCount +
                    " виконано за " +  Duration.between(starts, ends).toNanos() + " ns; (Millis) :" + Duration.between(starts, ends).toMillis() + " ms "
            );
        }
    }
    private long calculateArithmeticProgress(long n, long N, int threadsCount) {
        long res = 0;
        long nMax = 0;
        long nMin = 0;

        long m = N / threadsCount;
        long mLast = N / threadsCount + N % threadsCount;

        List<MyThread> threads = new ArrayList<>();

        MyThread at;
        for (int i = 0; i < threadsCount; i++) {
            nMin = nMax + 1;
            nMax = (nMin - 1) + (i == threadsCount - 1 ? mLast : m);

            at = new MyThread(n, nMin, nMax);
            threads.add(at);
            at.start();
        }

        for(MyThread t : threads){
            try {
                t.join();
                res += t.result;
//                System.out.println("Моніторінг: " + t.getName() + " result " + res);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return res;
    }
}
