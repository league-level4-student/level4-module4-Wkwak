package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	private int speed;

	public MovingMorph(int x, int y) {
		super(x, y);
		speed = 20;
	}

	public void update() {
		super.setX(super.getX() + speed);
		if (super.getX() > PolymorphWindow.WIDTH - 450) {
			speed = -speed;
		} else if (super.getX() < 0) {
			speed = -speed;
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
}
