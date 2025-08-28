//print add numbers from 1 to n....


import java.util.Scanner;
class Prime_Not{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}