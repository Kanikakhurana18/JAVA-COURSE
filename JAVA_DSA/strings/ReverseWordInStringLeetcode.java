package strings;

public class ReverseWordInStringLeetcode {
  public static void main(String[] args) {
    String s = "Hello World   ";
    // Tc = O(n) and SC= o(n) because you are using string builder
        StringBuilder ans = new StringBuilder();
        int i= s.length()-1; //end position
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){ //trailing extra sapces remove krne ke liye use hota hai 
                i--;
            }
            if(i<0) break;
            int end =i;
            while(i>=0 && s.charAt(i)!=' '){  // poora word find karo
                i--;
            }
            ans.append(s.substring(i+1, end+1));
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans.toString());


        //Inplace reverse with space complextity O(n) tc= o(n)
    //    String[] word= s.trim().split("\\s+"); //extra spaces remove //String[] words = {"the", "sky", "is", "blue"};
    //    String clean = String.join(" ", word);//"the sky is blue" space se jod do
    //    char[] arr= clean.toCharArray(); //so to convert into characters for reverse
    //    int n= arr.length;
    //    reverse(arr, 0 ,n-1); // Step 2: poori string reverse
    //    int start =0; //har word reverse
    //    for(int end=0;end<=n;end++){
    //     if(end==n || arr[end]==' '){
    //         reverse(arr, start, end-1);
    //         start =end+1;
    //     }
    //    }
    //  return new String(arr); // return String.valueOf(arr); //arr to string
    // }
    //  //helper function
    //    public static void reverse(char[] arr, int left , int right){
    //         while(left<right){
    //             char temp = arr[left];
    //             arr[left]= arr[right];
    //             arr[right]= temp;
    //             left++;
    //             right--;
    //         }

    

        //Using Built in methods but takes extra space O(N) TC= O(N)
        // String[] arr = s.trim().split("\\s+");

        // StringBuilder ans = new StringBuilder();

        // for(int i = arr.length - 1; i >= 0; i--){

        //     ans.append(arr[i]);

        //     if(i != 0){
        //         ans.append(" ");
        //     }
        // }

        // return (ans.toString());
  }
}
