//partition
class midsorting{
    public static void midsorting(int[] arr) {
        int x=arr[arr.length-1];
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<=x){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr={25,27,14,7,29,3,45,1,6,15};
        midsorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}