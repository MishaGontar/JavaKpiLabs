package JavaLabs.lab6;

public class MyThread extends Thread{
    long x;
    long nMin;
    long nMax;
    long result;

    public MyThread(long n, long nMin, long nMax ) {
        setName("Thread_"+nMin+"_"+nMax);
        //System.out.println(getName() + " створення потока");
        this.x = n;
        this.nMin = nMin;
        this.nMax = nMax;
    }


    @Override
    public void run() {
        long res=0;
        for(long i = nMin; i <= nMax; i++){
            res += x*i;
        }
        result = res;
    }
    public long getResult() {
        return result;
    }
}
