import java.util.*;
class sort
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of string : ");
		int n= sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		System.out.println("Enter strings");
		int i;
		for(i=0;i<n;i++)
			str[i]=sc.nextLine();
		Arrays.sort(str);
		System.out.println("Sorted string :"+Arrays.toString(str));
	}
}
