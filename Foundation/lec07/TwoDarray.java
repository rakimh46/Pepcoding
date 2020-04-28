import java.util.*;
class TwoDarray{



public static void input(int[][] arr) {
    int count=1;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
                   arr[i][j]=count;
                   count++;
        }
    }
    
}
public static void display(int[][] arr) {
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
        
        }
    System.out.println();
    }
}

public static void main(String[] args) {
    int rows=4,cols=4;
    int[][] arr=new int[rows][cols];
    input(arr);
     display(arr);
    
}
}