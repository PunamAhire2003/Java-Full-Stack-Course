import java.util.*;

class ArrayFrequencyChar {
    public static void main(String[] args) {
        String str = "HHello ";
        char[] arr = str.toCharArray(); 
        boolean[] visited = new boolean[arr.length];

        System.out.println("String: " + str);
        System.out.println("Character | Frequency");

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
                System.out.println("    " + arr[i] + "     |     " + count);
            }
        }
    }
}
