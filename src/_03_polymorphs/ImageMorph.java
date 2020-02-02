package _03_polymorphs;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{

	ImageMorph(int x, int y) {
		super(x, y);
		BufferedImage img = ImageIO.read();
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, x, y, width, height, observer)
	}
	
	public void update() {
		
	}

}
