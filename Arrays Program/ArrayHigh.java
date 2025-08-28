import java.util.*;

class ArrayHigh {
    public static void main(String[] args) {
        String str = "Hellllo";
        char[] arr = str.toCharArray();
        boolean[] visited = new boolean[arr.length];

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }

                visited[i] = true;

                if (count > maxCount) {
                    maxCount = count;
                    maxChar = arr[i];
                }
            }
        }

        if (maxCount > 1) {
            System.out.println("Highest repeating character is: " + maxChar);
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("No repeating characters found.");
        }
    }
}
