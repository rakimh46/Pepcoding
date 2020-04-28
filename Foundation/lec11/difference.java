class difference{
    
    // public static String diff (String str){
    //     String ans="";
    //     for(int i=0;i<=str.length()-1;i++)
    //     {
    //         String ch1=str.charAt(i);
    //         String ch2=str.charAt(i+1);
    //         String ch3=(ch2 - ch1);  
    //         ans=ans + ch1 + ch3;
    //     }
    //     System.out.print(ans);

    // }

    public static String diff(String str){
        String ans="";
        for(int i=0;i<str.length()-1;i++){
            ans +=str.charAt(i);
            ans +=str.charAt(i+1) - str.charAt(i);
        }
        ans +=str.charAt(str.length()-1);
        return ans;
    }




    public static void main(String[] args) {
        String str="abacd";
        System.out.println(diff(str));
        
    }
}