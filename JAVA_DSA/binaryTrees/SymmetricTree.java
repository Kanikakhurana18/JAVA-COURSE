package binaryTrees;

public class SymmetricTree {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(isSymmetric(root));
  }
  public static boolean isSymmetric(Node root) {
        if(root==null) return true;
        return identical(root.left, root.right);
    }
    public static boolean identical(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return identical(p.left, q.right)  && identical(p.right, q.left);
    }
}
