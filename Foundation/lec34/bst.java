//Binary Search Tree
import java.util.*;
public class bst {
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
    static class bstHelper{
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean isBst = true;
        node bstRoot =  null;
        int size=0;

    }
    // largest BST
    public static bstHelper checkBST(node root){
        if(root==null){
            bstHelper baseAns = new bstHelper();
            return baseAns;
        }else if(root.left == null && root.right == null){
            bstHelper baseAns = new bstHelper();
            baseAns.min = root.data;
            baseAns.max = root.data;
            return baseAns;
        }
        bstHelper left = largestBST(root.left);
        bstHelper right = largestBST(root.right);
        bstHelper myans = new bstHelper(); 
        myans.isBst = left.isBst && right.isBst &&(root.data > left.max && root.data < right.min);
        if( myans.isBst){
            if(root.left !=null){
                myans.min = left.min;
            }else{
                myans.min = root.data;
            }
            if(root.right !=null){
                myans.max = right.max;
            }else{
                myans.max = root.data;
            }
        }
        return myans;
    }
    public static bstHelper largestBST(node root){
        if(root==null){
            bstHelper baseAns = new bstHelper();
            return baseAns;
        }else if(root.left == null && root.right == null){
            bstHelper baseAns = new bstHelper();
            baseAns.min = root.data;
            baseAns.max = root.data;
            baseAns.size=1;
            baseAns.bstRoot = root;
            return baseAns;
        }
        bstHelper left = largestBST(root.left);
        bstHelper right = largestBST(root.right);
        bstHelper myans = new bstHelper(); 
        myans.isBst = left.isBst && right.isBst &&(root.data > left.max && root.data < right.min);
        if( myans.isBst){
            if(root.left !=null){
                myans.min = left.min;
            }else{
                myans.min = root.data;
            }
            if(root.right !=null){
                myans.max = right.max;
            }else{
                myans.max = root.data;
            }
            myans.bstRoot = root;
            myans.size = left.size + right.size +1;
        }else{
            if( left.size>= right.size){
                myans.size = left.size;
                myans.bstRoot = left.bstRoot;
            }else{
                myans.size = right.size;
                myans.bstRoot = right.bstRoot;
            }
        }
        return myans;
    }
    public static void main(String[] args) {
        int[] data={50,25,12,-1,40,35,-1,45,-1,-1,-1,70,60,-1,80};
        construct(data);
        //display(root);
        // bstHelper ans =checkBST(root);
        // System.out.println(ans.isBst+" "+ans.min+" "+ans.max);
        bstHelper answer =largestBST(root);
        System.out.println(answer.isBst+" size="+answer.size+" Root="+answer.bstRoot.data);    
    }
}
