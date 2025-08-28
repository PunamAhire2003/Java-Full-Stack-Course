//add even and odd number within n by using for loop

import java.util.Scanner;
class Even_OddSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++){
		if(i%2==0){
			sum+=i;

		}
		
	}
	System.out.println("Sum of even numbers: " + sum);

}
}


//
import java.util.Scanner;
class Even_OddSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<number;i++){
		if(i%2==0){
			sum=sum+i;

		}
		
	}
	System.out.println("Sum of even numbers: " + sum);

}
}

