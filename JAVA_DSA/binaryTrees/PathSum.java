package binaryTrees;

public class PathSum {
  public static void main(String[] args) {
    Node root= Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    int targetSum=7;
    System.out.println(hasPathSum(root, targetSum));
  }
   public static boolean hasPathSum(Node root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null) {
            if(targetSum ==root.val) return true;
            else return false;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
}
