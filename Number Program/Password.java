//passwoed validation

import java.util.Scanner;

class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234;
        int attempt = 3; 

        while (attempt > 0) { 
            System.out.println("\nEnter a PIN:");
            int userPin = sc.nextInt();

            if (userPin == storedPin) {
                System.out.println("Phone unlocked");
                break; 
            } else {
                attempt--; 
                System.out.println("Wrong PIN entered");
                if (attempt > 0) {
                    System.out.println("Attempts left: " + attempt);
                } else {
                    System.out.println("Too many wrong attempts. Phone locked.");
                }
            }
        }

        
    }
}
