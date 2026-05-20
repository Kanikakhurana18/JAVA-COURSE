package binarySearch;

public class NthMagicalNumber {
     public static int nthMagicalNumber(int n, int a, int b) {
        long mod= 1000000000+7;
        long low= Math.min(a,b);
        long high= (long)Math.min(a,b)*n;
        long lcm=(long)a*b/ gcd(a,b); //method call
        while(low<high){
            long mid= low+(high-low)/2;
            long count= mid/a+mid/b-mid/lcm; //count= no of factors
            if(count<n) low=mid+1;
            else high=mid;
        }
        return (int)(low%mod);
    }
public static long gcd(long a, long b){
    while(b!=0){
        long temp=b;
        b= a%b;
        a=temp;
    }
    return a; //remember a not b
}

public static void main(String[] args) {
  int n=1, a=2, b=3;
  int ans= nthMagicalNumber(n,a,b);
  System.out.println(ans);
}
}
