// post recursion
//memorization

import java.io.*;
import java.util.*;

class coinchangerec {
    
    public static int CoinChangeCombinationRec(int[] coins,int amt) {
        ArrayList<String>[] paths = new ArrayList[amt + 1];
        for (int i = 0; i < paths.length; i++) {
            paths[i] = new ArrayList<>();

        }
        paths[0].add("");
        int[] dp = new int[amt + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int j = coin; j < dp.length; j++) {
                dp[j] = dp[j] + dp[j - coin];
                for (String r : paths[j - coin]) {
                    paths[j].add(r + coin);
                }
            }
        }
        System.out.println(paths[amt]);
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
       
       System.out.println(CoinChangeCombinationRec(coins,amt));

   }   
}