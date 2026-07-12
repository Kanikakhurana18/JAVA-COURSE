package cyclicSort;

public class FirstMissingPositive {
  public static void main(String[] args) {
    int[] arr={3,4,-1,2};
    System.out.println(firstMissingPositive(arr));
   }
    public static int firstMissingPositive(int[] arr) {
        int i=0; //Using cyclic sort TC=O(n) and Sc=O(1)
        int n=arr.length; //1 to n
        while(i<n){
            if(arr[i]<=0 || arr[i]>n ||arr[i]==arr[arr[i]-1] || arr[i]==i+1) i++;
            else swap(arr, i, arr[i]-1);
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) return i+1;
        }
        return n+1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
