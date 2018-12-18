interface IPlayer
{
	public void play(String filename);
}
class VLCPlayer implements IPlayer
{
	public void play(String filename)
	{
		System.out.println("MUSIC ON");
	}
}
class WindowPlayer implements IPlayer
{
	public void play(String filename)
	{
		System.out.println("MUSIC ON");
	}
}