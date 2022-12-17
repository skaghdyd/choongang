package swing05;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Win extends JFrame {
	ArticleDao dao;

	Win() {
		dao = new ArticleDao();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setLocation(500, 500);
		init();
		this.setVisible(true);
	}

	private void init() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());

		JTextArea ta = new JTextArea(7, 20);
		c.add(ta, BorderLayout.CENTER);

		JPanel jp1 = new JPanel(new FlowLayout());
		c.add(jp1, BorderLayout.NORTH);

		JButton jb1 = new JButton("모두 검색");
		jp1.add(jb1);

		JButton jb2 = new JButton("상세 검색");
		jp1.add(jb2);

		JTextField tf = new JTextField(4);
		jp1.add(tf);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<Article> list = dao.selectAll();
				for (Article art : list) {
					ta.append(art + "\n");
//					System.out.println(art);
				}

			}

		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().equals("")) return;
				
				jb2.setEnabled(false);

				int inputId = Integer.parseInt(tf.getText());

				JFrame fr = new JFrame("상세 검색");
				fr.setSize(300, 400);
				fr.setLocation(600, 500);
				fr.setVisible(true);

				Container c = fr.getContentPane();
				c.setLayout(new BorderLayout());

				JPanel jp = new JPanel(new FlowLayout());
				c.add(jp, BorderLayout.SOUTH);

				JButton jb = new JButton("닫기");
				jp.add(jb);
				
				JTextArea ta = new JTextArea(7, 20);
				Article article = dao.select(inputId);
				if(article!=null) ta.append(article.toString());
				c.add(ta, BorderLayout.CENTER);
				
				fr.addWindowListener(new WindowAdapter(){

					@Override
					public void windowClosing(WindowEvent e) {
						jb2.setEnabled(true);
					}
					
				});
				
				jb.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						jb2.setEnabled(true);
						fr.dispose();

					}

				});
			}

		});
	}

	public static void main(String[] args) {
		new Win();

	}

}
