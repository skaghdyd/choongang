package hospitalProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;

class ChartDialog extends JDialog {
	HospitalDB hospitalDB;
	Container c = this.getContentPane();
	String name = "";
	String ssn = "";
	String date = "";

	public ChartDialog(HospitalDB hospitalDB) throws ClassNotFoundException, SQLException {
		this.hospitalDB = hospitalDB;
		this.setBounds(400, 150, 550, 670);
		c.setLayout(new BorderLayout(0, 0));
		initialize();
		this.setModal(true);
		this.setVisible(true);
	}

	public ChartDialog(HospitalDB hospitalDB, String name, String ssn, String date) {
		this.hospitalDB = hospitalDB;
		this.name = name;
		this.ssn = ssn;
		this.date = date;

		this.setBounds(400, 150, 550, 670);
		c.setLayout(new BorderLayout(0, 0));
		initialize();
		this.setModal(true);
		this.setVisible(true);
	}

	private void initialize() {

		JPanel chartPanel = new JPanel();
		chartPanel.setSize(this.getSize());
		c.add(chartPanel);
		chartPanel.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("신규 차트 입력");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(12, 10, 219, 32);
		chartPanel.add(lblNewLabel_3);

		JPanel leftChartPanel = new JPanel();
		leftChartPanel.setBounds(12, 52, 503, 102);
		chartPanel.add(leftChartPanel);
		leftChartPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		leftChartPanel.setLayout(null);

		JLabel leftChartDateLabel = new JLabel("날짜 : ");
		leftChartDateLabel.setBounds(12, 13, 74, 15);
		leftChartPanel.add(leftChartDateLabel);

		JLabel leftChartNameLabel = new JLabel("이름 : ");
		leftChartNameLabel.setBounds(12, 41, 74, 15);
		leftChartPanel.add(leftChartNameLabel);

		JLabel leftChartSsnLabel = new JLabel("주민번호 : ");
		leftChartSsnLabel.setBounds(12, 69, 74, 15);
		leftChartPanel.add(leftChartSsnLabel);

		JTextField leftChartDateField = new JTextField();
		leftChartDateField.setBounds(98, 10, 167, 21);
		leftChartPanel.add(leftChartDateField);
		leftChartDateField.setColumns(10);
		if (date.equals("")) {
			leftChartDateField.setEditable(true);
		} else {
			leftChartDateField.setEditable(false);
		}
		leftChartDateField.setText(date);

		JTextField leftChartNameField = new JTextField();
		leftChartNameField.setColumns(10);
		leftChartNameField.setBounds(98, 38, 167, 21);
		leftChartPanel.add(leftChartNameField);
		if (name.equals("")) {
			leftChartNameField.setEditable(true);
		} else {
			leftChartNameField.setEditable(false);
		}
		leftChartNameField.setText(name);

		JTextField leftChartSsnField = new JTextField();
		leftChartSsnField.setColumns(10);
		leftChartSsnField.setBounds(98, 66, 167, 21);
		leftChartPanel.add(leftChartSsnField);
		if (ssn.equals("")) {
			leftChartSsnField.setEditable(true);
		} else {
			leftChartSsnField.setEditable(false);
		}
		leftChartSsnField.setText(ssn);

		JPanel rightChartPanel = new JPanel();
		rightChartPanel.setBounds(12, 164, 503, 455);
		chartPanel.add(rightChartPanel);
		rightChartPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightChartPanel.setLayout(null);

		JLabel rightChartSymptomLabel = new JLabel("증상 : ");
		rightChartSymptomLabel.setBounds(12, 14, 57, 15);
		rightChartPanel.add(rightChartSymptomLabel);

		JTextArea rightChartSymptomArea = new JTextArea();
		rightChartSymptomArea.setBounds(12, 39, 480, 185);
		rightChartPanel.add(rightChartSymptomArea);

		JButton rightChartSavButton = new JButton("저장");
		rightChartSavButton.setBounds(395, 10, 97, 23);
		rightChartPanel.add(rightChartSavButton);

		JLabel rightChartOpinionLabel = new JLabel("소견 : ");
		rightChartOpinionLabel.setBounds(12, 249, 57, 15);
		rightChartPanel.add(rightChartOpinionLabel);

		JTextArea rightChartOpinionArea = new JTextArea();
		rightChartOpinionArea.setBounds(12, 274, 480, 165);
		rightChartPanel.add(rightChartOpinionArea);
		
		/////////////////////////////////////////////////////////////
		// 이벤트
		/////////////////////////////////////////////////////////////
		// 차트입력화면 저장 버튼 이벤트
		rightChartSavButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = leftChartDateField.getText();
				String name = leftChartNameField.getText();
				String ssn = leftChartSsnField.getText();
				String symptom = rightChartSymptomArea.getText();
				String opinion = rightChartOpinionArea.getText();

				if (date.equals("")) {
					JOptionPane.showMessageDialog(c, "날짜를 입력해주세요.");
					return;
				}
				if (name.equals("")) {
					JOptionPane.showMessageDialog(c, "이름을 입력해주세요.");
					return;
				}
				if (ssn.equals("")) {
					JOptionPane.showMessageDialog(c, "주민번호를 입력해주세요.");
					return;
				}
				if (symptom.equals("")) {
					JOptionPane.showMessageDialog(c, "증상을 입력해주세요.");
					return;
				}
				if (opinion.equals("")) {
					JOptionPane.showMessageDialog(c, "의견을 입력해주세요.");
					return;
				}
				try {
					hospitalDB.insert(date, name, ssn, symptom, opinion);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "저장 완료");
				leftChartDateField.setText("");
				leftChartNameField.setText("");
				leftChartSsnField.setText("");
				rightChartSymptomArea.setText("");
				rightChartOpinionArea.setText("");
				dispose();
			}
		});
	}
}

