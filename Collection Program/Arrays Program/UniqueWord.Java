import java.util.*;

class StringExample1 {
    public static void main(String[] args) {
        // Input string
        String str = "java hello java hie hello hello hello java bye java";

        // Print total length with and without spaces
        System.out.println("With spaces: " + str.length());
        System.out.println("Without spaces: " + str.replace(" ", "").length());

        // Split into words
        String[] arr = str.split(" ");
        boolean[] track = new boolean[arr.length];

        String op = "";
        System.out.println("\nUnique Words:");
        for (int i = 0, count = 0; i < arr.length; i++, count = 0) {
            if (track[i]) continue;

            for (int j = i; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                    track[j] = true;
                }
            }

            if (count == 1) {
                op += arr[i] + " ";
            }
        }

        op = op.trim();  // Remove trailing space
        System.out.println("Input:  " + str);
        System.out.println("Unique: " + op);
    }
}
