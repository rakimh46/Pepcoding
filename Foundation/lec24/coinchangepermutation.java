import java.io.*;
import java.util.*;

public class coinchangepermutation {

    public static int CoinChangePermutation(int[] coins,int amt){
        int[] dp=new int[amt+1];
        dp[0]=1; 
        for(int j=1;j<dp.length;j++){
            for(int i=0;i<coins.length;i++){
            int coin=coins[i];
            if (j- coin >= 0)//if (Coins[i] <= j)
            dp[j]=dp[j]+dp[j-coin];
                
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
        
        System.out.println(CoinChangePermutation(coins,amt));

    }  
}