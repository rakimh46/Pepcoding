class zeroonetwo{
    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;   
    }
        public static void mergesort (int[] arr) {
            int i=0,j=0,k=0;
            while(j<arr.length){
                if(arr[j]==0){
                    swap(arr,j,k);
                    swap(arr,i,k);
                    i++;k++;
                }else if(arr[j]==1){
                    swap(arr,j,k);
                    k++;
                }
            j++;
            }
        }
    
        public static void main(String[] args){
            int[] arr={0,1,1,2,2,0,2,1,0,2,0,0,1,0,1};
            mergesort(arr);
            for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        }    

}