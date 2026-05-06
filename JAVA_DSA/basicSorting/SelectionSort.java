package basicSorting;

public class SelectionSort { //TC= O(n^2) and it is not stable sorting
//select minimum element and swap it with first elem
  public static void main(String[] args) {
    int[] arr={3,1,2};
    int n= arr.length;
    for(int i=0;i<n-1;i++){
      int min= Integer.MAX_VALUE;//inside first loop
      int mindx=-1;
      for(int j=i;j<n;j++){ //finding minimum elem in array and assigning its index and j=n as //checking till last last for minimum
        if(arr[j]<min){
          min= arr[j];
          mindx=j;
        }
      }
       //swap with first element
      int temp= arr[i];
      arr[i]=arr[mindx]; //as mindx=j that is why we take mindx
      arr[mindx]=temp;
     }
     //print
     for (int i : arr) {
      System.out.print(i+" ");
     }
  }
}
