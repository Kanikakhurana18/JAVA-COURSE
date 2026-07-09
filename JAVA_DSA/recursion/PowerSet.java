package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PowerSet {
  public static void main(String[] args) {
     String s= "abc";
     System.out.println(powerSet(s));
  }

  public static ArrayList<String> powerSet(String s) {
    ArrayList<String> solution = new ArrayList<>();
    subset("", s, 0, solution);
    Collections.sort(solution);
    return solution;
  }

  public static void subset(String ans, String s, int idx,
      ArrayList<String> solution) {
      if (idx == s.length()) {
      if(ans.length()!=0) solution.add(ans);
      return;
    }
    char ch = s.charAt(idx);
    subset(ans + ch, s, idx + 1, solution); // Pick
    subset(ans, s, idx + 1, solution); // Skip
  }
}
