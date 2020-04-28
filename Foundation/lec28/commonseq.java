import java.io.*;
import java.util.*;    
public class commonseq {
        public static void main(String[] args) throws Exception {
            Scanner scn=new Scanner (System.in);
           String str1 = scn.nextLine();
            String str2 = scn.nextLine();
            System.out.println(commonseq(str1,str2));
        }
        public static int commonseq(String str1,String str2){
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
            for(int i = dp.length - 2; i >= 0; i--){
                for(int j = dp[0].length - 2; j >= 0; j--){
                    if(str1.charAt(i) == str2.charAt(j)){
                        dp[i][j] = 1 + dp[i + 1][j + 1];
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                    }
                }
            }
            return dp[0][0];
        }
    }
