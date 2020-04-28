import java.util.*;
class primeidentify{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.out.println("enter number");
        int n = sr.nextInt();
          
        for(int i=2; i<n; i++)
        {
            boolean isprime=true;
           for(int j=2; j*j<=i; j++)
           {
               if(i%j==0)
               {isprime=false;
            break;
        }     
           }
           if(isprime){
               System.out.print(i+" ");
               
           }
           
        }
         
    }}