import java.util.*;
class anybase{
  
  public static int anybase(int n, int db)
        {
          int ans=0;
          int pow=1;
          while(n!=0){
            int rem=n%db;
            n=n/db;
            ans=pow*rem+ans;
            pow=pow*10;
            
          }
          return ans;
                   }
    public static void main(String[] args){
    
      
      int f=anybase(1000,2);
      
    System.out.print(f);
    
    
    }
}