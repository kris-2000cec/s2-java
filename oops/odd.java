import java.util.*;
class odd
{ 
  Scanner s= new Scanner(System.in);
  void odd_even()
  {
  	System.out.println("Enter the number : ");
	int a= s.nextInt();
	
	if(a%2==0)
	{
		System.out.println("number is Even");
	}
	else
	{
		System.out.println("number is odd");
	}
		
	}
	public static void main(String arg[])
	{
	odd obj=new odd();
	obj.odd_even();
	}

  }
	
