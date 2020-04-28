import java.io.*;
import java.util.*;

public class countbinary{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    System.out.println(countbinary(n));

 }
 
public static int countbinary(int n){
    int a[] = new int [n]; 
        int b[] = new int [n]; 
        a[0] = b[0] = 1; 
        for (int i = 1; i < n; i++) 
        { 
            a[i] = a[i-1] + b[i-1];// ending at 1 
            b[i] = a[i-1]; // ending at 0
        } 
        return a[n-1] + b[n-1]; 
    }
}

