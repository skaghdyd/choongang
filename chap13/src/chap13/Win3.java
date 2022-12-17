package chap13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win3 {
	JButton jb1 = new JButton("닫기");
	JFrame jf;
	JButton bt;
	Win3(JButton bt) {
		this.bt = bt;
		jf = new JFrame();
		jf.setTitle("새 창");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = jf.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		jf.setSize(400, 300);
		jf.setLocation(200, 200);
		jf.setVisible(false);
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bt.setEnabled(true);
				jf.setVisible(false);
			}
			
		});
		
	}
	

}
