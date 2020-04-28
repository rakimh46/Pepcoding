class bubblesort{
    public static void swap(int[] arr,int i,int j) {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;    
    }
    public static void bubblesort(int[] arr) {
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-1-j;i++){
              if(arr[i]>arr[i+1]){
                  swap(arr,i,i+1);
              }
            }
        }
    }
    public static void display(int[] arr) {
        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j]+" ");
        } 
    }
    public static void main(String[] args) {
        int[] arr={2,8,6,5,3,7,9,4};
        bubblesort(arr);
        display(arr);
    }
}