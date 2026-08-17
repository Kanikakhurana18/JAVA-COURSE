package binaryTrees;

public class MinimumDistBwgivenNodes {
  public static void main(String[] args) {
    Node root = Node.createTree();
    DisplayAndNodeClass.display(root);
    System.out.println();
    int p=2, q=3;
    System.out.println(findDist(root, p, q));
  }

     public static int findDist(Node root, int a, int b) {
        Node LCA=lca(root, a,b);
        int[] dis={0,0};
        dfs(LCA, a,b,0, dis);
        return dis[0]+dis[1];
    }
    private static void dfs(Node root, int a, int b, int depth, int[] dis){
        if(root==null) return;
        if(root.val==a) dis[0]=depth;
        if(root.val==b) dis[1]=depth;
        dfs(root.left,a,b,depth+1,dis);
        dfs(root.right,a,b,depth+1,dis);
    }
    public static Node lca(Node root, int p, int q){
        if(root==null) return root;
        if(root.val==p || root.val==q) return root;
        Node l= lca(root.left, p,q);
        Node r= lca(root.right, p,q);
        if(l!=null && r!=null) return root;
        if(l==null) return r;
        else return l;
    }
}
