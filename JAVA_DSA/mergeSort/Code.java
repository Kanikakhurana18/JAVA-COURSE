package mergeSort;//DIVIDE & CONQUER [Fast and stable]

import java.util.Arrays;

public class Code { //Tc= O(nlogn) SC= O(nlogn)
  public static void main(String[] args) {
    int[] arr={5,4,3,7,-3,9,8,7,0};
    mergesort(arr);
    // for (int i : arr) {
    //   System.out.print(i+" ");
    // }
    System.out.println(Arrays.toString(arr));
  }
  public static void mergesort(int[] arr){
    int n= arr.length;
    if(n==1) return;
    int[] a= new int[n/2]; //create two empty array of n/2 each
    int[] b= new int[n-n/2];
    int idx=0; //idx travle krega array pe //copy paste arr into a and b
    for(int i=0;i<a.length;i++) a[i]=arr[idx++];
    for(int i=0;i<b.length;i++) b[i] =arr[idx++];
    mergesort(a);//recursion magic
    mergesort(b);
    merge(a, b, arr); //merge two sorted array a, b into arr
  }
  public static void merge(int[] a, int[] b, int[] c){
    int i=0,j=0,k=0;
    while(i<a.length&& j<b.length){
      if(a[i]<=b[j]) c[k++]=a[i++];
      else c[k++]=b[j++];
    }
    while(i<a.length) c[k++]=a[i++];
    while (j<b.length) c[k++]=b[j++];
  }

}
