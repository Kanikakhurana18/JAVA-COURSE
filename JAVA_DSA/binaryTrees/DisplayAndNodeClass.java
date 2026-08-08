package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
  int val;
  Node left;
  Node right;
  Node(int val){
    this.val=val;
  }
  public static Node createTree() {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    return root;
  }
}

class Pair{
  Node node; 
  int level;
  Pair(Node node, int level){
    this.node=node;
    this.level=level;
  }
}
public class DisplayAndNodeClass{
  public static void main(String[] args){
  //        3  root
  //       / \
  //     4    2
  //   /  \   / \
  // -1    1  6  9
    Node a= new Node(3);
    Node b= new Node(4);
    Node c= new Node(-1);
    Node d= new Node(1);
    Node e= new Node(2);
    Node f= new Node(6);
    Node g= new Node(9);

    a.left=b;
    a.right=e;
    b.left=c;
    b.right=d;
    e.left=f;
    e.right=g;
    display(a);
    System.out.println();
    System.out.println("Size of Binary tree is: "+size(a));
    System.out.println("Sum of Binary tree is: "+sum(a));
    System.out.println("Product of Binary tree is: "+product(a));
    System.out.println("Product of Non-zero values in Binary tree is: "+productNonZero(a));
    System.out.println("Maximum value is: "+ maximum(a));
    System.out.println("Levels of Tree are: "+ levels(a));

    System.out.println("Inorder traversal is ");
    inorder(a);
    System.out.println();
    
    System.out.println("Postorder traversal is ");
    postorder(a);
    
    System.out.println();
    System.out.println("Level Order(BFS) traversal is: ");
    levelOrder(a);

    System.out.println();
    System.out.println("Level Order(BFS) line by line traversal is: ");
    bfsLevelByLevel(a);

    System.out.println();
    System.out.println("Elements of kth level are: ");
    kthLevel(a, 0, 1); // level= currlevel , k= jis level ke elm you need
  }
  public static void display(Node root){ //PREORDER DFS TRAVERSAL( Node Left Right)
    if(root==null) return;
    System.out.print(root.val+" ");
    display(root.left); //left ki all values
    display(root.right); //right ki all values
  }
  public static int size(Node root){
    if(root==null) return 0;
    int leftsize= size(root.left);
    int rightsize= size(root.right);
    return 1+leftsize+rightsize; //here 1 is added beacuse of root element
  }
  public static int sum(Node root){
    if(root==null) return 0;
    return root.val+ sum(root.left) +sum(root.right);
  }
   public static int product(Node root){
    if(root==null) return 1;
    return root.val* product(root.left) *product(root.right);
  }
   public static int productNonZero(Node root){
    if(root==null) return 1;
    if(root.val==0){
      return productNonZero(root.left) *productNonZero(root.right);
    }
    return root.val* productNonZero(root.left) *productNonZero(root.right);
  }

  public static int maximum(Node root){
    if(root==null) return Integer.MIN_VALUE;
    return Math.max(root.val, Math.max(maximum(root.left), maximum(root.right)));
  }

  public static int levels(Node root){
    if(root==null) return 0;
    return 1+Math.max(levels(root.left), levels(root.right));
  }

  public static void inorder(Node root){ //Left Node Right
    if(root==null) return ;
    inorder(root.left);
    System.out.print(root.val+" "); //in bw the calls
    inorder(root.right);
  }

   public static void postorder(Node root){ //Left Right Node
    if(root==null) return ;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val+" "); //At the end of the calls
  }

  public static void levelOrder(Node root){ //BFS= Breadth first Search
    Queue<Node> q= new LinkedList<>();
    q.add(root);
    while(q.size()>0){
      Node front= q.remove();
      System.out.print(front.val+" ");
      if(front.left!=null) q.add(front.left);
      if(front.right!=null) q.add(front.right);
    }
    System.out.println();
  }

  public static void bfsLevelByLevel(Node root){
    Queue<Pair> q= new LinkedList<>();
    int currlevel=0;
    q.add(new Pair(root, 0));
    while(q.size()>0){
      Pair front= q.remove();
      if(front.level!=currlevel){ //IMPORTANT
        currlevel++;
        System.out.println();
      }
      System.out.print(front.node.val+" ");
      if(front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
      if(front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
    }
    System.out.println();
  }

  public static void kthLevel(Node root, int level, int k){
    if(root==null) return;
    if(level==k) System.out.print(root.val+" ");
    kthLevel(root.left, level+1, k);
    kthLevel(root.right, level+1, k);
  }
}