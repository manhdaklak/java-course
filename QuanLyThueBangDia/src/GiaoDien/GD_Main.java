package GiaoDien;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class GD_Main extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3612902112627409790L;
	DefaultTableModel defaultTableModel;
	private JPanel panel_TrangChu,panel_NCC,panel_KhachHang,panel_NhapBangDia,panel_BangDia,panel_NhanVien,panel_ThueBangDia,panel_TraBangDia,panel_ThongKe;
	
	private JTextField txt_MaNCC_NCC,txt_TenNCC_NCC,txt_DiaChi_NCC,txt_SDT_NCC
							,txt_Email_NCC,txt_TimKiem_NCC;
	private JTextArea txt_GhiChu_NCC;
	
	private JTextField txt_MaBD_NhapBD,txt_TenBD_NhapBD,txt_MaTheLoai_NhapBD,txt_TimKiem_NhapBD,
							txt_MaNCC_NhapBD,txt_SoLuong_NhapBD,txt_DonGia_NhapBD
							,txt_QuocGia_NhapBD,txt_TimKiemBD_NhapBD;
	private JTextArea txt_GhiChu_NhapBD;
	
	private JTextField txt_MaKH_KhachHang,txt_TenKH_KhachHang,txt_SCMND_KhachHang,txt_SDT_KhachHang,
		txt_Email_KhachHang,txt_DiaChi_KhachHang,txt_DiemTL_KhachHang,txt_TimKiem_KhachHang;
	private JTextArea txt_GhiChu_KhachHang;
	
	private JTextField txt_MaBD_BangDia,txt_TenBD_BangDia,txt_MaTL_BangDia,txt_MaNCC_BangDia,
		txt_XuatXu_BangDia,txt_SoLuong_BangDia,txt_SoLuongThue_BangDia,txt_SoLuongHuHong_BangDia,txt_DonGia_BangDia,txt_TimKiem_BangDia;
	private JTextArea txt_GhiChu_BangDia;
	
	private JTextField txt_MaNV_NV,txt_TenNV_NV,txt_SDT_NV,txt_Email_NV,
		txt_DiaChi_NV,txt_TenTK_NV,txt_MatKhau_NV,txt_TimKiem_NV;
	private JTextArea txt_GhiChu_NV;
	private JComboBox txt_GioiTinh_NV,txt_HinhThuc_ThongKe;

	private JTextField txt_MaPhieuThue_ThueBD,txt_MaKH_ThueBD,txt_MaNV_ThueBD,txt_MaBD1_ThueBD,txt_MaBD2_ThueBD,txt_MaBD3_ThueBD,txt_MaBD4_ThueBD,txt_MaBD5_ThueBD,
		txt_SoLuongLThue1_ThueBD,txt_SoLuongLThue2_ThueBD,txt_SoLuongLThue3_ThueBD,txt_SoLuongLThue4_ThueBD,txt_SoLuongLThue5_ThueBD,txt_TienCoc_ThueBD
		,txt_TrangThaiBD_ThueBD,txt_TimKiemBD_ThueBD,txt_TimKiemDSThue_ThueBD;
	private JDateChooser txt_NgayThue_ThueBD;
	private JTextArea txt_GhiChu_ThueBD;
	
	private JTextField txt_MaPhieuThue_TraBD;
	private JTextField txt_MaKH_TraBD;
	private JTextField txt_TenKH_TraBD;
	private JTextField txt_SoLuongLThue5_TraBD;
	private JTextField txt_MaBD5_TraBD;
	private JTextField txt_SoLuongLThue4_TraBD;
	private JTextField txt_MaBD4_TraBD;
	private JTextField txt_SoLuongLThue3_TraBD;
	private JTextField txt_MaBD3_TraBD;
	private JTextField txt_SoLuongLThue2_TraBD;
	private Component txt_MaBD2_TraBD;
	private JTextField txt_SoLuongLThue1_TraBD;
	private JTextField txt_MaBD1_TraBD;
	private Component txt_TimKiemBD_TraBD;
	private JTextArea txt_GhiChu_TraBD;
	private JTextField txt_TrangThaiBD_TraBD;
	private JComboBox<String> cboQuocGia;
	private JComboBox<String> cboTheLoai; 
	private JComboBox<String> cboNhaCC;
	
	//menuItem Nha cung cap
	private JMenuItem mniTimKiem_NCC, mniDanhSach_NCC,mniCapNhat_NCC;
	
	// menuItem KhachHang
	private JMenuItem mniTimKiem_KH, mniDanhSach_KH,mniCapNhat_KH;
	
	//menuItem Bang Dia
	private JMenuItem mniTimKiem_BD, mniDanhSach_BD,mniCapNhat_BD, mniThueBD, mniTraBD;
	
	//menuItem Thong Ke
	
	private JMenuItem mniTK_KH, mniTK_DoanhThu,mniTK_KHDangThue;
	
	// menuItem Nhan Vien
	private JMenuItem mniThongTin_NV,mniCapNhat_NV;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_Main frame = new GD_Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});      
	}
	
	public GD_Main() {
		setTitle("Quản Lý Băng Đĩa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 700);
		setResizable(false);
		//Menu menubar
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JMenu mnNCC = new JMenu("  Nhà Cung Cấp     ");
		mnNCC.setIcon(new ImageIcon("src/images/supplier.png"));
		mnNCC.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 17));
		mnNCC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnNCC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM); 
	
		mnNCC.add(mniTimKiem_NCC = new JMenuItem(" Tìm Kiếm   "));
		mniTimKiem_NCC.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniTimKiem_NCC.setIcon(new ImageIcon("src/images/seo.png"));
		
		mnNCC.add(mniDanhSach_NCC = new JMenuItem(" Danh Sách "));
		mniDanhSach_NCC.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniDanhSach_NCC.setIcon(new ImageIcon("src/images/check-list.png"));
		
		mnNCC.add(mniCapNhat_NCC = new JMenuItem(" Cập Nhật  "));
		mniCapNhat_NCC.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniCapNhat_NCC.setIcon(new ImageIcon("src/images/refresh.png"));
		
		
		mnNCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(true);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
				
				loadNCC();
			}
		});
		menuBar.add(mnNCC);
		
		JMenu mnKhachHang = new JMenu("  Khách Hàng      ");
		mnKhachHang.setIcon(new ImageIcon("src/images/community.png"));
		mnKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		mnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		
		mnKhachHang.add(mniTimKiem_KH = new JMenuItem("Tìm Kiếm"));
		mniTimKiem_KH.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniTimKiem_KH.setIcon(new ImageIcon("src/images/seo.png"));
			
		mnKhachHang.add(mniDanhSach_KH = new JMenuItem(" Danh Sách "));
		mniDanhSach_KH.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniDanhSach_KH.setIcon(new ImageIcon("src/images/check-list.png"));
		
		mnKhachHang.add(mniCapNhat_KH = new JMenuItem(" Cập Nhật  "));
		mniCapNhat_KH.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniCapNhat_KH.setIcon(new ImageIcon("src/images/refresh.png"));
		
		mnKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(true);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
				
			}
		});
		menuBar.add(mnKhachHang);
		
		JMenu mnNhapBangDia = new JMenu("   Băng Đĩa      ");
		mnNhapBangDia.setIcon(new ImageIcon("src/images/dvd.png"));
		mnNhapBangDia.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 17));
		mnNhapBangDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnNhapBangDia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		

		mnNhapBangDia.add(mniTimKiem_BD = new JMenuItem("Tìm Kiếm"));
		mniTimKiem_BD.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniTimKiem_BD.setIcon(new ImageIcon("src/images/seo.png"));
			
		mnNhapBangDia.add(mniDanhSach_BD = new JMenuItem(" Danh Sách "));
		mniDanhSach_BD.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniDanhSach_BD.setIcon(new ImageIcon("src/images/check-list.png"));
		
		mnNhapBangDia.add(mniCapNhat_BD = new JMenuItem(" Cập Nhật  "));
		mniCapNhat_BD.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniCapNhat_BD.setIcon(new ImageIcon("src/images/refresh.png"));
		
		mnNhapBangDia.add(mniThueBD = new JMenuItem(" Thuê Băng Đĩa "));
		mniThueBD.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniThueBD.setIcon(new ImageIcon("src/images/buy.png"));
		
		mnNhapBangDia.add(mniTraBD = new JMenuItem(" Trả Băng Đĩa  "));
		mniTraBD.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniTraBD.setIcon(new ImageIcon("src/images/pay.png"));
		
		mnNhapBangDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(true);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
			}
		});
		menuBar.add(mnNhapBangDia);
		
