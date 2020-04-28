//relation
//r[i]=r[i+1]-[sum-arr.length*arr[i-1]]

import java.util.*;
class rotationmax{

  public static void rotation(int[] arr){
    
    int res=0;
    int sum=0;
    for(int i=0;i<arr.length;i++){
         res=res+(i*arr[i]);
         sum+=arr[i];
  }
  int max=res;
  for(int i=1;i<arr.length;i++){
     res=res-(sum-(arr.length*arr[i-1]));
    if(res>max){
      max=res;
    }
  }
  System.out.print(max);
  }
  public static void main(String[] args)
  {

    int[] arr={1,8,3,5,2};
    rotation(arr);
  }

}