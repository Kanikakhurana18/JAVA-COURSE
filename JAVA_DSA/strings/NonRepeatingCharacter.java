package strings;

public class NonRepeatingCharacter {
  public static void main(String[] args) {
    String s= "racecar";
    //Frequency array Time:O(n) Space: O(1)=constant space
     int n=s.length();
        int[] freq= new int[26];
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            int idx= ch-'a';
            freq[idx]++;
        }
       for(int i=0;i<n;i++){//First Non-Repeating Character not lexographically that is why not using 26
     //string ki length tk traverse krna hai not 26 times
             char ch=s.charAt(i);
            if(freq[ch-'a']==1) System.out.println(ch);
        }


    //Brute force Time: O(n^2) Nested loop Space: O(1) 
    // for(int i=0;i<n;i++){
    //   int count=0;
    //   for(int j=0;j<n;j++){
    //     if(s.charAt(i)==s.charAt(j)) count++;
    //   }
    //   if(count==1) System.out.println(s.charAt(i));
    // }
         
  }
}
