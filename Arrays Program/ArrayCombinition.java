class ArrayCombinition{
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i;j<arr.length;j++)
            {
                if(arr[i]== arr[j]) 
                    continue;
                System.out.println(arr[i]+" : "+arr[j]);
            }
        }
    }
    }
