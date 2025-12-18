/**
 * Activity 3.1.2 - Traversing Arrays
 * Display goals in reverse order.
 */
public class TraverseBackwards {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

        // Standard reverse traversal: Start at last index, end at 0
        System.out.println("Goals in Reverse Order:");
        for (int i = goals.length - 1; i >= 0; i--) {
            System.out.println(goals[i]);
        }
        
        System.out.println("\nEvery Other Goal in Reverse Order:");
        // Task 8: Count down by 2s using a combined assignment operator
        for (int i = goals.length - 1; i >= 0; i -= 2) {
            System.out.println(goals[i]);
        }
    }
}
