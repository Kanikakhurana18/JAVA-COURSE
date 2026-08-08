package binaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(zigzagLevelOrder(root));
  }
  public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while(q.size()>0){
            int size=q.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<size;i++){
                Node front= q.remove();
                level.add(front.val);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            if(!leftToRight) Collections.reverse(level); //Agar direction left-to-right nahi hai, to current level ko ulta kar do

            ans.add(level); //Phir answer me level daal do.
            
            leftToRight= !leftToRight;//Phir direction ko ulta kar do, taaki next level opposite direction me aaye
        }
        return ans;
    }
}
