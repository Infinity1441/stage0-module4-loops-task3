package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int count = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            count+=i;
        }
        System.out.println(count);
    }
}