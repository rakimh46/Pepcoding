import java.util.*;
class spiralPoint{
public static void spiral(int[][] arr) {
    int minr=0,maxr=arr.length-1,minc=0,maxc=arr.length-1;
    int t=arr.length*arr[0].length;
    while(t>0){
       // left wall
      for(int i=minr;i<=maxr;i++){
          System.out.print(arr[i][minc]+" ");
      t--; 
      }
      minc++;
      // bottom wall
      for(int i=minc;i<=maxc;i++){
          System.out.print(arr[maxr][i]+" ");
      t--;
        }
      maxr--;
      //right wall
      for(int i=maxr;i>=minr;i--){
          System.out.print(arr[i][maxc]+" ");
        t--;  
      }  
      maxc--;
      // top wall
      for(int i=maxc;i>=minr;i--){
          System.out.print(arr[minr][i]+" ");
          t--;
      }
      minr++;
    }   
}
public static void main(String[] args) {
    int[][] arr={{1,2,3,4,5},
                {6,7,8,9,0},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
    spiral(arr);            
}

}