
class Prime_code_Method{
	public static void main(String[] args) {
		int num=13;
		if(prime(num)){
			System.out.println("prime");
		}
		else{
			System.out.println("Not prime");
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

}
