// decreasing recurssion
// print 5 4 3 2 1 
class recdec{
    public static void printdec(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printdec(n-1);
     }
    public static void main(String[] args) {
        int n=5;
        printdec(n);   
    }
}