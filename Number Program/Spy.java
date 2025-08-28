import java.util.Scanner;
class Spy{
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a  Number:");
	int num = sc.nextInt();
	int rem;
	int sum = 0;     // num = 123
	int product = 1;

	int i=num;
	while(i>0)  //12>0 true   1>0 true    
		{
			rem = i % 10;   //      123%10=3      12%10=2   1%10= 1
			sum = sum + rem;  //         0+3=3       3+2=5      5+1=6
			product = product * rem; // 1*3=3       3*2=6      6*1=6

			i=i/10;                             //123/10=12   //12/10=1
		}
	
		
	if(sum==product){
		System.out.println("spy number");
	}
	else{
		System.out.println("not spy number");
	}
}
}