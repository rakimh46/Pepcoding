import java.util.*;
class prime{    
    public static void main(String[] args) {
       Scanner sr=new Scanner(System.in);
        System.out.print("Input= ");
        int n=sr.nextInt();
        boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime==true){
            System.out.print("prime");
        }
        else{
            System.out.print("not prime");
        }
        
    }
}