package binarySearch;

public class SingleAmongDoubles {
  public static void main(String[] args) {
    int[] arr={1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        int n=arr.length;
        if(n==1) System.out.println(arr[0]); //edge case
        if(arr[0]!=arr[1]) System.out.println(arr[0]); //edge case
        if(arr[n-1]!=arr[n-2]) System.out.println(arr[n-1]);//edge case
        
        int low=0, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]!=arr[mid-1]&& arr[mid]!=arr[mid+1]) {
              System.out.println(arr[mid]);
              return;
            }            
            int f=mid, s=mid; //dono mid mai honge starting mai
            if(arr[mid-1]==arr[mid]) f=mid-1; //adjust f and s
            else s=mid+1;
            int leftcount=f-low; //find left and right count
            int rightcount=high-s;
            if(leftcount%2==0) low=s+1;
            else high=f-1;
        }
        System.out.println("-1");
  }
}
