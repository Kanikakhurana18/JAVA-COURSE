package arrays;

public class SingleNumber {
  public static void main(String[] args) {
    int[] nums={1,1,2,2,3,4,4,6,6};
    int xor=0;  //a ^ a = 0 and  0 ^ a = a. 
      for(int i=0;i<nums.length;i++){
            xor= xor^nums[i];
        }
        System.out.println(xor);
    }
}
  
