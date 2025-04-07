import java.util.*;
class student
{
	String name;
	int rollno;
	int [] mark=new int[5];
	void read()
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name ... ");
		name =s.nextLine();
		System.out.println("Enter roll no ... ");
		rollno=s.nextInt();
		System.out.println("Enter marks ... ");
		int i;
		for (i=0;i<5;i++)
		{
			mark[i]=s.nextInt();
		}
	}
	void sp()
	{
		int i,percent,s=0;
		for (i=0;i<5;i++)
		{
			s=s+mark[i];
		}
		percent= (s*100)/500;
	
	
	
		System.out.println("name : "+name);
		System.out.println("total : "+s);
		System.out.println(" percentage : "+percent );
	}
	
	public static void main(String args[])
	{
		student s1=new student();
		s1.read();
		s1.sp();
	}
	
}


/*
output
Enter name ... 
k
Enter roll no ... 
5
Enter marks ... 
2
5
2
5
2
name : k
total : 16
 percentage : 3
*/
