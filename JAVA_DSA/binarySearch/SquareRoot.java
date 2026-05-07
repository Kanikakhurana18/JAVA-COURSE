package binarySearch;

public class SquareRoot {
  public static void main(String[] args) {
    int x =8;
      //  //Using brute force(Mathematical approach)
      //   int root=0;
      //   for(int i=1;i<=x;i++){ //square root = 1to x
      //       if((long)i*i>x) break;
      //       root =i;  //Mark
      //   }
      //   System.out.println(root);//The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

      //OR
      //Using otimized Binary search approach
      //Using Type casting LONG
      // if(x==0) System.out.println("0"); //edge case
      //   long low=1, high=x; //square root 1 to n
      //   while(low<=high){
      //       long mid=low+(high-low)/2;
      //       if(mid*mid==x) System.out.println((int)(mid));
      //       else if(mid*mid>x) high=mid-1;
      //       else low=mid+1;
      //   }
      //   System.out.println((int)(high));

      //or without using long
      if(x==0) System.out.println("0"); //edge case
        int low=1, high=x; //square root 1 to n
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==x/mid) System.out.println(mid);
            else if(mid>x/mid) high=mid-1;
            else low=mid+1;
        }
        System.out.println(high);
  }
}
