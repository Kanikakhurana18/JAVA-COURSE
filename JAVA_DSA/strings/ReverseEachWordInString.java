package strings;

import java.util.Arrays;

public class ReverseEachWordInString {
  public static void main(String[] args) {
    // String s = "   i like this program very much    ";
    // //trim: s = " i like this program very much "
    // System.out.println(s.trim()); //O(n) extra space ek naya array bana raha hai.
    // String[] words = s.trim().split("\\s+");
    // //String ko words me tod deta ha Yahan multiple spaces ko separator maana gaya.
    //     // This will now print the words nicely as an array: [i, like, this, program, very, much]
    //     System.out.println("Split words: " + Arrays.toString(words));//array ke har element ko string bana ke return karta hai.
                              //Arrays.deepToString ye 2d array ke liye hia
    //     String[] arr = s.split(" ");
        //"  hello   world  " op ["", "", "hello", "", "", "world"] Empty strings bhi aa jaati hain

       //Built in words TC= O(n) SC =O(n)
       String s= "   You have to do it     ";
      String[] arr= s.trim().split("\\s+");
      // Pehle bahar ke spaces hatao, phir words me tod do. To avoid empty string
        StringBuilder ans = new StringBuilder(); //final answer ko store karega.
        for(String word: arr){
            ans.append(new StringBuilder(word).reverse()); //ek temporary StringBuilder word object banata usme reverse hota hai  hai.
            // StringBuilder temp = new StringBuilder(word); //Har iteration mein naya banta hai:
            // temp.reverse();
            // ans.append(temp);
            ans.append(" ");
        } 
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans.toString());
    

  //Two Pointer + StringBuilder tc O(n) and sc= O(n)
        //  StringBuilder ans = new StringBuilder();
        //  int i = 0;
        //  int n = s.length();
        //  while(i < n){ // spaces skip
        //     while(i < n && s.charAt(i) == ' '){
        //         i++;
        //     }
        //     if(i >= n) break;
        //     int start = i;
        //     while(i < n && s.charAt(i) != ' '){     // word find
        //         i++;
        //     }
        //     int end = i - 1;
        //     for(int j = end; j >= start; j--){ // reverse word
        //         ans.append(s.charAt(j));
        //     }
        //     ans.append(" ");
        // }
        // if(ans.length() > 0){
        //     ans.deleteCharAt(ans.length()-1);
        // }
        // return ans.toString();
        
        
        
    //   // TC= o(N^2) Kyuki + se har baar nayi String banti hai.
    //   String[] words= s.trim().split("\\s+"); //split string into multiple words by space
    //   String reverseString=""; //empty string
    //   for(int j=0; j<words.length; j++){// for(String w: words){
    //       String reverseWord="";
    //       for(int i=words[j].length()-1;i>=0;i--){ //current word ko krna gai
    //           reverseWord+= words[j].charAt(i); //add in backword direction
    //       }
    //     // for(int i=w.length()-1;i>=0;i--){
    //     //       reverseWord+= w.charAt(i);
    //       reverseString+= reverseWord;
    //       if(j != words.length-1){
    //         reverseString += " ";
    //   }}
    //   return reverseString;
    // return reverseString.trim();




  }
}
