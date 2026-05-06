package arrays;
//LINEAR SEARCH
public class Search {
  public static void main(String[] args) {
    int[] arr={1,23,445,67,67};
    int target=6;
    int found=-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==target){
        found=i;
      break;}
    }
    if(found!= -1) System.out.println("target is found "+ found);
    else System.out.println("target is missing");
  }
}
