import java.util.Scanner;
public class PerfectNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a NUmber:");
		int num = sc.nextInt();
		int sum =0;
                  //5
for(int i = 1 ; i<num; i++)//i=1  , 2  ,3 , 4 , 5
{
		if(num%i==0){    //6%1=0 true  6%2=0    6%3=0    6%4=2 false      6%5=1 false
			sum=sum+i;  // sum=0+1=1      sum=1+2=3     sum=3+3=6    
		}

}
System.out.println(sum);
if(num==sum)
{
	System.out.println(num+" is a Perfect Number");
}
else{
	System.out.println(num+ " is Not A Perfect Number");
}

	}
}