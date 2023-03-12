package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
}
