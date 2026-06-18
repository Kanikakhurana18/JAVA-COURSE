package strings;

import java.util.Arrays;

public class ReverseEachWordInString {
  public static void main(String[] args) {
    String s = "   i like this program very much    ";
    //trim: s = " i like this program very much "
    System.out.println(s.trim());
    String[] words = s.trim().split("\\s+");
    //String ko words me tod deta ha Yahan multiple spaces ko separator maana gaya.
        // This will now print the words nicely as an array: [i, like, this, program, very, much]
        System.out.println("Split words: " + Arrays.toString(words));
  }
}
