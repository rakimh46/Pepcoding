//dp dynamic program
class fibonacci{
    //simple
    public static int simple(int n){
        int n1=0;
        int n2=1;
        int n3=0;
        for(int i=2;i<=n;i++){
            n3=n1+n2; 
            n1=n2;
            n2=n3;
        }
        return n3;   
    }
    //memorization
    private static int memorization(int n,int[] dp) {
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        int n1f=memorization(n-1,dp);
        int n2f=memorization(n-2,dp);
        int ans=n1f+n2f;
        dp[n]=ans;
        return ans;  
    }
    //tabulation
    public static int tabulation(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        int[] dp=new int[n+1];
        System.out.println(memorization(n,dp));
        System.out.println(simple(n));
        System.out.println(tabulation(n));
    
    }
}