//post recursion
import java.util.ArrayList;
class nokiakeypad{
    public static ArrayList<String> nkc (String ques,String[] codes){
        if(ques.length()==0){
            ArrayList<String> baseAns=new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
    ArrayList<String> recans= nkc(ques.substring(1),codes);
    ArrayList<String> myans = new ArrayList<>();
    int num=ques.charAt(0)-'0';
    String word=codes[num];
    for(int i=0;i<word.length();i++){
        char cch=word.charAt(i);
        for(String str:recans){
            myans.add(cch+str);
        }
    }
    return myans;
    }
    public static void main(String[] args) {
        String[] codes={"?.",",;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.print(nkc("258",codes));
    }
}


