import java.util.*;
class reversearray{


    public static void input(int[] arr){
        Scanner scn=new Scanner(System.in);
        System.out.print("array= ");
         for(int i=0;i<arr.length;i++){
 
          arr[i]=scn.nextInt();
 
 
         }
     }

     

    public static void output(int[] arr){
         
    
   int left=0;
   int  right=arr.length-1;
   while(left<right){
   int temp=arr[left];
   arr[left]=arr[right];
   arr[right]=temp;
   left++;
   right--;
   }
   
}

      
     
       public static void display(int[] arr){
        
        System.out.print("array2= ");
         for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       
 
         }
     System.out.println(" ");
        }
    public static void main(String[] args){
    
    int[] arr=new int[5];
    input(arr);
    output(arr);
    display(arr);
    }

}