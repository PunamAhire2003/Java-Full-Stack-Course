class Practice {
    public static void main(String[] args) {
        int num = 1234;
        int originalNum = num;//135=135

        
        while(originalNum>9){
            int temp= originalNum;
            originalNum=0;//for  another loop its 0
        
        while(temp>0){
        originalNum=originalNum+temp%10;
           
            temp/=10;
        }
    }

    
    if(originalNum==1){
        System.out.println("magic number");
    }
    else{
        System.out.println("not magic number");
    }
}
}
