import java.util.*;
class anybasetodec{
  
  public static int anybase(int n, int db,int b)
        {
          int ans=0;
          int pow=1;
          while(n!=0){
            int rem=n%db;
            n=n/db;
            ans=pow*rem+ans;
            pow=pow*b;
            
          }
          return ans;
                   }
    public static void main(String[] args){
    
      
      int f=anybase(1010,10,2);
      
    System.out.print(f);
    
    
    }
}