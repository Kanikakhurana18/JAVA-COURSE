package basicSorting;

public class BubbleSort { //TC= O(N^2) for worst case & O(n) best case and stable sort
  //Swap with adjacent elements
  public static void main(String[] args) {
    int[] arr={5,-2,6,7,2,0,7,2};
    int n=arr.length;
    print(arr);
    System.out.println();
    //Optimized BUBBLE SORT //Best Case time complexity O(N)
       for(int i = 0; i < n - 1; i++) {
        boolean isSorted = true;
        for(int j = 0; j < n - 1 - i; j++) {
        if(arr[j] > arr[j + 1]) { //FOR DESCENDING ORDER JUST CHANGE SIGN (arr[j]<arr[j+1])
           // swap
           int temp = arr[j];
           arr[j] = arr[j + 1];
           arr[j + 1] = temp;
           isSorted = false; // swap hua → not sorted
    }
  } 
           if(isSorted) break; // no swap → already sorted
}
          print(arr); 


    //Better BUBBLE SORT 
      //  for(int i=0;i<n-1;i++){  //check array is sorted or not
      //   boolean isSorted=true;
      //   for(int j=0;j<n-1;j++){  //isSorted=true wala break
      //      if(arr[j]>arr[j+1]){ //if wala break
      //       isSorted=false;
      //       break;
      //      }
      //   }
      //   if(isSorted==true) break; //runs for outer for loop

      //   //if not sorted then bubble sort apply
      //   for(int j=0;j<n-1-i;j++){
      //     if(arr[j]>arr[j+1]){ //swap
      //       int temp= arr[j];
      //       arr[j]=arr[j+1];
      //       arr[j+1]= temp;
      //     }
      //   }
      //  }
      //  print(arr);


    // //BUBBLE SORT  //Time complexity =O(n^2)
    // for(int i=0;i<n-1;i++){
    //   for(int j=0;j<n-1;j++){
    //     if(arr[j]>arr[j+1]){
    //       int temp= arr[j]; //swap
    //       arr[j]=arr[j+1];
    //       arr[j+1]=temp;
    //     }
    //   }
    // }
    // print(arr);
  }
  public static void print(int[] arr){
    for(int ele: arr){
      System.out.print(ele+" ");
    }
  }
}
