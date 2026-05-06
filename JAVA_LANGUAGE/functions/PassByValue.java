package functions;

public class PassByValue {
  public static void change(int a){
    a=7;
    System.out.println(a);
  }

  public static void main(String[] args) {
    int a=3;
    System.out.println(a);// passes only value
    change(a);
    System.out.println(a);
  }
}
