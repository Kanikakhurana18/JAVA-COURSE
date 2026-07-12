package arrays;

public class MissingInArray {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,8}; 
    // long n=arr.length+1;  // in gfg range hai 1 to n(Array size n-1)
    // long sum=n*(n+1)/2;
    // long arrsum=0;
    // for (int i = 0; i < arr.length; i++) {
    //   arrsum+=arr[i];
    // }
    // System.out.println((int)(sum-arrsum)); //typecasting always in brackets

    //or using xor as x ^ x = 0 & x^0= x [No overflow]
    int n= arr.length+1;//// GFG: numbers are from 1 to n, array size = n-1 // in leetcode range hai 0 to n(Array size n) ie different question
    int xor1=0, xor2=0;
    // XOR all array elements
        for (int i = 0; i < n-1; i++) { //gfg ka question mai n-1 array ka size hai
            xor2 ^= arr[i];
        }
     // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++){ //1 to n hai
          xor1 ^=i;
        }
    // Missing number is the XOR of xor1 and xor2
        System.out.println(xor1 ^ xor2);

  }
}
