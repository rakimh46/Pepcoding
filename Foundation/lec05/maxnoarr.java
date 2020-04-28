import java.util.*;
class maxnoarr{
public static void input(int[] arr){
Scanner scn=new Scanner(System.in);  
    for(int i=0;i<arr.length;i++){
        arr[i]= scn.nextInt();
    }
    }
    // public static void display(int[] arr){
    
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
        
    //     }    
    //     System.out.println();
    //     }
public static void maximum(int[] arr){
     int max= arr[0];
     for(int i=1; i<arr.length;i++){
        if(max < arr[i]){
             max=arr[i];

        }
        

    }  
     System.out.println(max);
    

}


    public static void main(String[] args){
Scanner scn=new Scanner(System.in);

int size=scn.nextInt();
int[] arr=new int[size];
input(arr);
// display(arr);
maximum(arr);
} 




}