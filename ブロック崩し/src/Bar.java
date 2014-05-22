import java.awt.Graphics;

public class Bar {
	int width = 200;
	int height = 20;
	int centerX = 640/2;
	int y = 480 - 100;

	public void move(int x){
		centerX = x;
	}
	
	public void paint(Graphics g) {
		g.fillRect(centerX-width/2, y, width, height);
	}
}
