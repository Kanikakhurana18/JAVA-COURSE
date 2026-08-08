package binaryTrees;

public class BalancedBinaryTree {
  static boolean flag; //global variable
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(isBalanced(root));
  }
  public static boolean isBalanced(Node root) {
        //optimize by using one time recursion Tc=O(n)= Sc
        if(root==null) return true;
        flag=true;
        levels(root);
        return flag;
    }
    public static int levels(Node root){
        if(root==null) return 0;
        int leftlevels= levels(root.left);
        int rightlevels= levels(root.right);
        if(Math.abs(leftlevels-rightlevels)>1) flag=false;
        return 1+ Math.max(leftlevels, rightlevels);
    }
   //Tc=O(n^2) as two times recursion call so optimize it by using only one time
    // public boolean isBalanced(TreeNode root) {
    //     if(root==null) return true;
    //     int leftlevels= levels(root.left);
    //     int rightlevels= levels(root.right);
    //     if(Math.abs(leftlevels-rightlevels)>1) return false;
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }
    // public int levels(TreeNode root){
    //     if(root==null) return 0;
    //     return 1+Math.max(levels(root.left), levels(root.right));
    // }
}

