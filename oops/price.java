import java.util.*;
class product
{
		int price ,code;
		String name;
		void read()
		{
			Scanner s=new Scanner(System.in);
			name=s.nextLine();
			code=s.nextInt();
			price=s.nextInt();
		}
		void compare(product p1,product p2,product p3)
		{
			if (p1.price<p2.price && p1.price<p3.price)
				System.out.print("First product smaller");
			else if (p2.price<p1.price && p2.price<p3.price)
				System.out.print("second product smaller");
			else
				System.out.print("third product smaller");
		}
		public static void main(String arg[])
		{
			product p1=new product();
			System.out.println("Enter  first product :");
			p1.read();
			product p2=new product();
			System.out.println("Enter  second product :");
			p2.read();
			product p3=new product();
			System.out.println("Enter  third product :");
			p3.read();
			product c=new product();
			c.compare(p1,p2,p3);
				
		}
	} 