/*		JMenuItem mnBangDia = new JMenuItem("       Băng Đĩa      ");
		mnBangDia.setIcon(new ImageIcon("src/images/inTK.png"));
		mnBangDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnBangDia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM); 
		mnBangDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(true);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
			}
		});
		menuBar.add(mnBangDia);
		
		JMenuItem mnThueBangDia = new JMenuItem("Thuê Băng Đĩa");
		mnThueBangDia.setIcon(new ImageIcon("src/images/add-to-cart.png"));
		mnThueBangDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnThueBangDia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);   
		mnThueBangDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(true);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
			}
		});
		menuBar.add(mnThueBangDia);
	
		JMenuItem mnTraBangDia = new JMenuItem("  Trả Băng Đĩa  ");
		mnTraBangDia.setIcon(new ImageIcon("src/images/inTK.png"));
		mnTraBangDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnTraBangDia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);  
		mnTraBangDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(true);
				panel_ThongKe.setVisible(false);
			}
		});
		menuBar.add(mnTraBangDia); */
		
		JMenu mnThongKe = new JMenu("    Thống Kê    ");
		mnThongKe.setIcon(new ImageIcon("src/images/tk.png"));
		mnThongKe.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 17));
		mnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);   
		
		mnThongKe.add(mniTK_DoanhThu = new JMenuItem("Doanh Thu"));
		mniTK_DoanhThu.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniTK_DoanhThu.setIcon(new ImageIcon("src/images/tkdt.png"));
			
		mnThongKe.add(mniTK_KHDangThue = new JMenuItem(" Khách Hàng Đang Thuê"));
		mniTK_KHDangThue.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniTK_KHDangThue.setIcon(new ImageIcon("src/images/khdt.png"));
		
		mnThongKe.add(mniTK_KH = new JMenuItem(" Khách Hàng  "));
		mniTK_KH.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniTK_KH.setIcon(new ImageIcon("src/images/tkkh.png"));
		
		mnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(true);
			}
		});
		menuBar.add(mnThongKe);
		
		JMenu mnNhanVien = new JMenu("Nhân Viên");
		mnNhanVien.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 17));
		mnNhanVien.setIcon(new ImageIcon("src/images/team.png"));
		mnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);  
		
		mnNhanVien.add(mniThongTin_NV = new JMenuItem(" Thông Tin"));
		mniThongTin_NV.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniThongTin_NV.setIcon(new ImageIcon("src/images/check-list.png"));
		
		mnNhanVien.add(mniCapNhat_NV = new JMenuItem(" Cập Nhật  "));
		mniCapNhat_NV.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 14));
		mniCapNhat_NV.setIcon(new ImageIcon("src/images/refresh.png"));
		mnNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(true);
				panel_TraBangDia.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
			}
		});
		menuBar.add(mnNhanVien);
		
		JMenu mnan= new JMenu("                                                                                                ");
		menuBar.add(mnan);
		
		JMenuItem mnDoiMatKhau = new JMenuItem("  Đổi Mật Khẩu  ");
		mnDoiMatKhau.setIcon(new ImageIcon("src/images/user.png"));
		mnDoiMatKhau.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 17));
		mnDoiMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnDoiMatKhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		mnDoiMatKhau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
			}
		});
		menuBar.add(mnDoiMatKhau);
		
		JMenuItem mnDangXuat = new JMenuItem("    Đăng Xuất    ");
		mnDangXuat.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 17));
		mnDangXuat.setIcon(new ImageIcon("src/images/dx.png"));
		mnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM); 
		mnDangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GD_DangNhap frameLogin = new GD_DangNhap();				
				frameLogin.setVisible(true);
				dispose();
			}
		});
		menuBar.add(mnDangXuat);
		
		JMenuItem mnDong = new JMenuItem("   Đóng ");
		mnDong.setIcon(new ImageIcon("src/images/t.png"));
		mnDong.setFont(new Font("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT, 17));
		mnDong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		mnDong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		
		mnDong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		menuBar.add(mnDong);

        getContentPane().setLayout(new CardLayout(0, 0));
        /*------------------------PANEL TRANG CHỦ-----------------------------*/
        panel_TrangChu = new JPanel();
		panel_TrangChu.setBackground(SystemColor.info);
		getContentPane().add(panel_TrangChu);
		panel_TrangChu.setLayout(null);
		
		JLabel lblTrangChu = new JLabel("");
		lblTrangChu.setIcon(new ImageIcon("src/images/ptud1.jpg"));
		lblTrangChu.setBounds(0, 0, 1500, 700);
		panel_TrangChu.add(lblTrangChu);
		setResizable(false);
        /*------------------------PANEL NHÀ CUNG CẤP-----------------------------*/
        panel_NCC = new JPanel();
		getContentPane().add(panel_NCC);
		panel_NCC.setLayout(null);
		
		JLabel lblNCC = new JLabel("NHÀ CUNG CẤP");
		lblNCC.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNCC.setBounds(550, 5, 300, 35);
		lblNCC.setForeground(Color.BLUE);
		panel_NCC.add(lblNCC);
		
		JLabel lbl_MaNCC = new JLabel("Mã nhà cung cấp: ");
		lbl_MaNCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaNCC.setBounds(20, 50, 130, 20);
		panel_NCC.add(lbl_MaNCC);
		
		txt_MaNCC_NCC = new JTextField();
		txt_MaNCC_NCC.setEnabled(false);
		txt_MaNCC_NCC.setBounds(150, 50, 400, 25);
		panel_NCC.add(txt_MaNCC_NCC);
		txt_MaNCC_NCC.setColumns(10);
		
		JLabel lbl_TenNCC = new JLabel("Tên nhà cung cấp: ");
		lbl_TenNCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TenNCC.setBounds(20, 100, 130, 20);
		panel_NCC.add(lbl_TenNCC);
		
		txt_TenNCC_NCC = new JTextField();
		txt_TenNCC_NCC.setBounds(150, 100, 400, 25);
		panel_NCC.add(txt_TenNCC_NCC);
		txt_TenNCC_NCC.setColumns(10);
		
		JLabel lbl_DiaChiNCC = new JLabel("Địa chỉ: ");
		lbl_DiaChiNCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_DiaChiNCC.setBounds(20, 150, 130, 20);
		panel_NCC.add(lbl_DiaChiNCC);
		
		txt_DiaChi_NCC = new JTextField();
		txt_DiaChi_NCC.setBounds(150, 150, 400, 25);
		panel_NCC.add(txt_DiaChi_NCC);
		txt_DiaChi_NCC.setColumns(10);
		
		JLabel lbl_SDTNCC = new JLabel("Số điện thoại: ");
		lbl_SDTNCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_SDTNCC.setBounds(20, 200, 130, 20);
		panel_NCC.add(lbl_SDTNCC);
		
		txt_SDT_NCC = new JTextField();
		txt_SDT_NCC.setBounds(150, 200, 400, 25);
		panel_NCC.add(txt_SDT_NCC);
		txt_SDT_NCC.setColumns(10);
		
		JLabel lbl_EmailNCC = new JLabel("Email: ");
		lbl_EmailNCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_EmailNCC.setBounds(20, 250, 130, 20);
		panel_NCC.add(lbl_EmailNCC);
		
		txt_Email_NCC = new JTextField();
		txt_Email_NCC.setBounds(150, 250, 400, 25);
		panel_NCC.add(txt_Email_NCC);
		txt_Email_NCC.setColumns(10);
		
		JLabel lbl_GhiChuNCC = new JLabel("Ghi chú: ");
		lbl_GhiChuNCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_GhiChuNCC.setBounds(20, 300, 130, 20);
		panel_NCC.add(lbl_GhiChuNCC);
		
		txt_GhiChu_NCC = new JTextArea();
		txt_GhiChu_NCC.setBounds(150, 300, 400, 80);
		panel_NCC.add(txt_GhiChu_NCC);
        
		JButton btn_Them_NCC = new JButton(" Thêm");
		btn_Them_NCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Them_NCC.setIcon(new ImageIcon("src/images/add.png"));
		btn_Them_NCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Them_NCC.setBounds(100, 420, 110, 40);
		panel_NCC.add(btn_Them_NCC);
		
		JButton btn_Sua_NCC = new JButton(" Chỉnh Sửa");
		btn_Sua_NCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Sua_NCC.setIcon(new ImageIcon("src/images/sua.png"));
		btn_Sua_NCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Sua_NCC.setBounds(100, 480, 140, 40);
		panel_NCC.add(btn_Sua_NCC);
		
		JButton btn_Xoa_NCC = new JButton(" Xóa");
		btn_Xoa_NCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Xoa_NCC.setIcon(new ImageIcon("src/images/spam.png"));
		btn_Xoa_NCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Xoa_NCC.setBounds(240, 420, 110, 40);
		panel_NCC.add(btn_Xoa_NCC);
		
		JButton btn_XoaTrang_NCC = new JButton(" Làm Mới");
		btn_XoaTrang_NCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XoaTrang_NCC.setIcon(new ImageIcon("src/images/receipt.png"));
		btn_XoaTrang_NCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_XoaTrang_NCC.setBounds(280, 480, 150, 40);
		panel_NCC.add(btn_XoaTrang_NCC);
		
		JButton btn_Thoat_NCC = new JButton(" Thoát");
		btn_Thoat_NCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_NCC.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_NCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_NhanVien.setVisible(false);
					panel_ThueBangDia.setVisible(false);
					panel_ThongKe.setVisible(false);
					panel_TraBangDia.setVisible(false);
				}
			}
		});
		btn_Thoat_NCC.setBounds(400, 420, 110, 40);
		panel_NCC.add(btn_Thoat_NCC);
		
		JLabel lbl_timkiem_NCC = new JLabel("Tìm kiếm:");
		lbl_timkiem_NCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiem_NCC.setBounds(650, 50, 80, 20);
		panel_NCC.add(lbl_timkiem_NCC);
		
		txt_TimKiem_NCC = new JTextField();
		txt_TimKiem_NCC.setBounds(740, 50, 400, 25);
		panel_NCC.add(txt_TimKiem_NCC);
		txt_TimKiem_NCC.setColumns(10);
		
		JButton btn_TimKiem_NCC = new JButton("Tìm Kiếm");
		btn_TimKiem_NCC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiem_NCC.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiem_NCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiem_NCC.setBounds(1170, 40, 150, 40);
		panel_NCC.add(btn_TimKiem_NCC);
		
		JScrollPane scrollPane_NCC = new JScrollPane();
		scrollPane_NCC.setBounds(650, 100, 680, 470);
		panel_NCC.add(scrollPane_NCC);
		
		
		/*----------------------PANEL KHÁCH HÀNG--------------------------*/
		panel_KhachHang = new JPanel();
		getContentPane().add(panel_KhachHang);
		panel_KhachHang.setLayout(null);
		
		JLabel lblKhachHang = new JLabel("QUẢN LÝ KHÁCH HÀNG");
		lblKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblKhachHang.setBounds(550, 5, 400, 35);
		lblKhachHang.setForeground(Color.BLUE);
		panel_KhachHang.add(lblKhachHang);
		
		int a =20, b =50,c=130, d=20;
		int x= 140, y=50 , h = 400, w =25;
		
		JLabel lbl_TenKH_KH = new JLabel("Tên khách hàng: ");
		lbl_TenKH_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TenKH_KH.setBounds(a, b, c, d);
		panel_KhachHang.add(lbl_TenKH_KH);
		
		txt_TenKH_KhachHang = new JTextField();
		txt_TenKH_KhachHang.setBounds(x, y, h, w);
		panel_KhachHang.add(txt_TenKH_KhachHang);
		txt_TenKH_KhachHang.setColumns(10);
		
		JLabel lbl_SCMND_KH = new JLabel("Số CMND: ");
		lbl_SCMND_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b+=50;
		lbl_SCMND_KH.setBounds(a, b, c, d);
		
		panel_KhachHang.add(lbl_SCMND_KH);
		
		txt_SCMND_KhachHang = new JTextField();
		y+=50;
		txt_SCMND_KhachHang.setBounds(x, y, h, w);
		panel_KhachHang.add(txt_SCMND_KhachHang);
		txt_SCMND_KhachHang.setColumns(10);
		
		JLabel lbl_SDT_KH = new JLabel("Số điện thoại: ");
		lbl_SDT_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b +=50;
		lbl_SDT_KH.setBounds(a, b, c, d);
		panel_KhachHang.add(lbl_SDT_KH);
		
		txt_SDT_KhachHang = new JTextField();
		y+=50;
		txt_SDT_KhachHang.setBounds(x, y, h, w);
		panel_KhachHang.add(txt_SDT_KhachHang);
		txt_SDT_KhachHang.setColumns(10);
		
		JLabel lbl_DiaChi_KH = new JLabel("Địa chỉ: ");
		lbl_DiaChi_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b+=50;
		lbl_DiaChi_KH.setBounds(a, b, c, d);
		panel_KhachHang.add(lbl_DiaChi_KH);
		
		txt_DiaChi_KhachHang= new JTextField();
		y+=50;
		txt_DiaChi_KhachHang.setBounds(x, y, h, w);
		panel_KhachHang.add(txt_DiaChi_KhachHang);
		txt_DiaChi_KhachHang.setColumns(10);
		
		JLabel lbl_Email_KH = new JLabel("Email: ");
		lbl_Email_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b+=50;
		lbl_Email_KH.setBounds(a, b, c, d);
		panel_KhachHang.add(lbl_Email_KH);
		
		txt_Email_KhachHang= new JTextField();
		y+=50;
		txt_Email_KhachHang.setBounds(x, y, h, w);
		panel_KhachHang.add(txt_Email_KhachHang);
		txt_Email_KhachHang.setColumns(10);
		
		JLabel lbl_GhiChu_KH = new JLabel("Ghi chú: ");
		lbl_GhiChu_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b+=50;
		lbl_GhiChu_KH.setBounds(a, b, c, d);
		panel_KhachHang.add(lbl_GhiChu_KH);
		
		txt_GhiChu_KhachHang = new JTextArea();
		y+=50;
		txt_GhiChu_KhachHang.setBounds(x, y, h, 80);
		panel_KhachHang.add(txt_GhiChu_KhachHang);
        
		JButton btn_Them_KH = new JButton(" Thêm");
		btn_Them_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Them_KH.setIcon(new ImageIcon("src/images/add.png"));
		btn_Them_KH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Them_KH.setBounds(140, 400, 150, 40);	
		panel_KhachHang.add(btn_Them_KH);
		
		JButton btn_Sua_KH = new JButton(" Chỉnh Sửa");
		btn_Sua_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Sua_KH.setIcon(new ImageIcon("src/images/sua.png"));
		btn_Sua_KH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Sua_KH.setBounds(140, 460, 150, 40);	
		panel_KhachHang.add(btn_Sua_KH);
		
		JButton btn_Xoa_KH = new JButton(" Xóa");
		btn_Xoa_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Xoa_KH.setIcon(new ImageIcon("src/images/spam.png"));
		btn_Xoa_KH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Xoa_KH.setBounds(310, 400, 150, 40);
		panel_KhachHang.add(btn_Xoa_KH);
		
		JButton btn_XoaTrang_KH = new JButton(" Làm Mới");
		btn_XoaTrang_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XoaTrang_KH.setIcon(new ImageIcon("src/images/receipt.png"));
		btn_XoaTrang_KH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_XoaTrang_KH.setBounds(310, 460, 150, 40);
		panel_KhachHang.add(btn_XoaTrang_KH);
		
		JButton btn_Thoat_KH= new JButton(" Thoát");
		btn_Thoat_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_KH.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_KH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_NhanVien.setVisible(false);
					panel_ThueBangDia.setVisible(false);
					panel_TraBangDia.setVisible(false);
					panel_ThongKe.setVisible(false);
				}
			}
		});
		btn_Thoat_KH.setBounds(190, 620, 150, 40);
		panel_KhachHang.add(btn_Thoat_KH);
		
		
		JLabel lbl_Bang_KH = new JLabel("Danh Sách Khách Hàng");
		lbl_Bang_KH.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_Bang_KH.setBounds(870, 50, 300, 25);
		panel_KhachHang.add(lbl_Bang_KH);
		
		JLabel lbl_timkiem_KH = new JLabel("Tìm kiếm:");
		lbl_timkiem_KH.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiem_KH.setBounds(650, 90, 80, 20);
		panel_KhachHang.add(lbl_timkiem_KH);
		
		txt_TimKiem_KhachHang = new JTextField();
		txt_TimKiem_KhachHang.setBounds(740, 90, 400, 25);
		panel_KhachHang.add(txt_TimKiem_KhachHang);
		txt_TimKiem_KhachHang.setColumns(10);
		
		JButton btn_TimKiem_KhachHang = new JButton("Tìm Kiếm");
		btn_TimKiem_KhachHang.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiem_KhachHang.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiem_KhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiem_KhachHang.setBounds(1170, 80, 150, 40);
		panel_KhachHang.add(btn_TimKiem_KhachHang);
		
		JScrollPane scrollPane_KhachHang = new JScrollPane();
		scrollPane_KhachHang.setBounds(650, 125, 690, 400);
		panel_KhachHang.add(scrollPane_KhachHang);
		
		JButton btn_ThueBD_KhachHang = new JButton("Thuê Băng Đĩa");
		btn_ThueBD_KhachHang.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_ThueBD_KhachHang.setIcon(new ImageIcon("src/images/searching.png"));
		btn_ThueBD_KhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_ThueBangDia.setVisible(true);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
			}
		});
		btn_ThueBD_KhachHang.setBounds(1000, 900, 150, 40);
		panel_KhachHang.add(btn_ThueBD_KhachHang);
		
		/*----------------------PANEL NHẬP BĂNG ĐĨA--------------------------*/
		panel_NhapBangDia = new JPanel();
		getContentPane().add(panel_NhapBangDia);
		panel_NhapBangDia.setLayout(null);
		
		JLabel lblNhapBangDia = new JLabel("NHẬP BĂNG ĐĨA");
		lblNhapBangDia.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNhapBangDia.setBounds(550, 5, 300, 35);
		lblNhapBangDia.setForeground(Color.BLUE);
		panel_NhapBangDia.add(lblNhapBangDia);
		int a1 =20, b1=50,c1=130, d1=20;
		int x1= 140, y1=50 , h1 = 400, w1 =25;
		
		JLabel lbl_TenBD = new JLabel("Tên Băng Đĩa: ");
		lbl_TenBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TenBD.setBounds(a1, b1, c1, d1);
		panel_NhapBangDia.add(lbl_TenBD);
		
		txt_TenBD_NhapBD = new JTextField();
		txt_TenBD_NhapBD.setBounds(x1, y1, h1, w1);
		panel_NhapBangDia.add(txt_TenBD_NhapBD);
		txt_TenBD_NhapBD.setColumns(10);
		
		JLabel lbl_MaTL = new JLabel("Mã Thể Loại: ");
		lbl_MaTL.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1+=50;
		lbl_MaTL.setBounds(a1, b1, c1, d1);
		panel_NhapBangDia.add(lbl_MaTL);
		
		cboTheLoai = new JComboBox<String>();
		y1+=50;
		cboTheLoai.setBounds(x1, y1, h1, w1);
		panel_NhapBangDia.add(cboTheLoai);
	
		
		JLabel lbl_MaNCC_NhapBD = new JLabel("Mã NCC: ");
		lbl_MaNCC_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1+=50;
		lbl_MaNCC_NhapBD.setBounds(a1, b1, c1, d1);
		panel_NhapBangDia.add(lbl_MaNCC_NhapBD);
		
		cboNhaCC = new JComboBox<String>();
		y1+=50;
		cboNhaCC.setBounds(x1, y1, h1, w1);
		panel_NhapBangDia.add(cboNhaCC);
		
		
		JLabel lbl_SoLuong = new JLabel("Số Lượng: ");
		lbl_SoLuong.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1+=50;
		lbl_SoLuong.setBounds(a1, b1, c1, d1);
		panel_NhapBangDia.add(lbl_SoLuong);
		
		txt_SoLuong_NhapBD= new JTextField();
		y1+=50;
		txt_SoLuong_NhapBD.setBounds(x1, y1, h1, w1);
		panel_NhapBangDia.add(txt_SoLuong_NhapBD);
		txt_SoLuong_NhapBD.setColumns(10);
		
		JLabel lbl_DonGia_NhapBD = new JLabel("Đơn giá: ");
		lbl_DonGia_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1+=50;
		lbl_DonGia_NhapBD.setBounds(a1, b1, c1, d1);
		panel_NhapBangDia.add(lbl_DonGia_NhapBD);
		
		txt_DonGia_NhapBD= new JTextField();
		y1+=50;
		txt_DonGia_NhapBD.setBounds(x1, y1, h1, w1);
		panel_NhapBangDia.add(txt_DonGia_NhapBD);
		txt_DonGia_NhapBD.setColumns(10);
		
		
		JLabel lbl_QuocGia_NhapBD = new JLabel("Quốc gia: ");
		lbl_QuocGia_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1+=50;
		lbl_QuocGia_NhapBD.setBounds(a1, b1, c1, d1);
		panel_NhapBangDia.add(lbl_QuocGia_NhapBD);
		
		cboQuocGia= new JComboBox<String>();
		y1+=50;
		cboQuocGia.setBounds(x1, y1, h1, w1);
		panel_NhapBangDia.add(cboQuocGia);
		
		
		JLabel lbl_GhiChu_NhapBD = new JLabel("Ghi chú: ");
		lbl_GhiChu_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1+=50;
		lbl_GhiChu_NhapBD.setBounds(a1, b1, c1, d1);
		panel_NhapBangDia.add(lbl_GhiChu_NhapBD);
		
		txt_GhiChu_NhapBD = new JTextArea();
		y1+=50;
		txt_GhiChu_NhapBD.setBounds(x1, y1, h1, 80);
		panel_NhapBangDia.add(txt_GhiChu_NhapBD);
        
		JButton btn_Them_NhapBD = new JButton(" Nhập");
		btn_Them_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Them_NhapBD.setIcon(new ImageIcon("src/images/add.png"));
		btn_Them_NhapBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Them_NhapBD.setBounds(140, 480, 130, 40);	
		panel_NhapBangDia.add(btn_Them_NhapBD);
		
		
		
		JButton btn_XoaTrang_NhapBD = new JButton(" Làm Mới");
		btn_XoaTrang_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XoaTrang_NhapBD.setIcon(new ImageIcon("src/images/receipt.png"));
		btn_XoaTrang_NhapBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_XoaTrang_NhapBD.setBounds(320, 480, 150, 40);
		panel_NhapBangDia.add(btn_XoaTrang_NhapBD);
		
		JButton btn_Thoat_NhapBD = new JButton(" Thoát");
		btn_Thoat_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_NhapBD.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_NhapBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_ThueBangDia.setVisible(false);
					panel_TraBangDia.setVisible(false);
					panel_ThongKe.setVisible(false);
				}
			}
		});
		btn_Thoat_NhapBD.setBounds(240, 550, 130, 40);
		panel_NhapBangDia.add(btn_Thoat_NhapBD);
		
		
		JLabel lbl_Bang_NhapBD = new JLabel("Danh Sách Nhà Cung Cấp");
		lbl_Bang_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_Bang_NhapBD.setBounds(810, 50, 300, 25);
		panel_NhapBangDia.add(lbl_Bang_NhapBD);
		
		JLabel lbl_timkiem_NhapBD = new JLabel("Tìm kiếm:");
		lbl_timkiem_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiem_NhapBD.setBounds(650, 90, 80, 20);
		panel_NhapBangDia.add(lbl_timkiem_NhapBD);
		
		txt_TimKiem_NhapBD = new JTextField();
		txt_TimKiem_NhapBD.setBounds(740, 90, 400, 25);
		panel_NhapBangDia.add(txt_TimKiem_NhapBD);
		txt_TimKiem_NhapBD.setColumns(10);
		
		JButton btn_TimKiem_NhapBD = new JButton("Tìm Kiếm");
		btn_TimKiem_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiem_NhapBD.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiem_NhapBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiem_NhapBD.setBounds(1170, 80, 130, 30);
		panel_NhapBangDia.add(btn_TimKiem_NhapBD);
		
		JScrollPane scrollPane_NhapBangDia = new JScrollPane();
		scrollPane_NhapBangDia.setBounds(650, 125, 690, 180);
		panel_NhapBangDia.add(scrollPane_NhapBangDia);
		
		
		JLabel lbl_TheLoai_NhapBD = new JLabel("Danh Sách Thể Loại Băng Đĩa");
		lbl_TheLoai_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_TheLoai_NhapBD.setBounds(810, 330, 300, 25);
		panel_NhapBangDia.add(lbl_TheLoai_NhapBD);
		
		JLabel lbl_timkiembd_NhapBD = new JLabel("Tìm kiếm:");
		lbl_timkiembd_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiembd_NhapBD.setBounds(650, 370, 80, 20);
		panel_NhapBangDia.add(lbl_timkiembd_NhapBD);
		
		txt_TimKiemBD_NhapBD = new JTextField();
		txt_TimKiemBD_NhapBD.setBounds(740, 370, 400, 25);
		panel_NhapBangDia.add(txt_TimKiemBD_NhapBD);
		txt_TimKiemBD_NhapBD.setColumns(10);
		
		JButton btn_TimKiemBD_NhapBD = new JButton("Tìm Kiếm");
		btn_TimKiemBD_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiemBD_NhapBD.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiemBD_NhapBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiemBD_NhapBD.setBounds(1170, 370, 130, 30);
		panel_NhapBangDia.add(btn_TimKiemBD_NhapBD);
		
		JScrollPane scrollPane_TheLoaiBangDia = new JScrollPane();
		scrollPane_TheLoaiBangDia.setBounds(650, 405, 690, 180);
		panel_NhapBangDia.add(scrollPane_TheLoaiBangDia);
		
		
		/*----------------------PANEL BĂNG ĐĨA--------------------------*/
		panel_BangDia = new JPanel();
		getContentPane().add(panel_BangDia);
		panel_BangDia.setLayout(null);
		
		JLabel lblBangDia = new JLabel("NHẬP BĂNG ĐĨA");
		lblBangDia.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblBangDia.setBounds(550, 5, 300, 35);
		lblBangDia.setForeground(Color.BLUE);
		panel_BangDia.add(lblBangDia);
		
		JLabel lbl_MaBD_BD = new JLabel("Mã băng đĩa: ");
		lbl_MaBD_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaBD_BD.setBounds(20, 50, 130, 20);
		panel_BangDia.add(lbl_MaBD_BD);
		
		txt_MaBD_BangDia = new JTextField();
		txt_MaBD_BangDia.setEnabled(false);
		txt_MaBD_BangDia.setBounds(170, 50, 400, 25);
		panel_BangDia.add(txt_MaBD_BangDia);
		txt_MaBD_BangDia.setColumns(10);
		
		JLabel lbl_TenBD_BD = new JLabel("Tên Băng Đĩa: ");
		lbl_TenBD_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TenBD_BD.setBounds(20, 90, 130, 20);
		panel_BangDia.add(lbl_TenBD_BD);
		
		txt_TenBD_BangDia = new JTextField();
		txt_TenBD_BangDia.setBounds(170, 90, 400, 25);
		panel_BangDia.add(txt_TenBD_BangDia);
		txt_TenBD_BangDia.setColumns(10);
		
		JLabel lbl_MaTL_BD = new JLabel("Mã Thể Loại: ");
		lbl_MaTL_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaTL_BD.setBounds(20, 130, 130, 20);
		panel_BangDia.add(lbl_MaTL_BD);
		
		txt_MaTL_BangDia = new JTextField();
		txt_MaTL_BangDia.setBounds(170, 130, 400, 25);
		panel_BangDia.add(txt_MaTL_BangDia);
		txt_MaTL_BangDia.setColumns(10);
		
		JLabel lbl_MaNCC_BD = new JLabel("Mã NCC: ");
		lbl_MaNCC_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaNCC_BD.setBounds(20, 170, 130, 20);
		panel_BangDia.add(lbl_MaNCC_BD);
		
		txt_MaNCC_BangDia = new JTextField();
		txt_MaNCC_BangDia.setBounds(170, 170, 400, 25);
		panel_BangDia.add(txt_MaNCC_BangDia);
		txt_MaNCC_BangDia.setColumns(10);
		
		JLabel lbl_XuatXu_BD = new JLabel("Xuất Xứ: ");
		lbl_XuatXu_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_XuatXu_BD.setBounds(20, 210, 130, 20);
		panel_BangDia.add(lbl_XuatXu_BD);
		
		txt_XuatXu_BangDia = new JTextField();
		txt_XuatXu_BangDia.setBounds(170, 210, 400, 25);
		panel_BangDia.add(txt_XuatXu_BangDia);
		txt_XuatXu_BangDia.setColumns(10);
		
		JLabel lbl_SoLuong_BD = new JLabel("Số Lượng: ");
		lbl_SoLuong_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_SoLuong_BD.setBounds(20, 250, 130, 20);
		panel_BangDia.add(lbl_SoLuong_BD);
		
		txt_SoLuong_BangDia = new JTextField();
		txt_SoLuong_BangDia.setBounds(170, 250, 400, 25);
		panel_BangDia.add(txt_SoLuong_BangDia);
		txt_SoLuong_BangDia.setColumns(10);
		
		JLabel lbl_SLDangThue_BD = new JLabel("Số Lượng Đang Thuê: ");
		lbl_SLDangThue_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_SLDangThue_BD.setBounds(20, 290, 170, 20);
		panel_BangDia.add(lbl_SLDangThue_BD);
		
		txt_SoLuongThue_BangDia = new JTextField();
		txt_SoLuongThue_BangDia.setBounds(170, 290, 400, 25);
		panel_BangDia.add(txt_SoLuongThue_BangDia);
		txt_SoLuongThue_BangDia.setColumns(10);
		
		JLabel lbl_SoLuongHH_BD = new JLabel("Số Lượng Hư Hỏng: ");
		lbl_SoLuongHH_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_SoLuongHH_BD.setBounds(20, 330, 150, 20);
		panel_BangDia.add(lbl_SoLuongHH_BD);
		
		txt_SoLuongHuHong_BangDia = new JTextField();
		txt_SoLuongHuHong_BangDia.setBounds(170, 330, 400, 25);
		panel_BangDia.add(txt_SoLuongHuHong_BangDia);
		txt_SoLuongHuHong_BangDia.setColumns(10);
			
		JLabel lbl_DonGia_BD = new JLabel("Đơn giá: ");
		lbl_DonGia_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_DonGia_BD.setBounds(20, 370, 130, 20);
		panel_BangDia.add(lbl_DonGia_BD);
		
		txt_DonGia_BangDia = new JTextField();
		txt_DonGia_BangDia.setBounds(170, 370, 400, 25);
		panel_BangDia.add(txt_DonGia_BangDia);
		txt_DonGia_BangDia.setColumns(10);
	
		JLabel lbl_GhiChu_BD = new JLabel("Ghi chú: ");
		lbl_GhiChu_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_GhiChu_BD.setBounds(20, 410, 130, 20);
		panel_BangDia.add(lbl_GhiChu_BD);
		
		txt_GhiChu_BangDia = new JTextArea();
		txt_GhiChu_BangDia.setBounds(170, 410, 400, 80);
		panel_BangDia.add(txt_GhiChu_BangDia);
        
		JButton btn_Sua_BD = new JButton(" Chỉnh Sửa");
		btn_Sua_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Sua_BD.setIcon(new ImageIcon("src/images/sua.png"));
		btn_Sua_BD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Sua_BD.setBounds(40, 530, 150, 40);	
		panel_BangDia.add(btn_Sua_BD);
		
		JButton btn_Xoa_BD = new JButton(" Xóa");
		btn_Xoa_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Xoa_BD.setIcon(new ImageIcon("src/images/spam.png"));
		btn_Xoa_BD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Xoa_BD.setBounds(220, 530, 150, 40);	
		panel_BangDia.add(btn_Xoa_BD);
		
		JButton btn_XoaTrang_BD = new JButton(" Làm Mới");
		btn_XoaTrang_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XoaTrang_BD.setIcon(new ImageIcon("src/images/receipt.png"));
		btn_XoaTrang_BD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_XoaTrang_BD.setBounds(400, 530, 150, 40);
		panel_BangDia.add(btn_XoaTrang_BD);
		
		JButton btn_Thoat_BD = new JButton(" Thoát");
		btn_Thoat_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_BD.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_BD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_NhanVien.setVisible(false);
					panel_ThueBangDia.setVisible(false);
					panel_TraBangDia.setVisible(false);
					panel_ThongKe.setVisible(false);
				}
			}
		});
		btn_Thoat_BD.setBounds(200, 600, 190, 40);
		panel_BangDia.add(btn_Thoat_BD);
		
		JLabel lbl_BangBD_BD = new JLabel("Danh Sách Băng Đĩa");
		lbl_BangBD_BD.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_BangBD_BD.setBounds(870, 50, 300, 25);
		panel_BangDia.add(lbl_BangBD_BD);
		
		JLabel lbl_timkiem_BD = new JLabel("Tìm kiếm:");
		lbl_timkiem_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiem_BD.setBounds(650, 90, 80, 20);
		panel_BangDia.add(lbl_timkiem_BD);
		
		txt_TimKiem_BangDia = new JTextField();
		txt_TimKiem_BangDia.setBounds(740, 90, 400, 25);
		panel_BangDia.add(txt_TimKiem_BangDia);
		txt_TimKiem_BangDia.setColumns(10);
		
		JButton btn_TimKiem_BD = new JButton("Tìm Kiếm");
		btn_TimKiem_BD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiem_BD.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiem_BD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiem_BD.setBounds(1170, 80, 150, 40);
		panel_BangDia.add(btn_TimKiem_BD);
		
		JScrollPane scrollPane_BangDia = new JScrollPane();
		scrollPane_BangDia.setBounds(650, 125, 690, 450);
		panel_BangDia.add(scrollPane_BangDia);
		
		/*----------------------PANEL NHÂN VIÊN--------------------------*/
		panel_NhanVien = new JPanel();
		getContentPane().add(panel_NhanVien);
		panel_NhanVien.setLayout(null);
		
		JLabel lblNhanVien = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNhanVien.setBounds(550, 5, 400, 35);
		lblNhanVien.setForeground(Color.BLUE);
		panel_NhanVien.add(lblNhanVien);
		
		JLabel lbl_MaNV_NV = new JLabel("Mã nhân viên: ");
		lbl_MaNV_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaNV_NV.setBounds(20, 50, 130, 20);
		panel_NhanVien.add(lbl_MaNV_NV);
		
		txt_MaNV_NV = new JTextField();
		txt_MaNV_NV.setEnabled(false);
		txt_MaNV_NV.setBounds(140, 50, 400, 25);
		panel_NhanVien.add(txt_MaNV_NV);
		txt_MaNV_NV.setColumns(10);
		
		JLabel lbl_TenNV_NV = new JLabel("Tên Nhân Viên: ");
		lbl_TenNV_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TenNV_NV.setBounds(20, 90, 130, 20);
		panel_NhanVien.add(lbl_TenNV_NV);
		
		txt_TenNV_NV = new JTextField();
		txt_TenNV_NV.setBounds(140, 90, 400, 25);
		panel_NhanVien.add(txt_TenNV_NV);
		txt_TenNV_NV.setColumns(10);
		
		JLabel lbl_SDT_NV = new JLabel("Số Điện Thoại: ");
		lbl_SDT_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_SDT_NV.setBounds(20, 130, 130, 20);
		panel_NhanVien.add(lbl_SDT_NV);
		
		txt_SDT_NV = new JTextField();
		txt_SDT_NV.setBounds(140, 130, 400, 25);
		panel_NhanVien.add(txt_SDT_NV);
		txt_SDT_NV.setColumns(10);
		
		JLabel lbl_Email_NV= new JLabel("Email: ");
		lbl_Email_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Email_NV.setBounds(20, 170, 130, 20);
		panel_NhanVien.add(lbl_Email_NV);
		
		txt_Email_NV = new JTextField();
		txt_Email_NV.setBounds(140, 170, 400, 25);
		panel_NhanVien.add(txt_Email_NV);
		txt_Email_NV.setColumns(10);
		
		JLabel lbl_DiaChi_NV = new JLabel("Địa Chỉ: ");
		lbl_DiaChi_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_DiaChi_NV.setBounds(20, 210, 130, 20);
		panel_NhanVien.add(lbl_DiaChi_NV);
		
		txt_DiaChi_NV = new JTextField();
		txt_DiaChi_NV.setBounds(140, 210, 400, 25);
		panel_NhanVien.add(txt_DiaChi_NV);
		txt_DiaChi_NV.setColumns(10);
		
		JLabel lbl_GioiTinh_NV = new JLabel("Giới Tính: ");
		lbl_GioiTinh_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_GioiTinh_NV.setBounds(20, 250, 130, 20);
		panel_NhanVien.add(lbl_GioiTinh_NV);
		
		txt_GioiTinh_NV = new JComboBox();
		txt_GioiTinh_NV.setBounds(140, 250, 400, 25);
		panel_NhanVien.add(txt_GioiTinh_NV);
		
		JLabel lbl_TenTK_NV = new JLabel("Tên Tài Khoản: ");
		lbl_TenTK_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TenTK_NV.setBounds(20, 290, 170, 20);
		panel_NhanVien.add(lbl_TenTK_NV);
		
		txt_TenTK_NV = new JTextField();
		txt_TenTK_NV.setBounds(140, 290, 400, 25);
		panel_NhanVien.add(txt_TenTK_NV);
		txt_TenTK_NV.setColumns(10);
		
		JLabel lbl_MatKhau_NV = new JLabel("Mật Khẩu: ");
		lbl_MatKhau_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MatKhau_NV.setBounds(20, 330, 150, 20);
		panel_NhanVien.add(lbl_MatKhau_NV);
		
		txt_MatKhau_NV = new JTextField();
		txt_MatKhau_NV.setBounds(140, 330, 400, 25);
		panel_NhanVien.add(txt_MatKhau_NV);
		txt_MatKhau_NV.setColumns(10);
	
		JLabel lbl_GhiChu_NV = new JLabel("Ghi chú: ");
		lbl_GhiChu_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_GhiChu_NV.setBounds(20, 370, 130, 20);
		panel_NhanVien.add(lbl_GhiChu_NV);
		
		txt_GhiChu_NV = new JTextArea();
		txt_GhiChu_NV.setBounds(140, 370, 400, 80);
		panel_NhanVien.add(txt_GhiChu_NV);
        
		JButton btn_Them_NV = new JButton(" Thêm");
		btn_Them_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Them_NV.setIcon(new ImageIcon("src/images/add.png"));
		btn_Them_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Them_NV.setBounds(100, 480, 150, 40);
		panel_NhanVien.add(btn_Them_NV);
		
		JButton btn_Sua_NV = new JButton(" Chỉnh Sửa");
		btn_Sua_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Sua_NV.setIcon(new ImageIcon("src/images/sua.png"));
		btn_Sua_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Sua_NV.setBounds(100, 530, 150, 40);
		panel_NhanVien.add(btn_Sua_NV);
		
		JButton btn_Xoa_NV = new JButton(" Xóa");
		btn_Xoa_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Xoa_NV.setIcon(new ImageIcon("src/images/spam.png"));
		btn_Xoa_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Xoa_NV.setBounds(280, 480, 150, 40);
		panel_NhanVien.add(btn_Xoa_NV);
		
		JButton btn_XoaTrang_NV = new JButton(" Làm Mới");
		btn_XoaTrang_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XoaTrang_NV.setIcon(new ImageIcon("src/images/receipt.png"));
		btn_XoaTrang_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_XoaTrang_NV.setBounds(280, 530, 150, 40);
		panel_NhanVien.add(btn_XoaTrang_NV);
		
		JButton btn_Thoat_NV = new JButton(" Thoát");
		btn_Thoat_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_NV.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_NhanVien.setVisible(false);
					panel_ThueBangDia.setVisible(false);
					panel_TraBangDia.setVisible(false);
					panel_ThongKe.setVisible(false);
				}
			}
		});
		btn_Thoat_NV.setBounds(200, 590, 150, 40);
		panel_NhanVien.add(btn_Thoat_NV);
		
		JLabel lbl_BangNV_NV = new JLabel("Danh Sách Nhân Viên");
		lbl_BangNV_NV.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_BangNV_NV.setBounds(870, 50, 300, 25);
		panel_NhanVien.add(lbl_BangNV_NV);
		
		JLabel lbl_timkiem_NV = new JLabel("Tìm kiếm:");
		lbl_timkiem_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiem_NV.setBounds(650, 90, 80, 20);
		panel_NhanVien.add(lbl_timkiem_NV);
		
		txt_TimKiem_NV = new JTextField();
		txt_TimKiem_NV.setBounds(740, 90, 400, 25);
		panel_NhanVien.add(txt_TimKiem_NV);
		txt_TimKiem_NV.setColumns(10);
		
		JButton btn_TimKiem_NV = new JButton("Tìm Kiếm");
		btn_TimKiem_NV.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiem_NV.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiem_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiem_NV.setBounds(1170, 80, 150, 40);
		panel_NhanVien.add(btn_TimKiem_NV);
		
		JScrollPane scrollPane_NhanVien = new JScrollPane();
		scrollPane_NhanVien.setBounds(650, 125, 800, 500);
		panel_NhanVien.add(scrollPane_NhanVien);
		
		/*----------------------PANEL NHẬP BĂNG ĐĨA--------------------------*/
		panel_ThueBangDia = new JPanel();
		getContentPane().add(panel_ThueBangDia);
		panel_ThueBangDia.setLayout(null);
		
		JLabel lblThueBangDia = new JLabel("THUÊ BĂNG ĐĨA");
		lblThueBangDia.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblThueBangDia.setBounds(550, 5, 300, 35);
		lblThueBangDia.setForeground(Color.BLUE);
		panel_ThueBangDia.add(lblThueBangDia);
		
		JLabel lbl_MaPhieuThue = new JLabel("Mã Phiếu Thuê: ");
		lbl_MaPhieuThue.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaPhieuThue.setBounds(20, 50, 130, 20);
		panel_ThueBangDia.add(lbl_MaPhieuThue);
		
		txt_MaPhieuThue_ThueBD = new JTextField();
		txt_MaPhieuThue_ThueBD.setEnabled(false);
		txt_MaPhieuThue_ThueBD.setBounds(140, 50, 460, 25);
		panel_ThueBangDia.add(txt_MaPhieuThue_ThueBD);
		txt_MaPhieuThue_ThueBD.setColumns(10);
		
		JLabel lbl_MaKH_ThueBD = new JLabel("Mã Khách Hàng: ");
		lbl_MaKH_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaKH_ThueBD.setBounds(20, 90, 130, 20);
		panel_ThueBangDia.add(lbl_MaKH_ThueBD);
		
		txt_MaKH_ThueBD = new JTextField();
		txt_MaKH_ThueBD.setBounds(140, 90, 300, 25);
		panel_ThueBangDia.add(txt_MaKH_ThueBD);
		txt_MaKH_ThueBD.setColumns(10);
		
		JButton btn_MaKH_ThueBD = new JButton("Khách Hàng");
		btn_MaKH_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_MaKH_ThueBD.setIcon(new ImageIcon("src/images/employees.png"));
		btn_MaKH_ThueBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(true);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(false);
				panel_ThongKe.setVisible(false);
			}
		});
		btn_MaKH_ThueBD.setBounds(450, 80, 150, 40);
		panel_ThueBangDia.add(btn_MaKH_ThueBD);
		
		JLabel lbl_MaNV_ThueBD = new JLabel("Mã Nhân Viên: ");
		lbl_MaNV_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaNV_ThueBD.setBounds(20, 130, 130, 20);
		panel_ThueBangDia.add(lbl_MaNV_ThueBD);
		
		txt_MaNV_ThueBD = new JTextField();
		txt_MaNV_ThueBD.setBounds(140, 130, 460, 25);
		panel_ThueBangDia.add(txt_MaNV_ThueBD);
		txt_MaNV_ThueBD.setColumns(10);
		
		JLabel lbl_MaBD_ThueBD = new JLabel("Mã Băng Đĩa");
		lbl_MaBD_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaBD_ThueBD.setBounds(220, 170, 120, 20);
		panel_ThueBangDia.add(lbl_MaBD_ThueBD);
		
		JLabel lbl_SoLuong_ThueBD = new JLabel("Số Lượng");
		lbl_SoLuong_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_SoLuong_ThueBD.setBounds(470, 170, 120, 20);
		panel_ThueBangDia.add(lbl_SoLuong_ThueBD);
		
		txt_MaBD1_ThueBD = new JTextField();
		txt_MaBD1_ThueBD.setBounds(140, 190, 250, 25);
		panel_ThueBangDia.add(txt_MaBD1_ThueBD);
		txt_MaBD1_ThueBD.setColumns(10);
		
		txt_SoLuongLThue1_ThueBD = new JTextField();
		txt_SoLuongLThue1_ThueBD.setBounds(400, 190, 200, 25);
		panel_ThueBangDia.add(txt_SoLuongLThue1_ThueBD);
		txt_SoLuongLThue1_ThueBD.setColumns(10);
		
		txt_MaBD2_ThueBD = new JTextField();
		txt_MaBD2_ThueBD.setBounds(140, 220, 250, 25);
		panel_ThueBangDia.add(txt_MaBD2_ThueBD);
		txt_MaBD2_ThueBD.setColumns(10);
		
		txt_SoLuongLThue2_ThueBD = new JTextField();
		txt_SoLuongLThue2_ThueBD.setBounds(400, 220, 200, 25);
		panel_ThueBangDia.add(txt_SoLuongLThue2_ThueBD);
		txt_SoLuongLThue2_ThueBD.setColumns(10);
		
		txt_MaBD3_ThueBD = new JTextField();
		txt_MaBD3_ThueBD.setBounds(140, 250, 250, 25);
		panel_ThueBangDia.add(txt_MaBD3_ThueBD);
		txt_MaBD3_ThueBD.setColumns(10);
		
		txt_SoLuongLThue3_ThueBD = new JTextField();
		txt_SoLuongLThue3_ThueBD.setBounds(400, 250, 200, 25);
		panel_ThueBangDia.add(txt_SoLuongLThue3_ThueBD);
		txt_SoLuongLThue3_ThueBD.setColumns(10);
		
		txt_MaBD4_ThueBD = new JTextField();
		txt_MaBD4_ThueBD.setBounds(140, 280, 250, 25);
		panel_ThueBangDia.add(txt_MaBD4_ThueBD);
		txt_MaBD4_ThueBD.setColumns(10);
		
		txt_SoLuongLThue4_ThueBD = new JTextField();
		txt_SoLuongLThue4_ThueBD.setBounds(400, 280, 200, 25);
		panel_ThueBangDia.add(txt_SoLuongLThue4_ThueBD);
		txt_SoLuongLThue4_ThueBD.setColumns(10);
		
		txt_MaBD5_ThueBD = new JTextField();
		txt_MaBD5_ThueBD.setBounds(140, 310, 250, 25);
		panel_ThueBangDia.add(txt_MaBD5_ThueBD);
		txt_MaBD5_ThueBD.setColumns(10);
		
		txt_SoLuongLThue5_ThueBD = new JTextField();
		txt_SoLuongLThue5_ThueBD.setBounds(400, 310, 200, 25);
		panel_ThueBangDia.add(txt_SoLuongLThue5_ThueBD);
		txt_SoLuongLThue5_ThueBD.setColumns(10);
		
		JLabel lbl_NgayThue = new JLabel("Ngày Thuê: ");
		lbl_NgayThue.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_NgayThue.setBounds(20, 350, 130, 20);
		panel_ThueBangDia.add(lbl_NgayThue);
		
		txt_NgayThue_ThueBD = new JDateChooser();
		txt_NgayThue_ThueBD.setDateFormatString("yyyy - MM - dd");
		txt_NgayThue_ThueBD.setBounds(140, 350, 460, 25);
		panel_ThueBangDia.add(txt_NgayThue_ThueBD);

		
