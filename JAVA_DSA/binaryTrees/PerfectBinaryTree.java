package binaryTrees;

public class PerfectBinaryTree {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(isPerfect(root));
  }
  static boolean isPerfect(Node root) {
       int h= height(root);
       int n= count(root);
       return n== (Math.pow(2,h)-1);
    }
    public static int height(Node root){
      if(root==null) return 0;
      return 1+ Math.max(height(root.left), height(root.right));
    }
    public static int count(Node root){
      if(root==null) return 0;
      return 1+count(root.left) +count(root.right);
    }
}
