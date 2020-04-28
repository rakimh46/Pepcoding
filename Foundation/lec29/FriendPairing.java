import java.io.*;
import java.util.*;
public class FriendPairing {
    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    System.out.println(friend(n));
   }
   public static long friend(int n){
    long[] dp = new long[n + 1];
      dp[0] = 0;
      for (int i = 1; i <= n; i++) {
          if (i == 1) {
         dp[i]=1;
      }else if(i == 2){
          dp[i]=2;
      }else{
         dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
      }
      }
      return dp[n];   
   }
}