class Prime_Using_Methods_Number_2{
	public static void main(String[] args) {

		isPrime(9);  //method call
	}
 public static void isPrime(int numo)  //numo = 7
 {
 	if(numo==1) //numo==1 false
 		System.out.println(" Not PRime");

 	for(int den = 2 ; den<numo; den++ )//den start from 2 to 6
 	{6
 		if(numo%den==0)//7%2==1 false   7%3==1 false 7%4==3false 7%5==2 false 7%6==1false
 		{
 			System.out.println(" Not PRime");
 			break;
 		}
 		else{
 			System.out.println("PRime");
 		}
 	}
 }
}
 	
 
