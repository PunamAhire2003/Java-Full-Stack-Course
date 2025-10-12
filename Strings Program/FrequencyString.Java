class Practice {
    public static void main(String[] args) {
        String str = "hEllO mom dad ";
        str=str.toLowerCase();
        str=str.replace(" ","");

        char[]arr=str. toCharArray();
       

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)continue;
            int count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=0;
                }
            }
            System.out.println(arr[i]+ ":"+count);
        }
    }
}


        