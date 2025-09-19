class Practice{
    public static void main(String[] args) {
       int num=153;
       int sum=0;
       int power=1;

       for(int i=0;i<num;i++){
        int rem=num%10;//3
        power=power*rem;
        sum=sum+rem;
        num/=10;
    }
}

    if(num==sum){
                System.out.println("armstrong number");
            }
            else{
                System.out.println("not armstrong");
            }
        }
       
   




       