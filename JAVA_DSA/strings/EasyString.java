package strings;

public class EasyString {
  public static void main(String[] args) {
    String s = "aaABBb";
    //Group find karna → i, j
    //Output store karna → StringBuilder
    //Two Pointers / Grouping Technique hai. TC= O(n)
        int i=0;
        int n=s.length();
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        while(i<n){
           int j=i;
            while(j<n && s.charAt(i)==s.charAt(j)){
                j++;
            }
            int count=j-i;
            sb.append(count);
            sb.append(s.charAt(i));
            i=j;
        }
        System.out.println(sb.toString());
  }
}
