import java.util.*;
class rotate{


    public static void input(int[] arr){
        Scanner scn=new Scanner(System.in);
        System.out.print("array= ");
         for(int i=0;i<arr.length;i++){
 
          arr[i]=scn.nextInt();
 
 
         }
     }

     

    public static void reverse(int[] arr,int left,int right){
         
    
   
   while(left<right){
   int temp=arr[left];
   arr[left]=arr[right];
   arr[right]=temp;
   left++;
   right--;
   }
   
}

 public static void rotate(int[] arr,int r){
    reverse(arr,arr.length-r,arr.length-1);
    reverse(arr,0,arr.length-r-1);
    reverse(arr,0,arr.length-1);
 }     
     
public static void display(int[] arr){
        
System.out.print("rotate= ");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println(" ");
}

public static void main(String[] args){
    int r=2;
    int[] arr=new int[5];
    input(arr);
    rotate(arr,r);
    display(arr);
    }

}