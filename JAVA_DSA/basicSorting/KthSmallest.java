package basicSorting;

public class KthSmallest {
  public static void main(String[] args) {
    int[] arr={10, 5, 4, 3,3, 48, 6, 2, 33, 53, 10};
    int k=3;
        //selection sort use because smallest elem first find
        int n=arr.length; //TC=O(n*k)
        for(int i=0;i<k;i++){ //kth elem ie k passes
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        System.out.println(arr[k-1]);
  }
}
