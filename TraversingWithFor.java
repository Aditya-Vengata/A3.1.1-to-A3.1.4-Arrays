/**
 * Activity 3.1.2 - Traversing with a For Loop
 */
public class TraversingWithFor {
    public static void main(String[] args) {
        // The goals array tracks the number of goals scored in a season [cite: 15]
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

        System.out.println("Traversing with a for loop:");
        
        /* * The loop starts at 0 and goes until one less than the length[cite: 48].
         * The attribute goals.length is used as a sentinel value[cite: 53].
         */
        for (int i = 0; i < goals.length; i++) {
            // Games are displayed as 1 through n for the user [cite: 54]
            System.out.println("Game " + (i + 1) + ": " + goals[i]);
        }
    }
}
