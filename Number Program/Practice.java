class Practice{
	public static void main(String[] args) {
		int Number=67;
		System.out.println(evenodd(Number));

	}
	public static String evenodd(int Number){
	if(Number%2==0){
		return "even";
	}
	else{
		return"odd";
	}
}
}