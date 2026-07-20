package linkedList;

public class HappyNumber {//A happy number is a positive integer that eventually
//  reaches 1. when you repeatedly replace it with the sum of the squares of its 
// digits. If the process gets stuck in an endless loop, it is called an unhappy (or sad) number.
  public static void main(String[] args){
    int n=19;
    int slow= n;
         int fast= n;
         do{
            slow= squareSum(slow);
            fast= squareSum(squareSum(fast));
         } while(slow!=fast);
         System.out.println(slow==1);////or fast==1 as slow and fast ultimately beacomes equal
  }
  public static int squareSum(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum+= digit*digit;
            n/=10;
        }
        return sum;
    }
}
