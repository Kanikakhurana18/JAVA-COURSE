package oops;
class Arraylist{
  int[] arr;
  int idx;
  int size=0;
  int capacity;
  Arraylist(int capacity){
    this.capacity=capacity;
    arr= new int[capacity];
  }
  void add(int ele){
    if(idx==arr.length) capacityIncrease();
    arr[idx++]=ele;
    size++;
  }
  int capacity(){
    return arr.length;
  }
  void capacityIncrease(){
    int[] arr2= new int[arr.length*2];
    for(int i=0;i<arr.length;i++){
      arr2[i]=arr[i];
    }
    arr=arr2;
  }
  int get(int idx){
    return arr[idx];
  }
  void set(int idx, int val){
    arr[idx]=val;
  }
  void removeFromEnd(){
    if (size == 0) {
        System.out.println("ArrayList is Empty");
        return;
    }
    size--;
    idx--;
  }
  void remove(int index){
    if(index<0 || index>=size){ //<0 as -ve index invalid hai
      System.out.println("Invalid idx");
      return;
    }
    for(int i=index;i<size-1;i++) arr[i]=arr[i+1];
    size--;
    idx--;
  }
  void display(){
    for(int i=0;i<size;i++){
      System.err.print(arr[i]+" ");
    }
    System.out.println();
  }
}
public class ArrayListOwnClass {
  public static void main(String[] args) {
    Arraylist arr= new Arraylist(3);
    System.out.println(arr.capacity());
    arr.add(45);
    arr.add(70);;
    arr.add(85);
    arr.display();
    arr.add(90);
    arr.display();
    arr.set(0, 30);
    System.out.println(arr.get(0));
    arr.display();

    arr.removeFromEnd();
    arr.display();

    arr.remove(1);
    arr.display();
    System.out.println(arr.capacity()); //capacity double 2*3=6
  }
}