//		JLabel lbl_Coc_ThueBD = new JLabel("Tiền Cọc: ");
//		lbl_Coc_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
//		lbl_Coc_ThueBD.setBounds(20, 390, 130, 20);
//		panel_ThueBangDia.add(lbl_Coc_ThueBD);
//		
//		txt_TienCoc_ThueBD = new JTextField();
//		txt_TienCoc_ThueBD.setBounds(140, 390, 460, 25);
//		panel_ThueBangDia.add(txt_TienCoc_ThueBD);
//		txt_TienCoc_ThueBD.setColumns(10);
		
		
		JLabel lbl_TrangThai_ThueBD = new JLabel("Trạng Thái: ");
		lbl_TrangThai_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TrangThai_ThueBD.setBounds(20, 390, 130, 20);
		panel_ThueBangDia.add(lbl_TrangThai_ThueBD);
		
		txt_TrangThaiBD_ThueBD= new JTextField();
		txt_TrangThaiBD_ThueBD.setBounds(140, 390, 460, 25);
		panel_ThueBangDia.add(txt_TrangThaiBD_ThueBD);
		txt_TrangThaiBD_ThueBD.setColumns(10);
		
		JLabel lbl_GhiChu_ThueBD = new JLabel("Ghi chú: ");
		lbl_GhiChu_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_GhiChu_ThueBD.setBounds(20, 430, 130, 20);
		panel_ThueBangDia.add(lbl_GhiChu_ThueBD);
		
		txt_GhiChu_ThueBD = new JTextArea();
		txt_GhiChu_ThueBD.setBounds(140, 430, 460, 80);
		panel_ThueBangDia.add(txt_GhiChu_ThueBD);
        
		JButton btn_Thue_ThueBD = new JButton(" Đặt Thuê");
		btn_Thue_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thue_ThueBD.setIcon(new ImageIcon("src/images/add.png"));
		btn_Thue_ThueBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Thue_ThueBD.setBounds(100, 570, 150, 40);	
		panel_ThueBangDia.add(btn_Thue_ThueBD);
		
		
		
		JButton btn_XoaTrang_ThueBD = new JButton(" Làm Mới");
		btn_XoaTrang_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XoaTrang_ThueBD.setIcon(new ImageIcon("src/images/receipt.png"));
		btn_XoaTrang_ThueBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_XoaTrang_ThueBD.setBounds(280, 570, 150, 40);
		panel_ThueBangDia.add(btn_XoaTrang_ThueBD);
		
		JButton btn_Thoat_ThueBD = new JButton(" Thoát");
		btn_Thoat_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_ThueBD.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_ThueBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_ThueBangDia.setVisible(false);
				}
			}
		});
		btn_Thoat_ThueBD.setBounds(200, 620, 150, 40);
		panel_ThueBangDia.add(btn_Thoat_ThueBD);
		
		
		JLabel lbl_DSBD_NhapBD = new JLabel("Danh Sách Băng Đĩa");
		lbl_DSBD_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_DSBD_NhapBD.setBounds(870, 50, 300, 25);
		panel_ThueBangDia.add(lbl_DSBD_NhapBD);
		
		JLabel lbl_timkiemDSBD_ThueBD = new JLabel("Tìm kiếm:");
		lbl_timkiemDSBD_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiemDSBD_ThueBD.setBounds(650, 90, 80, 20);
		panel_ThueBangDia.add(lbl_timkiemDSBD_ThueBD);
		
		txt_TimKiemBD_ThueBD = new JTextField();
		txt_TimKiemBD_ThueBD.setBounds(740, 90, 400, 25);
		panel_ThueBangDia.add(txt_TimKiemBD_ThueBD);
		txt_TimKiemBD_ThueBD.setColumns(10);
		
		JButton btn_TimKiemBD_ThueBD = new JButton("Tìm Kiếm");
		btn_TimKiemBD_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiemBD_ThueBD.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiemBD_ThueBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiemBD_ThueBD.setBounds(1170, 80, 150, 40);
		panel_ThueBangDia.add(btn_TimKiemBD_ThueBD);
		
		JScrollPane scrollPane_DSBangDia_ThueBD = new JScrollPane();
		scrollPane_DSBangDia_ThueBD.setBounds(650, 125, 800, 200);
		panel_ThueBangDia.add(scrollPane_DSBangDia_ThueBD);
		
		
		JLabel lbl_ThueBD_NhapBD = new JLabel("Danh Sách Thuê Băng Đĩa");
		lbl_ThueBD_NhapBD.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_ThueBD_NhapBD.setBounds(870, 370, 300, 25);
		panel_ThueBangDia.add(lbl_ThueBD_NhapBD);
		
		JLabel lbl_timkiemThueBD_ThueBD = new JLabel("Tìm kiếm:");
		lbl_timkiemThueBD_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiemThueBD_ThueBD.setBounds(650, 415, 80, 20);
		panel_ThueBangDia.add(lbl_timkiemThueBD_ThueBD);
		
		txt_TimKiemDSThue_ThueBD = new JTextField();
		txt_TimKiemDSThue_ThueBD.setBounds(740, 415, 400, 25);
		panel_ThueBangDia.add(txt_TimKiemDSThue_ThueBD);
		txt_TimKiemDSThue_ThueBD.setColumns(10);
		
		JButton btn_TimKiemThueBD_ThueBD = new JButton("Tìm Kiếm");
		btn_TimKiemThueBD_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiemThueBD_ThueBD.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiemThueBD_ThueBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiemThueBD_ThueBD.setBounds(1170, 405, 150, 40);
		panel_ThueBangDia.add(btn_TimKiemThueBD_ThueBD);
		
		JButton btn_XemDSThueBD_ThueBD = new JButton(" Xem");
		btn_XemDSThueBD_ThueBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XemDSThueBD_ThueBD.setIcon(new ImageIcon("src/images/luu.png"));
		btn_XemDSThueBD_ThueBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_NCC.setVisible(false);
				panel_TrangChu.setVisible(false);
				panel_NhapBangDia.setVisible(false);
				panel_KhachHang.setVisible(false);
				panel_BangDia.setVisible(false);
				panel_NhanVien.setVisible(false);
				panel_ThueBangDia.setVisible(false);
				panel_TraBangDia.setVisible(true);
				panel_ThongKe.setVisible(false);
			}
		});
		btn_XemDSThueBD_ThueBD.setBounds(1340, 405, 130, 40);
		panel_ThueBangDia.add(btn_XemDSThueBD_ThueBD);
		
		JScrollPane scrollPane_ThueBangDia = new JScrollPane();
		scrollPane_ThueBangDia.setBounds(650, 450, 800, 200);
		panel_ThueBangDia.add(scrollPane_ThueBangDia);
		
		/*----------------------PANEL TRẢ BĂNG ĐĨA--------------------------*/
		panel_TraBangDia = new JPanel();
		getContentPane().add(panel_TraBangDia);
		panel_TraBangDia.setLayout(null);
		
		JLabel lblTraBangDia = new JLabel("QUẢN LÝ TRẢ BĂNG ĐĨA");
		lblTraBangDia.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTraBangDia.setBounds(550, 5, 400, 35);
		lblTraBangDia.setForeground(Color.BLUE);
		panel_TraBangDia.add(lblTraBangDia);
		
			
		JLabel lbl_MaPhieuThue_TraBD = new JLabel("Mã phiếu thuê: ");
		lbl_MaPhieuThue_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaPhieuThue_TraBD.setBounds(20, 50, 130, 20);
		panel_TraBangDia.add(lbl_MaPhieuThue_TraBD);
		
		txt_MaPhieuThue_TraBD = new JTextField();
		txt_MaPhieuThue_TraBD.setEnabled(false);
		txt_MaPhieuThue_TraBD.setBounds(140, 50, 460, 25);
		panel_TraBangDia.add(txt_MaPhieuThue_TraBD);
		txt_MaPhieuThue_TraBD.setColumns(10);
		
		JLabel lbl_MaKH_TraBD = new JLabel("Mã khách hàng: ");
		lbl_MaKH_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaKH_TraBD.setBounds(20, 90, 130, 20);
		panel_TraBangDia.add(lbl_MaKH_TraBD);
		
		txt_MaKH_TraBD = new JTextField();
		txt_MaKH_TraBD.setBounds(140, 90, 460, 25);
		panel_TraBangDia.add(txt_MaKH_TraBD);
		txt_MaKH_TraBD.setColumns(10);
		
		JLabel lbl_TenKH_TraBD = new JLabel("Tên khách hàng: ");
		lbl_TenKH_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TenKH_TraBD.setBounds(20, 130, 130, 20);
		panel_TraBangDia.add(lbl_TenKH_TraBD);
		
		txt_TenKH_TraBD = new JTextField();
		txt_TenKH_TraBD.setBounds(140, 130, 460, 25);
		panel_TraBangDia.add(txt_TenKH_TraBD);
		txt_TenKH_TraBD.setColumns(10);
		
		JLabel lbl_MaBD_TraBD = new JLabel("Mã Băng Đĩa");
		lbl_MaBD_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_MaBD_TraBD.setBounds(220, 170, 120, 20);
		panel_TraBangDia.add(lbl_MaBD_TraBD);
		
		JLabel lbl_SoLuong_TraBD = new JLabel("Số Lượng");
		lbl_SoLuong_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_SoLuong_TraBD.setBounds(470, 170, 120, 20);
		panel_TraBangDia.add(lbl_SoLuong_TraBD);
		
		txt_MaBD1_TraBD = new JTextField();
		txt_MaBD1_TraBD.setBounds(140, 190, 250, 25);
		panel_TraBangDia.add(txt_MaBD1_TraBD);
		txt_MaBD1_TraBD.setColumns(10);
		
		txt_SoLuongLThue1_TraBD = new JTextField();
		txt_SoLuongLThue1_TraBD.setBounds(400, 190, 200, 25);
		panel_TraBangDia.add(txt_SoLuongLThue1_TraBD);
		txt_SoLuongLThue1_TraBD.setColumns(10);
		
		txt_MaBD2_TraBD = new JTextField();
		txt_MaBD2_TraBD.setBounds(140, 220, 250, 25);
		panel_TraBangDia.add(txt_MaBD2_TraBD);
		((JTextField) txt_MaBD2_TraBD).setColumns(10);
		
		txt_SoLuongLThue2_TraBD = new JTextField();
		txt_SoLuongLThue2_TraBD.setBounds(400, 220, 200, 25);
		panel_TraBangDia.add(txt_SoLuongLThue2_TraBD);
		txt_SoLuongLThue2_TraBD.setColumns(10);
		
		txt_MaBD3_TraBD = new JTextField();
		txt_MaBD3_TraBD.setBounds(140, 250, 250, 25);
		panel_TraBangDia.add(txt_MaBD3_TraBD);
		txt_MaBD3_TraBD.setColumns(10);
		
		txt_SoLuongLThue3_TraBD = new JTextField();
		txt_SoLuongLThue3_TraBD.setBounds(400, 250, 200, 25);
		panel_TraBangDia.add(txt_SoLuongLThue3_TraBD);
		txt_SoLuongLThue3_TraBD.setColumns(10);
		
		txt_MaBD4_TraBD = new JTextField();
		txt_MaBD4_TraBD.setBounds(140, 280, 250, 25);
		panel_TraBangDia.add(txt_MaBD4_TraBD);
		txt_MaBD4_TraBD.setColumns(10);
		
		txt_SoLuongLThue4_TraBD = new JTextField();
		txt_SoLuongLThue4_TraBD.setBounds(400, 280, 200, 25);
		panel_TraBangDia.add(txt_SoLuongLThue4_TraBD);
		txt_SoLuongLThue4_TraBD.setColumns(10);
		
		txt_MaBD5_TraBD = new JTextField();
		txt_MaBD5_TraBD.setBounds(140, 310, 250, 25);
		panel_TraBangDia.add(txt_MaBD5_TraBD);
		txt_MaBD5_TraBD.setColumns(10);
		
		txt_SoLuongLThue5_TraBD = new JTextField();
		txt_SoLuongLThue5_TraBD.setBounds(400, 310, 200, 25);
		panel_TraBangDia.add(txt_SoLuongLThue5_TraBD);
		txt_SoLuongLThue5_TraBD.setColumns(10);
		
		JLabel lbl_NgayThue_TraBD = new JLabel("Ngày Thuê: ");
		lbl_NgayThue_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_NgayThue_TraBD.setBounds(20, 350, 130, 20);
		panel_TraBangDia.add(lbl_NgayThue_TraBD);
		
		txt_NgayThue_ThueBD = new JDateChooser();
		txt_NgayThue_ThueBD.setDateFormatString("yyyy - MM - dd");
		txt_NgayThue_ThueBD.setBounds(140, 350, 460, 25);
		panel_TraBangDia.add(txt_NgayThue_ThueBD);
	
		
		JLabel lbl_TrangThai_TraBD = new JLabel("Trạng Thái: ");
		lbl_TrangThai_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_TrangThai_TraBD.setBounds(20, 390, 130, 20);
		panel_TraBangDia.add(lbl_TrangThai_TraBD);
		
		txt_TrangThaiBD_TraBD= new JTextField();
		txt_TrangThaiBD_TraBD.setBounds(140, 390, 460, 25);
		panel_TraBangDia.add(txt_TrangThaiBD_TraBD);
		txt_TrangThaiBD_TraBD.setColumns(10);
		
		JLabel lbl_GhiChu_TraBD = new JLabel("Ghi chú: ");
		lbl_GhiChu_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_GhiChu_TraBD.setBounds(20, 430, 130, 20);
		panel_TraBangDia.add(lbl_GhiChu_TraBD);
		
		txt_GhiChu_TraBD = new JTextArea();
		txt_GhiChu_TraBD.setBounds(140, 430, 460, 60);
		panel_TraBangDia.add(txt_GhiChu_TraBD);
        
		JButton btn_ThanhToan_TraBD = new JButton(" Thanh Toán");
		btn_ThanhToan_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_ThanhToan_TraBD.setIcon(new ImageIcon("src/images/luu.png"));
		btn_ThanhToan_TraBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_ThanhToan_TraBD.setBounds(100, 510, 150, 30);	
		panel_TraBangDia.add(btn_ThanhToan_TraBD);
		
		JButton btn_InHoaDon_TraBD = new JButton(" In Hóa Đơn");
		btn_InHoaDon_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_InHoaDon_TraBD.setIcon(new ImageIcon("src/images/inhd.png"));
		btn_InHoaDon_TraBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_InHoaDon_TraBD.setBounds(280, 510, 150, 30);	
		panel_TraBangDia.add(btn_InHoaDon_TraBD);
		
		JButton btn_Sua_TraBD = new JButton(" Chỉnh Sửa");
		btn_Sua_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Sua_TraBD.setIcon(new ImageIcon("src/images/sua.png"));
		btn_Sua_TraBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Sua_TraBD.setBounds(450, 510, 150, 30);
		panel_TraBangDia.add(btn_Sua_TraBD);
		
		JButton btn_Xoa_TraBD = new JButton(" Xóa");
		btn_Xoa_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Xoa_TraBD.setIcon(new ImageIcon("src/images/spam.png"));
		btn_Xoa_TraBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Xoa_TraBD.setBounds(100, 550, 150, 30);
		panel_TraBangDia.add(btn_Xoa_TraBD);
		
		
		JButton btn_XoaTrang_TraBD = new JButton(" Làm Mới");
		btn_XoaTrang_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_XoaTrang_TraBD.setIcon(new ImageIcon("src/images/receipt.png"));
		btn_XoaTrang_TraBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_XoaTrang_TraBD.setBounds(280, 550, 150, 30);
		panel_TraBangDia.add(btn_XoaTrang_TraBD);
		
		JButton btn_Thoat_TraBD = new JButton(" Thoát");
		btn_Thoat_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_TraBD.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_TraBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_ThueBangDia.setVisible(false);
					panel_TraBangDia.setVisible(false);
					panel_ThongKe.setVisible(false);
				}
			}
		});
		btn_Thoat_TraBD.setBounds(450, 550, 150, 30);
		panel_TraBangDia.add(btn_Thoat_TraBD);
		
		
		JLabel lbl_DSBD_TraBD = new JLabel("Danh Sách Băng Đĩa Đang Thuê");
		lbl_DSBD_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_DSBD_TraBD.setBounds(800, 50, 400, 25);
		panel_TraBangDia.add(lbl_DSBD_TraBD);
		
		JLabel lbl_timkiemDSBD_TraBD = new JLabel("Tìm kiếm:");
		lbl_timkiemDSBD_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_timkiemDSBD_TraBD.setBounds(670, 90, 80, 20);
		panel_TraBangDia.add(lbl_timkiemDSBD_TraBD);
		
		txt_TimKiemBD_TraBD = new JTextField();
		txt_TimKiemBD_TraBD.setBounds(760, 90, 400, 25);
		panel_TraBangDia.add(txt_TimKiemBD_TraBD);
		((JTextField) txt_TimKiemBD_TraBD).setColumns(10);
		
		JButton btn_TimKiemBD_TraBD = new JButton("Tìm Kiếm");
		btn_TimKiemBD_TraBD.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_TimKiemBD_TraBD.setIcon(new ImageIcon("src/images/searching.png"));
		btn_TimKiemBD_TraBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_TimKiemBD_TraBD.setBounds(1180, 80, 140, 30);
		panel_TraBangDia.add(btn_TimKiemBD_TraBD);
		
		JScrollPane scrollPane_DSBangDia_TraBD = new JScrollPane();
		scrollPane_DSBangDia_TraBD.setBounds(670, 125, 670, 450);
		panel_TraBangDia.add(scrollPane_DSBangDia_TraBD);
		
		
		
		/*---------THỐNG KÊ----------*/
		panel_ThongKe = new JPanel();
		getContentPane().add(panel_ThongKe);
		panel_ThongKe.setLayout(null);
		
		JLabel lblThongKe = new JLabel("THỐNG KÊ BĂNG ĐĨA");
		lblThongKe.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblThongKe.setBounds(550, 5, 400, 35);
		lblThongKe.setForeground(Color.BLUE);
		panel_ThongKe.add(lblThongKe);
		
			
		JLabel lbl_HinhThuc_TK = new JLabel("Chọn hình thức thống kê: ");
		lbl_HinhThuc_TK.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_HinhThuc_TK.setBounds(200, 70, 200, 20);
		panel_ThongKe.add(lbl_HinhThuc_TK);
		
		txt_HinhThuc_ThongKe = new JComboBox();
		txt_HinhThuc_ThongKe.setBounds(380, 70, 250, 25);
		panel_ThongKe.add(txt_HinhThuc_ThongKe);
		
		JButton btn_ThongKe_TK = new JButton("Thống Kê");
		btn_ThongKe_TK.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_ThongKe_TK.setIcon(new ImageIcon("src/images/statistics.png"));
		btn_ThongKe_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_ThongKe_TK.setBounds(650, 60, 150, 40);
		panel_ThongKe.add(btn_ThongKe_TK);
		
		JButton btn_InThongKe_TK = new JButton("In Thống Kê");
		btn_InThongKe_TK.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_InThongKe_TK.setIcon(new ImageIcon("src/images/inTK.png"));
		btn_InThongKe_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_InThongKe_TK.setBounds(840, 60, 150, 40);
		panel_ThongKe.add(btn_InThongKe_TK);
		
		JButton btn_Thoat_ThongKe = new JButton(" Thoát");
		btn_Thoat_ThongKe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Thoat_ThongKe.setIcon(new ImageIcon("src/images/exit.png"));
		btn_Thoat_ThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hoi = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?",null,JOptionPane.YES_NO_OPTION);
				if(hoi ==JOptionPane.YES_NO_OPTION){
					panel_NCC.setVisible(false);
					panel_TrangChu.setVisible(true);
					panel_NhapBangDia.setVisible(false);
					panel_KhachHang.setVisible(false);
					panel_BangDia.setVisible(false);
					panel_ThueBangDia.setVisible(false);
					panel_TraBangDia.setVisible(false);
					panel_ThongKe.setVisible(false);
				}
			}
		});
		btn_Thoat_ThongKe.setBounds(1030, 60, 150, 40);
		panel_ThongKe.add(btn_Thoat_ThongKe);
		
		
		JScrollPane scrollPane_ThongKeBangDia_ThongKe = new JScrollPane();
		scrollPane_ThongKeBangDia_ThongKe.setBounds(120, 130, 1100, 450);
		panel_ThongKe.add(scrollPane_ThongKeBangDia_ThongKe);
		
	}	
	
	
	
	
		/*---------XỬ LÝ NHÀ CUNG CẤP----------*/
		public void loadNCC(){
			
//			NhaCungCapDao nhaCungCapDAO = new NhaCungCapDao();
			defaultTableModel = new DefaultTableModel();
			defaultTableModel.addColumn("Mã NCC");
			defaultTableModel.addColumn("Tên NCC");
			defaultTableModel.addColumn("Địa Chỉ");
			defaultTableModel.addColumn("Số điện thoại");
			defaultTableModel.addColumn("Email");
			defaultTableModel.addColumn("Ghi chú");

			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == mniCapNhat_NCC) {
				 
			
//			 new panel_NCC.setVisible(true);
			}
			
		}

	
	
}
