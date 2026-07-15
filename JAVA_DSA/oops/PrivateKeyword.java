package oops;
class Student{ //outside the file bhi use kr skte hai
  String name; //string bhi private ho gya then it is called encapsulation
  private int rollno=3;
  void print(){
    System.out.println( name+" "+rollno); //getter
  }
  // public void p(){  //if void print is private
  //   System.out.println(rollno+name);
  // }

  int getRollno(){ //getter
    return rollno;
  }
  void setRollno(int x){ //setter
    rollno =x;
  }
}

public class PrivateKeyword {
  public static void main(String[] args) {
    Student s1= new Student();
    s1.name="Kanika";
    // s1.rollno=18; //error as it is private
    // s1.print();
     s1.setRollno(18); //modify
    System.out.println(s1.getRollno());
  }
}
