package strings;

public class ChangeStringtoUpperOrLower {
  public static void main(String[] args) {
    String s="AbCde";
    char ch= s.charAt(0);
        if(Character.isLowerCase(ch)) System.out.println(s.toLowerCase());
        //OR if(ch>=97 && ch<=122) return s.toLowerCase(); 
        //ACSII for lowercase (97 to 122)
        //ACSII for UPPERcase (65 to 90)
        else System.out.println(s.toUpperCase());
  }
}
