//sequence
//print     5 4 3 2 1 2 3 4 5
class seq{
    //first method
    public static void printseq1(int n) {
        System.out.print(n+" ");
        if(n==1){
            return;
        }
        printseq(n-1);
        System.out.print(n+" ");      
    }
    // second method
        public static void printseq(int n) {
       if(n==1){
        System.out.print(n+" ");
          return;
        }    
       System.out.print(n+" ");
       
        printseq(n-1);
        System.out.print(n+" ");      
    }
    
    public static void main(String[] args) {
        int n=5;
        printseq(n);
        System.out.println();
        printseq1(n);   
    }
}