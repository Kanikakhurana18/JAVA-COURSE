package mergeSort;

public class ReversePairs {
  static int count;

  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 3, 1 };
    System.out.println(ReversePairs(arr));
  }

  public static int ReversePairs(int[] arr) {
    count = 0;
    mergesort(arr);
    return count;
  }

  public static void mergesort(int[] arr) {
    int n = arr.length;
    if (n <= 1)
      return;//// Agar kabhi empty array aa gaya to recursion nahi chalega
    int[] a = new int[n / 2];
    int[] b = new int[n - n / 2];
    int idx = 0;
    for (int i = 0; i < a.length; i++)
      a[i] = arr[idx++];
    for (int i = 0; i < b.length; i++)
      b[i] = arr[idx++];
    mergesort(a);
    mergesort(b);
    merge(a, b, arr);
  }

  public static void merge(int[] a, int[] b, int[] c) {
    // Count before recursion
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      while (j < b.length && a[i] > 2L * b[j]) { // YA a[i] > 2 * (long)b[j] , a[i]> (long)2*b[j])
        j++;
      }
      // for (int x = 0; x < j; x++) { //print elem[b[0] se b[j-1] tak sab reverse pair bana rahe hain. that is why b ka loop lgega]
      //   System.out.println("(" + a[i] + ", " + b[x] + ")");
      // }
      count += j;
    }
    // count after recusion by merging them
    int i = 0, k = 0;
    j = 0; // as j is alredy defined at top
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j])
        c[k++] = a[i++];
      else { // a[i]>b[j]
        c[k++] = b[j++];
      }
    }
    while (i < a.length)
      c[k++] = a[i++];
    while (j < b.length)
      c[k++] = b[j++];
  }
}
