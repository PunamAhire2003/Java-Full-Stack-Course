import java.util.Scanner;
class Perfect_Number{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number"); //28
		int number=sc.nextInt();

		int sum=0;
		for(int i=1;i<=number/2;i++){   //i=2,i=3,i=4  (3<=6/2=3 so stop)
			if(number%i==0){  //6%1==0,6%2==0,6%3==0,6/4not 0 so false sum same
				sum=sum+i;  //0+1=1,1+2=3,3+3=6

			}
		}
		if(sum==number){
			System.out.println(number + "  perfect number");
		}
		else{
			System.out.println(number + "  not a perfect number");
		}

	}
}