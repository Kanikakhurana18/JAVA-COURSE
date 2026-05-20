package strings;

public class BuiltInMethod {
  public static void main(String[] args) {
    String s1 ="Kanika";
    System.out.println(s1.length());
    System.out.println(s1.indexOf('a'));// first occurence of 'a'
    System.out.println(s1.lastIndexOf('a')); // last occurence of 'a'
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1.contains("anika"));
    System.out.println(s1.startsWith("Ka"));

    String s2= "Khurana";
    System.out.println(s1.compareTo(s2)); //ASCII CHAR SUBTRACTION(97-104)
    System.out.println(s1.concat(s2));
    System.out.println(Character.isLetterOrDigit('@')); //only takes alphanumeric
  }
}
