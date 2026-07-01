package recursion;

public class UniquePaths {
  public static void main(String[] args) {
    int m=3;
    int n=2;
//From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down
     System.out.println(uniquePaths(m,n));
  }
   public static int uniquePaths(int m, int n) {
     return paths(0,0,m-1,n-1);

        //OR
        // if(m==1 ||n==1) return 1;
        // return uniquePaths(m,n-1) + uniquePaths(m-1,n);
    }
    public static int paths(int cr, int cc, int lr, int lc){
        if(cr==lr && cc==lc) return 1;
        if(cr>lr || cc>lc) return 0; //avoid out of bound error
        int right=paths(cr, cc+1, lr, lc);
        int down = paths(cr+1,cc, lr, lc);
        return right+down;
    }
}
