import java.util.*;
interface shape
{
	void area();
	void perimeter();
}
class circle implements shape
{

	int r=7;
	public void area()
	{
		double area =3.14*r*r;
		System.out.println("Area of circle :"+area);
		
	}
	public void perimeter()
	{
		double perimeter=2*3.14*r;
		System.out.println("perimeter of circle :"+perimeter);
		
	}
}
class Rectangle implements shape
{
	int l=10,b=4;
	public void area()
	{
		double area=l*b;
		System.out.println("Area of rectangle :"+area);		
	}
	public void perimeter()
	{
		double perimeter=3*(l*b);
		System.out.println("perimeter of rectangle :"+perimeter);
		
		
	}
}
class main
{
	public static void main(String arg [])
	{
		Rectangle r= new Rectangle();
		r.area();
		r.perimeter();
		circle c= new circle();
		c.area();
		c.perimeter();
	}
}
