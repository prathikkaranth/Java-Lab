import java.util.*;
abstract class shapes
{
 float a,l,b,r;
 shapes()
 { 
  a=0;
  l=0;
  b=0;
  r=0;
 } 
  abstract void printarea();
 }
class rectangle extends shapes
 {
  void calc1()
  {
   System.out.println("Enter length and breadth");
   Scanner s=new Scanner(System.in);
   l=s.nextFloat();
   b=s.nextFloat();
   a=l*b;
  } 
  void printarea()
  {
   System.out.println("Area of rectangle= "+a);
  }
 }
class circle extends shapes
 {
  void calc2()
  {
   System.out.println("Enter the radius");
   Scanner sc=new Scanner(System.in);
   r=sc.nextFloat();
   a=3.14f*r*r;
  }
  void printarea()
  { 
   System.out.println("Area of circle = "+a);
  }
 }
class triangle extends shapes
 {
  void calc3()
  {
   System.out.println("Enter length and breadth");
   Scanner sa=new Scanner(System.in);
   l=sa.nextFloat();
   b=sa.nextFloat();
   a=0.5f*l*b;
  }
  void printarea() 
  {
   System.out.println("Area of triangle = "+a);
  }
 }
class shapedemo
{
 public static void main(String args[])
 {
  rectangle r1=new rectangle();
  circle c1=new circle();
  triangle t1=new triangle();
  System.out.println("RECTANGLE");
  r1.calc1();
  r1.printarea();
  System.out.println("CIRCLE");
  c1.calc2();
  c1.printarea();
  System.out.println("TRIANGLE");
  t1.calc3();
  t1.printarea();
 }
}  
        
      
