class revision{
    public static void partition(int[] arr) {
        int x=arr.length-1;
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]<=arr[x]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }
    
    // public static void missing(int[] arr) {
    //     int x=arr.length;

    //     while(x>=0){
    //         if(x=arr)

    //         x--;
    //     }
    // }
    public static void power(int x,int y,int ans) {
       if(y<=0){
           System.out.print(ans);
           return ;
       } 
        power(x,y-1,ans*x);
    }
    
    public static void main(String[] args) {
       int[] arr={4,8,7,1,1,6,2,3,9};
    //    partition(arr);
    //    for(int i=0;i<arr.length;i++)
    //    System.out.print(arr[i]+" ");
       //missing(arr); 
       int x=2;
       int y=4;
       int ans=1;
       power(x,y,ans);
    }
}