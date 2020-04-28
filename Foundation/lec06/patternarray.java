import java.util.*;
class patternarray{


    public static void input(int[] arr){
        Scanner scn=new Scanner(System.in);
        System.out.print("array= ");
         for(int i=0;i<arr.length;i++){
 
          arr[i]=scn.nextInt();
 
 
         }
     }

     public static void pattern(int[] arr){
        int max=-1;
        for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
         
        for(int cr=max;cr>0;cr--)
        {
           for(int cc=0;cc<arr.length;cc++){
               if(arr[cc]>=max){
                   System.out.print("*\t");
               }
               else{
                System.out.print(" \t");
                   
               }
           }

System.out.println();

         max--;
        }
        
      

     }
     public static void main(String[] args){
    
        int[] arr=new int[5];
        input(arr);
        pattern(arr);
        }
    
    } 
  
