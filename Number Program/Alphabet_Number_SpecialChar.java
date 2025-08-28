import java.util.Scanner;

class Alphabet_Number_SpecialChar{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);

		String answer = (ch>='A' && ch<='Z' || ch>='a' && ch<='z')? (ch + "is a Alphabet")
					:(ch>='0' && ch<='9')?(ch+" is A Number")
				    : (ch + " Is A Special Character ");
                 // : (condition)?(gives answer)     contyinue thias for all [-new new conditions 
					System.out.println(answer);
				}
			}

		