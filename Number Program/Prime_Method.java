import java.util.Scanner;
class Prime_Method{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int number=sc.nextInt();
	PrimeNumber(number);
		
		
		
	}
	public static void PrimeNumber(int Number){
		
		if (Number < 2) 
            System.out.println(Number + " is NOT a Prime Number");
          
	 for (int i = 2; i < Number; i++) { 
            if (Number % i == 0) {
             System.out.println("not prime Number");
		     break;
		 }
	else if(Number==i) {
		System.out.println("  Prime Number");
		
		
	}
}
}
}






