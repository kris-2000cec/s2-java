import java.util.*;
abstract class shape
{
	abstract void area();
	void display()
	{
		System.out.println("shapes");
	}
	
	
}
class Rectangle extends shape
{
	void area()
	{
		int l=7;
		int b=5,area=l*b;
		System.out.println("area of rectangle is : "+area);
	}
}
class Circle extends shape
{

	void area()
	{
		int r=7;
		double area=3.14*r*r;
		

	System.out.println("area of rectangle :"+area);
	}
	}
	
class Square extends shape
{
	void area()
	{
		int s=7;
		int area=s*s;
		
	System.out.println("area of square is :"+area);
	}
	
}
class sample
{
	public static void main(String [] args)
	{	
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Square s=new Square();
		s.display(); 
		s.area();
		c.area();
		r.area();
}
}
