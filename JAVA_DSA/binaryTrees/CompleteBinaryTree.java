package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(isCompleteTree(root));
  }
   public static boolean isCompleteTree(Node root) { //using bfs queue [TC=SC=O(n)]
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        boolean nullFound= false;
        while(q.size()>0){
            Node front= q.remove();
            if(front==null) nullFound=true;
            else{ //null milne ke baad element mil gya
                if(nullFound) return false;
                q.add(front.left);
                q.add(front.right);
            }
        }
        return true;
    }
}
