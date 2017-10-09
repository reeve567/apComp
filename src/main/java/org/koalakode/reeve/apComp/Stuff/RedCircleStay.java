package org.koalakode.reeve.apComp.Stuff;
// made by reeve
// on 12:35 PM

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class RedCircleStay extends JPanel {


	private static final long serialVersionUID = 1L;
	private ArrayList<Point> points;

	public RedCircleStay() {
		points = new ArrayList<Point>();
		setBackground(Color.WHITE);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				points.add(new Point(e.getX(), e.getY()));
				repaint();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.red);
		for (Point point : points) {
			g2.fillOval(point.x, point.y, 20, 20);

		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.add(new RedCircleStay());
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				frame.setSize(400, 400);
				frame.setVisible(true);
			}
		});
	}


}
