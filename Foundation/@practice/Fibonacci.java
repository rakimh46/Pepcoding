import java.io.*;
import java.util.*;
class Fibonacci {

    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int n = sr.nextInt();
        int[] a=new int[n];
        a[0]=0;    
        a[1]=1;
        for(int i=2;i<n;i++){
            if(i<n && a[i]<n)
            a[i]=a[i-1]+a[i-2];
        }
        for(int j=0;j<n;j++)
            System.out.print(a[j]+" ");
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}