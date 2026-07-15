package oops;
class Car{
    int seats; //0 default
    String name; //null
    int horsepower; //0

  Car(){ //default constructor 
    }
  Car(int seats, String name, int horsepower){ //parameterized constructor
    this.seats= seats; 
    this.name=name;
    this.horsepower=horsepower;
  }
  void print(){
    System.out.println(seats+" "+name+" "+horsepower);
  }
}
public class ThisKeyword {
  public static void main(String[] args) {
  Car c1= new Car(5,"Kia",118);
  c1.print();
  }
  }

