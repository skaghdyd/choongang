package chap13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win2 {
	JButton jb1 = new JButton("새 창");
	JFrame fr1;
	Win3 w3;
	Win2() {
		fr1 = new JFrame();
		fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = fr1.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		fr1.setSize(400, 300);
		fr1.setLocation(500, 500);
		fr1.setVisible(true);
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jb1.setEnabled(false);
				w3 = new Win3(jb1);
				w3.jf.setVisible(true);
			}
			
		});
	
	}
	public static void main(String[] args) {
		new Win2();

	}

}
