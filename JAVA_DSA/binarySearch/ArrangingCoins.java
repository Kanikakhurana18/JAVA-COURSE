package binarySearch;

public class ArrangingCoins {
  // public static void main(String[] args) {
    // int n=8;
  //   //Using Mathematical formula with type casting
  //   long m= (long) n;
  //   System.out.println((sqrt(8*m+1)-1)/2); //long convert kr diya in form of m )
    
  // }
  // //Using Mathematical formula with type casting
  // public static int sqrt(long n){
  //       if(n==0) return 0; //edge case
  //       long low=0, high=n; //till n
  //       while(low<=high){
  //           long mid=low+(high-low)/2;
  //           if(mid==n/mid) return (int)mid;
  //           else if(mid>n/mid) high=mid-1;
  //           else low= mid+1;
  //       }
  //       return (int)high;
// }


       //Without mathematical formula[Uing sum of n natural numbers]
       public static void main(String[] args) {
        int n=3;
        // long low=0, high=n, ans =0;
        // while(low<=high){
        //     long mid=low+(high-low)/2;
        //     long coins= mid*(mid+1)/2;
        //     if(coins==n) {
        //       System.out.println((int)mid);
        //       return;
        //     }
        //     else if(coins>n) high=mid-1;
        //     else {
        //         ans=mid;
        //         low=mid+1;
        //     }
        // }
        // System.out.println((int)ans) ;

        //Or
        long low=0, high=n;
        while(low<=high){
            long mid=low+(high-low)/2;
            long coins= mid*(mid+1)/2;
            if(coins==n) {
              System.out.println( (int)mid);
              return;
            }
            else if(coins>n) high=mid-1;
            else low=mid+1;
        }
        System.out.println((int)high);
       }
       
}