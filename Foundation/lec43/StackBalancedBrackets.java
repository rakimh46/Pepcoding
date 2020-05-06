//e.g.
//[(a + b) + {(c + d) * (e / f)}] -> true
//[(a + b) + {(c + d) * (e / f)]} -> false
//[(a + b) + {(c + d) * (e / f)} -> false
//([(a + b) + {(c + d) * (e / f)}] -> false 
import java.io.*;
import java.util.*;

public class StackBalancedBrackets {

   public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean ans=bb(str);
        System.out.println(ans);
        
    }
    public static boolean bb(String str){
        int i=0;
        Stack<Character> st = new Stack<>();
        while(i<str.length()){
            if(str.charAt(i) == '(' || str.charAt(i) =='[' || str.charAt(i)== '{' ){
                st.push(str.charAt(i));
            }else if(str.charAt(i)==']'){
                if(st.size() > 0 && st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }else if(str.charAt(i)==')'){
                if(st.size()>0 && st.peek() == '('){
                    st.pop();
                }else{
                    return false;
                }
            
            }else if(str.charAt(i)=='}'){
                if(st.size()>0 && st.peek() == '{'){
                    st.pop();
                }else{
                    return false;
                }
            }
            i++;
        }
        if(st.size()>0){
                return false;
            }
        return true;    
    }
}
