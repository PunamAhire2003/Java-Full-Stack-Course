class Practice{
    public static void main(String[] args) {
        int num=9;
        
        
        
       String result=isNeon(num);
       System.out.println(result);
   }
   public static String isNeon(int num){
        
        int square=num*num;//81
        int sum=0;
        while(square>0){
       
           
        int rem=square%10;//1
        sum=sum+rem;//0+1=1//
        square/=10;//81/10=8
    }
    
    if(sum==num){
        return "neon number";
    }
    else{
        return "not neon number";
    }
}
}


        