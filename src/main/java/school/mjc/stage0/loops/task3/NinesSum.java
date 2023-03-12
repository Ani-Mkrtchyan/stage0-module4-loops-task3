package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int num = 9;
        for(int i = 1; num <= lengthOfLastNumber; i++){
            sum += num;
            num =Integer.parseInt("9".repeat(i));
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
        NinesSum ninesSum = new NinesSum();
        ninesSum.calculateSum(9);
        ninesSum.calculateSum(99999);
    }
}
