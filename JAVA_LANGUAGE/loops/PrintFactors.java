package loops;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PrintFactors {
//  public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
    // // for(int i=1;i<=Math.sqrt(n);i++)
    //  for(int i=1;i*i<=n;i++){
    //   if(n%i==0){
    //   System.out.print(i+ " ");
    //   System.out.print(n/i+" ");}
    // }

    //store in form of arraylist to get sorted result of divisors
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Input number
        int N = 36;

        // Get divisors
        List<Integer> result = sol.getDivisors(N);

        // Print the result
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
class Solution {
    // Function to get all divisors
    public List<Integer> getDivisors(int N) {
        // Create a list to store divisors
        ArrayList<Integer> res = new ArrayList<>();

        // Loop from 1 to square root of N
        for (int i = 1; i * i <= N; i++) {
            // Check if i divides N
            if (N % i == 0) {
                // Add i to result
                res.add(i);

                // If N / i is different from i, add N / i too
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }
        Collections.sort(res);
        // Return the list of divisors
        return res;
    }
}