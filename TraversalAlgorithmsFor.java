public class TraversalAlgorithmsFor {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        String[] misc = {"A", "B", "C", "D", "E", "F"};

        algorithm1(goals);
        algorithm2(goals);
        algorithm3(misc);
        algorithm4(misc);
    }

    // Fix: Changed index to start at 1 to avoid index -1 error [cite: 377, 416]
    public static void algorithm1(int[] goals) {
        for (int p = 1; p < goals.length; p++) {
            if (goals[p - 1] == 0) {
                System.out.println("Previous game had no goals!");
            }
        }
    }

    // Fix: Changed condition to n < goals.length to include the last element [cite: 389]
    public static void algorithm2(int[] goals) {
        int sum = 0;
        for (int n = 0; n < goals.length; n++) {
            sum += goals[n];
        }
        System.out.println("All goals: " + sum);
    }

    // Fix: Changed start index to misc.length - 1 to stay within bounds [cite: 397]
    public static void algorithm3(String[] misc) {
        for (int j = misc.length - 1; j >= 0; j--) {
            System.out.print(misc[j] + " ");
        }
        System.out.println();
    }

    // Fix: Adjusted condition to skip < misc.length to include the last element [cite: 405]
    public static void algorithm4(String[] misc) {
        for (int skip = 1; skip < misc.length; skip += 2) {
            System.out.print(misc[skip] + " ");
        }
        System.out.println();
    }
}
