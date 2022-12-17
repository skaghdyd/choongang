package jdbc04;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx extends JFrame implements ActionListener {
	StudentDB studentDB;
	
	JButton sel = new JButton("검색");
	JButton ins = new JButton("추가");
	JButton del = new JButton("삭제");

	SwingEx() throws ClassNotFoundException, SQLException {
		studentDB = new StudentDB();
		
		Container con = this.getContentPane();
		con.setLayout(null);
		sel.setBounds(50, 60, 80, 50);
		sel.addActionListener(this);
		ins.setBounds(50, 120, 80, 50);
		ins.addActionListener(this);
		del.setBounds(50, 180, 80, 50);
		del.addActionListener(this);
		con.add(sel);
		con.add(ins);
		con.add(del);

		this.setLocation(500, 300);
		this.setSize(500, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new SwingEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sel) {
			System.out.println("sel 버튼 클릭");
			try {
				studentDB.selectAll();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource() == ins) {
			System.out.println("ins 버튼 클릭");
		} else if (e.getSource() == del) {
			System.out.println("del 버튼 클릭");
		}
	}
}
