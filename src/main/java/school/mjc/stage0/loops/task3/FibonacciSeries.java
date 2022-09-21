package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f0=0,f1=1,fn=0;
        for (int i = 0; i <= lastFibonacci; i++) {
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }
        System.out.println(fn);
    }
}
