
class Application
{
	public static void main(String args[])
	{
	Human h=null;
	String gender="M";
	if(gender=="M")
	{
	h=new Male();
	}
	else
	{
	h=new Female();
	}
	h.sayHi();
	}
}
	
	
	