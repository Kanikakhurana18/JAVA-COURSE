package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalLeetcode {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(levelOrder(root));
  }
   public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size= q.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<size;i++){
                Node front= q.remove();
                level.add(front.val);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
