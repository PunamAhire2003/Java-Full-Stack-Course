class Practice{
    public static void main(String[] args) {
        int num=7;
        int square=num*num;
        int divisor=1;
        int originalNum=num;

        while(originalNum>0){//25>0 ,2>0
            divisor=divisor*10;//1*10=10,10*10=100
            originalNum=originalNum/10;//25/10=2,2/10=0//no temp=0
        }
        int digit=square%divisor;//625%100=25
        if(num==digit){
            System.out.println("automorphic number");
        }
        else{
            System.out.println("not automorphic num");
        }
       
    
       
     
}

}

      
    