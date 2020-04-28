// nokia keypad pre recurssion
class nokia{
    public static void keypad(String ques,String ans,String[] codes) {
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=ques.charAt(0);
        int num=ch-'0';
        String word=codes[num];
        for(int i=0;i<word.length();i++){
            char ch1=word.charAt(i);
            keypad(ques.substring(1),ans+ch1,codes);
        }
    }
    public static void main(String[] args) {
        String[] codes={"?.",",;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keypad("258","",codes);
    }
}