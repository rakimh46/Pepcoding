import java.util.*;

public class array
{
public static int[] mult(int arr[],int i,int data,int c)
{
     if(i==arr.length)
     {
         int []ans=new int[c];
         return ans;
     }

    
     if(arr[i]==data)
     {
            c++;
     }
    int [] ans=mult(arr,i+1,data,c);
     if(arr[i]==data)
     {
         ans[c-1]=i;
     }
return ans;
}
     public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int arr[]={3,0,1,0,3,0,2,3,0};
        int data=scn.nextInt();
        int i=scn.nextInt(); // index  
        int c=scn.nextInt();  // count number
        int arr1[]=mult(arr,i,data,c);
        for(int j=0;j<arr1.length;j++)
        {
            System.out.print(arr1[j]);
        }
    }
}