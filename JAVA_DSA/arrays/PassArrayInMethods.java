package arrays;

public class PassArrayInMethods {
  public static void main(String[] args) {
    int[] x={1,2,3,4,5};
    System.out.println(x[2]);
    change(x); 
    System.out.println(x[2]);}  // changed to 100 as in array it gets passed 
                                // in form of reference or methods

    public static void change(int[] x){
      x[2] =100;
    }
  }

