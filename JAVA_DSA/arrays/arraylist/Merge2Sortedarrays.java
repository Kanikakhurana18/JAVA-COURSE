package arrays.arraylist;

public class Merge2Sortedarrays { //TC= O(n+m) and SC= O(n+m)
  //3 pointer or varible technique
  public static void main(String[] args) {
    int[] a={1,2,3,4,45};
    int[] b={3,4,6,7,8,9,90};
    int[] c=new int[a.length+b.length];
    for(int ele: c){
      System.out.print(ele+" ");}
      System.out.println();
      merge(a,b,c);
      for (int i : c) {
        System.out.print(i+" ");
      }
    }
      public static void merge(int[] a, int[] b, int[] c){
      int i=0,j=0,k=0;
      while(i<a.length && j<b.length){
        if(a[i]<=b[j]){
          c[k]=a[i];
          i++;
          k++;
        }
        else{
          c[k]=b[j];
          j++;
          k++;
        }}
        if(i==a.length){
          while(j<b.length){
            c[k++]=b[j++];
          }
        }
        if(j==b.length){
          while (i<a.length) {
            c[k++]=a[i++];
          }
        }
      }
      }


