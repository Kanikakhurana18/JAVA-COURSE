package binaryTrees;

public class LCA {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    int p=2, q=3;
    System.out.println(lowestCommonAncestor(root,p,q).val);
  }
  public static Node lowestCommonAncestor(Node root, int p, int q) {
        //Tc=O(n)
        if(root==null) return root;
        if(root.val==p || root.val==q) return root;
        Node l= lowestCommonAncestor(root.left, p, q);
        Node r= lowestCommonAncestor(root.right, p, q);
        if(l!=null && r!=null) return root;
        if(l==null) return r;
        else return l;
    }

    //     //OR USING ARRAYList TC=SC=O(n)
    //     ArrayList<TreeNode> pathP= new ArrayList<>();
    //     ArrayList<TreeNode> pathQ= new ArrayList<>();
    //     findPath(root, p, pathP);
    //     findPath(root, q, pathQ);
    //     int i=0;
    //     while(i<pathP.size() && i<pathQ.size() && pathP.get(i)==pathQ.get(i)){
    //         i++;
    //     }
    //     return pathP.get(i-1);
    // }
    // public boolean findPath(TreeNode root, TreeNode tar , ArrayList<TreeNode> path){
    //     if(root==null) return false;
    //     path.add(root);
    //     if(root==tar) return true;
    //     if(findPath(root.left, tar , path) || findPath(root.right, tar, path)){
    //         return true;
    //     }
    //     path.remove(path.size()-1);
    //     return false;
    // }


    //     //Tc=O(n) worst case mai O(n^2)
    //     if(root==null) return null;
    //     if(root==p || root==q) return root;
    //     boolean pliesLeft= exists(root.left, p);
    //     boolean qliesleft= exists(root.left, q);
    //     if(pliesLeft && qliesleft) return lowestCommonAncestor(root.left, p, q);
    //     else if(!pliesLeft && !qliesleft) return lowestCommonAncestor(root.right, p, q);
    //     else return root;
    // }
    // private boolean exists(TreeNode root, TreeNode target){
    //     if(root==null) return false;
    //     if(root==target) return true;
    //     return exists(root.left, target) || exists(root.right, target);
    // }
}
