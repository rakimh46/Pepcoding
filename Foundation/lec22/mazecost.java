import java.util.*;
class mazecost{
   public static int mazecosttab(int [][] arr){
       int[][] dp=new int[arr.length][arr[0].length];
       for(int i=arr.length-1;i>=0;i--){
           for(int j=arr.length-1;j>=0;j--){
               if(i==arr.length-1 && j==arr.length-1){
                dp[i][j]=arr[i][j];
               }
               else if(i==arr.length-1)
               dp[i][j]=arr[i][j]+dp[i][j+1];
               
               else if(j==arr[0].length-1)
               dp[i][j]=arr[i][j]+dp[i+1][j];
               else{   
                   dp[i][j]=arr[i][j]+Math.min(dp[i][j+1],dp[i+1][j]);
               }
           }
       }
       mazepath(0,0,"",dp);
       return dp[0][0];
   } 
   public static void mazepath(int i,int j,String path,int[][] dp){
    if(i==dp.length-1 && j==dp.length-1){
        System.out.println(path);
        return;
       }
       else if(i==dp.length-1)
       mazepath(i,j+1,path+'h',dp);
       else if(j==dp[0].length-1){
       mazepath(i+1,j,path+'v',dp);
       }
       else{       
        int min=dp[i][j+1]<dp[i+1][j]?dp[i][j+1]:dp[i+1][j];
        if(min==dp[i][j+1]){
            mazepath(i,j+1,path+'h',dp);
        }
        if(min==dp[i+1][j])
        {
            mazepath(i+1,j,path+'v',dp);
        }
       }
          }
    public static void main(String[] args) {
        int[][] arr={{5,7,8,3,27},
                    {9,11,11,21,25},
                    {28,14,20,22,30},
                    {18,31,15,4,2},
                    {9,1,6,5,10}};
      
      int[][] dp=new int[arr.length][arr[0].length];
      System.out.println(mazecosttab(arr));  
    }

}