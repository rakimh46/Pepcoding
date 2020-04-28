import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class diawave {
public static void Array(int[][] arr) {
    Scanner sr=new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]=sr.nextInt();
        }
        System.out.println();
    }
}       
public static void wave(int[][] arr) {        
    for (int gap = arr[0].length; gap>=0; gap--) {
        for (int i = gap, j = 0; i<arr[0].length && j < arr[0].length; i++, j++){
            System.out.print(arr[i][j]+" "); 
        }
    }
    for (int gap = 1; gap < arr.length; gap++) {
        for (int i =0, j = gap; i >= 0 && j < arr[0].length; i++, j++) {
            System.out.print(arr[i][j]+" "); 
        }  
    }
} 

    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int r = sr.nextInt();  
        int c = sr.nextInt();            
         int[][] arr=new int[r][c];
         Array(arr); 
         wave(arr);
    }

}