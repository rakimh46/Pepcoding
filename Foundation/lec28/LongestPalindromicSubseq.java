import java.io.*;
import java.util.*;
public class LongestPalindromicSubseq {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner (System.in);
        String str = scn.nextLine();
        System.out.println(longpalinseq1(str));
        System.out.println(longpalinseq2(str));
    }
    //method 1
    public static int longpalinseq1(String str){
        int[][] dp = new int[str.length()][str.length()];
        for(int g = 0; g < dp.length; g++){
            for(int i = 0, j = g; j < dp[0].length; i++, j++){
                if(g == 0){
                    dp[i][j] = 1;
                } else if(g == 1){
                    dp[i][j] = str.charAt(i) == str.charAt(j)? 2: 1;
                } else {
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[0][dp[0].length - 1];
    }
    //method 2
    public static int longpalinseq2(String str){
        int[][] dp = new int[str.length()][str.length()];
        for(int g = 0; g < dp.length; g++){
            for(int i = 0, j = g; j < dp[0].length; i++, j++){
                if(g == 0){
                    dp[i][j] = 1;
                } else{
                    if(str.charAt(i) == str.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    
                }
                
                }
            }
        }
        return dp[0][dp[0].length - 1];
    }


}