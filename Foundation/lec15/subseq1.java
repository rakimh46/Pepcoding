// post recurssion
import java.util.ArrayList;
class subseq1{
    public static ArrayList<String> subseq(String ques) {
        if(ques.length()==0){
            ArrayList<String> baseAns= new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        String roq = ques.substring(1);
        ArrayList <String> recAns=subseq(roq);
        ArrayList<String> myAns= new ArrayList<>();
        for(int i=0;i<recAns.size();i++){
            myAns.add(ques.charAt(0)+recAns.get(i));
        }
        for(String str: recAns){
            myAns.add(str);
        }
    return myAns;
    }
    public static void main(String[] args) {
        System.out.println(subseq("abc"));
    }
}