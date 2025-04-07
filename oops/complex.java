import java.util.*;
class complex
	{
		int real,img;
		void read()
		{
			Scanner s=new Scanner(System.in);
			real=s.nextInt();
			img=s.nextInt();
		}
		void add(complex c1,complex c2)
		{
			real=c1.real+c2.real;
			img=c1.img+c2.img;
			System.out.println("Addition="+real+"+i"+img);
			
		}
		public static void main(String arg[])
		{
			complex c1=new complex();
			System.out.println("Enter  first number :");
			c1.read();
			complex c2=new complex();
			System.out.println("Enter  second number :");
			c2.read();
			complex c=new complex();
			c.add(c1,c2);
				
		}
	} 
