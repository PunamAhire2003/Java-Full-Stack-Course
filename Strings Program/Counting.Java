
class Practice {
    public static void main(String[] args) {
        String str = "hellOomkar%*16809";


        str=str.replace(" ","");
        str=str.toLowerCase();
        int letter=0;
        int number=0;
        int special=0;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

     if(ch>='a'&& ch<='z'){
        letter++;
     }
     else if(ch>='0'&& ch<='9'){
        number++;
     }
     else{
        special++;
    }
     }
     System.out.println("number " + number);
     System.out.println("letter " + letter);
     System.out.println("special " + special);
 }
}


