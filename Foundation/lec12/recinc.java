// increasing recurssion
// print 1 2 3 4 5
class recinc{
    public static void printinc(int n) {
        if(n==0){
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        printinc(n);   
    }
}