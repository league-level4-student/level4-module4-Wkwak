package _03_polymorphs;

import java.awt.Dimension;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageMorph extends Polymorph {

	private BufferedImage img;

	ImageMorph(int x, int y) {
		
		super(x, y);
		// TODO Auto-generated constructor stub

		try {
		
			img = ImageIO.read(this.getClass().getResourceAsStream("dogImage.jpeg"));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void draw(Graphics g) {
		g.drawImage(img, super.getX(), super.getY(), super.getWidth(), super.getHeight(), null);

	}

	public void update() {

	}

}
