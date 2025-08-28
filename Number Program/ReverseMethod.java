import java.util.Scanner;
class ReverseMethod{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();



		System.out.println(rev(number));
	}

	public static int rev(int number){
	int rev=0;
	while(number>0){
	int digit=number%10; //124%10=4
	rev=rev*10+digit; //0*10+4=4
	number/=10;//124/10=12
}
	return rev;
}
}
