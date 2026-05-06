package arrays;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] nums={1,1,2,3,3,4,5,5,5,6,6,6,6};
    int i=0;
        for(int j=1;j<nums.length;j++){ //second element start that
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
            i++;}      
        }
        System.out.println("Unique elements are: "+(i+1)); //total elements will be equal to i+1(0,1,2)
        for(int k = 0; k <i+1; k++){
    System.out.print(nums[k] + " ");
      }
}}
