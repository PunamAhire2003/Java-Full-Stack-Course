class Practice {

    
    public static boolean isPalindrome(String str) {
        str = str.replace(" ", "");   
        str = str.toLowerCase();      
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }

    public static void main(String[] args) {
        
        String str = "punam";

        

        if (isPalindrome(str)) {
            System.out.println(str2 + " is a Palindrome");
        } else {
            System.out.println(str2 + " is not a Palindrome");
        }
    }
}
