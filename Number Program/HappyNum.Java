class Practice {
    public static void main(String[] args) {
        int num = 19;  // try with 2 also
        int originalNum = num;

        while (originalNum > 9) {     // repeat until single digit
            int temp = originalNum;
            originalNum = 0;         // reset for new sum

            while (temp > 0) {
                int rem = temp % 10;
                originalNum += rem * rem;  // sum of squares of digits
                temp /= 10;
            }
        }

        if (originalNum == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}
