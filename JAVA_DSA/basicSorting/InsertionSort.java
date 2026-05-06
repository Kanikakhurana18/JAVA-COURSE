package basicSorting;

public class InsertionSort { //TC= O(n^2) and for sorted it is O(n) and it is stable
// Array divide in two part sorted and unsorted and insert unsorted in sorted part 
  public static void main(String[] args) {
    int[] arr={4,1,7,9,3,8,1,0};
    for(int i=1;i<arr.length;i++){//can't i=0 because j=i and while loop mai j>0 hai
      int j=i;
      while(j>0 && arr[j]<arr[j-1]){
        int temp= arr[j]; //swap
        arr[j]= arr[j-1];
        arr[j-1]= temp;
        j--;
      }
    }
    for(int ele: arr) System.out.print(ele+" ");
  }
}
