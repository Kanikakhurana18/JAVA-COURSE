package mergeSort;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int ans = inversionCount(arr);
        System.out.println(ans);
    }

    static int count; // Global variable

    public static int inversionCount(int arr[]) {
        // Using Merge Sort
        count = 0;
        mergesort(arr);
        return count;

        // Brute force Approach [Tc=O(n^2)] RLE
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        // for(int j=i+1;j<arr.length;j++){
        // if(arr[i]>arr[j]) count++;
        // }
        // }
        // return count;
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return; //// Agar kabhi empty array aa gaya to recursion nahi chalega
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
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else { // a[i]>b[j]
                count += a.length - i; // imp
                // for (int x = i; x < a.length; x++) { //printing elem
                //     System.out.println("(" + a[x] + ", " + b[j] + ")");
                // }
                c[k++] = b[j++];
            }
        }
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];
    }
}
