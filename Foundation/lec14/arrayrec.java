class arrayrec{


    public static void print(int[] arr,int n) {    
        if(n==arr.length){
            return;
        }
        System.out.println(arr[n]);
        print(arr,n+1);



    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=0;
        print(arr ,n);  
        
    }
}