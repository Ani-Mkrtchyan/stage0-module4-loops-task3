package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int smaller = (first < second) ? first : second;
        int gcd = 1;
        for (int i = 2; i <= smaller; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }

        }
        System.out.println("Greatest Common Divisor is  " + gcd);
    }
        public static void main (String[]args){
            GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
            greatestCommonDivisor.printGCD(4, 8);
            greatestCommonDivisor.printGCD(50, 250);
        }
    }
