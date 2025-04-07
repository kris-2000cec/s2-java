import java.util.*;
class search
{
	int a[]=new int[10];
	void read()
	{	
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter  no elements...");
		n=sc.nextInt();
		System.out.println("Enter  elements...");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		}
		System.out.println("Entered elements are  : ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		
		}	
		System.out.println("Enter  element to search...");
		int s,f=0;
		s=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==s)
				f=1;
		
		}
		if(f==1)
		
			System.out.println("Element " +s+ " found");
		else
			System.out.println("Element " +s+ " not found");
		
	}
	public static void main(String arg[])
	{
		search w=new search();
		w.read();
	}
	
}
