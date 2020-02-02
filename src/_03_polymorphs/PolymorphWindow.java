package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	ArrayList<Polymorph> polys;

	private JFrame window;
	private Timer timer;
	


//	7. Let's create more Polymorphs! Create a new sub-class of Polymorphs for each of the following…
//		a) Create a Polymorph that moves in a circle. hint: Math.sin() Math.cos()
//		b) Create a Polymorph that follows your mouse.
//		c) Create a Polymorph that displays an image.
//		d) Create a Polymorph that displays a JOptionPane message dialog when clicked.


	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		timer = new Timer(1000 / 30, this);
		timer.start();
		
		polys  = new ArrayList<Polymorph>();
		polys.add(new MovingMorph(60,60));
		polys.add(new CircleMorph(123,123));
		polys.add(new MousePolymorph(234,234));
		polys.add(new ImageMorph(300,300));
		polys.add(new MessageMorph(200, 200));
		
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for(Polymorph p:polys) {
			p.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for(Polymorph p:polys) {
			p.update();
		}
	}
}
