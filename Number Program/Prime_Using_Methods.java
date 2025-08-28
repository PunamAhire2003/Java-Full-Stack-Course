class Prime_Using_Methods{
	public static void main(String[] args) {
		
		int num = 7;
		if(isPrime(7))
			System.out.println("PRime");
		else
			System.out.println(" Not PRime");

	}
 public static boolean isPrime(int numo)
 {
 	if(numo==1)
 		return false;
 	for(int den = 2 ; den<numo; den++ )
 	{
 		if(numo%den==0)
 		{
 			return false;
 		}
 	}
 	return true;
 }


}