import java.util.*;
class ceilfloor{
    public static int cf(int[] arr,int data){
        int left=0,right=arr.length-1;
        int ceil=-1,floor=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==data){
                ceil=data;
                floor=data;
                break;
            }
            else if(data<arr[mid]){
                ceil=arr[mid];
                right=mid-1;
            }else{
                floor=arr[mid];
                left=mid+1;
            }
        }
    System.out.print("ceil="+ceil+", ");
    System.out.print("floor="+floor+"");    
     return 0; 
    }
    public static void main(String[] args){

        int[] arr={1,5,10,15,22,33,55,56};
        cf(arr,40);
    }



}