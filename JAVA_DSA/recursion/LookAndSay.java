package recursion;

public class LookAndSay {
  public static void main(String[] args) {
    int n=4;
    System.out.println(countAndSay(n));
  }
      public static String countAndSay(int n) {
        if(n==1) return "1";
        String s= countAndSay(n-1);
        String ans="";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int freq=j-i;
        ans+=freq;
        ans+=s.charAt(i);
        return ans;
    }


    //Or Using String Builder
  // if(n==1) return "1"; //Base case imp
//   String prev = countAndSay(n-1);
// StringBuilder ans = new StringBuilder();
// int count = 1;
// for (int i = 1; i < prev.length(); i++) {
//     if (prev.charAt(i) == prev.charAt(i-1)) {
//         count++;
//     } else {
//         ans.append(count);
//         ans.append(prev.charAt(i-1));
//         count = 1;
//     }
// }
// ans.append(count);
// ans.append(prev.charAt(prev.length()-1));
// return ans.toString();
}
