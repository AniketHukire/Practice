package Polymorphism;

public class GameDriver {
	public static void main(String [] args) {
		Game1 g1 = new Game1();
		g1.fire();
		g1.goFront();
		g1.goBack();
		g1.goRight();
		g1.goLeft();
		g1.reload();
		System.out.println("----------------");
		
		Game2 g2 = new Game2();
		g2.fire();
		g2.reload();
		g2.fire();
		g2.fire();
		g2.reload();
		g2.fire();
		g2.goLeft();
		
	}
}

