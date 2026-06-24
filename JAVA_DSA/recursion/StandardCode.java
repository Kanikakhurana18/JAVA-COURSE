package recursion;

public class StandardCode {
  //Recursion= Fynction calling itself[Function can stop using parameters and return or break statement]
  //It is slower than for loop(callback) even though time complex is same.
  public static void print(int n){
    if(n==0) return; //Base case[Stop to avoid infinite recursion]
    System.out.println(n); //working()
    print(n-1); //Function call
    //working()
  }
}
