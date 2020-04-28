// Merge two sorted array
class mergesorted{
    public static void merge(int[] arr1,int[] arr2,int[] arr3) {
        int i=0,j=0,k=0;
        while(i<arr1.length && j <arr2.length){
            if (arr1[i] < arr2[j]) 
            arr3[k++] = arr1[i++]; 
        else
            arr3[k++] = arr2[j++];
        //    if (arr1[i] < arr2[j]) {
        //        arr3[k] = arr1[i]; 
        //        i++;
        //        }        
        //        else{
        //            arr3[k++] = arr2[j++];
        //            j++;
        //            }
        //            k++;
        }
        while(i<arr1.length){
             arr3[k++]=arr1[i++];
        }
        while(j<arr2.length){
             arr3[k++]=arr2[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr1={-1,3,5,17,20,27,30};
        int[] arr2={-89,0,2,4,6,18,20,23,45};
        int arr3[]=new int[arr1.length + arr2.length];
        merge(arr1,arr2,arr3);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}