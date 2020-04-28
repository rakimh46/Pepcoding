class stair{
    public static void stair(int n,String path) {
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(path);
            return;
        }
        stair(n-1,path+'1');
        stair(n-2,path+'2');
        stair(n-3,path+'3');   
    }
    public static void main(String[] args) {
        stair(4,"");
        
    }
}