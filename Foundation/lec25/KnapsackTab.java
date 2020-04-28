import java.io.*;
import java.util.*;

public class KnapsackTab {
    public static int knapsacktab(int[] prices,int[] weights,int cap){
        int n=prices.length + 1;
        int m=cap + 1;
        int[][] dp=new int[n][m];
        for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            int val=weights[i-1];
            int p=prices[i-1];
            if(j-val>=0){
                dp[i][j]=Math.max(dp[i-1][j],p + dp[i-1][j-val]);
            }else{
                dp[i][j]=dp[i-1][j];
            }
            
        }
            
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    int[] prices=new int[n];
    for(int i=0;i<n;i++){
        prices[i]=scn.nextInt();

    }
    int[] weights=new int[n];
    for(int i=0;i<n;i++){
        weights[i]=scn.nextInt();
    }
    int cap=scn.nextInt();
    System.out.println(knapsacktab(prices,weights,cap));


    }
}