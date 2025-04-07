import java.util.*;
class matrix
{
int [][] a=new int[2][2];
int [][] b=new int[2][2];
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
void sym()
{
	int i,j,f=0;
	for (i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			if (a[i][j]==b[j][i])
				f=1;
		}
	}
	if (f==1)
		System.out.println("Matrix is symmitric");
	else
		System.out.println("Matrix is not symmitric");		
	}
public static void main(String []args)
	{
		matrix m= new matrix();
		m.read1();
		m.read2();
		m.sym();
		
	}
	}
