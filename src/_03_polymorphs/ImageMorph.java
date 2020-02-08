package _03_polymorphs;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageMorph extends Polymorph{

	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension (getWidth(), getHeight()));
		ImageIcon icon = new ImageIcon("dogImage.jpeg");
		JLabel label = new JLabel(icon);
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void draw(Graphics g) {
		
	}
	
	public void update() {
		
	}

}
