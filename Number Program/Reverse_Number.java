
import java.util.Scanner;
class Reverse_Number{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=sc.nextInt();
		
		System.out.println(rev(number));
	}
	public static int rev(int number ){
		int rev=0;
		while(number>0){
		int rem=number%10;
		rev=rev*10+rem;
		number/=10;
	}
	
		return rev;
	
}
}

