import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
            if (number >= 0) {
                int digitCount = countDigits(number);
                System.out.println("Total digits: " + digitCount);
            }
        } while (number >= 0);
        System.out.println("Program exited.");
    }
    public static int countDigits(int number) {
        int count = 0;
        // Handle the case of 0 separately
        if (number == 0) {
            return 1;
        }
        // Take the absolute value to handle negative numbers
        number = Math.abs(number);
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}


