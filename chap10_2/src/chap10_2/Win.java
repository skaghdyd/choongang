package chap10_2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Win extends JFrame {
	JLabel lb = new JLabel("여기");
	JTextField tf = new JTextField("검색", 10);
	JButton jb = new JButton("클릭");

	Win() {
		new Thread(()->{
			while(true) {
				LocalDateTime now = LocalDateTime.now();
				lb.setText(now.getYear()+"-"+now.getMonthValue()+"-"+now.getDayOfMonth()+" "+now.getHour()+":"+now.getMinute()+":"+now.getSecond());			
//				lb.setText(now.getSecond()+"초");
			}
		}).start();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(lb);
		c.add(jb);
		c.add(tf);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int num = Integer.parseInt(tf.getText());

					if (num >= 100) {
						throw new MyNumException("100 이상!");
					}

					JOptionPane.showMessageDialog(c, num);

				} catch (NumberFormatException ne) {
					JOptionPane.showMessageDialog(c,
							ne.getMessage() + "숫자를 입력해주세요." + "\n" + "NumberFormatException 발생!");

				} catch (MyNumException ne2) {
					JOptionPane.showMessageDialog(c, ne2.getMessage() + "\n" + "MyNumException 발생!");

				} finally {
					JOptionPane.showMessageDialog(c, "finally 실행!");

				}
			}
		});

		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);

		tf.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if (tf.getText().equals("검색")) {
					tf.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (tf.getText().equals("")) {
					tf.setText("검색");
				}
			}
		});
	}

	public static void main(String[] args) {
		new Win();
	}
}
