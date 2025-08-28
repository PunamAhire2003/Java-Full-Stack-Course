import java.util.Scanner;
class N_Even{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a N");
		int N=sc.nextInt();
		int Nth_Even=N*2;
		System.out.println("N even number is: " + Nth_Even);
	}
}