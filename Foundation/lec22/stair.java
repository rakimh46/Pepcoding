class stair{
    public static int stairmem(int n,int[] dp) {
        if(n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int ans=0;
        if(n-1>=0)
        ans+=stairmem(n-1,dp);
        if(n-2>=0)
        ans+=stairmem(n-2,dp);
        if(n-3>=0)
        ans+=stairmem(n-3,dp);
        dp[n]=ans; 
        return ans;  
    }   

    //tabulation
    public static int stairtabu(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            if(i-1>=0) 
            dp[i]+=dp[i-1];
            
            if(i-2>=0) 
            dp[i]+=dp[i-2];
            
            if(i-3>=0)
            dp[i]+=dp[i-3];
            
        }
        return dp[n];
        
    }
     public static void main(String[] args) {
         int n=35;
         int[] dp=new int[n+1];
         System.out.println(stairmem(n,dp));
         System.out.println(stairtabu(n));
     }
}