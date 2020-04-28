// selection sort
class selectionsort{
    public static void swap(int[] arr,int k,int j) {
                  int temp=arr[k];
                  arr[k]=arr[j];
                  arr[j]=temp;    
    }
    public static void selectionsort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);   
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
        int[] arr={2,8,6,5,3,7,9,4,-1};
        selectionsort(arr);
        display(arr); 
    }
}