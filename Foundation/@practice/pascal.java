import java.util.*;
class pascal{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        System.out.print("Input= ");
        int x=sr.nextInt();
        int ncr=1;
        for(int n=0; n<x; n++){
           
            for(int r=0; r<=n; r++){
                System.out.print(ncr+" ");
            
            }   
         ncr=ncr+1;
            
        // System.out.println();  
        // }
        System.out.println(); 
  
        int i, j = 0; 
  
        // for top half 
        // for (i = 0; i < n; i++) { 
  
        //     // for left * 
        //     for (j = i; j < n; j++) 
        //         System.out.print("*"); 
  
        //     // for middle " " 
        //     for (j = 0; j < 2 * i + 1; j++) 
        //         System.out.print(" "); 
  
        //     // for right * 
        //     for (j = i; j < n; j++) 
        //         System.out.print("*"); 
  
        //     System.out.println(); 
        // } 
  

        // for below half 
        // for (i = 0; i < n ; i++) { 
            
        //     // for left * 
        //     for (j = 0; j <=i ; j++) 
        //         System.out.print("1 "); 
  
        //     // for middle " " 
        //     for (j = 0; j < 2 * (n - 1 - i); j++) 
        //         System.out.print("2 "); 
            
        //     // for right * 
        //     for (j = 0; j <=i ; j++) 
        //         System.out.print("3 "); 
  
        //     System.out.println(); 
        // } 
       
        // for (i = 0; i < n ; i++){
            
        //      System.out.println("1 ");
        
        
        // }
        
       

    
        
      

}}}
