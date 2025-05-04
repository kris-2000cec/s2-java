import java.util.*;
class vechicle
{

	String color="black";
	void print()
	{
		System.out.println(color);
	}
	
}
class Bike extends vechicle
{
	String color="White";
	void  print()
	{
		System.out.println(super.prints);
		System.out.println(color);
		
		
	}
}
class text
{
	public static void main(String [] arg)
	{
		Bike obj=new Bike();
		obj.print();
		obj.print();
	}
}

