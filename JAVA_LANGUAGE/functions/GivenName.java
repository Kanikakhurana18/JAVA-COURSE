package functions;
import java.util.*;

public class GivenName {
  public static void Name(String name){
    System.out.println(name);
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String n= sc.nextLine();
    Name(n);
  }
}
