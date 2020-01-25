package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
		
	public MovingMorph(int x, int y) {
		super(x,y);
	}
	
	public void update() {
		y+=(10)*Math.random();
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
}
