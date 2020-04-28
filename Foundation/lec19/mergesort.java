class mergesort{
    public static int[] merge2sortedarrays(int[] a,int[] b){
      int[] ans=new int[a.length+b.length];
        int i=0,j=0,k=0;
      while(i<a.length && j<b.length){
          if(a[i]<b[j]){
              ans[k]=a[i];
              i++;
          }else{
              ans[k]=b[j];
              j++;
          }
          k++;
      }
      while(i<a.length){
            ans[k]=a[i];
            i++;
        k++;
    }
    while(j<b.length){
            ans[k]=b[j];
            j++;
        k++;
    }
    return ans;
    } 
    public static int[] mergesort (int[] arr,int lo,int hi ) {
        if(lo==hi){
            int[] base=new int[1];
            base[0]=arr[lo];
            return base;
        }

        int mid=(lo+hi)/2;
        int[] left=mergesort(arr,lo,mid);
        int[] right=mergesort(arr,mid+1,hi);
        int[] ans=merge2sortedarrays(left,right);
        return ans;
    }

    public static void main(String[] args){
        int[] arr={45,34,23,123,37,89,49,3,2,1};
        arr=mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }    
}