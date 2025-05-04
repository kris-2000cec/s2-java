import java.util.*;
class fact
{
	public static void main(String arg[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number : ");
	int a= s.nextInt();
	int i, f=1;
	for(i=1;i<=a;i++)
	{
		f=f*i;
	}
	System.out.println("Factorial is :"+f);
	}
}
