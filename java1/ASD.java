import java.util.Scanner;

public class ASD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read the number of elements
        int x = in.nextInt();
        
        // Create an array to store the elements
        int[] y = new int[x];
        
        // Read the elements into the array
        for (int i = 0; i < x; i++) {
            y[i] = in.nextInt(); 
        } 
        
        // Initialize variables
        int j = x - 1; // j starts at the last index
        int s = 0, d = 0, n = 0; // s and d for accumulating sums, n to track turns
        
        // Iterate through the array
        for (int i = 0; i < x;) {
            if (y[i] < y[j]) {
                // Increment sum based on turn parity
                if (n % 2 == 0) 
                    s += y[j];
                else 
                    d += y[j];  
                
                // Move to the previous element
                j--;
                n++; 
            } else if (y[i] > y[j]) {
                // Increment sum based on turn parity
                if (n % 2 == 0)
                    s += y[i];
                else
                    d += y[i];
                
                // Move to the next element
                i++;
                n++;
            } else {
                // Increment sum based on turn parity
                if (n % 2 == 0)
                    s += y[i];
                else
                    d += y[i];
                
                // Move to the next element
                i++;
                n++;
            }        
           
            // Break the loop if we have covered all elements
            if (i > j)
                break;
        }
        
        // Output the sums
        System.out.println(s + " " + d);
        
        in.close();
    }
}
