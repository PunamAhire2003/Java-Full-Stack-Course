class Practice{
    public static void main(String[] args) {
       int num=153;
       int originalNum=num;
       int sum=0;
       

       while(num>0){
        int rem=num%10;//3,5
        int power=rem*rem*rem;//3*3*3//5*5*5=125
        sum=sum+power;//0+27=27//27
        num/=10;//15
    }


    if(originalNum==sum){
                System.out.println("armstrong number");
            }
            else{
                System.out.println("not armstrong");
            }
        }
    }

        