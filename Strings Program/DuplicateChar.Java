class Practice{
    public static void main(String[] args) {
        String str="heello mooon";
        str=str.replace(" ","");
        str=str.toLowerCase();

        char[]arr=str.toCharArray();

        for(int i=0;i<arr.length;i++){
           if (visited[i]) continue;
            int count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=0;
                }
            }
            
        
            if(count>1){
                System.out.println("duplicate char  " +arr[i]);
            }
            }
        




        }
    }
