import java.io.*;
import java.util.*;
public class LongestPalindromicSubstring {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner (System.in);
        String str = scn.nextLine();
        System.out.println(longpalin(str));
    }
    public static int longpalin(String str){
    boolean[][] dp = new boolean[str.length()][str.length()];
        int len = 0;
        for(int g = 0; g < dp.length; g++){
            // i=starting point and j= ending point
            for(int i = 0, j = g; j < dp[0].length; i++, j++){
                if(g == 0){
                    dp[i][j] = true;
                } else if(g == 1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j] && (g + 1) > len){
                    len = g + 1;
                }      
            }
        }
        return len;
    }
}