package arrays;

public class MoveZeroesAtEnd {
  public static void main(String[] args) {
    int[] arr={0,0,9,8,7,30,0,0,8,0,7};
    moveZeroes(arr); //call function

    for (int i : arr) {
      System.out.print(i+" ");
    }
    }
    
    
    public static void moveZeroes(int[] arr) {
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;// no zeroes in array
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];   //swap
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
