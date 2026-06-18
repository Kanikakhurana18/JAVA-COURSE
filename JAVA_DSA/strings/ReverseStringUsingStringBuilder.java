package strings;

public class ReverseStringUsingStringBuilder {
  public static void main(String[] args) {
    String s="Kanika";
    StringBuilder sb = new StringBuilder(s);
    // sb.reverse();
    reverse(sb);
    s=sb.toString();
    System.out.println(s);
  }

  
    //Function of reverse in string builder
    public static StringBuilder reverse(StringBuilder sb){
    int i=0, j= sb.length()-1;
    while(i<=j){
      char temp1= sb.charAt(i);
      char temp2= sb.charAt(j);
      sb.setCharAt(i, temp2);
      sb.setCharAt(j, temp1);
      i++;
      j--;
    }
    return sb;
  }
}
