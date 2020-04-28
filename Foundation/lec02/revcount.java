import java.util.*;
class revcount{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.out.println("enter number");
        int n = sr.nextInt();
        System.out.println("r");
        int r = sr.nextInt();
        
        int n1=n;
        int length=0;
        while(n1!=0){

            n1=n1/10;
            length++;
        }  
        r=r%length;  
        if(r<0){
            r=r+length;
        }
         int r1=r;
         int pow=1, post=0;
         while(r>0){
            int rem=n%10;
            n=n/10;
            post=pow*rem + post;
            pow=pow*10;    
            r--;              
             
         }   
        length= length-r1;
        while(length > 0){
            post=post*10;
            length--;  
        }
          post=post+n;
          System.out.print(post);        
        
    }}