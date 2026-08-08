package binaryTrees;

public class MirrorTree {
  public static void main(String[] args) {
    Node root = Node.createTree(); //as function in displayAndNode class is stataic so write Node.
    DisplayAndNodeClass.display(root);
    System.out.println();
    mirror(root);//function har node ke left aur right child ko swap karta hai.
    DisplayAndNodeClass.display(root);
  }
   static Node mirror(Node root) {
        if(root==null) return root;
        Node temp= root.left; //swap
        root.left= root.right;
        root.right= temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }
}
