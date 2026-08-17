package binaryTrees;

public class DiameterOfBinaryTree {
  static int max; //global variable
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(diameterOfBinaryTree(root));
  }
   public static int diameterOfBinaryTree(Node root) {
        //Tc=O(n)
        max=0;
        levels(root);
        return max;
    }
    public static int levels(Node root){
        if(root==null) return 0;
        int leftlevels= levels(root.left);
        int rightlevels= levels(root.right);
        max=Math.max(max, leftlevels+rightlevels);
        return 1+Math.max(leftlevels, rightlevels);
    }


        //Tc=O(n^2) Two times recursion
    //     if(root==null) return 0;
    //     int a= levels(root.left) + levels(root.right);
    //     int b= diameterOfBinaryTree(root.left);
    //     int c= diameterOfBinaryTree(root.right);
    //     return Math.max(a, Math.max(b,c));
    // }
    
    //  public int levels(TreeNode root){
    //     if(root==null) return 0;
    //     return 1+Math.max(levels(root.left), levels(root.right));
    // }
}
