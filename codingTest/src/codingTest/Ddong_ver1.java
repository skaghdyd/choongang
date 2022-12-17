package codingTest;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

class WatchOut_ver1 extends JPanel {
	private final int X = (int) Math.floor(Math.random() * 1081 + 1);
	private final int SPEED = (int) Math.floor(Math.random() * 30 + 10);
	private JLabel watchOutLabel;

	WatchOut_ver1() {
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.setSize(15, 15);
		this.setLayout(null);

		if (X < 12) {
			this.setLocation(12, 10);
		} else {
			this.setLocation(X, 10);
		}

		watchOutLabel = new JLabel("똥");
		watchOutLabel.setHorizontalAlignment(SwingConstants.CENTER);
		watchOutLabel.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.add(watchOutLabel);
	}

	int getSpeed() {
		return SPEED;
	}

	JLabel getLabel() {
		return watchOutLabel;
	}
}

public class Ddong_ver1 {
	boolean isAlive = true;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ddong_ver1 window = new Ddong_ver1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ddong_ver1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1124, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel me = new JPanel();
		me.setToolTipText("");
		me.setBorder(new LineBorder(new Color(0, 0, 0)));
		me.setBounds(12, 551, 30, 30);
		frame.getContentPane().add(me);
		me.setLayout(null);

		JLabel meLabel = new JLabel("나");
		meLabel.setHorizontalAlignment(SwingConstants.CENTER);
		meLabel.setBounds(0, 0, me.getWidth(), me.getHeight());
		me.add(meLabel);

		JPanel pointPanel = new JPanel();
		pointPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		pointPanel.setBounds(0, 0, 143, 20);
		frame.getContentPane().add(pointPanel);
		pointPanel.setLayout(null);

		JLabel pointLabel = new JLabel("점수 :");
		pointLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pointLabel.setBounds(0, 0, 50, 20);
		pointPanel.add(pointLabel);

		JLabel pointLabel_2 = new JLabel("0");
		pointLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		pointLabel_2.setBounds(50, 0, 93, 20);
		pointPanel.add(pointLabel_2);

		// 똥 생성하는 쓰레드
		new Thread(() -> {
			while (isAlive) {
				// 새로운 똥을 만들어서 화면에 추가해줌.
				JPanel watchOut = new WatchOut_ver1();
				frame.getContentPane().add(watchOut);
				frame.getContentPane().repaint();

				// 똥 움직이는 쓰레드
				new Thread(() -> {
					while (isAlive) {
						// 똥의 Y값을 SPEED만큼 증가시켜줌.
						watchOut.setLocation(watchOut.getX(), watchOut.getY() + ((WatchOut_ver1) watchOut).getSpeed());

						// 똥의 Y값이 600이 넘으면 삭제.
						if (watchOut.getY() >= 600) {
							pointLabel_2.setText((Integer.parseInt(pointLabel_2.getText()) + 10) + "");
							frame.remove(watchOut);
							return;
						}

						// 똥이 나에게 닿으면 게임오버.
						if ((watchOut.getY() + watchOut.getHeight() >= me.getY()
								&& watchOut.getY() <= me.getY() + me.getHeight())
								&& (watchOut.getX() + watchOut.getWidth() >= me.getX()
										&& watchOut.getX() <= me.getX() + me.getWidth())) {
							isAlive = false;
							System.out.println("---");
							System.out.println("당신의 점수는 [" + pointLabel_2.getText() + "]점 입니다.");
							System.out.println("---");
							JOptionPane.showMessageDialog(frame, "게임 오버!!!");
							System.exit(0);
						}

						try {
							Thread.sleep(100);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}).start();

				try {
					Thread.sleep(1000);

				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}).start();

		frame.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					me.setLocation(me.getX(), me.getY() - 10);
					break;
				case KeyEvent.VK_DOWN:
					me.setLocation(me.getX(), me.getY() + 10);
					break;
				case KeyEvent.VK_LEFT:
					if (me.getX() <= 12) {
						me.setLocation(12, me.getY());
					} else {
						me.setLocation(me.getX() - 10, me.getY());
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (me.getX() >= 1062) {
						me.setLocation(1062, me.getY());
					} else {
						me.setLocation(me.getX() + 10, me.getY());
					}
					break;
				}
			}
		});
	}
}