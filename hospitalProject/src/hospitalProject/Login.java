package hospitalProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends JFrame {
	JPanel mainPane = new JPanel();
	JPanel loginPane = new JPanel();
	JLabel loginTitle = new JLabel("HOSPITAL PROJECT");
	JPanel centerPane = new JPanel();
	public Login() {
//		this.setSize(1000,1000);
		//////////////////////////레이아웃////////////////////////

		add(mainPane);

		// 메인 패널 레이아웃 그리드백레이아웃 
		mainPane.setLayout(new GridBagLayout());
		
		//그리드백 제약사항을 정의
		GridBagConstraints gbc = new GridBagConstraints();
		
		// 전체를 그리드백레이웃으로 채운다
		gbc.fill = GridBagConstraints.BOTH;
		
		// grid top
		gbc.weightx=1.0;
		gbc.weighty=0.5;
		gbc.gridx=0;
		gbc.gridy=1;
		mainPane.add(loginPane,gbc);
		loginPane.setLayout(new BorderLayout());
		loginPane.add(loginTitle);
		// 제목 폰트 설정
//		loginTitle.setFont(titleFnt);
		loginTitle.setHorizontalAlignment(JLabel.CENTER);
//		loginTitle.setVerticalAlignment(JLabel.BOTTOM);
		loginPane.setBackground(Color.white);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Login();

	}

}
