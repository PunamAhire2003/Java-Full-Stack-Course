class Practice{
    public static void main(String[] args) {
        int num=8;
        int digit=num+1;
        boolean isSunny=false;

        for(int i=1;i*i<=digit;i++){
            if(i*i==digit){
                isSunny=true;

            }
        }
        if(isSunny){
            System.out.println("sunny number");
        }
        else{
            System.out.println("not sunny number");
        }
    }
}


       