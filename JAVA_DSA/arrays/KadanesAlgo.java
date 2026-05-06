package arrays;

public class KadanesAlgo {
    public static int maxSubArray(int[] nums) {
      //BOTH INDICES AND VALUE OF MAXIMUM SUBARRAY
        int maxsum= Integer.MIN_VALUE;
        int sum=0;
        int start = 0; // Starting index of current subarray
        int ansStart=-1, ansEnd=-1;// Indices of the maximum sum subarray
        for(int i=0;i<nums.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=nums[i];
            if(sum>maxsum){
                 maxsum=sum;
                 ansStart=start;
                 ansEnd=i;
            }
            if(sum<0){
                sum=0; //reset sum value
          }
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
        return maxsum;
    }
    public static void main(String[] args) {
         int[] arr = { 2, 3, 5, -2, 7, -4  };
         System.out.println(maxSubArray(arr));
    }
}

