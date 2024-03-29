import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the username:");
        String username = in.next();

        // Convert the username to lowercase to ignore case sensitivity
        username = username.toLowerCase();

        // Convert the username to a character array for easier processing
        char[] charArray = username.toCharArray();

        // Sort the character array to group similar characters together
        Arrays.sort(charArray);

        // Use a Set to count unique characters
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : charArray) {
            uniqueChars.add(c);
        }

        // Calculate the number of unique characters
        int noOfChar = uniqueChars.size();

        // Determine whether to "CHAT WITH HER!" or "IGNORE HIM!"
        if (noOfChar % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

        in.close(); 
    }
}
