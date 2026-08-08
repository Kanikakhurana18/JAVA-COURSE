package binaryTrees;
public class IdenticalTrees {
  public static void main(String[] args) {
        // First Tree
    Node root1 = new Node(1);
    root1.left = new Node(2);
    root1.right = new Node(3);

    // Second Tree
    Node root2 = new Node(1);
    root2.left = new Node(2);
    root2.right = new Node(3);
    System.out.println(isIdentical(root1, root2));
  }
  public static  boolean isIdentical(Node p, Node q) {
         if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!= q.val) return false;
        return isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }
}
