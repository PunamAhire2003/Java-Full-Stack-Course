class Fibonacii{
	public static void main(String[] args) {
		int num=17;
		int rev=0;


		if(prime(num)){//17
			if(rev(num)){//71
				System.out.println("Emirp number");
			}
			else{
				System.out.println("Not Emirp");
			}
		}
		else{
			System.out.println("Emirp NOT");//90
		}
	}
		public static boolean prime(int num){
			if(num<2){
				return false;

			}
		

			for(int i=2;i<num;i++){
				if(num%i==0){
					return false;
				}
			}
			return true;
		}
	
		public static boolean rev(int num){
			int rev=0;
			while(num>0){
				int rem=num%10;

				 rev=rev*10+rem;
				 num=num/10;
				 
			}
			if(prime(rev))//17(71)
				return true;

			return false;

		}
	}



	
