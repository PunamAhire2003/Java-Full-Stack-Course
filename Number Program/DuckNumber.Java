class Practice{
    public static void main(String[] args) {
        int num=5209;
        boolean isDuck=false;
       
        while(num>0){
           // int count=0;
            int rem=num%10;//9
            if(rem==0){
               isDuck=true;
            }
            
                num/=10;
            
        }
        if(isDuck){
            System.out.println("duck number");
        }
        else{

         System.out.println("not duck number");
        }
    }
}


    

        
       


        