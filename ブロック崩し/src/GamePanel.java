import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	Ball ball;

	public GamePanel(Ball b) {
		ball = b;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//ここに実際に行いたい描写の処理を記述する
		ball.paint(g);
	}
}