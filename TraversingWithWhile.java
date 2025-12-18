/**
 * Activity 3.1.2 - Traversing with a While Loop
 */
public class TraversingWithWhile {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

        System.out.println("Traversing with a while loop:");
        
        int i = 0; // Initialize the index variable [cite: 52]
        
        /* * The Boolean expression i < goals.length determines 
         * when the loop terminates[cite: 48, 53].
         */
        while (i < goals.length) {
            System.out.println("Game " + (i + 1) + ": " + goals[i]);
            i++; // Increment is required to avoid an infinite loop [cite: 52]
        }
    }
}
