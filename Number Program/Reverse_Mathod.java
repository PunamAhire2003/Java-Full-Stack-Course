import java.util.Scanner;
class Reverse_Method{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();


		System.out.println(rev(number));
	}

	public static int rev(int number){
	rev=0
	int digit=number%10;
	rev=rev*10+digit;
	number/=10;
	return rev;
}
}

