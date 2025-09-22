class Practice{
    public static void main(String[] args) {
        int num=85;
        int originalNum=num;
        int rev=0;
        

        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("rev " +  rev);
        int sum=originalNum+rev;
        System.out.println("sum "  +  sum);

        int temp=sum;

        int revNum=0;
        while(temp>0){
            int rem=temp%10;
            revNum=revNum*10+rem;
            temp/=10;
        }
         
        if(sum==revNum){
            System.out.println("magic number");
        }
        else{
            System.out.println("not magic number");
        }




            }
        }





    
