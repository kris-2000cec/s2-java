import java.util.*;
class sorted
{
	Scanner sc=new Scanner(System.in);
	void string()
	{
		System.out.println("Enter word");
		String word=sc.nextLine();
		char [] charArray=word.toCharArray();
		Arrays.sort(charArray);
		System.out.println("sorted character : ");
		System.out.println(charArray);
	}
	public static void main(String []args)
	{
		sorted obj=new sorted();
		obj.string();
	}
}
