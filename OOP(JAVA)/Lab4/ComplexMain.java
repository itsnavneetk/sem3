import java.util.Scanner;
class Complex
{
 double real,imag;
 
 Complex(double r, double i)
 {
  real=r;
  imag=i;
 }
 
 Complex()
 {
  real=imag=0;
 }
 
 void add(int integer, Complex c)
 {
  real=integer+c.real;
  imag=c.imag;
 }
 
 void add(Complex c1, Complex c2)
 {
  real=c1.real+c2.real;
  imag=c1.imag+c2.imag;
 }
 
 void display()
 {
  System.out.print(real+"+"+imag+"i");
 } 
}

class ComplexMain
{
 public static void main(String[] ar)
 {
  double real,imag;
  int I;
  Scanner in=new Scanner(System.in);
  
  System.out.println("Enter complex number C1:");
  System.out.print("Real part     : "); real=in.nextDouble();
  System.out.print("Imaginary part: "); imag=in.nextDouble();
  Complex C1=new Complex(real,imag);
  
  System.out.println("Enter complex number C2:");
  System.out.print("Real part     : "); real=in.nextDouble();
  System.out.print("Imaginary part: "); imag=in.nextDouble();
  Complex C2=new Complex(real,imag);
  
  Complex C3=new Complex();
  
  System.out.print("Enter an integer I: "); I=in.nextInt();
  
  System.out.print("C1 + C2 =  ");
  C3.add(C1,C2); C3.display();
  
  System.out.print("\nI + C1  =  ");
  C3.add(I,C1); C3.display();
  
  System.out.print("\nI + C2  =  ");
  C3.add(I,C2); C3.display();
 }
}
  
  