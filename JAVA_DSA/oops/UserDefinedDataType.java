package oops;

import java.util.Scanner;

public class UserDefinedDataType {
  public static class Student{
    String name;
    int rollno;
    double cgpa;
    int[] marks; //array of given size
    Student(){} //default constuctor
    Student(int[] s){  //parameterized constructor
      // marks=new int[s]; //size of an array
      marks=s; //can receive full array too
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student s1= new Student();
    s1.name ="Kanika";
    s1.rollno= 3;
    s1.cgpa= 9.5;
    System.out.println(s1.name+" "+s1.rollno+" "+s1.cgpa); //print
    //Input using scanner class and sc object
    // Student s2= new Student();
    // s2.name= sc.nextLine();
    // s2.rollno= sc.nextInt();
    // s2.cgpa= sc.nextDouble();
    // System.out.println(s2.name+" "+s2.rollno+" "+s2.cgpa); //print

    // Student s3= new Student(4);
    // s3.marks[0] =89; //giving value
    //OR
    int[] arr={9,8,7,6};
    Student s4= new Student(arr); //array pass karo
    s4.marks[0]=3;
    System.out.println(arr[0]); //shallow copy which changes the array[0] to 3 even though modified in student marks array
  }
}
