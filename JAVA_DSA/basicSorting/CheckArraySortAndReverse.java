package basicSorting;

public class CheckArraySortAndReverse {
  public static void main(String[] args) {
    int[] nums={3,4,5,1,2};
    int count=0;
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]>nums[(i+1)%n]) count++;
        // } or
        
          for (int i = 1; i < n; i++) {
            if(nums[i] < nums[i-1]) {
                count++;
            }}
            //circular check
            if(nums[0]<nums[n-1]) {count++;}
        System.out.println(count<=1);
  }
}
