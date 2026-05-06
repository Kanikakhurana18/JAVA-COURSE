package functions;

public class Sum {
  public static int sum(int a, int b){ // sum: function
  int sum= a+b; // sum: local variable
  System.out.println(sum);
  return sum;
  }

  public static void main(String[] args) {
    sum(6,9);
  }
}
