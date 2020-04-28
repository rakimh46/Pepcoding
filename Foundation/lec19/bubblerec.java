// it is not complete 
class bubblerec{
public static void bubblerec(int[] arr) {
    if (n == 1) 
        return; 
    for (int i=0; i<n-1; i++) 
        if (arr[i] > arr[i+1]) 
            swap(arr[i], arr[i+1]); 
  
    bubblerec(arr, n-1,);
}
public static void main(String[] args) {    
    int[] arr={2,8,6,5,3,7,9,4};
    int n=arr.length
    bubblerec(arr,n);
}
}