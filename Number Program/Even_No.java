import java.util.Scanner;

class Even_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  N value: ");
        int N = sc.nextInt();

        for (int i = 0; i <= N * 2; i += 2) {
            System.out.println(i);
        
    }
}
}