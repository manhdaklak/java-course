package GiaoDien;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class GD_DangNhap extends JFrame{

	private JPanel contentPane;
	private JTextField txt_Username;
	private JPasswordField txt_PassWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_DangNhap frame = new GD_DangNhap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GD_DangNhap() {
		
		setTitle("Đăng Nhập");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(420, 150, 525, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLog = new JLabel("ĐĂNG NHẬP TÀI KHOẢN");
		lblLog.setFont(new Font("Kristen ITC", Font.BOLD, 25));
		lblLog.setForeground(Color.BLUE);
		lblLog.setIcon(new ImageIcon("src/images/Apps-preferences-desktop-user-password-icon.png"));
		lblLog.setBounds(80, 30, 400, 70);
		contentPane.add(lblLog);
		
		JLabel lblUsername = new JLabel(" Tên Tài Khoản: ");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUsername.setIcon(new ImageIcon("src/images/account.png"));
		lblUsername.setBounds(70, 115, 150, 50);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel(" Mật Khẩu:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setIcon(new ImageIcon("src/images/password.png"));
		lblPassword.setBounds(70, 155, 150, 50);
		contentPane.add(lblPassword);
		
		txt_Username = new JTextField();
		txt_Username.setBounds(220, 130, 230, 25);
		contentPane.add(txt_Username);
		txt_Username.setColumns(10);
		
		txt_PassWord = new JPasswordField();
		txt_PassWord.setBounds(220, 170, 230, 25);
		contentPane.add(txt_PassWord);
		txt_PassWord.setColumns(10);
		
		JButton btn_Login = new JButton("Đăng Nhập");
		btn_Login.setIcon(new ImageIcon("src/images/login.png"));
		btn_Login.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evenLogin();
			}
		});
		btn_Login.setBounds(90, 240, 150, 40);
		contentPane.add(btn_Login);
		
		JButton btn_Exit = new JButton("Thoát");
		btn_Exit.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Exit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btn_Exit.setBounds(300, 240, 150, 40);
		contentPane.add(btn_Exit);
	}
	public void evenLogin(){
		String user_Name =txt_Username.getText().trim();
		String passWord= txt_PassWord.getText().trim();
		String sql = "SELECT *FROM NhanVien WHERE TenTaiKhoan='"+user_Name+"' AND MatKhau='"+passWord+"'";
//		try {
//			ResultSet rs = DataBase.executeQuery(sql);
//			GD_Main frame = new GD_Main();
//			GD_DangNhap frame_Login = new GD_DangNhap();
//				while(rs.next()){					
//					frame_Login.setVisible(false);
//					frame.setVisible(true);
//					setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//					frame_Login.disable();
//					frame_Login.dispose();
//					dispose();
//					setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//					
//					return;
//				}
//			} catch (HeadlessException e1) {
//				e1.printStackTrace();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			JOptionPane.showMessageDialog(null,"Tên đăng nhập hoặc mật khẩu sai! Vui lòng nhập lại!");
	}
}
