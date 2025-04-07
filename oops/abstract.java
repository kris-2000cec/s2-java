abstract  class Animal
{
	abstract void sound();
	void display()
	{
		System.out.println("parent class");
	}
}
class dog extends Animal
{	
	void sound()
	{
	System.out.println("child class");
	}
}
class text
{
	public static void main(String [] args)
	{
		dog o=new dog();
		o.sound();
		o.display();
	}
}
