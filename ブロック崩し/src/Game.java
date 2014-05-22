import javax.swing.JFrame;

public class Game implements Runnable {

	Ball ball;
	Thread thread;
	JFrame frame;
	GamePanel panel;

	public static void main(String[] args) {

		Game game = new Game();

		game.frame = new JFrame("FrameName");// フレーム生成（FrameName部分を変更するとタイトル変わるよ）
		game.frame.setSize(640, 480);// フレームのサイズをセット
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// フレーム閉じたらプログラムも終了にセット
		game.frame.setVisible(true);// フレームが見えるように

		game.ball = new Ball();
		game.ball.size = 16;

		game.panel = new GamePanel(game.ball);
		game.frame.add(game.panel);// フレームにパネルを追加

		game.thread = new Thread(game);
		game.thread.start();// 繰り返しスタート
	}

	@Override
	public void run() {

		// 下のwhile文の中に書いた処理が繰り返し行われる
		while (true) {

			ball.move();// ボールのmoveメソッドを呼ぶ
			panel.repaint();// パネルに描写を行う。詳しい描写の処理はGamePanel内にて

			try {
				// 繰り返しが速すぎと動きを目で終えないのでここで16ミリ秒眠らせる（ストップ）
				thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
