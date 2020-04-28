import java.util.*;
class pascaltriangle{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.out.print("Input= ");
        int x=sr.nextInt();
        
        for(int n=0; n<=x; n++){
           int ncr=1;
            for(int r=0; r<=n; r++){
                System.out.print(ncr+" ");
                int ncrp1=ncr*(n-r)/(r+1);
                ncr=ncrp1;
            
            }     
            
        System.out.println();  
        }

}}