public class HospitalProject {
	File uploadFile = null;
	HospitalDB hospitalDB;
	private JFrame frame;
	private JTable rightMainPanelTable;
	private JTable leftSearchTable;
	private JTextField searchPatientField;
	private JTable rightSearchTable;
	final String FILEPATH = "C:\\_dev\\hospitalProject\\src\\hospitalProject\\images\\";
	DefaultTableModel leftSearchTableModel = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(int row, int column) {
			// all cells false
			return false;
		}
	};
	DefaultTableModel rightMainPanelTableModel = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(int row, int column) {
			// all cells false
			return false;
		}
	};
	DefaultTableModel rightSearchTableModel = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(int row, int column) {
			// all cells false
			return false;
		}
	};
	private JTextField patientNameField;
	private JTextField patientSsnField;
	private JTextField patientPhoneNumField;

	/**
	 * Create the application.
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public HospitalProject(HospitalDB hospitalDB) throws ClassNotFoundException, SQLException {
		this.hospitalDB = hospitalDB;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("환자 진료 차트 관리 프로그램");
		frame.setBounds(0, 0, 1800, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		JPanel searchPanel = new JPanel();
		searchPanel.setBounds(0, 0, 1784, 938);
		frame.getContentPane().add(searchPanel);
		searchPanel.setLayout(null);

		JPanel leftSearchPanel = new JPanel();
		leftSearchPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		leftSearchPanel.setBounds(12, 246, 503, 676);
		searchPanel.add(leftSearchPanel);
		leftSearchPanel.setLayout(null);

		leftSearchTable = new JTable(leftSearchTableModel);

		JScrollPane leftSearchTableScrollPane = new JScrollPane(leftSearchTable);
		leftSearchTableScrollPane.setBounds(12, 68, 479, 598);
		leftSearchPanel.add(leftSearchTableScrollPane);

		searchPatientField = new JTextField();
		searchPatientField.setBounds(12, 37, 399, 21);
		leftSearchPanel.add(searchPatientField);
		searchPatientField.setColumns(10);

		JButton searchPatientButton = new JButton("조회");
		searchPatientButton.setBounds(423, 35, 68, 23);
		leftSearchPanel.add(searchPatientButton);

		JLabel lblNewLabel_4 = new JLabel("환자 조회");
		lblNewLabel_4.setBounds(12, 10, 57, 15);
		leftSearchPanel.add(lblNewLabel_4);

		JPanel rightSearchPanel = new JPanel();
		rightSearchPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightSearchPanel.setBounds(527, 52, 816, 870);
		searchPanel.add(rightSearchPanel);
		rightSearchPanel.setLayout(null);

		rightSearchTable = new JTable(rightSearchTableModel);

		JScrollPane rightSearchTableScrollPane = new JScrollPane(rightSearchTable);
		rightSearchTableScrollPane.setBounds(12, 42, 787, 818);
		rightSearchPanel.add(rightSearchTableScrollPane);

		JButton inputChartButton = new JButton("차트입력");
		inputChartButton.setBounds(686, 9, 97, 23);
		rightSearchPanel.add(inputChartButton);

		JLabel lblNewLabel_5 = new JLabel("과거 차트 리스트");
		lblNewLabel_5.setBounds(12, 13, 321, 15);
		rightSearchPanel.add(lblNewLabel_5);

		JPanel patientAddPanel = new JPanel();
		patientAddPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		patientAddPanel.setBounds(12, 52, 503, 184);
		searchPanel.add(patientAddPanel);
		patientAddPanel.setLayout(null);

		patientNameField = new JTextField();
		patientNameField.setBounds(375, 44, 116, 21);
		patientAddPanel.add(patientNameField);
		patientNameField.setColumns(10);

		patientSsnField = new JTextField();
		patientSsnField.setBounds(375, 75, 116, 21);
		patientAddPanel.add(patientSsnField);
		patientSsnField.setColumns(10);

		patientPhoneNumField = new JTextField();
		patientPhoneNumField.setBounds(375, 106, 116, 21);
		patientAddPanel.add(patientPhoneNumField);
		patientPhoneNumField.setColumns(10);

		JLabel patientNameLabel = new JLabel("이름 : ");
		patientNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		patientNameLabel.setBounds(292, 47, 71, 15);
		patientAddPanel.add(patientNameLabel);

		JLabel patientSsnLabel = new JLabel("주민번호 : ");
		patientSsnLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		patientSsnLabel.setBounds(292, 78, 71, 15);
		patientAddPanel.add(patientSsnLabel);

		JLabel patientPhoneNumLabel = new JLabel("연락처 : ");
		patientPhoneNumLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		patientPhoneNumLabel.setBounds(292, 109, 71, 15);
		patientAddPanel.add(patientPhoneNumLabel);

		JButton patientSavButton = new JButton("저장");

		patientSavButton.setBounds(420, 10, 71, 23);
		patientAddPanel.add(patientSavButton);

		JLabel lblNewLabel_6 = new JLabel("신규 환자 등록");
		lblNewLabel_6.setBounds(12, 14, 116, 15);
		patientAddPanel.add(lblNewLabel_6);

		JButton btnNewButton = new JButton("이미지 업로드");

		btnNewButton.setBounds(340, 151, 116, 23);
		patientAddPanel.add(btnNewButton);

		JPanel patientImagePanel = new JPanel();
		patientImagePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		patientImagePanel.setBounds(12, 40, 280, 134);
		patientAddPanel.add(patientImagePanel);
		patientImagePanel.setLayout(null);

		JLabel uploadPatientImageLabel = new JLabel();
		uploadPatientImageLabel.setBounds(0, 0, 280, 134);
		patientImagePanel.add(uploadPatientImageLabel);
		uploadPatientImageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
				fileChooser.setFileFilter(filter);

				int ret = fileChooser.showOpenDialog(null);
				if (ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
					return;
				}

				String filePath = fileChooser.getSelectedFile().getPath();
				String fileName = fileChooser.getSelectedFile().getName();
				uploadPatientImageLabel.setIcon(new ImageIcon(filePath, fileName));

				uploadFile = fileChooser.getSelectedFile();

			}
		});

		JLabel lblNewLabel_1 = new JLabel("신규 환자 입력 및 조회");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(12, 10, 219, 32);
		searchPanel.add(lblNewLabel_1);

		JPanel currentPatientImagePanel = new JPanel();
		currentPatientImagePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		currentPatientImagePanel.setBounds(1355, 52, 417, 385);
		searchPanel.add(currentPatientImagePanel);
		currentPatientImagePanel.setLayout(null);

		JLabel currentPatientImageLabel = new JLabel();
		currentPatientImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		currentPatientImageLabel.setBounds(12, 38, 393, 337);
		currentPatientImagePanel.add(currentPatientImageLabel);

		JLabel lblNewLabel_8 = new JLabel("환자 사진");
		lblNewLabel_8.setBounds(12, 10, 57, 15);
		currentPatientImagePanel.add(lblNewLabel_8);
		searchPanel.setVisible(false);

		// 환자조회 화면 환자 이름 검색 버튼 이벤트
		searchPatientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 테이블 초기화
				int rowCount = rightSearchTable.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					rightSearchTableModel.removeRow(i);
				}

				String name = searchPatientField.getText();
				List<Map<String, String>> resultList = null;
				if (name.equals("")) {
					JOptionPane.showMessageDialog(frame, "조회할 환자의 이름을 입력해주세요.");
					return;
				}

				try {
					resultList = hospitalDB.searchPatient(name);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				rowCount = leftSearchTableModel.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					leftSearchTableModel.removeRow(i);
				}

				if (resultList.size() == 0) {
					JOptionPane.showMessageDialog(frame, "조회된 자료가 없습니다.");
					return;
				}

				for (int i = 0; i < resultList.size(); i++) {
					Map<String, String> map = resultList.get(i);
					String nm = map.get("name");
					String ssn = map.get("ssn");
					String phoneNum = map.get("phoneNum");
					String fileName = map.get("fileName");
					leftSearchTableModel.addRow(new Object[] { nm, ssn, phoneNum, fileName });
				}
			}
		});

		// 환자조회화면 테이블 클릭 이벤트
		leftSearchTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ssn = (String) leftSearchTableModel.getValueAt(leftSearchTable.getSelectedRow(), 1);
				String fileName = (String) leftSearchTableModel.getValueAt(leftSearchTable.getSelectedRow(), 3);
				currentPatientImageLabel.setIcon(new ImageIcon(FILEPATH + fileName));
				List<Map<String, String>> resultList = null;
				try {
					resultList = hospitalDB.searchChart(ssn);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// 테이블 초기화
				int rowCount = rightSearchTable.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					rightSearchTableModel.removeRow(i);
				}

				if (resultList.size() == 0) {
					JOptionPane.showMessageDialog(frame, "조회된 자료가 없습니다.");
					return;
				}

				for (int i = 0; i < resultList.size(); i++) {
					Map<String, String> map = resultList.get(i);
					String date = map.get("date");
					String name = map.get("name");
					String symptom = map.get("symptom");
					String opinion = map.get("opinion");
					rightSearchTableModel.addRow(new Object[] { date, name, ssn, symptom, opinion });
				}
			}
		});

		// 차트입력 버튼 이벤트
		inputChartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (leftSearchTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(frame, "먼저 데이터를 선택 후 다시 시도하십시오.");
					return;
				}
				String name = (String) leftSearchTableModel.getValueAt(leftSearchTable.getSelectedRow(), 0);
				String ssn = (String) leftSearchTableModel.getValueAt(leftSearchTable.getSelectedRow(), 1);
				String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
				new ChartDialog(hospitalDB, name, ssn, date);

			}
		});

		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1784, 938);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(true);

		JLabel lblNewLabel_2 = new JLabel("메인화면");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(12, 10, 219, 32);
		mainPanel.add(lblNewLabel_2);

		JPanel leftMainPanel = new JPanel();
		leftMainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		leftMainPanel.setBounds(12, 52, 503, 870);
		mainPanel.add(leftMainPanel);
		leftMainPanel.setLayout(null);

		JCalendar calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(0, 0, 0)));
		calendar.setBounds(0, 43, 491, 827);
		leftMainPanel.add(calendar);

		JButton leftMainPanelSearchButton = new JButton("조회");
		leftMainPanelSearchButton.setBounds(423, 10, 68, 23);
		leftMainPanel.add(leftMainPanelSearchButton);

		JLabel lblNewLabel_7 = new JLabel("날짜 조회");
		lblNewLabel_7.setBounds(12, 10, 57, 15);
		leftMainPanel.add(lblNewLabel_7);

		JPanel rightMainPanel = new JPanel();
		rightMainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightMainPanel.setBounds(527, 52, 1242, 870);
		mainPanel.add(rightMainPanel);
		rightMainPanel.setLayout(null);

		rightMainPanelTable = new JTable(rightMainPanelTableModel);
		rightMainPanelTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
					String name = (String) rightMainPanelTableModel.getValueAt(rightMainPanelTable.getSelectedRow(), 1);
					String ssn = (String) rightMainPanelTableModel.getValueAt(rightMainPanelTable.getSelectedRow(), 3);
					new ChartDialog(hospitalDB, name, ssn, date);
				}
			}
		});

		JScrollPane rightMainPanelTableScrollPane = new JScrollPane(rightMainPanelTable);
		rightMainPanelTableScrollPane.setBounds(12, 37, 1218, 823);
		rightMainPanel.add(rightMainPanelTableScrollPane);

		JLabel lblNewLabel = new JLabel("예약 리스트");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(12, 10, 108, 15);
		rightMainPanel.add(lblNewLabel);

		// 메인화면 날짜 조회 이벤트
		leftMainPanelSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year = calendar.getDate().getYear() + 1900 + "";
				int intMonth = calendar.getDate().getMonth() + 1;
				String month = String.format("%02d", intMonth);
				int intDate = calendar.getDate().getDate();
				String Date = String.format("%02d", intDate);

				List<Map<String, String>> resultList = null;
				try {
					resultList = hospitalDB.searchReservation(year + month + Date);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// 테이블 초기화
				int rowCount = rightMainPanelTableModel.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					rightMainPanelTableModel.removeRow(i);
				}

				if (resultList.size() == 0) {
					JOptionPane.showMessageDialog(frame, "조회된 자료가 없습니다.");
					return;
				}

				for (int i = 0; i < resultList.size(); i++) {
					Map<String, String> map = resultList.get(i);
					String name = map.get("name");
					String doctor = map.get("doctor");
					String ssn = map.get("ssn");
					String phoneNum = map.get("phoneNum");
					rightMainPanelTableModel.addRow(new Object[] { year + month + Date, name, doctor, ssn, phoneNum });
				}
			}
		});

		// 환자 조회 화면 왼쪽 테이블 컬럼 추가
		String[] leftSearchTableColumns = { "이름", "주민번호", "연락처", "이미지 경로" };
		for (int i = 0; i < leftSearchTableColumns.length; i++) {
			leftSearchTableModel.addColumn(leftSearchTableColumns[i]);
		}
		leftSearchTable.getColumn("이미지 경로").setMaxWidth(0);
		leftSearchTable.getColumn("이미지 경로").setMinWidth(0);

		// 환자 조회 화면 오른쪽 테이블 컬럼 추가
		String[] rightSearchTableColumns = { "날짜", "이름", "주민번호", "증상", "소견" };
		for (int i = 0; i < rightSearchTableColumns.length; i++) {
			rightSearchTableModel.addColumn(rightSearchTableColumns[i]);
		}

		// 메인 화면 오른쪽 테이블 컬럼 추가
		String[] rightMainPanelTableColumns = { "날짜", "이름", "주치의", "주민번호", "연락처" };
		for (int i = 0; i < rightMainPanelTableColumns.length; i++) {
			rightMainPanelTableModel.addColumn(rightMainPanelTableColumns[i]);
		}

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu firstMenu = new JMenu("메뉴");
		menuBar.add(firstMenu);

		JMenuItem firstMenuToMain = new JMenuItem("메인화면");
		firstMenu.add(firstMenuToMain);

		JMenuItem firstMenuToPatientInfo = new JMenuItem("신규 환자 입력 및 조회");
		firstMenu.add(firstMenuToPatientInfo);

		JMenuItem firstMenuToNewChart = new JMenuItem("신규 차트 입력");
		firstMenu.add(firstMenuToNewChart);

		JMenuItem firstMenuToLogout = new JMenuItem("로그아웃");
		firstMenu.add(firstMenuToLogout);

		// 메뉴항목 이벤트(로그아웃)
		firstMenuToLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				try {
					new HospitalLogin(hospitalDB);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		// 메뉴항목 이벤트(메인화면)
		firstMenuToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(true);
				searchPanel.setVisible(false);

				// 테이블 초기화
				int rowCount = rightMainPanelTableModel.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					rightMainPanelTableModel.removeRow(i);
				}
			}
		});

		// 메뉴항목 이벤트(환자조회)
		firstMenuToPatientInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPanel.setVisible(true);
				mainPanel.setVisible(false);

				searchPatientField.setText("");
				// 테이블 초기화
				int rowCount = leftSearchTableModel.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					leftSearchTableModel.removeRow(i);
				}
				// 테이블 초기화
				rowCount = rightSearchTableModel.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					rightSearchTableModel.removeRow(i);
				}
			}
		});

		// 메뉴항목 이벤트(차트입력)
		firstMenuToNewChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new ChartDialog(hospitalDB);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		patientSavButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = patientNameField.getText();
				String ssn = patientSsnField.getText();
				String phoneNum = patientPhoneNumField.getText();
				String fileName = name + "_" + ssn;

				if (name == null || name.equals("")) {
					JOptionPane.showMessageDialog(frame, "저장할 환자의 이름을 입력해주세요.");
					return;
				}
				if (ssn == null || ssn.equals("")) {
					JOptionPane.showMessageDialog(frame, "저장할 환자의 주민번호를 입력해주세요.");
					return;
				}
				if (phoneNum == null || phoneNum.equals("")) {
					JOptionPane.showMessageDialog(frame, "저장할 환자의 연락처를 입력해주세요.");
					return;
				}

				try {
					int result = hospitalDB.addPatient(name, ssn, phoneNum, fileName);
					if (result == -1) {
						// 중복으로 인한 저장 실패
						JOptionPane.showMessageDialog(frame, "해당 주민번호는 이미 등록이 되어 있습니다.");
						return;
					} else if (result == 0) {
						JOptionPane.showMessageDialog(frame, "등록에 실패하였습니다. 시스템 관리자에게 문의해주세요.");
						return;
					} else {
						JOptionPane.showMessageDialog(frame, "저장에 성공하였습니다!");
						patientNameField.setText("");
						patientSsnField.setText("");
						patientPhoneNumField.setText("");
						uploadPatientImageLabel.setIcon(null);

						// 파일 생성
						BufferedImage img = ImageIO.read(uploadFile);
						ImageIO.write(img, "jpg", new File(FILEPATH + fileName));
						System.out.println("파일 생성 성공");
						uploadFile = null;
					}
				} catch (SQLException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		calendar.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				if (evt.getPropertyName().equals("calendar")) {
					String year = calendar.getYearChooser().getYear() + "";
					String month = String.format("%02d", calendar.getMonthChooser().getMonth() + 1);
					String Date = String.format("%02d", calendar.getDayChooser().getDay());

					List<Map<String, String>> resultList = null;
					try {
						resultList = hospitalDB.searchReservation(year + month + Date);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					// 테이블 초기화
					int rowCount = rightMainPanelTableModel.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						rightMainPanelTableModel.removeRow(i);
					}

					if (resultList.size() == 0) {
						JOptionPane.showMessageDialog(frame, "조회된 자료가 없습니다.");
						return;
					}

					for (int i = 0; i < resultList.size(); i++) {
						Map<String, String> map = resultList.get(i);
						String name = map.get("name");
						String doctor = map.get("doctor");
						String ssn = map.get("ssn");
						String phoneNum = map.get("phoneNum");
						rightMainPanelTableModel
								.addRow(new Object[] { year + month + Date, name, doctor, ssn, phoneNum });
					}
				}
			}
		});
	}
}
