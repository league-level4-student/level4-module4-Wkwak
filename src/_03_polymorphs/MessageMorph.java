package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph implements MouseListener{
	JFrame frame = new JFrame();
	
	MessageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		frame.addMouseListener(this);
	}
	
	public void update() {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()<=getX()+getWidth() && e.getX()>=getX()) {
			if(e.getY()<=getY()+getHeight() && e.getY()>=getY()) {
				JOptionPane.showMessageDialog(frame, "clicked");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
