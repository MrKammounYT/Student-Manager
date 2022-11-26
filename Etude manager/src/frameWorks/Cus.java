package frameWorks;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

public class Cus extends AbstractBorder implements Border {

	

	private static final long serialVersionUID = 1L;

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		// TODO Auto-generated method stubs
		super.paintBorder(c, g, x, y, width, height);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawRoundRect(x, y, width - 1, height - 1, 40, 40);
	}
	
	@Override
	public Insets getBorderInsets(Component c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBorderOpaque() {
		// TODO Auto-generated method stub
		return false;
	}

}
