//                                           BINARY TREE
//1.Construction of Binary tree
//2.Display of the binary tree
//3.Size of binary tree (two different Method )
//4.Height or Depth of tree
//5.Maximum child of the tree
//6.Preorder,Postorder and Inorder of binary tree 
//given preorder or inorder then we consruct tree
import java.util.*;
public class BinaryTree {
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
    //3.Size of binary tree
       //method 1
    public static int size1(node root) { 
        if(root == null)
        return 0; 
        else { 
          return(size1(root.left) + 1 + size1(root.right)); 
        }    
    }    
       //method 2
    public static int size2(node root){
        if(root==null){
            return 0;
        }
        int mysize=1;
        if(root.left!=null){
            mysize += size2(root.left);
        }
        if(root.right!=null){
            mysize += size2(root.right);
        }
        return mysize;
    } 
    //height or Depth of tree
    public static int height(node root){
        if(root==null){
            return 0;
        }
        int myheight=1;
        if(root.left!=null){
            myheight = height(root.left);
        }
        if(root.right!=null){
            myheight=Math.max(myheight,height(root.right));
        }
        return myheight + 1;
    }  
    // maximum child number in tree
    public static int max(node root){
        if(root==null){
            return 0;
        }
        int mymax=root.data;
        if(root.left!=null){
            mymax=Math.max(mymax,max(root.left));
        }
        if(root.right!=null){
            mymax=Math.max(mymax,max(root.right));
        }
        return mymax;
    }  
    //preorder of binary tree (Root Left Right)
    public static void preorder(node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+",");
        if(root.left !=null){
            preorder(root.left);
        }
        if(root.right !=null){
            preorder(root.right);
        }
    }
    //postorder of binary tree (Left Right Root)
    public static void postorder(node root){
        if(root == null){
            return ;
        }
        if(root.left !=null){
            postorder(root.left);
        }
        if(root.right !=null){
            postorder(root.right);
        } 
        System.out.print(root.data+",");
    }
    //inorder of binary tree (Left Root Right)
    public static void inorder(node root){
        if(root == null){
            return ;
        }
        if(root.left !=null){
            inorder(root.left);
        }
        System.out.print(root.data+",");
        if(root.right !=null){
            inorder(root.right);
        } 
    }
    //given preorder or inorder then we consruct tree
    public static node preINConst(int[] pre,int[] in,int ps,int pe,int is,int ie){
        if(is==ie || ps==pe){
            node baseNode = new node(pre[ps]);
            return baseNode;
        }
        if(is > ie || ps>pe){
            return null;
        }
        node croot = new node(pre[ps]);
        int i=is;
        int count=0;
        while(pre[ps] != in[i]){
            i++;
            count++;
        }
        croot.left  = preINConst(pre, in, ps+1, ps+count, is, i-1);
        croot.right = preINConst(pre, in, ps+count+1, pe, i+1, ie);
        return croot;
    }
    public static void main(String[] args) {
        int[] data={10,20,30,80,-1,-1,40,-1,-1,50,70,-1,60};
        construct(data);
        // display(root);
        // System.out.println();
        // System.out.println("Method 1 Size="+size1(root));
        // System.out.println("Method 2 Size="+size2(root));
        // System.out.println("Depth="+height(root));
        // System.out.println("Max="+max(root));
        // System.out.println();
        // System.out.print("Preorder=");
        // preorder(root);
        // System.out.println();
        // System.out.print("Postorder=");
        // postorder(root);
        // System.out.println();
        // System.out.print("Inorder=");
        // inorder(root);
        int[] pre={10,20,30,4,5,40,1,80,50,60,2,90,70,100,3};
        int[] in={4,30,5,20,1,40,80,10,2,60,90,50,100,70,3};
        node root1 = preINConst(pre, in, 0, pre.length-1, 0, in.length-1);
        display(root1);  
    }
}