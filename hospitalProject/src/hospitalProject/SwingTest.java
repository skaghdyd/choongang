package hospitalProject;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest extends JFrame implements WindowListener, ActionListener {
//	JFrame jf = new JFrame("스윙 테스트 프로그램");
	JButton jb = new JButton("종료버튼");
	
	SwingTest(){
		this.setTitle("스윙 테스트 프로그램");
		this.setLayout(null);
		this.setLocation(750, 350);
		this.setSize(300, 300);
		this.addWindowListener(this);
		
		Container container = this.getContentPane();
		
		jb.setLocation(50, 50);
		jb.setSize(100, 50);
		jb.addActionListener(this);
		
		container.add(jb);
		
		this.setVisible(true);		
	}
	
	public static void main(String[] args) {
		SwingTest swingtest = new SwingTest();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료");
		System.exit(0);		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("아이콘!");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("아이콘 풀림!");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭!");
		
	}

}
