//Pre Order Iterative
//diameter
//Balanced
import java.util.*;
public class BinaryTreeLectureTwo {
    static node root= null;
    // Tree Node
    static class node { 
        int data; 
        node left, right; 
        node(int data) 
        { 
            this.data = data; 
            this.left = null; 
            this.right = null; 
        } 
    } 
    //1.construction of Binary tree
    public static void construct(int[] data){
        ArrayList<node> cplist=new ArrayList<>();
        for(int i=0;i<data.length;i++){
            if(data[i]==-1){
                cplist.remove(cplist.size()-1);
            }else{
                node currNode=new node(data[i]);
                if(root==null){
                    root=currNode;
                }else{   
                    node cp=cplist.get(cplist.size()-1);     
                    if(cp.left == null){
                        cp.left=currNode;
                    }else{
                        cp.right=currNode;
                    }
                }
                cplist.add(currNode);
            }
        } 
    }    
    //2.Display of the binary tree
    public static void display(node root){
        if(root == null){
            return;
        }
        if(root.left !=null){
            System.out.print(root.left.data+" -> ");
        }
        System.out.print(root.data + " ");
        if(root.right !=null){
            System.out.print(" <- "+root.right.data);
        }
        System.out.println(".");
        if(root.left !=null){
            display(root.left);
        }
        if(root.right !=null){
            display(root.right);
        }
    }
    //pre order iterative
    public static void preOrderIterative(node root) {
        ArrayList<node> stack=new ArrayList<>();
        stack.add(root);
        while(stack.size()>0){
            node currNode = stack.remove( stack.size()-1);
            System.out.print(currNode.data+" ");
            if(currNode.right != null){
                stack.add(currNode.right);
            }
            if(currNode.left != null){
                stack.add(currNode.left);
            }
        }
    }
    //diameter
    static class diaHelper{
        int d=0;
        int h=0;
    }
    public static diaHelper diameterDp(node root) {
        if(root == null){
            diaHelper baseAns = new diaHelper();
            return baseAns;
        }
        diaHelper left =diameterDp(root.left);
        diaHelper right =diameterDp(root.right);
        diaHelper myans = new diaHelper();
        myans.d = Math.max(left.h +right.h +1, Math.max(left.d, right.d));
        myans.h = Math.max(left.h,right.h) +1;
        return myans;
    }

    //Balanced
    static class balHelper{
        int h = 0;
        boolean b= true;
    }
    public static balHelper isBalancedDP(node root) {
        if(root == null){
            balHelper baseAns = new balHelper();
            return baseAns;
        }
        balHelper left= isBalancedDP(root.left);
        balHelper right= isBalancedDP(root.right);
        balHelper myans = new balHelper();

        myans.b = left.b && right.b && (left.h - right.h >= -1 && left.h - right.h <= 1);
        myans.h = Math.max(left.h, right.h) +1;
        return myans;    
    }

    public static void main(String[] args) {
        int[] data={10,20,30,80,-1,-1,40,-1,-1,50,70,-1,60};
        construct(data);
        //display(root);
        //preOrderIterative(root);
        // diaHelper ans=diameterDp(root);
        // System.out.print(ans.d);
        balHelper answer=isBalancedDP(root);
        System.out.print(answer.b);
        
    }
}