// tabulation
//combination
import java.io.*;
import java.util.*;

public class coinchange {
    
    public static int coinchange(int[] coins,int amt){
        int[] dp=new int[amt+1];
        dp[0]=1; 
        for(int i=0;i<coins.length;i++){
            int coin=coins[i];
            for(int j=coin;j<dp.length;j++){
                dp[j]=dp[j] + dp[j-coin];
            }
        }
        return dp[amt];
    }

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner (System.in);
        int n=scn.nextInt(); 
        int[] coins=new int[n];
        for(int i=0;i<coins.length;i++){
            coins[i]=scn.nextInt();
            
        }
        int amt=scn.nextInt();
        
        System.out.println(coinchange(coins,amt));

    }  
}