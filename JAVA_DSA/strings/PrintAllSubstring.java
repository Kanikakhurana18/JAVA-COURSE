package strings;

public class PrintAllSubstring {
  public static void main(String[] args) {
  //Substring= part of string
  // String s="Kanika";
  // System.out.println(s.substring(1,3)); //1 index se end tk sara print krna hai

  String s="Kanika";
  for (int i = 0; i < s.length(); i++) {
    for (int j = i+1; j <=s.length(); j++) {
      System.out.print(s.substring(i,j)+" ");
    }
    System.out.println();
  }
  }
}
