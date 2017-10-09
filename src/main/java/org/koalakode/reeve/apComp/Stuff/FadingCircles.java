package org.koalakode.reeve.apComp.Stuff;
// made by reeve
// on 7:54 PM

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FadingCircles {

	public static void main(String[] args) {
		new FadingCircles();
	}

	public FadingCircles() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				JFrame frame = new JFrame("Test");
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				frame.setLayout(new BorderLayout());
				frame.add(new TestPane());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}

		});
	}

	public static class TestPane extends JPanel {

		public static final int CIRCLE_COUNT = 10;

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(200, 200);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g.create();

			g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
			g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
			g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
			g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

			int maxRadius = Math.min(getWidth(), getHeight());
			int alpha = 255;
			int range = 255 - 32;
			g2d.setStroke(new BasicStroke(6, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

			for (int index = 0; index < CIRCLE_COUNT; index++) {
				float progress = (float) index / (float) CIRCLE_COUNT;
				alpha = 255 - Math.round(range * progress);
				Color color = new Color(0, 0, 0, alpha);
				g2d.setColor(color);

				int radius = Math.round(maxRadius * progress);
				int x = (getWidth() - radius) / 2;
				int y = (getHeight() - radius) / 2;

				g2d.draw(new Ellipse2D.Float(x, y, radius, radius));
			}
			g2d.dispose();
		}
	}
}
