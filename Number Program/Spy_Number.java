import java.util.Scanner;
class Spy_Number{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number");
			int number=sc.nextInt();

			int sum=0;
			int product=1;
			int rem=0;

			int i=number;
			while(i>0){
				rem=i%10;    //123%10=3  ,12%10=2 ,1%10=1
				sum=sum+rem;   //0+3=3,3+2=5,1+5=6
				product=product*rem;  //1*3=3,3*2=6,1*6=6
				i=i/10;   //123/10=12,12/10=1

			}
			if(sum==product){
				System.out.println(Number+ "spy number");
			}
			else{
				System.out.println("not a spy number");
			}



		}
	
	}
