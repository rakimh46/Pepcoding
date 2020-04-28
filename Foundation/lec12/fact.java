class fact{
   
    public static int fact(int n) {
        if(n==1){
        
           
            return 1;
        }

        // int ans=fact(n-1);
        // int ans1=n*ans;
        // return ans1;
         return(n*fact(n-1));
     }
    public static void main(String[] args) {
        int f=fact(5); 
        System.out.print(f); 
    }
}