package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0; // the first two terms of the series
        int num2 = 1;


            for (int i = 1; i <= lastFibonacci; i++) {
                System.out.println(num1);
                int temp = num1+num2;
                num1 = num2;
                num2 = temp;
            }
        }



    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(5);

    }
}
