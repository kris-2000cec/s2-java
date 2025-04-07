import java.util.*;
class leapyr
{
	public static void main(String arg[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter start yr : ");
	int a= s.nextInt();
	Scanner p= new Scanner(System.in);
	System.out.println("Enter end yr : ");
	int b= s.nextInt();
	int i;
	for (i=a;i<=b;i++)
	{
		if(i%4==0 && i%100!=0)
		{
			System.out.println("is leap yr "+i);
		}
	}
		
	}
}
