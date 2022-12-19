package hospitalProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

class AddUserDialog extends JDialog {
	HospitalDB hospitalDB;
	Container c = this.getContentPane();
	boolean idCheck = false;

	public AddUserDialog(HospitalDB hospitalDB) throws ClassNotFoundException, SQLException {
		this.hospitalDB = hospitalDB;
		this.setBounds(400, 150, 580, 500);
		c.setLayout(new BorderLayout(0, 0));
		initialize();
		this.setModal(true);
		this.setVisible(true);
	}

	private void initialize() {
		JPanel addUserPanel = new JPanel();
//        addUserPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		addUserPanel.setSize(this.getSize());
		c.add(addUserPanel, BorderLayout.CENTER);
		addUserPanel.setLayout(null);

		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(130, 100, 82, 21);
		addUserPanel.add(idLabel);

		JTextField idField = new JTextField();
		idField.setBounds(230, 100, 116, 21);
		addUserPanel.add(idField);
		idField.setColumns(10);

		JButton addIdCheckButton = new JButton("중복체크");
		addIdCheckButton.setBounds(360, 100, 90, 21);
		addUserPanel.add(addIdCheckButton);

		JLabel nameLabel = new JLabel("이름 : ");
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setBounds(130, 150, 82, 21);
		addUserPanel.add(nameLabel);

		JTextField nameField = new JTextField();
		nameField.setBounds(230, 150, 116, 21);
		addUserPanel.add(nameField);
		nameField.setColumns(10);

		JLabel passwordLabel = new JLabel("비밀번호 : ");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setBounds(130, 200, 82, 21);
		addUserPanel.add(passwordLabel);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(230, 200, 116, 21);
		addUserPanel.add(passwordField);

		JLabel passwordCheckLabel = new JLabel("비밀번호 확인 : ");
		passwordCheckLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordCheckLabel.setBounds(100, 250, 112, 21);
		addUserPanel.add(passwordCheckLabel);

		JPasswordField passwordCheckField = new JPasswordField();
		passwordCheckField.setBounds(230, 250, 116, 21);
		addUserPanel.add(passwordCheckField);

		JButton addCompleteButton = new JButton("완료");
		addCompleteButton.setBounds(170, 350, 97, 23);
		addUserPanel.add(addCompleteButton);

		JButton addCancelButton = new JButton("취소");
		addCancelButton.setBounds(290, 350, 97, 23);
		addUserPanel.add(addCancelButton);

		/////////////////////////////////////////////////////////////
		// 이벤트
		/////////////////////////////////////////////////////////////

		// 중복체크 버튼
		addIdCheckButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				if (id == null || id.equals("")) {
					JOptionPane.showMessageDialog(c, "먼저 아이디를 입력해주세요.");
					return;
				}

				try {
					boolean result = hospitalDB.addIdCheck(id);
					if (result == false) {
						JOptionPane.showMessageDialog(c, "해당 아이디는 이미 사용중 입니다.");
						idCheck = false;
					} else {
						JOptionPane.showMessageDialog(c, "해당 아이디로 회원가입이 가능합니다.");
						idCheck = true;
						idField.setEditable(false);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 완료 버튼
		addCompleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				String name = nameField.getText();
				String password = passwordField.getText();
				String passwordCheck = passwordCheckField.getText();

				if (id == null || id.equals("")) {
					JOptionPane.showMessageDialog(c, "아이디를 입력해주세요.");
					return;
				}
				if (name == null || name.equals("")) {
					JOptionPane.showMessageDialog(c, "이름을 입력해주세요.");
					return;
				}
				if (password == null || password.equals("")) {
					JOptionPane.showMessageDialog(c, "비밀번호를 입력해주세요.");
					return;
				}
				if (passwordCheck == null || passwordCheck.equals("")) {
					JOptionPane.showMessageDialog(c, "비밀번호 확인을 입력해주세요.");
					return;
				}
				if (!password.equals(passwordCheck)) {
					JOptionPane.showMessageDialog(c, "비밀번가 일치하지 않습니다.");
					return;
				}
				if (idCheck == false) {
					JOptionPane.showMessageDialog(c, "아이디 중복체크를 해주세요.");
					return;
				}
				try {
					int result = hospitalDB.addUser(id, name, password);
					if (result > 0) {
						JOptionPane.showMessageDialog(c, "회원가입이 완료되었습니다.");
						dispose();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		// 취소 버튼
		addCancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});

	}
}

public class HospitalLogin {
	HospitalDB hospitalDB;
	private JFrame frame;
	private JTextField idField;
	private JPasswordField passwordField;
	private JTextField loginInnerNamePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HospitalLogin window = new HospitalLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public HospitalLogin() throws ClassNotFoundException, SQLException {
		hospitalDB = new HospitalDB();
		initialize();
	}

	public HospitalLogin(HospitalDB hospitalDB) throws ClassNotFoundException, SQLException {
		JOptionPane.showMessageDialog(null, "로그아웃 하였습니다.");
		this.hospitalDB = hospitalDB;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1113, 611);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setVisible(true);

		JPanel loginPanel = new JPanel();
		frame.getContentPane().add(loginPanel, BorderLayout.CENTER);
		loginPanel.setLayout(null);

		JPanel loginInnerPanel = new JPanel();
		loginInnerPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		loginInnerPanel.setBounds(395, 209, 293, 157);
		loginPanel.add(loginInnerPanel);
		loginInnerPanel.setLayout(null);

		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(33, 28, 82, 21);
		loginInnerPanel.add(idLabel);

		JLabel passwordLabel = new JLabel("비밀번호 : ");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setBounds(33, 59, 82, 21);
		loginInnerPanel.add(passwordLabel);

		idField = new JTextField();
		idField.setBounds(127, 28, 116, 21);
		loginInnerPanel.add(idField);
		idField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(127, 59, 116, 21);
		loginInnerPanel.add(passwordField);

		JButton addUserButton = new JButton("회원가입");
		addUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new AddUserDialog(hospitalDB);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		addUserButton.setBounds(45, 105, 97, 23);
		loginInnerPanel.add(addUserButton);

		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(154, 105, 97, 23);
		loginInnerPanel.add(loginButton);

		loginInnerNamePanel = new JTextField();
		loginInnerNamePanel.setEditable(false);
		loginInnerNamePanel.setHorizontalAlignment(SwingConstants.CENTER);
		loginInnerNamePanel.setText("로그인 페이지");
		loginInnerNamePanel.setBounds(395, 136, 293, 63);
		loginPanel.add(loginInnerNamePanel);
		loginInnerNamePanel.setColumns(10);

		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				String password = passwordField.getText();
				if (id == null || id.equals("")) {
					JOptionPane.showMessageDialog(frame, "아이디를 입력해주세요.");
					return;
				}
				if (password == null || password.equals("")) {
					JOptionPane.showMessageDialog(frame, "비밀번호를 입력해주세요.");
					return;
				}
				try {
					String result = hospitalDB.loginCheck(id);
					if (result == null) {
						JOptionPane.showMessageDialog(frame, "아이디가 잘못되었습니다.");
						return;
					} else {
						if (!password.equals(result)) {
							JOptionPane.showMessageDialog(frame, "비밀번호가 일치하지 않습니다.");
							return;
						}
					}
					JOptionPane.showMessageDialog(frame, "로그인 성공!");
					frame.dispose();
					try {
						new HospitalProject(hospitalDB);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
	}
}
