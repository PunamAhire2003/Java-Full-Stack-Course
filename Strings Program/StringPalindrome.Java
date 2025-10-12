class Practice {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        str = str.toLowerCase(); // ignore case

        // remove spaces
        String originalStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                originalStr += str.charAt(i);
            }
        }

        int left = 0;
        int right = originalStr.length() - 1;

        while (left < right) {
            if (originalStr.charAt(left) != originalStr.charAt(right)) {
                System.out.println("Not Palindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Palindrome");
    }

}