package Polymorphism;

public class Game1 {
	int bullet;
	
	public void goFront()
	{
		System.out.println("Forword");
	}
	public void goRight()
	{
		System.out.println("Trun Right");
	}
	public void goLeft()
	{
		System.out.println("Trun Left");
	}
	public void goBack()
	{
		System.out.println("BackWord");
	}
	public void fire()
	{
		bullet = 30;
		System.out.println("Reloade");
	}
	public void reload()
	{
		System.out.println(bullet--);
		System.out.println("Fired!");
	}
}
