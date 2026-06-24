package recursion;

public class GlobalAndLocalVariable {
  static int x=10; //Global variable (outside function)
  public static void main(String[] args) {
    x=9; //change
    System.out.println(x);
    int x=4; //local variable initialised using int
    System.out.println(x);
    x=6;
    System.out.println(x);
  }
  public static void fun(){
    x=20; //Global var used
  }
}
