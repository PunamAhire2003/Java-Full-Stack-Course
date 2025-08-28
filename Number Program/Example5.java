
import java.util.Scanner;
class Example5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++){   //1<=5,2<=5,3<=5,4<=5,5<=5
			 fact=fact*i;          //1*1=1,1*2=2,2*3=6,6*4=24;24*5=120
		}
		System.out.println("Factorial of " + number + " is: " + fact);
}
		}



	
