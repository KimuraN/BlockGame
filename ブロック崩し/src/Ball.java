import java.awt.Graphics;

public class Ball {
	int x;
	int y;
	int size = 16;
	int vx = 4;
	int vy = 4;

	public void move() {
		if(x+size > 640 || x < 0){
			vx = vx*-1;
		}
		if(y+size > 480 || y < 0){
			vy = vy*-1;
		}
		x = x + vx;
		y = y + vy;
	}

	public void paint(Graphics g) {
		g.fillOval(x, y, size, size);
	}
}