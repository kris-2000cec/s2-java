import java.util.*;
class area
{	
	Scanner sc=new Scanner (System.in);
	void area()
	{
	System.out.println("Enter radius of circle :");
	float r=sc.nextFloat();
	System.out.println("area of circle is :"+3.14*r*r);
	}

	void area(int side)
	{
	System.out.println("Enter side  :");
	int side=sc.nextInt();
	System.out.println("area of square is :"+side*side);
	
	}

	void area(int l,int b)
	{
	System.out.println("Enter radius of circle :");
	int l=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("area of rectangle is :"+l*b);
	}
	
}
