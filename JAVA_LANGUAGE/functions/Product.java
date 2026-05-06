package functions;

public class Product {
  public static int product(int a, int b){ // sum: function
  int p= a*b; // sum: local variable
  System.out.println(p);
  return p;
  }
  public static void main(String[] args) {
    product(6,9);
  }
}

