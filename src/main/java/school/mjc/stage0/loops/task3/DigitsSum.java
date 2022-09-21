package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int number = Math.abs(t);
        int sum;
        for(sum=0; number!=0; number=number/10)
        {

            sum = sum + number % 10;
        }

        System.out.println(sum);
    }
}