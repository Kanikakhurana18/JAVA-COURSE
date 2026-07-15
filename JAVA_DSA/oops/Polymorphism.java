package oops;

public class Polymorphism { //one name but many forms OR same method name but different work
  public static class Dog{
    void speak(){
      System.out.println("Brarks");
    }
  }
  public static class Cat{
    void speak(){
      System.out.println("Meow");
    }
  }
  public static class Human{
    void speak(){
      System.out.println("Hello");
    }
  }
  public static void main(String[] args) {
    Human h= new Human();
    Dog d= new Dog();
    Cat c= new Cat();
    h.speak(); //Same function name speak but working differently
    d.speak();
    c.speak();
  }
}

//Two types of POLYMORPHISM
//1.Compile time poly- METHOD OVERLOADING [Ek hi method ka naam same hota hai, lekin parameters alag hote hain.]
// class Calculator {
//   int add(int a, int b) {
//         return a + b;
//     }
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
//     double add(double a, double b) {
//         return a + b;
//     }
// }


//2.Run time poly- Method overriding [Parent class ka method child class apne hisaab se change (override) kar deta hai.]
// class Animal {
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }
// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

