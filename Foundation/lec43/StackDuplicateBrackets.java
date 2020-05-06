import java.io.*;
import java.util.*;

public class StackDuplicateBrackets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(db(str));
    }
    
    public static boolean db(String str){
        int i=0;
        Stack<Character> st = new Stack<>();
        while(i < str.length() ){
            if(str.charAt(i)== ')' ){
                if(st.peek() == '(' ){
                    return true;
                } else {
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(str.charAt(i));
            }
            i++;
        }
        return false;
    }
}