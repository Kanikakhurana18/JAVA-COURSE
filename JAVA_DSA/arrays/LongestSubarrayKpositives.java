package arrays;

public class LongestSubarrayKpositives {
  public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int n=arr.length;
        int maxlen=0;
        int left=0, right=0; //pointers like i &j at index 0
        int sum =arr[0]; // current elemet ie starting wala
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left]; //exceed sum then - subtract and left ko increase
                left++;
            }
            
            if(sum==k){//update
                maxlen= Math.max(maxlen,right-left+1);
             }
             right++;
             if(right<n){
                 sum+= arr[right];
             }
        }
        System.out.println(maxlen);
}
}