package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
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
		MousePolymorph mp = new MousePolymorph(234, 234);
		window.addMouseMotionListener(mp);
		
		polys  = new ArrayList<Polymorph>();
		polys.add(new MovingMorph(60,60));
		polys.add(new CircleMorph(123,123));
		polys.add(mp);
		polys.add(new ImageMorph(250,250));
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
