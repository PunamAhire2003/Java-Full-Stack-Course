//all zero at last
class ReplaceZeroLast{
    public static void main(String[] args) {
        int[]arr={0, 1, 9, 8, 4, 0, 0, 2};

        int index=0;
//non zero element position change if zero not change
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        //place zero remaining places

        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println("array after zero");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}