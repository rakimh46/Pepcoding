import java.util.*;
class exitarray{

    public static void input(int[] arr){
       Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){

         arr[i]=scn.nextInt();


        }
    }

    public static boolean exit(int[] arr){
         int no=5;
        boolean  exitno=true;
        for(int i=0;i<arr.length;i++){
          if(no == arr[i])
          {
    
           return true;  
        }
             

        }
        
           
        return false; 


    }


public static void main(String[] args){
    
int[] arr=new int[5];


input(arr);
System.out.print(exit(arr));

}

}