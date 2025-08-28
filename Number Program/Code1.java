import java.util.Scanner;
class Code1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();


		System.out.println(palindrome(number));
	}

	public static String palindrome(int number){
	int rev=0;
	int originalNumber=number;
	for(int i=number;i>0;i/=10)
	{
			int digit=i%10;
			rev=rev*10+digit;

	}
	return originalNumber==rev? "Palindrome" : "Not";



	
}
}
