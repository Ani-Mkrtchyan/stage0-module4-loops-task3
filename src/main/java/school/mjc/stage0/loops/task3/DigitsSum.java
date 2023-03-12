package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String numStr = t + "";
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Integer.parseInt(numStr.charAt(i) + "");
            sum += digit;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(123);
    }
}
