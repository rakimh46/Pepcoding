//generic tree
import java.util.*;
class gtree{
    static node root= null;

    static class node{
        int data;
        ArrayList<node> child;
        node(int d){
            this.data =d;
            this.child= new ArrayList<>();
        }
    }
    public static void treeConstruct(int[] data){
        ArrayList<node> cplist= new ArrayList<>();
        for(int i=0;i<data.length;i++){
            if(data[i] == -1){
                cplist.remove(cplist.size()-1);
            }else{
                node currNode=new node(data[i]);
                if(root == null){
                    root=currNode;
                }else{
                    node cp = cplist.get(cplist.size()-1);
                    cp.child.add(currNode);
                }
                cplist.add(currNode);
            }
        }
    }
    public static void display(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ->");
        for(int i=0;i<root.child.size();i++){
            System.out.print(root.child.get(i).data+", ");
        }
        System.out.println(".");
        for(int i=0;i<root.child.size();i++){
            display(root.child.get(i));
        }
    }
    // Size of the tree
    public static int TreeSize(node root){
        if(root == null){
            return 0;
        }
        int mysize =1;
        for(int i=0;i<root.child.size();i++){
        mysize +=TreeSize(root.child.get(i));
        }
        return mysize;
    }
    //Maximum
    public static int Max(node root){
        if(root == null){
            return -1;
            //-1 means we have not tree
        }
        int Max = root.data;
        for(int i=0;i<root.child.size();i++){
        int ans =Max(root.child.get(i));
        if(Max < ans){
            Max=ans;
        }   
    }
        return Max;
    }

    //Minimum
    public static int Min(node root){
        if(root == null){
            return -1;
            //-1 means we have not tree
        }
        int Min = root.data;
        for(int i=0;i<root.child.size();i++){
        int ans =Min(root.child.get(i));
        if(Min > ans){
            Min=ans;
        }   
    }
        return Min;
    }    

    // Existence or find element in the tree
    public static boolean exist(node root,int element){
        if(root == null){
            return false;
        } 
        if (root.data == element ){  
            return true; 
        }
        
        for(int i=0;i<root.child.size();i++){
            boolean ans = exist(root.child.get(i),element );  
            if(ans == true){
                return true;
            }
        }   
  
    return false;
    }
    public static void main(String[] args) {
        int[] data={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        treeConstruct(data);
        display(root);
        System.out.println("Height of the tree= " + TreeSize(root));
        System.out.println("Maximum = " + Max(root));
        System.out.println("Minimum = " + Min(root));
        int element=100;
        System.out.println(exist(root,element));
    }
}