package binaryTrees;

import java.util.ArrayList;

public class BinaryTreePaths {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    System.out.println(paths(root));
  }
     public static ArrayList<ArrayList<Integer>> paths(Node root) {
         ArrayList<ArrayList<Integer>> ans= new ArrayList<>();//final answer, saare root-to-leaf paths
         ArrayList<Integer> arr= new ArrayList<>();//current path, abhi jis path par DFS chal raha hai
         dfs(root, arr, ans);
         return ans;
    }
    public static void dfs(Node root , ArrayList<Integer> arr, 
    ArrayList<ArrayList<Integer>>ans){
        if(root==null) return;
        arr.add(root.val);
        if(root.left==null && root.right==null){
            ArrayList<Integer> list= new ArrayList<>();
            list.addAll(arr); //deepcopy of arraylist arr as it is pass by reference //hum current path ki copy bana rahe hain.
            ans.add(list);
        }
        dfs(root.left , arr, ans);
        dfs(root.right , arr, ans);
        arr.remove(arr.size()-1); //backtracking
    }
}
