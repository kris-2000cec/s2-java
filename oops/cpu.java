
class cpu
{
	int price=50000;
	class processor
	{
		int cores=8;
		String manufacturer="intel";
		void display()
		{
			System.out.println("cpu cores :"+cores+"\t cpu manufacturer : "+manufacturer);
			
		}	
	}
	
	static class ram
	{
		int memory=50;
		String manufacturer="cr";
		void display1()
		{
			System.out.println(" ram memory :"+memory+"Gb"+"\t ram manufacturer : "+manufacturer);
		}
	}
		

	public static void main(String arg[])
	{
		cpu c1= new cpu();
		cpu.processor p1=c1.new processor();
		p1.display();
		cpu.ram R=new cpu.ram();
		R.display1();

	
	}
}

/* output
cpu cores :8	 cpu manufacturer : intel
 ram memory :50Gb	 ram manufacturer : cr
*/
