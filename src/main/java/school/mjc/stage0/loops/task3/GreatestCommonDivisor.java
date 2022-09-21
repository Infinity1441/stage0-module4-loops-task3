package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int thatNum=1;
        int max=Math.max(first,second);
        for (int i = 1; i <= max; i++) {
            if (first % i == 0 && second % i == 0) {
                thatNum = i;
            }
        }

        System.out.println(thatNum);
    }
}