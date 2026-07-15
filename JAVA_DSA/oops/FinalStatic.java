package oops;

class Cricketer{
  // final String country="India"; //fixed
  static String country="India"; //shareable ya common to all objects.
  int runs;
  String name;
  
  static void greet(){ //static means shareable is another class
    System.out.println("Minimum number of balance is 5000");
  }
}
public class FinalStatic {
  public static void main(String[] args) {
  Cricketer c1= new Cricketer();
  // c1.country="England";//Error as it is already final 
  c1.country="New Zealand"; //change allowed
  System.out.println(c1.country);
  c1.greet();
  }
}
