package recursion;

public class LinearBinarySearch {
  public static void main(String[] args) {
    int[] arr= {1,46,98,77,6,99,3};
    int target=99;
    System.out.println(exist(arr,target,0));
  }
  public static boolean exist(int[] arr, int target, int idx){
    if(idx==arr.length) return false;
    if(arr[idx]==target) return true;
    return exist(arr, target, idx+1);
  }
}
