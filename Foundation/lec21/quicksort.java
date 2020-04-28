class quicksort{
    public static int midsorting(int[] arr,int lo,int hi) {
        int x=arr[hi];
        int i=lo,j=lo;
        while(j<arr.length){
            if(arr[j]<=x){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return i-1;
    }
    public static void quicksort(int[] arr,int lo,int hi ) {
        if(lo>=hi){
            return;
        }
        int pi=midsorting(arr,lo,hi);
        quicksort(arr,lo,pi-1);
        quicksort(arr,pi+1,hi);   
    }
    public static void main(String[] args) {
        int[] arr={25,27,14,7,29,3,45,1,6,15};
        midsorting(arr,0,arr.length-1);
        quicksort(arr,0,arr.length-1);   
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }   
    }
}