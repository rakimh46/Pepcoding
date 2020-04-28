class zerotoone{
    public static void mergesort (int[] arr) {
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args){
        int[] arr={0,1,1,0,1,0,0,0,1,0,1};
        mergesort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }    
}