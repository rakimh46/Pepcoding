import java.util.*;
class mularray{






public static void multiply(int[][] arr1,int[][] arr2) {
    int[][] ans=new int[arr1.length][arr1.length];
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[0].length;j++){
             for(int k=0;k<arr1[0].length;k++){    
            ans[i][j]+=arr1[i][k]*arr2[k][j];   
             }
    
        }
    }

    display(ans);
}

public static void display(int[][] ans) {
    for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans[0].length;j++){
        System.out.print(ans[i][j]+" ");
        
        }
    System.out.println();
    }
}

public static void main(String[] args) {
   
    int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
    int[][] arr2={{10,11,12},{13,14,15},{16,17,18}}; 
    multiply(arr1,arr2);
  
    
}
}