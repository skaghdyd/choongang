package chap09_2;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Button extends JButton {
	OnClickListener listener;
	JLabel lb = new JLabel("여기에");
	Button(String str, Container c){
		super(str);
		this.setBounds(100,30,80,50);
		lb.setBounds(100,0,80,50);
		c.add(lb);
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		System.out.println(listener.onClick());
	}
	
	interface OnClickListener{
		String onClick();
	}
}
