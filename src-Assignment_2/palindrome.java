import java.util.StringTokenizer;
public class palindrome {
    public static void main(String[] args) {
        // Get the sentence from the user
        System.out.print("Enter a sentence: ");
        String input = System.console().readLine();
        // Remove spaces and punctuation, and convert to
        // lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // Use StringTokenizer to split the cleaned sentence
        // into words
        StringTokenizer tokenizer = new
                StringTokenizer(cleanInput);
        // Reconstruct the cleaned sentence without spaces
        StringBuilder reversed = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            reversed.insert(0, tokenizer.nextToken());
        }
        // Check if the cleaned sentence is a palindrome
        if (cleanInput.equals(reversed.toString())) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }
}
