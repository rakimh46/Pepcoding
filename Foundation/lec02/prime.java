import java.util.*;
class prime{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.out.println("enter number");
        int i = sr.nextInt();
      
    boolean isprime=true;
    for(int n=2; n<i; n++){
        if(i%n==0){
        isprime=false;
        break;
        }
    }
    if(isprime==true){
        System.out.print("prime");
        
    }
    else{
        System.out.println("not prime");

    
    }
}
}