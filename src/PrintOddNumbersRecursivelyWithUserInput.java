public class PrintOddNumbersRecursivelyWithUserInput {
    public static void main(String[] args) {
        int current=15;
        printOddNumbers(current);
    }

    public static int printOddNumbers(int current) {
        if (current == 1) {
            return 0;
        }
        if (current % 2 != 0) {
            System.out.println(current);
            printOddNumbers(current - 2); // Print odd number
        }
        return 1;

    }
}