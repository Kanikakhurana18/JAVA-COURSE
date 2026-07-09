package recursion;

public class KthSymbolGrammar {
  public static void main(String[] args) {
    int n=2, k=2; //n=row and k=row ka kaunsa character (position) chahiye. start hoga 1,2.... se
    System.out.println(kthGrammar(n, k));
  }
   public static int kthGrammar(int n, int k) {
        if(n==1) return 0;
        int half= (int) Math.pow(2,n-2);
        if(k<=half) return kthGrammar(n-1,k);
        else return 1-kthGrammar(n-1,k-half);
    }
}
