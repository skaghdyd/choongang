package chap09_2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WinEx2 extends JFrame {
	JLabel jl1 = new JLabel("10000000000000000000000");
	JLabel jl2 = new JLabel("20000000000000000000000");
	JLabel jl3 = new JLabel("30000000000000000000000");
	JLabel jl4 = new JLabel("40000000000000000000000");
	JLabel nameLabel = new JLabel("이름");
	JLabel studentIdLabel = new JLabel("학번");
	JLabel majorLabel = new JLabel("학과");
	JLabel subjectLabel = new JLabel("과목");
	JTextField nameTextField = new JTextField();
	JTextField studentIdTextField = new JTextField();
	JTextField majorTextField = new JTextField();
	JTextField subjectTextField = new JTextField();
	WinEx2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		JPanel jplNorth = new JPanel();
		JPanel jplEast = new JPanel();
		JPanel jplWest = new JPanel();
		JPanel jplSouth = new JPanel();
		jplNorth.add(jl1);
		jplEast.add(jl2);
		jplWest.add(jl3);
		jplSouth.add(jl4);
		
		JPanel jplCenter = new JPanel();
		jplCenter.setLayout(new GridLayout(4,2,10,10));
		jplCenter.add(nameLabel);
		jplCenter.add(nameTextField);
		jplCenter.add(studentIdLabel);
		jplCenter.add(studentIdTextField);
		jplCenter.add(majorLabel);
		jplCenter.add(majorTextField);
		jplCenter.add(subjectLabel);
		jplCenter.add(subjectTextField);
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
		new WinEx2();

	}

}
