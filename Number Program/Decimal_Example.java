import java.util.Scanner;
class Decimal_Example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int number=sc.nextInt();
	String oct=" ";
	do{
		int r=n%8;
		oct=r+oct;
		n=n/8;
	}
	while(n!=0);
	}
	System.out.println(oct);
	}