package strings;

public class PassingStringToMethod { //Pass by value of reference
  public static void change(String x){
    x="Utkarsh";
  }
  public static void main(String[] args) {
    String x="Kanika";
    System.out.println(x); //kanika
    change(x); //method call with parameter
    System.out.println(x); //kanika
  }
}
