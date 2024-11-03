import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (first middle last): ");
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        String formattedName = last + ", " + first + " " + middle.charAt(0) + ".";
        System.out.println("Formatted name: " + formattedName);

        scanner.close();
    }
}

