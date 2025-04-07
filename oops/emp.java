import java.util.*;
class emp
{	
	int empno,salary;
	String empname;
	void read()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee no. ..");
		empno=sc.nextInt();
				sc.nextLine();
		System.out.println("Enter employee name...");
		empname=sc.nextLine();
		System.out.println("Enter employee Salary...");
		salary=sc.nextInt();
		 
	}
	void search(int empno)
	{
		Scanner s=new Scanner(System.in);
		empno=s.nextInt();

		int i,f=0;
		for(i=0;i<3;i++)
		{
			if(empno == obj[i])
			{
				System.out.println("empno : "+empno);
				System.out.println("empname : "+empname);
				System.out.println("salary : "+salary);
			}			
			
			
		}
		
	}

	public static void main(String arg[])
	
	{
		emp obj[]=new emp[3];
		int i;
		for(i=0;i<3;i++)
		{
			obj[i]=new emp();
		}
		for(i=0;i<3;i++)
		{
			obj[i].read();
		}
		System.out.println("Enter employee no to search if it exit . ..");
		for(i=0;i<3;i++)
		{
			obj[i].search(empno);
			
			
		}
	}
}
