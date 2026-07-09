package recursion;

public class TowerOfHanoi {
  public static void main(String[] args) {
    hanoi(3,'A','B','C');
    System.out.println("Minimum no. of moves: "+(int)(Math.pow(2, 3)-1));
  }
  public static void hanoi(int n, char a, char b , char c){
    if(n==0) return;
    hanoi(n-1, a,c, b); //n-1 disks frpm A to B via C
    System.out.println(a+"->"+c); //largest disk from A to C
    hanoi(n-1, b, a, c); //n-1 disks frrom B to C via A
  }

  //OR To find MINIMUM NUMBER OF MOVES TO TRANSFER n-disks
  static int count; //global variable
    // public int towerOfHanoi(int n, int from, int to, int aux) {
    // //   return (int)Math.pow(2,n)-1; 
    
    // //OR
    // count=0;
    // hanoi(n, 'A','B','C');
    // return count;
    // }
    // public void hanoi(int n, char A, char B, char C){
    //     if(n==0) return ;
    //     hanoi(n-1,A,C,B);
    //     count++;
    //     hanoi(n-1,B,A,C);
    // }
}
