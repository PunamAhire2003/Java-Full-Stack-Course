import java.util.Scanner;
class Hex{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		 System.out.println("Hexadecimal: " + decToHex(number));
	}
	public static String decToHex(int number){
	String hex=" ";
	do {
		int r=number%16;
		if(r<10){
			hex=r+hex;

		}
		else if(r==10){
			hex="A"+hex;
		}
		else if(r==11){
			hex="B"+hex;
		}
		else if(r==12){
			hex="C"+hex;
		}
		
		else if(r==13){
			hex="D"+hex;
		}
		
		else if(r==14){
			hex="E"+hex;
		}
		
		else if(r==15){
			hex="F"+hex;
		}
		number=number/16;
	
}
	
	while(number!=0);

	return hex;
}
	}		


	
	



	
	

