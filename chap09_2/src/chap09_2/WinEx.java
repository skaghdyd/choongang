package chap09_2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WinEx extends JFrame {
	
	WinEx(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		JPanel jplNorth = new JPanel();
		jplNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
		for(int i=1; i<=8; i++) {
			jplNorth.add(new JButton(String.valueOf(i)));
		}
		JPanel jplEast = new JPanel();
		jplEast.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));//(new GridLayout(4,2,10,10));
		for(int i=1; i<=8; i++) {
			jplEast.add(new JButton(String.valueOf(i)));
		}
		JPanel jplCenter = new JPanel();
		jplCenter.setLayout(new GridLayout(4,2,10,10));
		for(int i=1; i<=8; i++) {
			jplCenter.add(new JButton(String.valueOf(i)));
		}
		JPanel jplWest = new JPanel();
		jplWest.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));//(new GridLayout(4,2,10,10));
		for(int i=1; i<=8; i++) {
			jplWest.add(new JButton(String.valueOf(i)));
		}
		JPanel jplSouth = new JPanel();
		jplSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));//(new GridLayout(4,2,10,10));
		for(int i=1; i<=8; i++) {
			jplSouth.add(new JButton(String.valueOf(i)));
		}
		c.add(jplNorth, BorderLayout.NORTH);
		c.add(jplEast, BorderLayout.EAST);
		c.add(jplCenter, BorderLayout.CENTER);
		c.add(jplWest, BorderLayout.WEST);
		c.add(jplSouth, BorderLayout.SOUTH);
		this.setLocation(400,400);
		this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new WinEx();

	}
}
