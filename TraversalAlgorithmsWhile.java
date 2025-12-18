public class TraversalAlgorithmsWhile {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        String[] misc = {"A", "B", "C", "D", "E", "F"};

        algorithm1(goals);
        algorithm2(goals);
        algorithm3(misc);
        algorithm4(misc);
    }

    public static void algorithm1(int[] goals) {
        int index = 1; // Fix: Start at 1 to prevent OutOfBounds [cite: 416]
        while (index < goals.length) {
            if (goals[index - 1] == 0) {
                System.out.println("Previous game had no goals!");
            }
            index++;
        }
    }

    public static void algorithm2(int[] goals) {
        int sum = 0;
        int i = 0;
        while (i < goals.length) { // Fix: Include last index [cite: 428]
            sum += goals[i];
            i++; // Fix: Increment counter to avoid infinite loop
        }
        System.out.println("All goals: " + sum);
    }

    public static void algorithm3(String[] misc) {
        int num = misc.length - 1; // Fix: Start at valid index [cite: 397]
        while (num >= 0) {
            System.out.print(misc[num] + " ");
            num--;
        }
        System.out.println();
    }

    public static void algorithm4(String[] misc) {
        int j = 0;
        while (j < misc.length) {
            System.out.print(misc[j] + " "); // Fix: Logic to print every other element [cite: 451, 452]
            j += 2;
        }
        System.out.println();
    }
}
