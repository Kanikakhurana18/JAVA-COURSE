package arrays;

import java.util.HashMap;

public class LongesSubarrayBothPositNdNeg {
  public static void main(String[] args) {
    int[] nums = {1,2,3}; 
    int k = 3;
    int n=nums.length;
    //Brute force approach //time complexity O(n^2) hai
        // int count=0;
        // for(int i=0;i<n;i++){  //starting point i=0
        //     int sum=0;
        //     for(int j=i;j<n;j++){ //ending j=i as move krega j till point i
        //         sum+=nums[j];
        //         if(sum==k) count++;
        //     }
        // }
        // System.out.println(count); 


        //optimal approach - Unordered Hashmap(key → value store) timecomplexity= O(n)
        //using Prefix subarray
        //subarray[i,j]= PS[j] - PS[i-1]
        // K = PS[j] - PS[i-1]
        //PS[i-1]= PS[j]-K
        // 1. prefixSum bana lo
        // 2. har element pe: agar prefixSum[j] == k → count++
              // agar (prefixSum[j] - k) map me hai → count badhao
        // 3. prefixSum[j] ko map me store karo
        int count=0;
        //step1 prefix sum array/ vector according to question
        int[] prefixsum = new int[n];
        prefixsum[0]= nums[0];
        for(int i=1;i<n;i++){  //i=1 to avoid out of index error
        prefixsum[i]= prefixsum[i-1]+ nums[i]; //add no not index
        }
        // step2 unordered hashmap
        HashMap<Integer,Integer> map= new HashMap<>();
        //traverse
        for(int j=0;j<n;j++){
            //case1 starting mai hi prefixsum==k
            if(prefixsum[j]==k) count++;

            //case2 prefixsum[j]-k
            int val=prefixsum[j]-k;
            if(map.containsKey(val)){
                count+= map.get(val);
            }

            //step-4 store prefix value
            map.put(prefixsum[j],map.getOrDefault(prefixsum[j],0)+1); //that is                                       //if(map.containsKey(prefixSum[j])) {
                    //     map.put(prefixSum[j], map.get(prefixSum[j]) + 1);
                                         // } else {
                                       //     map.put(prefixSum[j], 1);
                                            // }
        }
         System.out.println(count);
    }
}


 
