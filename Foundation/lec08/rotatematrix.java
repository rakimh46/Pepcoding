//rotate matrix
import java.util.*;
class rotatematrix{
public static void transpose(int[][] arr) {
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
             int temp=arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=temp;   
          }
        }
    }

public static void rotate(int[][] arr) {
    transpose(arr);
    for(int i=0;i<arr.length/2;i++){          
        for(int j=0;j<arr.length;j++){
             int temp=arr[i][j];
             arr[i][j]=arr[arr.length-1-i][j];
             arr[arr.length-1-i][j]=temp;   
          }
        }   
}
public static void display(int[][] arr) {
    
    for(int i=0;i<arr.length;i++){          
        for(int j=0;j<arr.length;j++){
             System.out.print(arr[i][j]+" ");          
        }
        System.out.println();          
        }
}      
public static void main(String[] args) {
    System.out.println("Array =");
    int[][] arr={{1,2,3},
                 {4,5,6},
                 {7,8,9}};
    display(arr);
    rotate(arr); 
    System.out.println("Rotate Matrix=");  
    display(arr);                
}
}