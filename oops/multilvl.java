class A
{
	A(int a,int b)
	{
		System.out.println("A constuctor");
	}
	
}
class B extends A
{
	B(int b)
	{
				System.out.println("B constuctor");
	}
}
class C extends B
{
	C() 
	{ 
		super(2,3,4);
				System.out.println("C constuctor");
	}
}
class text 
{
	public static void main(String [] arg)
	{
		 obj=new C();
		
	}
}
