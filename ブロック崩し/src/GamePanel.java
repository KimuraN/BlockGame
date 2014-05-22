import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	Ball ball;
	Bar bar;

	public GamePanel(Ball b,Bar b2) {
		ball = b;
		bar = b2;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//ここに実際に行いたい描写の処理を記述する
		ball.paint(g);
		bar.paint(g);
	}
}