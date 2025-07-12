package Polymorphism;

public class Game2 extends Game1
{
	public void fire()
	{
		if(bullet > 0)
		{
			bullet --;
			System.out.println("Fired");
			System.out.println(bullet + "left");
		}
		else
		{
			System.out.println("Please Reload");
		}
	}
	public void reload()
	{
		bullet = 30;
		System.out.println("Bullets reloaded");
	}
	public void goRight()
	{
		System.out.println("Trun Left");
	}
	public void goLeft()
	{
		System.out.println("Trun Left");
	}
	public void goBack()
	{
		System.out.println("BackWord");
	}
	public void goFront()
	{
		System.out.println("Forword");
	}
	
}
		


	
	
