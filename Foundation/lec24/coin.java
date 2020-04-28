// post recursion
//memorization

import java.io.*;
import java.util.*;

class CoinChangePermuRec {
    
    public static int CoinChangePermutationRec(final int[] coins, final int amt) {
        ArrayList<String>[] paths = new ArrayList[amt + 1];
        for (int i = 0; i < paths.length; i++) {
            paths[i] = new ArrayList<>();

        }
        paths[0].add("");
        int[] dp = new int[amt + 1];
        dp[0] = 1;
       for(int j=1;j<dp.length;j++){
            for(int i=0;i<coins.length;i++){
            int coin=coins[i];
            if (j- coin >= 0)//if (Coins[i] <= j)
            dp[j]=dp[j]+dp[j-coin];
            for (String r : paths[j - coin]) {
                    paths[j].add(r + coin);
                }
                
            }
        }
        System.out.println(paths[amt]);
        return dp[amt];
    
    }

    public static void main(final String[] args) throws Exception {
        final Scanner scn = new Scanner(System.in);
        final int n = scn.nextInt();
        final int[] coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scn.nextInt();

        }
        final int amt = scn.nextInt();
        System.out.println(CoinChangePermutationRec(coins,amt));

    }  
}