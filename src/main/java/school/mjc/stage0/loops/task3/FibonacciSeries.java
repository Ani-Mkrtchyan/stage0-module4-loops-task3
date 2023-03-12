package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0;
        int num2 = 1;

        if (lastFibonacci > 0) {
            System.out.println(num1);
            for (int i = 2; i <= lastFibonacci; i++) {
                System.out.println(num2);
                int temp = num2;
                num2 = num1 + num2;
                num1 = temp;
            }
        }

    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(5);
    }
}
