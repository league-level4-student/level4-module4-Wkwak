package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	double centerX;
	double centerY;
	int radius;
	double radians;
	
	CircleMorph(int x, int y) {
		super(x, y);
		centerX = x;
		centerY = y;
		radius = 40;
		radians = 0;
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

	
	public void update() {
		radians+=Math.PI/6;
		
		setX((int) (centerX + (radius*Math.cos(radians))));
		setY((int) (centerY + (radius*Math.sin(radians))));
	}
}
