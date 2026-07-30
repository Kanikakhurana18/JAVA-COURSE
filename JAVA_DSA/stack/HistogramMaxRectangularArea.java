package stack;

import java.util.Stack;

public class HistogramMaxRectangularArea {
  public static void main(String[] args){
    int[] arr={60, 20, 50, 40, 10, 50, 60};  //second last 50*2 =100
    System.out.println(largestRectangleArea(arr));
  }
  public static int largestRectangleArea(int[] arr) {
   //Using Stack TC=SC=O(n)
        int n= arr.length;
        int[] nse= new int[n];
        nse[n-1]=n;
        Stack<Integer> st= new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        //Empty Stack
        while(st.size()>0) st.pop(); //st.clear();
        
        int[] pse= new int[n];
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        
        int maxArea=0;// int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area=arr[i] * (nse[i]-pse[i]-1);
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;


    // Brute force TC=O(N^2) Sc=O(1)
        // if(arr==null || arr.length==0) return 0;
        // int maxarea=0;
        // int n=arr.length;;
        // for(int i=0;i<n;i++){ //rectangle kahan se start hoga.
        //     int minHeight= Integer.MAX_VALUE;
        //     for(int j=i;j<n;j++){ //Ye rectangle ko aage badha raha hai.
        //         minHeight=Math.min(minHeight, arr[j]);
        //         int width=j-i+1;
        //         int currArea=minHeight*width;
        //          maxarea=Math.max(maxarea, currArea);
        //     }
        // }
        // return maxarea;
    }
}
