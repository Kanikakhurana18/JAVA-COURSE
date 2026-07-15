package oops;

public class PassingObjectsToMethods {
  public static class Car {
    int seats;
    String name;
    double horsepower;
  
  void print(){ //We can use method inside the object of class 
    System.out.print(seats+" "+name+" "+horsepower);
    System.out.println();
  }
}
    public static void main(String[] args) {
      Car c1= new Car();
      c1.seats=5;
      c1.name="I-20";
      c1.horsepower= 82.6;
      c1.print();
      change(c1);
      System.out.println(c1.seats);//PASS BY REFERNCE IN OOPS
      c1.print();
    }
    public static void change(Car x){////PASS BY REFERNCE IN OOPS
      x.seats=6;
    }
  }

