class Human
{
	String gender;
	void sayHi()
	{
	System.out.println("Music On");
	}
}
class Male extends Human
{
	String filename="M";
	void sayHi()
	{
	IPlayer ip=new VLCPlayer();
	ip.play(filename);
	}
}
class Female extends Human
{
	String filename="F";
	void sayHi()
	{
	IPlayer ip=new WindowPlayer();
	ip.play(filename);
	}
}