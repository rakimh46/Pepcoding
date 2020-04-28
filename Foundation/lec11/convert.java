//small to big letter or vice versa
class convert{
    public static String toogle(String str) {
        String ans = "";
       for(int i=0;i<str.length();i++){
          char ch=str.charAt(i); 
          if(ch>='a' && ch<='z'){
              ch=(char) (ch - 'a' + 'A');
          }else{
              ch=(char) (ch - 'A' + 'a');
          }          
          ans =ans + ch;
       }
        return ans;
    } 
    public static void main(String[] args) {
        String str="aDCef";
        System.out.println(toogle(str));  
    }
}