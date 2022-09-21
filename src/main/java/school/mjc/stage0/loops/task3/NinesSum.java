package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0,son =1;
        if (lengthOfLastNumber==0){
            System.out.println(0);
        }else if (lengthOfLastNumber<0){
            System.out.println(0);
        }else {
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                sum += 9 * son;
                son += (long) (Math.pow(10, i));
            }
            System.out.println(sum);
        }
    }
}