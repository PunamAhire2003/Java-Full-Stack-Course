import java.util.Scanner;
class Addition{
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num 1");
	int num1=sc.nextInt();
	System.out.println("Enter a num 2");
	int num2=sc.nextInt();
	addition(num1,num2);

}
public static void addition(int num1,int num2){
	int addition=num1+num2;
	System.out.println("addition of number is:"+ addition);
}

}