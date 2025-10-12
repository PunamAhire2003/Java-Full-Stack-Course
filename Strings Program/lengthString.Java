class Practice{
    public static void main(String[] args) {
        String str="punama om";
        int count=0;
        str=str.replace(" ","");

        for(int i=0;i<str.length();i++){
            count++;
        }
        System.out.println(count);
       
    }
}