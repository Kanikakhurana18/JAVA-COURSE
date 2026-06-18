package strings;
import java.util.Arrays;

public class MostFrequentCharacter {
  public static void main(String[] args) {
    String s="character";
    //Method-3 Frequency array TC[O(n)]  Space complex[O(1)]
    int n= s.length();
    int[] freq= new int[26];
    for(int i=0;i<n;i++){
      char ch=s.charAt(i);
      int idx= ch-97;
      freq[idx]++;
    }
    int maxfreq=0;
    char ans= s.charAt(0);//default value =0
    for(int i=0;i<26;i++){ //traversing in frequency array
      if(freq[i]>maxfreq){
        maxfreq=freq[i];
        ans=(char)(i+97);
      }
    }
    System.out.println(ans);

    
    //Method-2 sorting- Sliding Window TC[O(nlogn)]
    // int n=s.length();
    // int maxfreq=-1;
    // char ans= s.charAt(0);
    // char[] arr= s.toCharArray();
    // Arrays.sort(arr);
    // int i=0, j=0;
    // while(j<n){
    //   if(arr[i]==arr[j]) j++;
    //   else{
    //     int freq= j-i;
    //     if(freq>maxfreq){
    //       maxfreq=freq;
    //       ans=arr[i];
    //     }
    //     i=j;
    //   }
    //   int freq=j-i; //last string check ke liye kr rhe hai 
    //   if(freq>maxfreq){
    //     maxfreq=freq;
    //     ans=arr[i];
    //   }
    // }
    //  System.out.println(ans);


    //Method-1 Brute force methhod nested loop TC[o(n^2)]
    // int n= s.length();
    // int maxfreq=-1;
    // char ans= s.charAt(0);
    // for(int i=0;i<n;i++){
    //   int freq=1;
    //   char ch=s.charAt(i);
    //   for(int j=i+1;j<n;j++){
    //     if(s.charAt(j)==ch) freq++;
    //   }
    //   if(freq>maxfreq){
    //     maxfreq=freq;
    //     ans=ch;
    //   }
    //   else if(freq==maxfreq && ch<ans) ans=ch;
    // }
    // System.out.println(ans);
  }
}
