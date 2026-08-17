package binaryTrees;
import java.util.*;

public class RightViewOfBinaryTree {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(rightSideView(root));
  }
    public static List<Integer> rightSideView(Node root) {
        List<Integer> ans= new ArrayList<>();
        view(root, 0, ans);
        return ans;
    }
    public static void view(Node root, int level, List<Integer> ans){
        if(root==null) return;
        if(level>=ans.size()) ans.add(root.val); //left view mai just change  if(level==ans.size()) ans.add(root.val)
        else ans.set(level, root.val);
        view(root.left, level+1, ans);
        view(root.right, level+1, ans);
    }
}
