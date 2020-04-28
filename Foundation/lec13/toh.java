// Tower of Hanoi
class toh{
    public static void toh(int n, String s,String h,String d) {
        if(n==0){
            return;
        }
        toh(n-1,s,d,h);
        System.out.println("move "+n+"th from "+s+" to "+d);
        toh(n-1,h,s,d);
    }

    public static void main(String[] args) {
        int n=3;
        String s="Source";
        String h="Helper";
        String d="Destination";
        toh(n,s,h,d);
        
    }
}