package cyclicSort;

public class SingleNumberDuplicate {
  public static void main(String[] args) {
    int[] arr={1,3,4,2,2};
    System.out.println(findDuplicate(arr));
  }

public static int findDuplicate(int[] arr) {
        int n=arr.length;//n sirf array ki length
        int i=0;
        while(i<n){
            int correctIdx= arr[i]-1;
            if(arr[i]==i+1) i++;
            else if(arr[i]==arr[correctIdx]) return arr[i];
            else swap(arr, i, correctIdx);
        }
        return -1;
    }
    public static void swap(int[] arr, int i, int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
  }
