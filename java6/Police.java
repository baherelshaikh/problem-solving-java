import java.util.Scanner;

public class Police {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the number of events
        int NO_OfEvents = in.nextInt();
        
        // Initialize variables to track manpower and untreated crimes
        int manpower = 0;
        int untreated = 0;

        // Iterate through each event
        for (int i = 0; i < NO_OfEvents; i++) {
            int crime = 0; // Variable to track the number of crimes in each event
            
            // Read the value of the current event
            int event = in.nextInt();

            // If the event is positive, it adds to the manpower
            if (event > 0)
                manpower += event;
            else {
                // If the event is negative (indicating a crime), handle it
                crime++;
                
                // Check if there's enough manpower to handle the crime
                if (manpower - crime < 0)
                    untreated++; // Increment untreated crimes if there's not enough manpower
                else
                    manpower--; // Decrement manpower if the crime is handled
            }
        }

        // Output the number of untreated crimes
        System.out.println(untreated);

        in.close(); 
    }
}
