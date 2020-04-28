//1. find path from node(child) to root path
//2. two different nodes of common root
//3. Display Local order
//4. Find Height or Depth of Tree
import java.util.*;
public class GenericTreeClassTwo {
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
    //1. find path from node(child) to root path
    public static ArrayList<Integer> n2rpath(node root,int val){
        if (root==null){  
            return null;
        }
        if(root.data == val){
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(root.data);
            return ans;
        }
        for(int i=0;i<root.child.size();i++){
            ArrayList<Integer> recans=n2rpath(root.child.get(i),val);
            if(recans !=null){
                recans.add(root.data);
                return recans;
            }
        }
        return null;
    }
    //2. local common node or root
    public static int LCA(node root,int d1,int d2) {
        ArrayList<Integer> n2rPathD1=n2rpath(root,d1);
        ArrayList<Integer> n2rPathD2=n2rpath(root,d2);
        int i=n2rPathD1.size()-1;
        int j=n2rPathD2.size()-1;       
        while(i>=0 && j >=0){
            if(n2rPathD1.get(i) !=n2rPathD2.get(j)){
                break;
            }
            i--;
            j--;
        } 
        return n2rPathD1.get(i+1);
    }
    //3. Display Local order
    public static void DisplayLO(node root) {
        Queue<node> qu=new LinkedList<>();
        qu.add(root);
        while(qu.size()> 0){
            node currNode=qu.remove();
            System.out.print(currNode.data +" ");
            for(int i=0;i<currNode.child.size();i++){
                qu.add(currNode.child.get(i));
            }
        }

        
    }
    //4. Find Height or depth of Tree
    public static int Depth(node root) {
        int height = 0;
         if (root == null ) {
         return height;
         }

         if (root.child == null) {
         return 1;
       }
        for (int i = 0; i < root.child.size(); i++) {
         height = Math.max(height,Depth(root.child.get(i)));
       }
        return height + 1;
     }
    public static void main(String[] args) {
        int[] data={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        treeConstruct(data);
        ArrayList<Integer> ans =n2rpath(root,30);
        System.out.println(ans);
        System.out.println(LCA(root, 70, 80));
        DisplayLO(root);
        System.out.println("Depth="+Depth(root));


    }
}