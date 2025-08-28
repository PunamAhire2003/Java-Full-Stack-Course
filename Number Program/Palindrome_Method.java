import java.util.Scanner;

class Palindrome_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        Palindrome(Number);
    }

    public static String Palindrome(int Number) {
        int originalNumber = Number;
        int rev = 0;

        while (Number > 0) {
            int rem = Number % 10;
            rev = rev * 10 + rem;
            Number /= 10;
        }

        if (originalNumber == rev) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }
}
