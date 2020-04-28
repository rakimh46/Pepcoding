import java.io.*;
import java.util.*;

public class ArrangeBuildings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    System.out.println(countbinary(n));

 }
 
public static long countbinary(int n){
        long space[] = new long [n+1]; 
        long building[] = new long [n+1]; 
        space[1] = building[1] = 1; 
        for (int i = 2; i <=n; i++) 
        { 
            space[i] = space[i-1] + building[i-1]; 
            building[i] = space[i-1]; 
        } 
        return (space[n] + building[n])*(space[n] + building[n]); 
    }
}

