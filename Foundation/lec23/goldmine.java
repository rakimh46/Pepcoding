import java.io.*;
import java.util.*;

public class Main {
public static boolean targetsum(int[] arr, int t){
    boolean[][] dp=new boolean[arr.length+1][t+1];
    dp[0][0]=true;
    for(int i=1;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            if(dp[i-1][j]==true){
                dp[i][j]=true;

            }else if(j-arr[i-1]>=0 && dp[i-1][j-arr[i-1]]==true){
                dp[i][j]=true;
            }            

        }

    }
    return dp[dp.length-1][dp[0].length-1];
}
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();

    }
    int target=scn.nextInt();
    
    System.out.println(targetsum(arr,target));

    }
}