import java.util.*;
class reverse{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.out.println("enter number");
        int n = sr.nextInt();
    int ans=0;
    while(n !=0){
    int rem=n%10;
        n=n/10;
        
        ans=ans*10+rem;    
        
    }
    System.out.print(ans+"");
    }}