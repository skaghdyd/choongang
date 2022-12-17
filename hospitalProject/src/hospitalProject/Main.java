package hospitalProject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TestProject extends JFrame {
	JPanel mainPane = new JPanel();

	TestProject() {
		this.setTitle("환자 진료 차트 관리 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1500, 1000);
		
		setMenuBar();
		
		mainPane.add(setLeftPane());
		mainPane.add(setRightPane());		
		this.add(mainPane);
		
		this.setVisible(true);
	}

	private JPanel setLeftPane() {
		JPanel leftPane = new JPanel();
		JPanel datePane = new JPanel();
		JPanel namePane = new JPanel();
		JPanel ssnPane = new JPanel();
		
		datePane.setLayout(new BoxLayout(datePane, BoxLayout.X_AXIS));
		datePane.add(new JLabel("날짜 : "));
		datePane.add(new JTextField());

		namePane.setLayout(new BoxLayout(namePane, BoxLayout.X_AXIS));
		namePane.add(new JLabel("이름 : "));
		namePane.add(new JTextField());
		
		ssnPane.setLayout(new BoxLayout(ssnPane, BoxLayout.X_AXIS));
		ssnPane.add(new JLabel("주민번호 : "));
		ssnPane.add(new JTextField());
		
		leftPane.setLayout(new BoxLayout(leftPane, BoxLayout.Y_AXIS));
		leftPane.add(datePane);
		leftPane.add(namePane);
		leftPane.add(ssnPane);
		
		return leftPane;
	}

	private JPanel setRightPane() {
		JPanel rightPane = new JPanel(new GridLayout(3, 3, 5, 5));

		JLabel symptomLabel = new JLabel("증상 : ");
		JTextField symptomText = new JTextField();

		JLabel opinionLabel = new JLabel("소견 : ");
		JTextField opinionText = new JTextField();

		JButton saveBtn = new JButton("저장");

		rightPane.add(saveBtn);
		rightPane.add(symptomLabel);
		rightPane.add(symptomText);
		rightPane.add(opinionLabel);
		rightPane.add(opinionText);

//		this.add(rightPane);
		return rightPane;
	}

	private void setMenuBar() {
		JMenuBar mb = new JMenuBar(); // 메뉴바 상자 생성
		JMenu jm = new JMenu("메뉴"); // 메뉴바 항목 생성
		JMenuItem jmi1 = new JMenuItem("메인화면");
		JMenuItem jmi2 = new JMenuItem("환자 정보 조회");
		JMenuItem jmi3 = new JMenuItem("신규 환자 입력");

		jmi1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "메인화면");
			}
		});

		jmi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "환자 정보 조회");
			}
		});

		jmi3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "신규 환자 입력");
			}
		});

		jm.add(jmi1); // 메뉴바 항목의 하위 항목 생성
		jm.add(jmi2); // 메뉴바 항목의 하위 항목 생성
		jm.add(jmi3); // 메뉴바 항목의 하위 항목 생성

		mb.add(jm); // 메뉴바에 담기

		setJMenuBar(mb); // 화면에 메뉴바 넣기

	}

}

public class Main {

	public static void main(String[] args) {
		new TestProject();
	}

}
