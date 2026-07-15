package oops;

public class Constructors {
  public static class Car{
    int seats; //0 default
    String name; //null
    int horsepower; //0
//CONSTRUCTOR OVERLOADING= same constructor name (Car) hai, lekin parameters different hain.
  Car(){ //default constructor hai means no parameters and return type
    }
  Car(int x, String s, int y){ //parameterized constructor
    seats= x; 
    name=s;
    horsepower=y;
  }
  void print(){
    System.out.println(seats+" "+name+" "+horsepower);
  }
}
public static void main(String[] args) {
  Car c1= new Car(5, "i-20", 118);
  c1.print();
  Car c2= new Car();
  c2.name="Honda"; //this needs default constuctor
  c2.print();
}
}
