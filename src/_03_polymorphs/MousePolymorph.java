package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePolymorph extends Polymorph implements MouseMotionListener{

	MousePolymorph(int x, int y){
		super(x,y);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(super.getX(), getY(), getWidth(), getHeight());
	}

	
	public void update() {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		setX(e.getX()-(getWidth()/2));
		setY(e.getY()-getHeight());
	}
	
}
