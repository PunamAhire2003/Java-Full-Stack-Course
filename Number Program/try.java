import java.util.scanner;

class Try{
	public static void main(String[] args) {
		
		scanner sc=new scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();


		if(num*2)/2==0{
			System.out.println("even");
		}
		else{
			System.out.println("odd");

		}
	}
}