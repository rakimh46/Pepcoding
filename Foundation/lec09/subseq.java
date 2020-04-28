//subsequence

import java.util.*;
class subseq{
    public static void sub(int[] arr){
        int p=1;
        for(int i=0;i<arr.length;i++){
             p=p*2; 
        } 
        System.out.print("power= "+p); 
        for(int i=0;i<p;i++){
               int index=0;      
               int cc=i;
               System.out.print("[");
                while(cc>0){
                 int rem=cc%2;
                 cc/=2;
                 if(rem==1){
                     System.out.print(" "+arr[index]+" ");   
                 }
                 index++;
               }
                 System.out.println("]");
            }    
    }
    public static void main(String[] args){
    int[] arr={5,8,3};
    sub(arr);
    }
    }