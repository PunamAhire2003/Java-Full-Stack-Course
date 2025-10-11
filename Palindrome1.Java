class Practice{
    public static void main(String[] args) {
        String str="nayam";
         str=str.replace(" ","");
        
         int left=0;
         int right=str.length-1;

         while(left<right){
            if(str.charAt(left)!=str.charAt(right){
                System.out.println(" not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");
            