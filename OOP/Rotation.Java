import java.util.Arrays;
import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2};

        System.out.println("Before: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rotation:");
        int rotation = sc.nextInt();
        sc.close();

        ClockWiseRotation(arr, rotation);
        System.out.println("After: " + Arrays.toString(arr));
    }

    public static void ClockWiseRotation(int[] arr, int rotation) {
        int n = arr.length;
        rotation = rotation % n; // if rotation > n
        for (int i = 1; i <= rotation; i++) {
            int temp = arr[0];
            for (int j = 1; j < n; j++) {
                arr[j - 1] = arr[j];
            }
            arr[n - 1] = temp;
        }
    }
}
