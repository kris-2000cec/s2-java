import java.util.*;
class matrix
{
int [][] a=new int[2][2];
int [][] b=new int[2][2];
int [][] c=new int[2][2];
void read1()
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter elements  in 1... ");
		int i,j;
		for (i=0;i<2;i++)
		{
			
			for (j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
			
			
		}
	}
	
void read2()
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter elements  in 2... ");
		int i,j;
		for (i=0;i<2;i++)
		{
			
			for (j=0;j<2;j++)
			{
				b[i][j]=s.nextInt();
			}
			
			
		}
	}
void sum()
{
	int i,j;
	for (i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	for (i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			System.out.print(c[i][j]+"\t");
		}
		System.out.println("\n");
	}
	}
public static void main(String []args)
	{
		matrix m= new matrix();
		m.read1();
		m.read2();
		m.sum();
		
	}
}
