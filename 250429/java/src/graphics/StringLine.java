package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class StringLine extends JFrame {
	public StringLine() {
		getContentPane().setBackground(new Color(255,255,255));
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawLine(250, 50, 30, 160);
		g.drawLine(250, 60, 50, 160);
		g.drawLine(250, 70, 70, 160);
		
		g.setColor(Color.red);
		g.drawString("Red String", 10, 50);
		g.drawLine(250, 80, 90, 160);
		g.drawLine(250, 90, 110, 160);
		g.drawLine(250, 100, 130, 160);
		g.setColor(Color.green);
		g.drawString("Green String", 10, 80);
		g.drawLine(250, 110, 150, 160);
		g.drawLine(250, 120, 170, 160);
		g.drawLine(250, 130, 190, 160);
		g.setColor(Color.blue);
		g.drawString("Blue String", 10, 110);
		g.setColor(Color.black);
		g.drawLine(250, 140, 210, 160);
		g.drawLine(250, 150, 230, 160);
		g.drawLine(250, 160, 250, 160);
	}
	
	public static void main(String[] args) {
		new StringLine();
	}
	
}


