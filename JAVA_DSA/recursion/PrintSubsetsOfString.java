package recursion;

public class PrintSubsetsOfString {
  public static void main(String[] args) {
    String s="abc";
    subset("",s,0);
  }
  public static void subset(String ans, String s, int idx){
    if(idx==s.length()){
      System.out.print(ans+" ");
      return;
    }
    char ch=s.charAt(idx);
    subset(ans+ch, s, idx+1);//pick
    subset(ans, s, idx+1); //skip
  }
}
