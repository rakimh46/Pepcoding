import java.io.*;
import java.util.*;

public class ZeroKnapsack {
    public static int knapsack(int[] prices,int[] weights,int idx,int cap){
        if(idx==prices.length)
        {
            if(cap>=0){
                return 0;
            }else{
                return Integer.MIN_VALUE;
            }
            
        }
        int r1=0 + knapsack(prices,weights,idx + 1,cap);
        int r2=prices[idx] + knapsack(prices,weights,idx + 1,cap-weights[idx]);
        return Math.max(r1,r2);
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
    System.out.println(knapsack(prices,weights,0,cap));

    }
}