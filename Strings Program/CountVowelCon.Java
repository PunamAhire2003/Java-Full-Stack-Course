class Practice {
    public static void main(String[] args) {
        String str = "hellO& ";
        int vowel=0;
        int cons=0;
        str = str.toLowerCase(); // ignore case
        str=str.replace(" ","");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){


            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;

            }
            else{
                cons++;
            }
                
            }
        }
            
            System.out.println("vowel : " + vowel);
            System.out.println("cons : " + cons);

        
    }
}


        