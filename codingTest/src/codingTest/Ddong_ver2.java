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

class WatchOut_ver2 extends JPanel {
	private final int X = (int) Math.floor(Math.random() * 1081 + 1);
	private final int SPEED = (int) Math.floor(Math.random() * 30 + 10);
	private JLabel watchOutLabel;

	WatchOut_ver2() {
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

public class Ddong_ver2 {
	boolean isAlive = true;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ddong_ver2 window = new Ddong_ver2();
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
	public Ddong_ver2() {
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
				//새로운 똥을 만들어서 화면에 추가해줌.
				JPanel watchOut = new WatchOut_ver2();
				frame.getContentPane().add(watchOut);
				frame.getContentPane().repaint();
				
				//똥이 추가되면 점수 10점씩 증가
				pointLabel_2.setText((Integer.parseInt(pointLabel_2.getText()) + 10) + "");

				// 똥 움직이는 쓰레드
				new Thread(() -> {
					int time = 0;
					while (isAlive) {
						//똥이 나를 향해서 다가옴
						if (watchOut.getX() < me.getX()) {
							watchOut.setLocation(watchOut.getX() + ((WatchOut_ver2) watchOut).getSpeed(), watchOut.getY());
						} else {
							watchOut.setLocation(watchOut.getX() - ((WatchOut_ver2) watchOut).getSpeed(), watchOut.getY());
						}
						if (watchOut.getY() < me.getY()) {
							watchOut.setLocation(watchOut.getX(), watchOut.getY() + ((WatchOut_ver2) watchOut).getSpeed());
						} else {
							watchOut.setLocation(watchOut.getX(), watchOut.getY() - ((WatchOut_ver2) watchOut).getSpeed());
						}

						//10초 지난 똥을 삭제
						time+=100; //0.1초마다 실행되므로 10000에 도달하면 10초가 지난것임.
						if (time==10000) {
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

		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				me.setLocation(e.getX() - me.getWidth(), e.getY() - me.getHeight());
			}
		});
	}
}
