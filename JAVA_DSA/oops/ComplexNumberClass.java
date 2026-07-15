package oops;
class ComplexNumber{
  double x;
  double y;
  ComplexNumber(double x , double y){
    this. x = x;
    this.y =y;
  }
  void print(){
    if(y>=0) System.out.printf("%.2f+%.2fi%n",x,y); //(Pehla %.2f→ x) [Dusra %.2f-y]  [%n → New line (ye \n jaisa hai, lekin platform-independent hai)]
    else System.out.printf("%.2f+%.2fi%n", x, y);//i → Normal character (complex number dikhane ke liye)
  }
  void add(ComplexNumber z){
    x+=z.x;
    y+=z.y;
  }
  void multiply(ComplexNumber z){
    double real=x; //ye z2 ke x and y hai 
    double imag=y;
    x= (real*z.x)-(imag*z.y); //aur ye z.x and z.y ye z1 ke x and y hai
    y=(real*z.y)+(imag*z.x);
  }
  void divide(ComplexNumber z){
    double real=x;
    double imag=y;
    double den= z.x*z.x+ z.y*z.y;
    x=(real*z.x + imag*z.y )/den;
    y= (imag*z.x - real* z.y)/den;
  }
}
public class ComplexNumberClass {
  public static void main(String[] args) {
    ComplexNumber z1= new ComplexNumber(2, -5);
    z1.print();
    ComplexNumber z2= new ComplexNumber(-3, -2);
    z2.print();
    z1.add(z2);
    z1.print();

    z2.multiply(z1);
    z2.print();

    z1.divide(z2);
    z1.print();
  }
}
