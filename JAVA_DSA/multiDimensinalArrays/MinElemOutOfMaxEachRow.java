package multiDimensinalArrays;

public class MinElemOutOfMaxEachRow {
  public static void main(String[] args) {
  int[][] arr={{5,4,3,306},{5,8,869,5},{4,6,987}};
  int minOfMax=Integer.MAX_VALUE;  //let minimum value out of maximum elemts(opposite take)
  int rowIndex=-1;//-1= no valid index
  for(int i=0;i<arr.length;i++){
    int rowmax=Integer.MIN_VALUE;  //each row max value as row ka maximum elem chahiye
    for(int j=0;j<arr[i].length;j++){
    if(arr[i][j]>rowmax) rowmax=arr[i][j]; //rowmax= maximum elements 
    }
    if(rowmax<minOfMax) 
      {minOfMax=rowmax;
    //maximum elemst mai chota(smallest) elem check krenge (306 < ∞ → YES update minOfMax = 306; second row(rowMax = 869) 869 < 306 → NO ==no change
    rowIndex=i;}
  }
  System.out.println("Max Element: "+minOfMax);
  System.out.println("Row index: " + rowIndex); 


  //MAXIMUM ELEMENSTS OUT OF MAXIMUM ELEMTS IN EACH ROW
  int overallMax = Integer.MIN_VALUE;  //maximum elem
  for(int i = 0; i < arr.length; i++){
      int rowMax = Integer.MIN_VALUE;  //max elem
      for(int j = 0; j < arr[i].length; j++){
        if(arr[i][j] > rowMax){
          rowMax = arr[i][j];
        }
      }
      // compare row max with overall max
      if(rowMax > overallMax){  //greater(maximum check krenge)
        overallMax = rowMax;
      }
    }
     System.out.println("Max Element: " + overallMax);
}
}