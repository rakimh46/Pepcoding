//                                                               Binary Search Tree     
// construct binary search tree by help array
//display
//maximum
//minimum
//find value in tree
//replace number With Sum Of Larger than number
import java.util.*;
public class ConstructBST {
    static node root= null;
    // Tree Node
    static class node { 
        int data; 
        node left, right; 
        node(int d) 
        { 
            this.data = d; 
            this.left = null; 
            this.right = null; 
        } 
    } 
    //construction of Binary tree by array
    public static node construct(int[] data,int lo,int hi){
        if(lo>hi){
            return null;
        } 
        int mid=(lo+hi)/2;
        node root = new node(data[mid]);
        root.left = construct(data, lo, mid-1);
        root.right = construct(data, mid+1, hi);
        return root;
    }
    //display
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
    //max
    public static int max(node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        while(root.right !=null){
            root = root.right;
        }
        return root.data;
    }
    //min
    public static int min(node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        while(root.left !=null){
            root = root.left;
        }
        return root.data;
    }
    //find
    public static boolean find(node root,int val){
        if( root == null ){
            return false;
        }
        if( root.data == val ){
            return true;
        }
        if( val < root.data ){
            return find(root.left,val);
        }else{
            return find( root.right,val );
        }
    }
    //replace number With Sum Of Larger than number
    static int maxSum=0;

    public static void replaceWithSumOfLarger(node root){
        if(root == null){
            return;
        }
        replaceWithSumOfLarger(root.right);
        //work
        int val = root.data;
        root.data=maxSum;
        maxSum +=val;
        replaceWithSumOfLarger(root.left);
    }
    public static void main(String[] args) {
        int[] data={10,20,30,40,50,60,70,80,90,100};
        node root = construct(data,0,data.length-1);
        display(root);
        // System.out.println("Maximum= "+max(root));
        // System.out.println("Minimum= "+min(root));
        //System.out.println(find(root,data));
        replaceWithSumOfLarger(root);
        display(root);
    }

}