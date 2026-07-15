package oops;

// class Vehicle{
//   int wheels;
//   int speeed;
//   int seats;
//   Vehicle(){
//   }
//   Vehicle(int wheels, int seats){
//     this.wheels=wheels;
//     this.seats=seats;
//   }
//   void print(){
//     System.out.println(this.wheels+" "+this.seats);
//   }
// }
//   class PowerVehicle extends Vehicle{ //single inheritance
//     int engine;
//     PowerVehicle(){}
//     PowerVehicle(int wheels, int seats, int engine) {
//         super(wheels, seats); //Parent class (Vehicle) ke constructor ko call karo.
//         this.engine = engine;
//     }
//      void display() {
//         print();
//         System.out.println(engine);
//     }
//   }
//   class Aircraft extends PowerVehicle{ //multilevel inheritance
//     int rotors;
//   }


//Hierarchial inheritance
class Animal{
  int size;
  boolean isVegeterian;
}
class Birds extends Animal{
  int maximumAltitude;
}
class Aquaticanimals extends Animal{
  int fins;
}
public class Inheritance {
  public static void main(String[] args) {
    // PowerVehicle p= new PowerVehicle(3,4,2000);
    // p.seats=8;
    // System.out.println(p.seats);
    // p.display();

    // Aircraft a= new Aircraft();
    // a.engine=9;
    // a.display();

      Birds b= new Birds();
      b.isVegeterian= true;
      System.out.println(b.isVegeterian);
      Aquaticanimals a = new Aquaticanimals();
      a.size = 20;
      System.out.println(a.size);

  }
}
