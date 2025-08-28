class Prime_Logic{
	public static void main(String[] args) {
		int number=9;
		int count=0;
		for(int i=1;i<=number;i++){
			if(i%2==0){
				count++;
			}
		}
		
		if(count==2 && number<=1){
			System.out.println(number + "this is Prime number");
		}
		else{
			System.out.println(number +"this is not prime number");
		}
	}
}

