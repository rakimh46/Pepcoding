import java.util.*;
class binarysearch{

    public static void input(int[] arr){
       Scanner scn=new Scanner(System.in);
       System.out.print("array= ");
        for(int i=0;i<arr.length;i++){

         arr[i]=scn.nextInt();


        }
    }
    public static int binary(int[] arr,int data){
       int left=0, right=arr.length-1;
       while(left<=right){
           int mid=(left+right)/2;
           if(arr[mid] ==data){
               System.out.print("1");
               return mid;
           }else if(arr[mid]<data){
               left=mid+1;
           }else{
               right=mid-1;
           } 
    


        }
        System.out.print("-1");
       return -1;
    }
    public static void main(String[] args){
    
        int[] arr=new int[5];
        
        
        input(arr);
        binary(arr,10);
        
        }
        
        }