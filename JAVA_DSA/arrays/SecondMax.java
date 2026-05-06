package arrays;

public class SecondMax {
  public static void main(String[] args) {
    int[] arr={1,2,3,498,780};
    int max= Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        if(smax==Integer.MIN_VALUE){
          System.out.println("No second largest element");
        }
        System.out.println(max);
        System.out.println(smax);
  }
}
