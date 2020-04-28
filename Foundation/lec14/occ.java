class occ{
    public static int occ(int[] arr, int n,int r) {
     if(n==arr.length){
         return -1; 
     }
       
        int a=occ(arr,n+1,r);
        if(arr[n]==r){
        return n;         
        }
        
        return a;
         
        
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,6,9,2};
        int n=0;
        int r=2;
        System.out.print(occ(arr,n,r));
        
    }
}