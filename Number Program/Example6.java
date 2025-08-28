
import java.util.Scanner;
class Example6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		System.out.println(add(num1,num2));//actual argument

		}
	public static int add(int num1,int num2){//formal argument

		int add=num1+num2;
		return add;
		
	}
	
	
	
	}



