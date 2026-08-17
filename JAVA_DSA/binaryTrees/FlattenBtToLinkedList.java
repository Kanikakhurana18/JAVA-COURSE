package binaryTrees;

import javax.swing.tree.TreeNode;

public class FlattenBtToLinkedList {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    flatten(root);
     DisplayAndNodeClass.display(root);
  }
  public static void flatten(Node root) {
        //using recursion
        if(root==null) return;
        Node lst= root.left;
        Node rst= root.right;
        root.left=null;
        flatten(lst);
        flatten(rst);
        root.right=lst;
        Node last= root; //lst ka last element
        while(last.right!=null) last=last.right;
        last.right=rst;
    }


    //     //Using ArrayList
    //     ArrayList<TreeNode> arr= new ArrayList<>();
    //     dfs(root, arr);
    //     for(int i=0;i<arr.size()-1;i++){
    //         TreeNode current= arr.get(i);
    //         TreeNode next= arr.get(i+1);
    //         current.right=next;
    //         current.left=null;
    //         TreeNode last= arr.get(arr.size()-1);
    //         last.left=null;
    //         last.right=null;
    //     }
    // }
    //     public static void dfs(TreeNode root, ArrayList<TreeNode> arr){
    //         if(root==null) return ;
    //         arr.add(root);
    //         dfs(root.left, arr);
    //         dfs(root.right, arr);
    //     }
}
