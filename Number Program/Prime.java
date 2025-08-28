public class Prime_N {
    public static void main(String[] args) {
        int num = 8;
        int count = 0;

        for (int i = 1; i <= num; i++) { //2<=8,3<=8
            if (num % i == 0) {   //8%1=0,8%2=0,8%3=2,8%4=0,
                count++;      //2,3,4 if not divide mod const
            }
        }

        // Prime number has exactly 2 factors (1 and itself)
        System.out.println((count == 2 && num > 1) ? "Prime" : "Not Prime");//4==2&&8>1
    }
}
