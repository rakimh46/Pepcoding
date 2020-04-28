import java.util.*;
class rat{
    public static void exitpoint(int[][] arr) {
       int i=0,j=0,dir=0;
       while(true){
         dir +=arr[i][j];
         dir %=4;
         if(dir==0){
             j++;
         }else if(dir==1){
            i++;
        }else if(dir==2){
            j--;
        }else if(dir==3){
            i--;
        }
        if(i<0 || i==arr.length || j<0 || j==arr.length){
            break;
        }
    }
        if(i<0){
            i++;
        }
        if(i==arr.length){
            i--;
        }
        if(j<0){
            j++;
        }
        if(j==arr.length){
            j--;
        }
        System.out.print("exit point={"+i+","+j+"}");     
    }
    public static void main(String[] args) {   
    int[][] arr={{0,0,1,0},{1,1,0,0},{0,1,0,0},{1,0,1,0}};
     exitpoint(arr); 
    }    
}