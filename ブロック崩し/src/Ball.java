import java.awt.Graphics;

public class Ball {
	int x;
	int y;
	int size;

	public void move() {
		x = x + 1;
	}

	public void paint(Graphics g) {
		g.drawOval(x, y, size, size);
	}
}