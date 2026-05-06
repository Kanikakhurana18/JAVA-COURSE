package multiDimensinalArrays;

public class ColumnWiseElemts {
  public static void main(String[] args) {
    //column wise
    int[][] arr={{5,4,3,306},{5,8,869,5},{4,6,987},{908,87}};
    for(int j=0;j<arr[0].length;j++){
      for(int i=0;i<arr.length;i++){
        if(j<arr[i].length) //“is row me column j exist karta hai ya nahi” 
        //array ek jagged(irregular: differ colums) hai to check j kya row mai exist krta hai(like i=0,1 hai only 2 elemts) so no out of index for elemt 3rd index as thee is no ement so check ith length(row length)
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();  //after 1 loop ends
    }
  }
}
