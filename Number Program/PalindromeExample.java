import java.util.Scanner;
class PalindromeExample{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int number=sc.nextInt();
	PalindromeNumber(number);
		
		
		
	}
	public static void PalindromeNumber(int Number){
		int originalNumber=Number;
		int rev=0;
		for(;Number>0;Number=Number/10){
		int digit=Number % 10;
		rev=rev*10+digit;

	}


		
	if(originalNumber==rev){
		System.out.println("is Palindrome");
	}
	else {
		System.out.println("is Not Palindrome");
	}
}
}



