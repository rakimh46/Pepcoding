class lastocc{
    public static int cf(int[] arr,int data){
      int left=0,right=arr.length-1;
      
      while(left<=right){
          int mid=(left+right)/2;
          if(arr[mid]==data){
                  if(mid+1<arr.length && data==arr[mid+1])
                  {
                    left=mid+1;
                  } 
                  else{
                    return mid;
                  }
          }
          else if(data<arr[mid]){
             right=mid-1;            
          }else{
             left=mid+1; 
          }
          }
  
   return -1; 
  }
  
  
  
  
  
    public static void main(String[] args){
  
      int[] arr={1,1,1,1,2,3,5,5};
      System.out.println(cf(arr,2));
  }
  }