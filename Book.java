import java.util.*;
class book
{
 String name,author;
 double price;
 int num_page;

book()
{
 name=null;
 author=null;
 price=0.0;
 num_page=0;
}
void setdata()
{
 Scanner in=new Scanner(System.in);
 name=in.nextLine();
 author=in.nextLine();
 price=in.nextDouble();
 num_page=in.nextInt();
}
public String toString()
{
 String str=("Name: " +name +" Author: " +author +" Price: " +price +" Pages: " +num_page);
 return str;
}
void getdata()
{
 String str=toString();
 System.out.println(str);
 }
}

class BookDemo
{
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter no. of books");
  int n=in.nextInt();
  book b[]=new book[n];
  for(int i=0;i<n;i++)
  {b[i]=new book();}
  for(int i=0;i<n;i++)
  {System.out.println("Enter name,author,price and pages of book" +(i+1));
  b[i].setdata();}
  for(int i=0;i<n;i++)
  {System.out.println("Details of the book: " +(i+1));
  b[i].getdata();}
 }
}


