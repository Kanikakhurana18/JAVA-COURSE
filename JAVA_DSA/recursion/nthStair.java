package recursion;

public class nthStair {
  public static void main(String[] args) {
    int n=2;
// There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
System.out.println(climbStairs(n));
  } 
   public static int climbStairs(int n) {
        if(n==1 || n==2) return n;
        return climbStairs(n-1)+ climbStairs(n-2);
    }
}

