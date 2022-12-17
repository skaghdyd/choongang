package chap09_2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {// implements ActionListener {
	Button bt;
	JButton jbt = new JButton("클릭");
//	JLabel lb = new JLabel("여기에");
	ButtonEx() {
		Container c = this.getContentPane();
		bt = new Button("연습", c);
//		bt.addActionListener(this);
//		jbt.addActionListener(this);
		c.setLayout(null);
		bt.setBounds(100,30,80,50);
		jbt.setBounds(100,100,80,50);
//		lb.setBounds(100,200,80,50);
		c.add(bt);
		c.add(jbt);
//		c.add(lb);
		this.setBounds(600,500,400,300);
		this.setVisible(true);
		
		bt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭!!!");
				bt.setOnClickListener(new CallListener());
				bt.touch();
				
			}
			
		});
	}
	public static void main(String[] args) {
//		Button btn = new Button();
//		btn.setOnClickListener(new OnClickListener(){
//			@Override
//			public void onClick() {
//				System.out.println("내맘대로 겁니다.");				
//			}
//		});
//		btn.touch();
//		
//		btn.setOnClickListener(new CallListener());
//		btn.touch();
//		
//		btn.setOnClickListener(new MessageListener());
//		btn.touch();
		
		new ButtonEx();
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭!!!");
//		bt.setOnClickListener(new CallListener());
//		bt.touch();
//		
//	}

}
