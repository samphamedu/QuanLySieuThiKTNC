package com.supermarket.UI;

import com.supermarket.DAO.ChiTietDonHangDAO;
import com.supermarket.DAO.ChiTietHoaDonDAO;
import com.supermarket.DAO.ChungLoaiDAO;
import com.supermarket.DAO.DonHangDAO;
import com.supermarket.DAO.HoaDonDAO;
import com.supermarket.DAO.KhachHangDAO;
import com.supermarket.DAO.NhanVienDAO;
import com.supermarket.DAO.SanPhamDAO;
import com.supermarket.DAO.ThongKeDAO;
import com.supermarket.ENTITY.CLockThread;
import com.supermarket.ENTITY.ChiTietDonHang;
import com.supermarket.ENTITY.ChiTietHoaDon;
import com.supermarket.ENTITY.ChungLoai;
import com.supermarket.ENTITY.DonHang;
import com.supermarket.ENTITY.HoaDon;
import com.supermarket.ENTITY.KhachHang;
import com.supermarket.ENTITY.NhanVien;
import com.supermarket.ENTITY.SanPham;
import com.supermarket.UTILS.JdbcHelper;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XDate;
import com.supermarket.UTILS.XImage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin_Frame extends javax.swing.JFrame {

    private int indexSP = -1;
    private int indexKH = -1;
    private int indexCL = -1;
    private int indexHD = -1;
    private int indexDH = -1;
    private int indexNV = -1;
    private int indexTK = -1;
    private Date ngaySinh;

    //Biến LIST
    private List<SanPham> spList = new ArrayList<>();
    private List<KhachHang> khList = new ArrayList<>();
    private List<ChungLoai> clList = new ArrayList<>();
    private List<DonHang> dhList = new ArrayList<>();
    private List<NhanVien> nvList = new ArrayList<>();
    private List<HoaDon> hdList = new ArrayList<>();

    //Biến DAO
    private final KhachHangDAO khDao = new KhachHangDAO();
    private final SanPhamDAO spDao = new SanPhamDAO();
    private final ChungLoaiDAO clDao = new ChungLoaiDAO();
    private final DonHangDAO dhDao = new DonHangDAO();
    private final HoaDonDAO hdDao = new HoaDonDAO();
    private final ChiTietDonHangDAO dhctDao = new ChiTietDonHangDAO();
    private final NhanVienDAO nvDao = new NhanVienDAO();
    private final ThongKeDAO tkDao = new ThongKeDAO();

    public Admin_Frame() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoGioiTinh_NV = new javax.swing.ButtonGroup();
        rdoGioiTinh_KH = new javax.swing.ButtonGroup();
        pnlContainer = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pnl_SanPham = new javax.swing.JPanel();
        pnl_Sub_SP = new javax.swing.JPanel();
        pnlTitle_SP = new javax.swing.JPanel();
        lblTitle_SP = new javax.swing.JLabel();
        pnlTimKiem_SP = new javax.swing.JPanel();
        txtTim_SP = new javax.swing.JTextField();
        btnTim_SP = new javax.swing.JButton();
        btnReset_SP = new javax.swing.JButton();
        pnlInfor = new javax.swing.JPanel();
        lblMa_SP = new javax.swing.JLabel();
        txtMa_SP = new javax.swing.JTextField();
        lblTen_SP = new javax.swing.JLabel();
        txtTen_SP = new javax.swing.JTextField();
        lblSoLuong_SP = new javax.swing.JLabel();
        txtSoLuong_SP = new javax.swing.JTextField();
        lblGia_SP = new javax.swing.JLabel();
        txtGia_SP = new javax.swing.JTextField();
        lblChungLoai_SP = new javax.swing.JLabel();
        cboChungLoai_SP = new javax.swing.JComboBox<>();
        pnlPic_SP = new javax.swing.JPanel();
        lblPic_SP = new javax.swing.JLabel();
        pnlMainBtn_SP = new javax.swing.JPanel();
        btnThem_SP = new javax.swing.JButton();
        btnSua_SP = new javax.swing.JButton();
        btnXoa_SP = new javax.swing.JButton();
        btnMoi_SP = new javax.swing.JButton();
        pnlNavigation_SP = new javax.swing.JPanel();
        btnFirst_SP = new javax.swing.JButton();
        btnPrevious_SP = new javax.swing.JButton();
        btnNext_SP = new javax.swing.JButton();
        btnLast_Sp = new javax.swing.JButton();
        scroll_SP = new javax.swing.JScrollPane();
        tbl_SP = new javax.swing.JTable();
        pnl_ChungLoai = new javax.swing.JPanel();
        pnl_Sub_CL = new javax.swing.JPanel();
        pnlTitle_CL = new javax.swing.JPanel();
        lblTitle_CL = new javax.swing.JLabel();
        pnlInfor_CL = new javax.swing.JPanel();
        lblMa_CL = new javax.swing.JLabel();
        txtMa_CL = new javax.swing.JTextField();
        lblTen_CL = new javax.swing.JLabel();
        txtTen_CL = new javax.swing.JTextField();
        lblMieuTa_CL = new javax.swing.JLabel();
        scrollMieuTa_CL = new javax.swing.JScrollPane();
        txtMieuTa_CL = new javax.swing.JTextArea();
        pnlPic_CL = new javax.swing.JPanel();
        lblPic_CL = new javax.swing.JLabel();
        pnlMainBtn_CL = new javax.swing.JPanel();
        btnThem_CL = new javax.swing.JButton();
        btnSua_CL = new javax.swing.JButton();
        btnXoa_CL = new javax.swing.JButton();
        btnMoi_CL = new javax.swing.JButton();
        pnlNavigation_CL = new javax.swing.JPanel();
        btnFirst_CL = new javax.swing.JButton();
        btnPrevious_CL = new javax.swing.JButton();
        btnNext_CL = new javax.swing.JButton();
        btnLast_CL = new javax.swing.JButton();
        scroll_CL = new javax.swing.JScrollPane();
        tbl_CL = new javax.swing.JTable();
        pnl_NhanVien = new javax.swing.JPanel();
        pnl_Sub_NV = new javax.swing.JPanel();
        pnlTitle_NV = new javax.swing.JPanel();
        lblTitle_NV = new javax.swing.JLabel();
        pnlInfor_NV = new javax.swing.JPanel();
        lblMa_NV = new javax.swing.JLabel();
        txtMa_NV = new javax.swing.JTextField();
        lblMatKhau_NV = new javax.swing.JLabel();
        txtMatKhau_NV = new javax.swing.JTextField();
        lblHoTen_NV = new javax.swing.JLabel();
        txtHoTen_NV = new javax.swing.JTextField();
        lblGioiTinh_NV = new javax.swing.JLabel();
        rdoNam_NV = new javax.swing.JRadioButton();
        rdoNu_NV = new javax.swing.JRadioButton();
        lblNgaySinh_NV = new javax.swing.JLabel();
        txtNgaySinh_NV = new javax.swing.JTextField();
        pnlPic_NV = new javax.swing.JPanel();
        lblPic_NV = new javax.swing.JLabel();
        pnlMainBtn_NV = new javax.swing.JPanel();
        btnThem_NV = new javax.swing.JButton();
        btnSua_NV = new javax.swing.JButton();
        btnXoa_NV = new javax.swing.JButton();
        btnMoi_NV = new javax.swing.JButton();
        pnlNavigation_NV = new javax.swing.JPanel();
        btnFirst_NV = new javax.swing.JButton();
        btnPrevious_NV = new javax.swing.JButton();
        btnNext_NV = new javax.swing.JButton();
        btnLast_NV = new javax.swing.JButton();
        scroll_NV = new javax.swing.JScrollPane();
        tbl_NV = new javax.swing.JTable();
        pnl_KhachHang = new javax.swing.JPanel();
        pnl_Sub_KH = new javax.swing.JPanel();
        pnlTitle_KH = new javax.swing.JPanel();
        lblTitle_KH = new javax.swing.JLabel();
        pnlMa_KH = new javax.swing.JPanel();
        lblMa_KH = new javax.swing.JLabel();
        txtMa_KH = new javax.swing.JLabel();
        pnlInfor_KH = new javax.swing.JPanel();
        lblTen_KH = new javax.swing.JLabel();
        txtTen_KH = new javax.swing.JTextField();
        lblMatKhau_KH = new javax.swing.JLabel();
        txtMatKhau_KH = new javax.swing.JTextField();
        lblNgaySinh_KH = new javax.swing.JLabel();
        txtNgaySinh_KH = new javax.swing.JTextField();
        lblGioiTinh_KH = new javax.swing.JLabel();
        rdoNam_KH = new javax.swing.JRadioButton();
        rdoNu_KH = new javax.swing.JRadioButton();
        lblNgayDangKy_KH = new javax.swing.JLabel();
        txtNgayDangKy_KH = new javax.swing.JTextField();
        pnlPic_KH = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btnSua_KH = new javax.swing.JButton();
        pnlNavigation_KH = new javax.swing.JPanel();
        btnFirst_KH = new javax.swing.JButton();
        btnPrevioust_KH = new javax.swing.JButton();
        btnNext_KH = new javax.swing.JButton();
        btnLast_KH = new javax.swing.JButton();
        scroll_KH = new javax.swing.JScrollPane();
        tbl_KH = new javax.swing.JTable();
        pnl_HoaDon = new javax.swing.JPanel();
        pnl_Sub_HD = new javax.swing.JPanel();
        pnlTitle_HD = new javax.swing.JPanel();
        lblTitle_HD = new javax.swing.JLabel();
        pnlMa_HD = new javax.swing.JPanel();
        lblMa_HD = new javax.swing.JLabel();
        txtMa_HD = new javax.swing.JLabel();
        pnlInfor_HD = new javax.swing.JPanel();
        lblMaNV_HD = new javax.swing.JLabel();
        txtMaNV_HD = new javax.swing.JTextField();
        lblNgayLap_HD = new javax.swing.JLabel();
        txtNgayLap_HD = new javax.swing.JTextField();
        lblTongTien_HD = new javax.swing.JLabel();
        txtTongTien_HD = new javax.swing.JLabel();
        lblDonViGia_HD = new javax.swing.JLabel();
        pnlPic_HD = new javax.swing.JPanel();
        lblPic_HD = new javax.swing.JLabel();
        btnXoa_HD = new javax.swing.JButton();
        lblMeo_HD = new javax.swing.JLabel();
        pnlNavigation_HD = new javax.swing.JPanel();
        btnFirst_HD = new javax.swing.JButton();
        btnPrevioust_HD = new javax.swing.JButton();
        btnNext_HD = new javax.swing.JButton();
        btnLast_HD = new javax.swing.JButton();
        scroll_HD = new javax.swing.JScrollPane();
        tbl_HD = new javax.swing.JTable();
        pnl_DonHang = new javax.swing.JPanel();
        pnl_Sub_DH = new javax.swing.JPanel();
        pnlTitle_DH = new javax.swing.JPanel();
        lblTitle_DH = new javax.swing.JLabel();
        pnlMa_DH = new javax.swing.JPanel();
        lblMa_DH = new javax.swing.JLabel();
        txtMa_DH = new javax.swing.JLabel();
        pnlInfor_DH = new javax.swing.JPanel();
        lblMaKH_DH = new javax.swing.JLabel();
        txtMaKH_DH = new javax.swing.JTextField();
        txtNgayDatHang_DH = new javax.swing.JTextField();
        lblNgayDatHang_DH = new javax.swing.JLabel();
        lblTongTien_DH = new javax.swing.JLabel();
        txtTongTien_DH = new javax.swing.JLabel();
        lblDonViGia_DH = new javax.swing.JLabel();
        pnlPic_DH = new javax.swing.JPanel();
        lblPic_DH = new javax.swing.JLabel();
        btnXoa_DH = new javax.swing.JButton();
        lblMeo_DH = new javax.swing.JLabel();
        pnlNavigation_DH = new javax.swing.JPanel();
        btnFirst_DH = new javax.swing.JButton();
        btnPrevious_DH = new javax.swing.JButton();
        btnNext_DH = new javax.swing.JButton();
        btnLast_DH = new javax.swing.JButton();
        sroll_DH = new javax.swing.JScrollPane();
        tbl_DH = new javax.swing.JTable();
        pnl_ThongKe = new javax.swing.JPanel();
        pnl_Sub_TK = new javax.swing.JPanel();
        lblTitle_TK = new javax.swing.JLabel();
        pnlPic_TK = new javax.swing.JPanel();
        lblPic_TK = new javax.swing.JLabel();
        pnlInfor_TK = new javax.swing.JPanel();
        lblNam_TK = new javax.swing.JLabel();
        txtNam_TK = new javax.swing.JLabel();
        lblDoanhThu_TK = new javax.swing.JLabel();
        txtDoanhThu_TK = new javax.swing.JLabel();
        lblBanNhieuNhat_TK = new javax.swing.JLabel();
        txtBanNhieuNhat_TK = new javax.swing.JLabel();
        lblBanItNhat_TK = new javax.swing.JLabel();
        txtBanItNhat_TK = new javax.swing.JLabel();
        pnlNavigation_TK = new javax.swing.JPanel();
        btnFirst_TK = new javax.swing.JButton();
        btnPrevious_TK = new javax.swing.JButton();
        btnNext_TK = new javax.swing.JButton();
        btnLast_TK = new javax.swing.JButton();
        scroll_TK = new javax.swing.JScrollPane();
        tbl_TK = new javax.swing.JTable();
        pnlHeader = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        lblInfor = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống quản lý siêu thị | Nhóm 5 (UDPM)");
        setBackground(new java.awt.Color(61, 61, 61));
        setMaximizedBounds(new java.awt.Rectangle(1100, 600, 600, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlContainer.setBackground(new java.awt.Color(61, 61, 61));

        tabs.setBackground(new java.awt.Color(61, 61, 61));
        tabs.setForeground(new java.awt.Color(255, 146, 64));
        tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabs.setOpaque(true);
        tabs.setPreferredSize(new java.awt.Dimension(1100, 552));

        pnl_SanPham.setForeground(new java.awt.Color(205, 255, 255));
        pnl_SanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_SanPham.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnl_SanPham.setPreferredSize(new java.awt.Dimension(907, 552));

        pnl_Sub_SP.setBackground(new java.awt.Color(61, 61, 61));

        pnlTitle_SP.setBackground(new java.awt.Color(61, 61, 61));

        lblTitle_SP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle_SP.setForeground(new java.awt.Color(255, 209, 84));
        lblTitle_SP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box-product.png"))); // NOI18N
        lblTitle_SP.setText("QUẢN LÝ SẢN PHẨM");
        lblTitle_SP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle_SP.setIconTextGap(15);

        javax.swing.GroupLayout pnlTitle_SPLayout = new javax.swing.GroupLayout(pnlTitle_SP);
        pnlTitle_SP.setLayout(pnlTitle_SPLayout);
        pnlTitle_SPLayout.setHorizontalGroup(
            pnlTitle_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_SPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle_SP)
                .addContainerGap())
        );
        pnlTitle_SPLayout.setVerticalGroup(
            pnlTitle_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_SPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle_SP)
                .addContainerGap())
        );

        pnlTimKiem_SP.setBackground(new java.awt.Color(61, 61, 61));

        txtTim_SP.setBackground(new java.awt.Color(255, 255, 169));
        txtTim_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnTim_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnTim_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTim_SP.setForeground(new java.awt.Color(255, 255, 169));
        btnTim_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        btnTim_SP.setText("Tìm kiếm");
        btnTim_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTim_SPActionPerformed(evt);
            }
        });

        btnReset_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnReset_SP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnReset_SP.setForeground(new java.awt.Color(255, 255, 169));
        btnReset_SP.setText("Reset");
        btnReset_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_SPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimKiem_SPLayout = new javax.swing.GroupLayout(pnlTimKiem_SP);
        pnlTimKiem_SP.setLayout(pnlTimKiem_SPLayout);
        pnlTimKiem_SPLayout.setHorizontalGroup(
            pnlTimKiem_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimKiem_SPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTim_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTim_SP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTimKiem_SPLayout.setVerticalGroup(
            pnlTimKiem_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimKiem_SPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimKiem_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTimKiem_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTim_SP, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(btnTim_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlInfor.setBackground(new java.awt.Color(61, 61, 61));

        lblMa_SP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMa_SP.setForeground(new java.awt.Color(255, 255, 169));
        lblMa_SP.setText("Mã sản phẩm:");

        txtMa_SP.setBackground(new java.awt.Color(255, 146, 64));
        txtMa_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMa_SP.setForeground(new java.awt.Color(255, 255, 169));
        txtMa_SP.setFocusable(false);

        lblTen_SP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTen_SP.setForeground(new java.awt.Color(255, 255, 169));
        lblTen_SP.setText("Tên sản phẩm:");

        txtTen_SP.setBackground(new java.awt.Color(255, 146, 64));
        txtTen_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTen_SP.setForeground(new java.awt.Color(255, 255, 169));

        lblSoLuong_SP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSoLuong_SP.setForeground(new java.awt.Color(255, 255, 169));
        lblSoLuong_SP.setText("Số lượng:");

        txtSoLuong_SP.setBackground(new java.awt.Color(255, 146, 64));
        txtSoLuong_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSoLuong_SP.setForeground(new java.awt.Color(255, 255, 169));
        txtSoLuong_SP.setText("0");

        lblGia_SP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGia_SP.setForeground(new java.awt.Color(255, 255, 169));
        lblGia_SP.setText("Đơn giá:");

        txtGia_SP.setBackground(new java.awt.Color(255, 146, 64));
        txtGia_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGia_SP.setForeground(new java.awt.Color(255, 255, 169));
        txtGia_SP.setText("0.0");

        lblChungLoai_SP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblChungLoai_SP.setForeground(new java.awt.Color(255, 255, 169));
        lblChungLoai_SP.setText("Chủng loại:");

        cboChungLoai_SP.setBackground(new java.awt.Color(255, 146, 64));
        cboChungLoai_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboChungLoai_SP.setForeground(new java.awt.Color(255, 255, 169));
        cboChungLoai_SP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlInforLayout = new javax.swing.GroupLayout(pnlInfor);
        pnlInfor.setLayout(pnlInforLayout);
        pnlInforLayout.setHorizontalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInforLayout.createSequentialGroup()
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMa_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTen_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoLuong_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInforLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMa_SP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(txtTen_SP, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pnlInforLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuong_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGia_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblChungLoai_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGia_SP)
                            .addComponent(cboChungLoai_SP, 0, 274, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMa_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGia_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChungLoai_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChungLoai_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlPic_SP.setBackground(new java.awt.Color(61, 61, 61));

        lblPic_SP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product-management 256px.png"))); // NOI18N

        javax.swing.GroupLayout pnlPic_SPLayout = new javax.swing.GroupLayout(pnlPic_SP);
        pnlPic_SP.setLayout(pnlPic_SPLayout);
        pnlPic_SPLayout.setHorizontalGroup(
            pnlPic_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_SPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_SP, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPic_SPLayout.setVerticalGroup(
            pnlPic_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_SPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_SP, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainBtn_SP.setBackground(new java.awt.Color(61, 61, 61));
        pnlMainBtn_SP.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnThem_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnThem_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnThem_SP.setForeground(new java.awt.Color(255, 255, 169));
        btnThem_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addition.png"))); // NOI18N
        btnThem_SP.setText("Thêm");
        btnThem_SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_SPActionPerformed(evt);
            }
        });
        pnlMainBtn_SP.add(btnThem_SP);

        btnSua_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnSua_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSua_SP.setForeground(new java.awt.Color(255, 255, 169));
        btnSua_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edition.png"))); // NOI18N
        btnSua_SP.setText("Sửa");
        btnSua_SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua_SP.setFocusable(false);
        btnSua_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_SPActionPerformed(evt);
            }
        });
        pnlMainBtn_SP.add(btnSua_SP);

        btnXoa_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnXoa_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnXoa_SP.setForeground(new java.awt.Color(255, 255, 169));
        btnXoa_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletion.png"))); // NOI18N
        btnXoa_SP.setText("Xóa");
        btnXoa_SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa_SP.setFocusable(false);
        btnXoa_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_SPActionPerformed(evt);
            }
        });
        pnlMainBtn_SP.add(btnXoa_SP);

        btnMoi_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnMoi_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMoi_SP.setForeground(new java.awt.Color(255, 255, 169));
        btnMoi_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        btnMoi_SP.setText("Mới");
        btnMoi_SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoi_SP.setFocusable(false);
        btnMoi_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi_SPActionPerformed(evt);
            }
        });
        pnlMainBtn_SP.add(btnMoi_SP);

        pnlNavigation_SP.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation_SP.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst_SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst_SP.setFocusable(false);
        btnFirst_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_SPActionPerformed(evt);
            }
        });
        pnlNavigation_SP.add(btnFirst_SP);

        btnPrevious_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevious_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevious_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevious_SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevious_SP.setFocusable(false);
        btnPrevious_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_SPActionPerformed(evt);
            }
        });
        pnlNavigation_SP.add(btnPrevious_SP);

        btnNext_SP.setBackground(new java.awt.Color(255, 146, 64));
        btnNext_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext_SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext_SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext_SP.setFocusable(false);
        btnNext_SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_SPActionPerformed(evt);
            }
        });
        pnlNavigation_SP.add(btnNext_SP);

        btnLast_Sp.setBackground(new java.awt.Color(255, 146, 64));
        btnLast_Sp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast_Sp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast_Sp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast_Sp.setFocusable(false);
        btnLast_Sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_SpActionPerformed(evt);
            }
        });
        pnlNavigation_SP.add(btnLast_Sp);

        tbl_SP.setBackground(new java.awt.Color(255, 146, 64));
        tbl_SP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_SP.setForeground(new java.awt.Color(61, 61, 61));
        tbl_SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Chủng loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_SP.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_SP.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tbl_SP.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tbl_SP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_SP.getTableHeader().setReorderingAllowed(false);
        tbl_SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_SPMousePressed(evt);
            }
        });
        scroll_SP.setViewportView(tbl_SP);

        javax.swing.GroupLayout pnl_Sub_SPLayout = new javax.swing.GroupLayout(pnl_Sub_SP);
        pnl_Sub_SP.setLayout(pnl_Sub_SPLayout);
        pnl_Sub_SPLayout.setHorizontalGroup(
            pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_SP)
            .addGroup(pnl_Sub_SPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_SPLayout.createSequentialGroup()
                        .addComponent(pnlTitle_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(pnlTimKiem_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_Sub_SPLayout.createSequentialGroup()
                        .addGroup(pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlMainBtn_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_Sub_SPLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlPic_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Sub_SPLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(pnlNavigation_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnl_Sub_SPLayout.setVerticalGroup(
            pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Sub_SPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTimKiem_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTitle_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainBtn_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNavigation_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_SP, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_SanPhamLayout = new javax.swing.GroupLayout(pnl_SanPham);
        pnl_SanPham.setLayout(pnl_SanPhamLayout);
        pnl_SanPhamLayout.setHorizontalGroup(
            pnl_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(pnl_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_SanPhamLayout.setVerticalGroup(
            pnl_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(pnl_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("QUẢN LÝ SẢN PHẨM", pnl_SanPham);

        pnl_ChungLoai.setForeground(new java.awt.Color(205, 255, 255));
        pnl_ChungLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_ChungLoai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnl_ChungLoai.setPreferredSize(new java.awt.Dimension(907, 552));

        pnl_Sub_CL.setBackground(new java.awt.Color(61, 61, 61));

        pnlTitle_CL.setBackground(new java.awt.Color(61, 61, 61));

        lblTitle_CL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle_CL.setForeground(new java.awt.Color(255, 209, 84));
        lblTitle_CL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/species 24px.png"))); // NOI18N
        lblTitle_CL.setText("QUẢN LÝ CHỦNG LOẠI");
        lblTitle_CL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle_CL.setIconTextGap(15);

        javax.swing.GroupLayout pnlTitle_CLLayout = new javax.swing.GroupLayout(pnlTitle_CL);
        pnlTitle_CL.setLayout(pnlTitle_CLLayout);
        pnlTitle_CLLayout.setHorizontalGroup(
            pnlTitle_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_CLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle_CL)
                .addContainerGap())
        );
        pnlTitle_CLLayout.setVerticalGroup(
            pnlTitle_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_CLLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTitle_CL)
                .addContainerGap())
        );

        pnlInfor_CL.setBackground(new java.awt.Color(61, 61, 61));

        lblMa_CL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMa_CL.setForeground(new java.awt.Color(255, 255, 169));
        lblMa_CL.setText("Mã chủng loại:");

        txtMa_CL.setBackground(new java.awt.Color(255, 146, 64));
        txtMa_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMa_CL.setForeground(new java.awt.Color(255, 255, 169));

        lblTen_CL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTen_CL.setForeground(new java.awt.Color(255, 255, 169));
        lblTen_CL.setText("Tên chủng loại:");

        txtTen_CL.setBackground(new java.awt.Color(255, 146, 64));
        txtTen_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTen_CL.setForeground(new java.awt.Color(255, 255, 169));

        lblMieuTa_CL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMieuTa_CL.setForeground(new java.awt.Color(255, 255, 169));
        lblMieuTa_CL.setText("Miêu tả:");

        txtMieuTa_CL.setBackground(new java.awt.Color(255, 146, 64));
        txtMieuTa_CL.setColumns(20);
        txtMieuTa_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMieuTa_CL.setForeground(new java.awt.Color(255, 255, 169));
        txtMieuTa_CL.setRows(5);
        scrollMieuTa_CL.setViewportView(txtMieuTa_CL);

        javax.swing.GroupLayout pnlInfor_CLLayout = new javax.swing.GroupLayout(pnlInfor_CL);
        pnlInfor_CL.setLayout(pnlInfor_CLLayout);
        pnlInfor_CLLayout.setHorizontalGroup(
            pnlInfor_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_CLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMa_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTen_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMieuTa_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfor_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTen_CL)
                    .addComponent(txtMa_CL)
                    .addComponent(scrollMieuTa_CL, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlInfor_CLLayout.setVerticalGroup(
            pnlInfor_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_CLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMa_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfor_CLLayout.createSequentialGroup()
                        .addComponent(lblMieuTa_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlInfor_CLLayout.createSequentialGroup()
                        .addComponent(scrollMieuTa_CL)
                        .addContainerGap())))
        );

        pnlPic_CL.setBackground(new java.awt.Color(61, 61, 61));

        lblPic_CL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/species.png"))); // NOI18N

        javax.swing.GroupLayout pnlPic_CLLayout = new javax.swing.GroupLayout(pnlPic_CL);
        pnlPic_CL.setLayout(pnlPic_CLLayout);
        pnlPic_CLLayout.setHorizontalGroup(
            pnlPic_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_CLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_CL, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPic_CLLayout.setVerticalGroup(
            pnlPic_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_CLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_CL, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainBtn_CL.setBackground(new java.awt.Color(61, 61, 61));
        pnlMainBtn_CL.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnThem_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnThem_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnThem_CL.setForeground(new java.awt.Color(255, 255, 169));
        btnThem_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addition.png"))); // NOI18N
        btnThem_CL.setText("Thêm");
        btnThem_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem_CL.setFocusable(false);
        btnThem_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_CLActionPerformed(evt);
            }
        });
        pnlMainBtn_CL.add(btnThem_CL);

        btnSua_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnSua_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSua_CL.setForeground(new java.awt.Color(255, 255, 169));
        btnSua_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edition.png"))); // NOI18N
        btnSua_CL.setText("Sửa");
        btnSua_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua_CL.setFocusable(false);
        btnSua_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_CLActionPerformed(evt);
            }
        });
        pnlMainBtn_CL.add(btnSua_CL);

        btnXoa_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnXoa_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnXoa_CL.setForeground(new java.awt.Color(255, 255, 169));
        btnXoa_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletion.png"))); // NOI18N
        btnXoa_CL.setText("Xóa");
        btnXoa_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa_CL.setFocusable(false);
        btnXoa_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_CLActionPerformed(evt);
            }
        });
        pnlMainBtn_CL.add(btnXoa_CL);

        btnMoi_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnMoi_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMoi_CL.setForeground(new java.awt.Color(255, 255, 169));
        btnMoi_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        btnMoi_CL.setText("Mới");
        btnMoi_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoi_CL.setFocusable(false);
        btnMoi_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi_CLActionPerformed(evt);
            }
        });
        pnlMainBtn_CL.add(btnMoi_CL);

        pnlNavigation_CL.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation_CL.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst_CL.setFocusable(false);
        btnFirst_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_CLActionPerformed(evt);
            }
        });
        pnlNavigation_CL.add(btnFirst_CL);

        btnPrevious_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevious_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevious_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevious_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevious_CL.setFocusable(false);
        btnPrevious_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_CLActionPerformed(evt);
            }
        });
        pnlNavigation_CL.add(btnPrevious_CL);

        btnNext_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnNext_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext_CL.setFocusable(false);
        btnNext_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_CLActionPerformed(evt);
            }
        });
        pnlNavigation_CL.add(btnNext_CL);

        btnLast_CL.setBackground(new java.awt.Color(255, 146, 64));
        btnLast_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast_CL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast_CL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast_CL.setFocusable(false);
        btnLast_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_CLActionPerformed(evt);
            }
        });
        pnlNavigation_CL.add(btnLast_CL);

        tbl_CL.setBackground(new java.awt.Color(255, 146, 64));
        tbl_CL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_CL.setForeground(new java.awt.Color(61, 61, 61));
        tbl_CL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã chủng loại", "Tên chủng loại", "Miêu tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_CL.setGridColor(java.awt.Color.black);
        tbl_CL.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tbl_CL.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tbl_CL.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_CL.getTableHeader().setReorderingAllowed(false);
        tbl_CL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_CLMousePressed(evt);
            }
        });
        scroll_CL.setViewportView(tbl_CL);

        javax.swing.GroupLayout pnl_Sub_CLLayout = new javax.swing.GroupLayout(pnl_Sub_CL);
        pnl_Sub_CL.setLayout(pnl_Sub_CLLayout);
        pnl_Sub_CLLayout.setHorizontalGroup(
            pnl_Sub_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_CL)
            .addGroup(pnl_Sub_CLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_CLLayout.createSequentialGroup()
                        .addComponent(pnlTitle_CL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_Sub_CLLayout.createSequentialGroup()
                        .addGroup(pnl_Sub_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlMainBtn_CL, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                            .addComponent(pnlInfor_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_Sub_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_Sub_CLLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlPic_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Sub_CLLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(pnlNavigation_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnl_Sub_CLLayout.setVerticalGroup(
            pnl_Sub_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Sub_CLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitle_CL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfor_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainBtn_CL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNavigation_CL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_CL, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_ChungLoaiLayout = new javax.swing.GroupLayout(pnl_ChungLoai);
        pnl_ChungLoai.setLayout(pnl_ChungLoaiLayout);
        pnl_ChungLoaiLayout.setHorizontalGroup(
            pnl_ChungLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(pnl_ChungLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ChungLoaiLayout.setVerticalGroup(
            pnl_ChungLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(pnl_ChungLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_CL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("QUẢN LÝ CHỦNG LOẠI", pnl_ChungLoai);

        pnl_NhanVien.setForeground(new java.awt.Color(205, 255, 255));
        pnl_NhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_NhanVien.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnl_NhanVien.setPreferredSize(new java.awt.Dimension(907, 552));

        pnl_Sub_NV.setBackground(new java.awt.Color(61, 61, 61));

        pnlTitle_NV.setBackground(new java.awt.Color(61, 61, 61));

        lblTitle_NV.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle_NV.setForeground(new java.awt.Color(255, 209, 84));
        lblTitle_NV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/staff 24px.png"))); // NOI18N
        lblTitle_NV.setText("QUẢN LÝ NHÂN VIÊN");
        lblTitle_NV.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle_NV.setIconTextGap(15);

        javax.swing.GroupLayout pnlTitle_NVLayout = new javax.swing.GroupLayout(pnlTitle_NV);
        pnlTitle_NV.setLayout(pnlTitle_NVLayout);
        pnlTitle_NVLayout.setHorizontalGroup(
            pnlTitle_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_NVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle_NV)
                .addContainerGap())
        );
        pnlTitle_NVLayout.setVerticalGroup(
            pnlTitle_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_NVLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTitle_NV)
                .addContainerGap())
        );

        pnlInfor_NV.setBackground(new java.awt.Color(61, 61, 61));

        lblMa_NV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMa_NV.setForeground(new java.awt.Color(255, 255, 169));
        lblMa_NV.setText("Mã nhân viên:");

        txtMa_NV.setBackground(new java.awt.Color(255, 146, 64));
        txtMa_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMa_NV.setForeground(new java.awt.Color(255, 255, 169));

        lblMatKhau_NV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMatKhau_NV.setForeground(new java.awt.Color(255, 255, 169));
        lblMatKhau_NV.setText("Mật khẩu:");

        txtMatKhau_NV.setBackground(new java.awt.Color(255, 146, 64));
        txtMatKhau_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMatKhau_NV.setForeground(new java.awt.Color(255, 255, 169));

        lblHoTen_NV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblHoTen_NV.setForeground(new java.awt.Color(255, 255, 169));
        lblHoTen_NV.setText("Họ và tên:");

        txtHoTen_NV.setBackground(new java.awt.Color(255, 146, 64));
        txtHoTen_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHoTen_NV.setForeground(new java.awt.Color(255, 255, 169));

        lblGioiTinh_NV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGioiTinh_NV.setForeground(new java.awt.Color(255, 255, 169));
        lblGioiTinh_NV.setText("Giới tính:");

        rdoNam_NV.setBackground(new java.awt.Color(61, 61, 61));
        rdoGioiTinh_NV.add(rdoNam_NV);
        rdoNam_NV.setForeground(new java.awt.Color(255, 255, 169));
        rdoNam_NV.setText("Nam");

        rdoNu_NV.setBackground(new java.awt.Color(61, 61, 61));
        rdoGioiTinh_NV.add(rdoNu_NV);
        rdoNu_NV.setForeground(new java.awt.Color(255, 255, 169));
        rdoNu_NV.setText("Nữ");

        lblNgaySinh_NV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNgaySinh_NV.setForeground(new java.awt.Color(255, 255, 169));
        lblNgaySinh_NV.setText("Ngày sinh:");

        txtNgaySinh_NV.setBackground(new java.awt.Color(255, 146, 64));
        txtNgaySinh_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgaySinh_NV.setForeground(new java.awt.Color(255, 255, 169));

        javax.swing.GroupLayout pnlInfor_NVLayout = new javax.swing.GroupLayout(pnlInfor_NV);
        pnlInfor_NV.setLayout(pnlInfor_NVLayout);
        pnlInfor_NVLayout.setHorizontalGroup(
            pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_NVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGioiTinh_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgaySinh_NV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMatKhau_NV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoTen_NV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMa_NV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfor_NVLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHoTen_NV)
                                .addComponent(txtMatKhau_NV)
                                .addComponent(txtMa_NV, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                            .addComponent(txtNgaySinh_NV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInfor_NVLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rdoNam_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNu_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlInfor_NVLayout.setVerticalGroup(
            pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_NVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMa_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNam_NV)
                    .addComponent(rdoNu_NV))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNgaySinh_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPic_NV.setBackground(new java.awt.Color(61, 61, 61));

        lblPic_NV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/staff 256px.png"))); // NOI18N

        javax.swing.GroupLayout pnlPic_NVLayout = new javax.swing.GroupLayout(pnlPic_NV);
        pnlPic_NV.setLayout(pnlPic_NVLayout);
        pnlPic_NVLayout.setHorizontalGroup(
            pnlPic_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_NVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_NV, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPic_NVLayout.setVerticalGroup(
            pnlPic_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_NVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_NV, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainBtn_NV.setBackground(new java.awt.Color(61, 61, 61));
        pnlMainBtn_NV.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnThem_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnThem_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnThem_NV.setForeground(new java.awt.Color(255, 255, 169));
        btnThem_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addition.png"))); // NOI18N
        btnThem_NV.setText("Thêm");
        btnThem_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem_NV.setFocusable(false);
        btnThem_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_NVActionPerformed(evt);
            }
        });
        pnlMainBtn_NV.add(btnThem_NV);

        btnSua_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnSua_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSua_NV.setForeground(new java.awt.Color(255, 255, 169));
        btnSua_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edition.png"))); // NOI18N
        btnSua_NV.setText("Sửa");
        btnSua_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua_NV.setFocusable(false);
        btnSua_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_NVActionPerformed(evt);
            }
        });
        pnlMainBtn_NV.add(btnSua_NV);

        btnXoa_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnXoa_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnXoa_NV.setForeground(new java.awt.Color(255, 255, 169));
        btnXoa_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletion.png"))); // NOI18N
        btnXoa_NV.setText("Xóa");
        btnXoa_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa_NV.setFocusable(false);
        btnXoa_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_NVActionPerformed(evt);
            }
        });
        pnlMainBtn_NV.add(btnXoa_NV);

        btnMoi_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnMoi_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMoi_NV.setForeground(new java.awt.Color(255, 255, 169));
        btnMoi_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        btnMoi_NV.setText("Mới");
        btnMoi_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoi_NV.setFocusable(false);
        btnMoi_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi_NVActionPerformed(evt);
            }
        });
        pnlMainBtn_NV.add(btnMoi_NV);

        pnlNavigation_NV.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation_NV.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst_NV.setFocusable(false);
        btnFirst_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_NVActionPerformed(evt);
            }
        });
        pnlNavigation_NV.add(btnFirst_NV);

        btnPrevious_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevious_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevious_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevious_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevious_NV.setFocusable(false);
        btnPrevious_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_NVActionPerformed(evt);
            }
        });
        pnlNavigation_NV.add(btnPrevious_NV);

        btnNext_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnNext_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext_NV.setFocusable(false);
        btnNext_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_NVActionPerformed(evt);
            }
        });
        pnlNavigation_NV.add(btnNext_NV);

        btnLast_NV.setBackground(new java.awt.Color(255, 146, 64));
        btnLast_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast_NV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast_NV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast_NV.setFocusable(false);
        btnLast_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_NVActionPerformed(evt);
            }
        });
        pnlNavigation_NV.add(btnLast_NV);

        tbl_NV.setBackground(new java.awt.Color(255, 146, 64));
        tbl_NV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_NV.setForeground(new java.awt.Color(61, 61, 61));
        tbl_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Mật khẩu", "Họ tên", "Giới tính", "Ngày sinh", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_NV.setGridColor(java.awt.Color.black);
        tbl_NV.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tbl_NV.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tbl_NV.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_NV.getTableHeader().setReorderingAllowed(false);
        tbl_NV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_NVMousePressed(evt);
            }
        });
        scroll_NV.setViewportView(tbl_NV);

        javax.swing.GroupLayout pnl_Sub_NVLayout = new javax.swing.GroupLayout(pnl_Sub_NV);
        pnl_Sub_NV.setLayout(pnl_Sub_NVLayout);
        pnl_Sub_NVLayout.setHorizontalGroup(
            pnl_Sub_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_NV)
            .addGroup(pnl_Sub_NVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_NVLayout.createSequentialGroup()
                        .addComponent(pnlTitle_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_Sub_NVLayout.createSequentialGroup()
                        .addGroup(pnl_Sub_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlMainBtn_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlInfor_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_Sub_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_Sub_NVLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlPic_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Sub_NVLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(pnlNavigation_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnl_Sub_NVLayout.setVerticalGroup(
            pnl_Sub_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Sub_NVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitle_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfor_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainBtn_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNavigation_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_NV, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_NhanVienLayout = new javax.swing.GroupLayout(pnl_NhanVien);
        pnl_NhanVien.setLayout(pnl_NhanVienLayout);
        pnl_NhanVienLayout.setHorizontalGroup(
            pnl_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(pnl_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_NhanVienLayout.setVerticalGroup(
            pnl_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(pnl_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("QUẢN LÝ NHÂN VIÊN", pnl_NhanVien);

        pnl_KhachHang.setForeground(new java.awt.Color(205, 255, 255));
        pnl_KhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_KhachHang.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnl_KhachHang.setPreferredSize(new java.awt.Dimension(907, 552));

        pnl_Sub_KH.setBackground(new java.awt.Color(61, 61, 61));

        pnlTitle_KH.setBackground(new java.awt.Color(61, 61, 61));

        lblTitle_KH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle_KH.setForeground(new java.awt.Color(255, 209, 84));
        lblTitle_KH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer 24px.png"))); // NOI18N
        lblTitle_KH.setText("QUẢN LÝ KHÁCH HÀNG");
        lblTitle_KH.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle_KH.setIconTextGap(15);

        javax.swing.GroupLayout pnlTitle_KHLayout = new javax.swing.GroupLayout(pnlTitle_KH);
        pnlTitle_KH.setLayout(pnlTitle_KHLayout);
        pnlTitle_KHLayout.setHorizontalGroup(
            pnlTitle_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_KHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle_KH)
                .addContainerGap())
        );
        pnlTitle_KHLayout.setVerticalGroup(
            pnlTitle_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_KHLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTitle_KH)
                .addContainerGap())
        );

        pnlMa_KH.setBackground(new java.awt.Color(61, 61, 61));

        lblMa_KH.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblMa_KH.setForeground(new java.awt.Color(255, 255, 169));
        lblMa_KH.setText("Mã khách hàng:");

        txtMa_KH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtMa_KH.setForeground(new java.awt.Color(255, 146, 64));
        txtMa_KH.setText("KH000");

        javax.swing.GroupLayout pnlMa_KHLayout = new javax.swing.GroupLayout(pnlMa_KH);
        pnlMa_KH.setLayout(pnlMa_KHLayout);
        pnlMa_KHLayout.setHorizontalGroup(
            pnlMa_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMa_KHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMa_KH)
                .addGap(18, 18, 18)
                .addComponent(txtMa_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMa_KHLayout.setVerticalGroup(
            pnlMa_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMa_KHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlMa_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa_KH)
                    .addComponent(txtMa_KH)))
        );

        pnlInfor_KH.setBackground(new java.awt.Color(61, 61, 61));

        lblTen_KH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTen_KH.setForeground(new java.awt.Color(255, 255, 169));
        lblTen_KH.setText("Tên khách hàng:");

        txtTen_KH.setBackground(new java.awt.Color(255, 146, 64));
        txtTen_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTen_KH.setForeground(new java.awt.Color(255, 255, 169));

        lblMatKhau_KH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMatKhau_KH.setForeground(new java.awt.Color(255, 255, 169));
        lblMatKhau_KH.setText("Mật khẩu:");

        txtMatKhau_KH.setBackground(new java.awt.Color(255, 146, 64));
        txtMatKhau_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMatKhau_KH.setForeground(new java.awt.Color(255, 255, 169));

        lblNgaySinh_KH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNgaySinh_KH.setForeground(new java.awt.Color(255, 255, 169));
        lblNgaySinh_KH.setText("Ngày sinh:");

        txtNgaySinh_KH.setBackground(new java.awt.Color(255, 146, 64));
        txtNgaySinh_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgaySinh_KH.setForeground(new java.awt.Color(255, 255, 169));

        lblGioiTinh_KH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGioiTinh_KH.setForeground(new java.awt.Color(255, 255, 169));
        lblGioiTinh_KH.setText("Giới tính:");

        rdoNam_KH.setBackground(new java.awt.Color(61, 61, 61));
        rdoGioiTinh_KH.add(rdoNam_KH);
        rdoNam_KH.setForeground(new java.awt.Color(255, 255, 169));
        rdoNam_KH.setText("Nam");

        rdoNu_KH.setBackground(new java.awt.Color(61, 61, 61));
        rdoGioiTinh_KH.add(rdoNu_KH);
        rdoNu_KH.setForeground(new java.awt.Color(255, 255, 169));
        rdoNu_KH.setText("Nữ");

        lblNgayDangKy_KH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNgayDangKy_KH.setForeground(new java.awt.Color(255, 255, 169));
        lblNgayDangKy_KH.setText("Ngày đăng ký:");

        txtNgayDangKy_KH.setBackground(new java.awt.Color(255, 146, 64));
        txtNgayDangKy_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgayDangKy_KH.setForeground(new java.awt.Color(255, 255, 169));
        txtNgayDangKy_KH.setFocusable(false);

        javax.swing.GroupLayout pnlInfor_KHLayout = new javax.swing.GroupLayout(pnlInfor_KH);
        pnlInfor_KH.setLayout(pnlInfor_KHLayout);
        pnlInfor_KHLayout.setHorizontalGroup(
            pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_KHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfor_KHLayout.createSequentialGroup()
                        .addComponent(lblNgayDangKy_KH)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblGioiTinh_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgaySinh_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMatKhau_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTen_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTen_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(txtMatKhau_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(txtNgaySinh_KH)
                    .addComponent(txtNgayDangKy_KH)
                    .addGroup(pnlInfor_KHLayout.createSequentialGroup()
                        .addComponent(rdoNam_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNu_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlInfor_KHLayout.setVerticalGroup(
            pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_KHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNam_KH)
                    .addComponent(rdoNu_KH))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayDangKy_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayDangKy_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPic_KH.setBackground(new java.awt.Color(61, 61, 61));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer 256px.png"))); // NOI18N

        javax.swing.GroupLayout pnlPic_KHLayout = new javax.swing.GroupLayout(pnlPic_KH);
        pnlPic_KH.setLayout(pnlPic_KHLayout);
        pnlPic_KHLayout.setHorizontalGroup(
            pnlPic_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPic_KHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlPic_KHLayout.setVerticalGroup(
            pnlPic_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_KHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSua_KH.setBackground(new java.awt.Color(255, 146, 64));
        btnSua_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSua_KH.setForeground(new java.awt.Color(255, 255, 169));
        btnSua_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edition.png"))); // NOI18N
        btnSua_KH.setText("Sửa");
        btnSua_KH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua_KH.setFocusable(false);
        btnSua_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_KHActionPerformed(evt);
            }
        });

        pnlNavigation_KH.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation_KH.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst_KH.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst_KH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst_KH.setFocusable(false);
        btnFirst_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_KHActionPerformed(evt);
            }
        });
        pnlNavigation_KH.add(btnFirst_KH);

        btnPrevioust_KH.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevioust_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevioust_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevioust_KH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevioust_KH.setFocusable(false);
        btnPrevioust_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevioust_KHActionPerformed(evt);
            }
        });
        pnlNavigation_KH.add(btnPrevioust_KH);

        btnNext_KH.setBackground(new java.awt.Color(255, 146, 64));
        btnNext_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext_KH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext_KH.setFocusable(false);
        btnNext_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_KHActionPerformed(evt);
            }
        });
        pnlNavigation_KH.add(btnNext_KH);

        btnLast_KH.setBackground(new java.awt.Color(255, 146, 64));
        btnLast_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast_KH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast_KH.setFocusable(false);
        btnLast_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_KHActionPerformed(evt);
            }
        });
        pnlNavigation_KH.add(btnLast_KH);

        tbl_KH.setBackground(new java.awt.Color(255, 146, 64));
        tbl_KH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_KH.setForeground(new java.awt.Color(61, 61, 61));
        tbl_KH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Mật khẩu", "Ngày sinh", "Giới tính", "Ngày đăng ký"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_KH.setGridColor(java.awt.Color.black);
        tbl_KH.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tbl_KH.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tbl_KH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_KH.getTableHeader().setReorderingAllowed(false);
        tbl_KH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_KHMousePressed(evt);
            }
        });
        scroll_KH.setViewportView(tbl_KH);

        javax.swing.GroupLayout pnl_Sub_KHLayout = new javax.swing.GroupLayout(pnl_Sub_KH);
        pnl_Sub_KH.setLayout(pnl_Sub_KHLayout);
        pnl_Sub_KHLayout.setHorizontalGroup(
            pnl_Sub_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_KH)
            .addGroup(pnl_Sub_KHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_KHLayout.createSequentialGroup()
                        .addComponent(pnlTitle_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMa_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(pnl_Sub_KHLayout.createSequentialGroup()
                        .addComponent(btnSua_KH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNavigation_KH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_Sub_KHLayout.createSequentialGroup()
                        .addComponent(pnlInfor_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPic_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_Sub_KHLayout.setVerticalGroup(
            pnl_Sub_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Sub_KHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMa_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTitle_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfor_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlNavigation_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua_KH))
                .addGap(7, 7, 7)
                .addComponent(scroll_KH, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_KhachHangLayout = new javax.swing.GroupLayout(pnl_KhachHang);
        pnl_KhachHang.setLayout(pnl_KhachHangLayout);
        pnl_KhachHangLayout.setHorizontalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_KhachHangLayout.setVerticalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("QUẢN LÝ KHÁCH HÀNG", pnl_KhachHang);

        pnl_HoaDon.setForeground(new java.awt.Color(205, 255, 255));
        pnl_HoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_HoaDon.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnl_HoaDon.setPreferredSize(new java.awt.Dimension(907, 552));

        pnl_Sub_HD.setBackground(new java.awt.Color(61, 61, 61));

        pnlTitle_HD.setBackground(new java.awt.Color(61, 61, 61));

        lblTitle_HD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle_HD.setForeground(new java.awt.Color(255, 209, 84));
        lblTitle_HD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bill 24px.png"))); // NOI18N
        lblTitle_HD.setText("QUẢN LÝ HÓA ĐƠN");
        lblTitle_HD.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle_HD.setIconTextGap(15);

        javax.swing.GroupLayout pnlTitle_HDLayout = new javax.swing.GroupLayout(pnlTitle_HD);
        pnlTitle_HD.setLayout(pnlTitle_HDLayout);
        pnlTitle_HDLayout.setHorizontalGroup(
            pnlTitle_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_HDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle_HD)
                .addContainerGap())
        );
        pnlTitle_HDLayout.setVerticalGroup(
            pnlTitle_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_HDLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTitle_HD)
                .addContainerGap())
        );

        pnlMa_HD.setBackground(new java.awt.Color(61, 61, 61));

        lblMa_HD.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblMa_HD.setForeground(new java.awt.Color(255, 255, 169));
        lblMa_HD.setText("Mã hóa đơn:");

        txtMa_HD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtMa_HD.setForeground(new java.awt.Color(255, 146, 64));
        txtMa_HD.setText("HD001");

        javax.swing.GroupLayout pnlMa_HDLayout = new javax.swing.GroupLayout(pnlMa_HD);
        pnlMa_HD.setLayout(pnlMa_HDLayout);
        pnlMa_HDLayout.setHorizontalGroup(
            pnlMa_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMa_HDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMa_HD)
                .addGap(18, 18, 18)
                .addComponent(txtMa_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMa_HDLayout.setVerticalGroup(
            pnlMa_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMa_HDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMa_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa_HD)
                    .addComponent(txtMa_HD))
                .addContainerGap())
        );

        pnlInfor_HD.setBackground(new java.awt.Color(61, 61, 61));

        lblMaNV_HD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMaNV_HD.setForeground(new java.awt.Color(255, 255, 169));
        lblMaNV_HD.setText("Mã nhân viên:");

        txtMaNV_HD.setBackground(new java.awt.Color(255, 146, 64));
        txtMaNV_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMaNV_HD.setForeground(new java.awt.Color(255, 255, 169));

        lblNgayLap_HD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNgayLap_HD.setForeground(new java.awt.Color(255, 255, 169));
        lblNgayLap_HD.setText("Ngày lập:");

        txtNgayLap_HD.setBackground(new java.awt.Color(255, 146, 64));
        txtNgayLap_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgayLap_HD.setForeground(new java.awt.Color(255, 255, 169));

        lblTongTien_HD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTongTien_HD.setForeground(new java.awt.Color(255, 255, 169));
        lblTongTien_HD.setText("Tổng tiền:");

        txtTongTien_HD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTongTien_HD.setForeground(new java.awt.Color(255, 146, 64));
        txtTongTien_HD.setText("00000.000");

        lblDonViGia_HD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDonViGia_HD.setForeground(new java.awt.Color(255, 146, 64));
        lblDonViGia_HD.setText("VND");

        javax.swing.GroupLayout pnlInfor_HDLayout = new javax.swing.GroupLayout(pnlInfor_HD);
        pnlInfor_HD.setLayout(pnlInfor_HDLayout);
        pnlInfor_HDLayout.setHorizontalGroup(
            pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_HDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfor_HDLayout.createSequentialGroup()
                        .addGroup(pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNV_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNgayLap_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayLap_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(txtMaNV_HD)))
                    .addGroup(pnlInfor_HDLayout.createSequentialGroup()
                        .addComponent(lblTongTien_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongTien_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(lblDonViGia_HD)))
                .addContainerGap())
        );
        pnlInfor_HDLayout.setVerticalGroup(
            pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_HDLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNV_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayLap_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayLap_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfor_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTongTien_HD)
                        .addComponent(lblDonViGia_HD))
                    .addComponent(lblTongTien_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPic_HD.setBackground(new java.awt.Color(61, 61, 61));

        lblPic_HD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bill 256px.png"))); // NOI18N

        javax.swing.GroupLayout pnlPic_HDLayout = new javax.swing.GroupLayout(pnlPic_HD);
        pnlPic_HD.setLayout(pnlPic_HDLayout);
        pnlPic_HDLayout.setHorizontalGroup(
            pnlPic_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_HDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPic_HDLayout.setVerticalGroup(
            pnlPic_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_HDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnXoa_HD.setBackground(new java.awt.Color(255, 146, 64));
        btnXoa_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnXoa_HD.setForeground(new java.awt.Color(255, 255, 169));
        btnXoa_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletion.png"))); // NOI18N
        btnXoa_HD.setText("Xóa");
        btnXoa_HD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa_HD.setFocusable(false);
        btnXoa_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_HDActionPerformed(evt);
            }
        });

        lblMeo_HD.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblMeo_HD.setForeground(new java.awt.Color(255, 255, 169));
        lblMeo_HD.setText("Mẹo: Double click để xem thông tin chi tiết, nhé!");

        pnlNavigation_HD.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation_HD.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst_HD.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst_HD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst_HD.setFocusable(false);
        btnFirst_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_HDActionPerformed(evt);
            }
        });
        pnlNavigation_HD.add(btnFirst_HD);

        btnPrevioust_HD.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevioust_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevioust_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevioust_HD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevioust_HD.setFocusable(false);
        btnPrevioust_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevioust_HDActionPerformed(evt);
            }
        });
        pnlNavigation_HD.add(btnPrevioust_HD);

        btnNext_HD.setBackground(new java.awt.Color(255, 146, 64));
        btnNext_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext_HD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext_HD.setFocusable(false);
        btnNext_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_HDActionPerformed(evt);
            }
        });
        pnlNavigation_HD.add(btnNext_HD);

        btnLast_HD.setBackground(new java.awt.Color(255, 146, 64));
        btnLast_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast_HD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast_HD.setFocusable(false);
        btnLast_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_HDActionPerformed(evt);
            }
        });
        pnlNavigation_HD.add(btnLast_HD);

        tbl_HD.setBackground(new java.awt.Color(255, 146, 64));
        tbl_HD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_HD.setForeground(new java.awt.Color(61, 61, 61));
        tbl_HD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập", "Mã nhân viên", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_HD.setGridColor(java.awt.Color.black);
        tbl_HD.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tbl_HD.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tbl_HD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_HD.getTableHeader().setReorderingAllowed(false);
        tbl_HD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_HDMousePressed(evt);
            }
        });
        scroll_HD.setViewportView(tbl_HD);

        javax.swing.GroupLayout pnl_Sub_HDLayout = new javax.swing.GroupLayout(pnl_Sub_HD);
        pnl_Sub_HD.setLayout(pnl_Sub_HDLayout);
        pnl_Sub_HDLayout.setHorizontalGroup(
            pnl_Sub_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
            .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                        .addComponent(pnlTitle_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMa_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                        .addComponent(btnXoa_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMeo_HD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNavigation_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                        .addComponent(pnlInfor_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPic_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_Sub_HDLayout.setVerticalGroup(
            pnl_Sub_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                .addGroup(pnl_Sub_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTitle_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(pnlMa_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_Sub_HDLayout.createSequentialGroup()
                        .addComponent(pnlInfor_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlNavigation_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Sub_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa_HD)
                        .addComponent(lblMeo_HD)))
                .addGap(7, 7, 7)
                .addComponent(scroll_HD, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout pnl_HoaDonLayout = new javax.swing.GroupLayout(pnl_HoaDon);
        pnl_HoaDon.setLayout(pnl_HoaDonLayout);
        pnl_HoaDonLayout.setHorizontalGroup(
            pnl_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(pnl_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_HoaDonLayout.setVerticalGroup(
            pnl_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(pnl_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_HoaDonLayout.createSequentialGroup()
                    .addComponent(pnl_Sub_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabs.addTab("QUẢN LÝ HÓA ĐƠN", pnl_HoaDon);

        pnl_DonHang.setForeground(new java.awt.Color(205, 255, 255));
        pnl_DonHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_DonHang.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnl_DonHang.setPreferredSize(new java.awt.Dimension(907, 552));

        pnl_Sub_DH.setBackground(new java.awt.Color(61, 61, 61));

        pnlTitle_DH.setBackground(new java.awt.Color(61, 61, 61));

        lblTitle_DH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle_DH.setForeground(new java.awt.Color(255, 209, 84));
        lblTitle_DH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle_DH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/order 24px.png"))); // NOI18N
        lblTitle_DH.setText("QUẢN LÝ ĐƠN HÀNG");
        lblTitle_DH.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle_DH.setIconTextGap(15);

        javax.swing.GroupLayout pnlTitle_DHLayout = new javax.swing.GroupLayout(pnlTitle_DH);
        pnlTitle_DH.setLayout(pnlTitle_DHLayout);
        pnlTitle_DHLayout.setHorizontalGroup(
            pnlTitle_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_DHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle_DH)
                .addContainerGap())
        );
        pnlTitle_DHLayout.setVerticalGroup(
            pnlTitle_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitle_DHLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTitle_DH)
                .addContainerGap())
        );

        pnlMa_DH.setBackground(new java.awt.Color(61, 61, 61));

        lblMa_DH.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblMa_DH.setForeground(new java.awt.Color(255, 255, 169));
        lblMa_DH.setText("Mã đơn hàng:");

        txtMa_DH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtMa_DH.setForeground(new java.awt.Color(255, 146, 64));
        txtMa_DH.setText("DH001");

        javax.swing.GroupLayout pnlMa_DHLayout = new javax.swing.GroupLayout(pnlMa_DH);
        pnlMa_DH.setLayout(pnlMa_DHLayout);
        pnlMa_DHLayout.setHorizontalGroup(
            pnlMa_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMa_DHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMa_DH)
                .addGap(18, 18, 18)
                .addComponent(txtMa_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMa_DHLayout.setVerticalGroup(
            pnlMa_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMa_DHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMa_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa_DH)
                    .addComponent(txtMa_DH))
                .addContainerGap())
        );

        pnlInfor_DH.setBackground(new java.awt.Color(61, 61, 61));

        lblMaKH_DH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMaKH_DH.setForeground(new java.awt.Color(255, 255, 169));
        lblMaKH_DH.setText("Mã khách hàng:");

        txtMaKH_DH.setBackground(new java.awt.Color(255, 146, 64));
        txtMaKH_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMaKH_DH.setForeground(new java.awt.Color(255, 255, 169));

        txtNgayDatHang_DH.setBackground(new java.awt.Color(255, 146, 64));
        txtNgayDatHang_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgayDatHang_DH.setForeground(new java.awt.Color(255, 255, 169));

        lblNgayDatHang_DH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNgayDatHang_DH.setForeground(new java.awt.Color(255, 255, 169));
        lblNgayDatHang_DH.setText("Ngày đặt hàng:");

        lblTongTien_DH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTongTien_DH.setForeground(new java.awt.Color(255, 255, 169));
        lblTongTien_DH.setText("Tổng tiền:");

        txtTongTien_DH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTongTien_DH.setForeground(new java.awt.Color(255, 146, 64));
        txtTongTien_DH.setText("0000.000");

        lblDonViGia_DH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDonViGia_DH.setForeground(new java.awt.Color(255, 146, 64));
        lblDonViGia_DH.setText("VND");

        javax.swing.GroupLayout pnlInfor_DHLayout = new javax.swing.GroupLayout(pnlInfor_DH);
        pnlInfor_DH.setLayout(pnlInfor_DHLayout);
        pnlInfor_DHLayout.setHorizontalGroup(
            pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_DHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfor_DHLayout.createSequentialGroup()
                        .addGroup(pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaKH_DH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNgayDatHang_DH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayDatHang_DH, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(txtMaKH_DH)))
                    .addGroup(pnlInfor_DHLayout.createSequentialGroup()
                        .addComponent(lblTongTien_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongTien_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(lblDonViGia_DH)))
                .addContainerGap())
        );
        pnlInfor_DHLayout.setVerticalGroup(
            pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_DHLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKH_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayDatHang_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayDatHang_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnlInfor_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongTien_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien_DH)
                    .addComponent(lblDonViGia_DH))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPic_DH.setBackground(new java.awt.Color(61, 61, 61));

        lblPic_DH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic_DH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/order 256px.png"))); // NOI18N

        javax.swing.GroupLayout pnlPic_DHLayout = new javax.swing.GroupLayout(pnlPic_DH);
        pnlPic_DH.setLayout(pnlPic_DHLayout);
        pnlPic_DHLayout.setHorizontalGroup(
            pnlPic_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_DHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_DH, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPic_DHLayout.setVerticalGroup(
            pnlPic_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_DHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_DH, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnXoa_DH.setBackground(new java.awt.Color(255, 146, 64));
        btnXoa_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnXoa_DH.setForeground(new java.awt.Color(255, 255, 169));
        btnXoa_DH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletion.png"))); // NOI18N
        btnXoa_DH.setText("Xóa");
        btnXoa_DH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa_DH.setFocusable(false);
        btnXoa_DH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_DHActionPerformed(evt);
            }
        });

        lblMeo_DH.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblMeo_DH.setForeground(new java.awt.Color(255, 255, 169));
        lblMeo_DH.setText("Mẹo: Double click để xem thông tin chi tiết, nhé!");

        pnlNavigation_DH.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation_DH.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst_DH.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst_DH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst_DH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst_DH.setFocusable(false);
        btnFirst_DH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_DHActionPerformed(evt);
            }
        });
        pnlNavigation_DH.add(btnFirst_DH);

        btnPrevious_DH.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevious_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevious_DH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevious_DH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevious_DH.setFocusable(false);
        btnPrevious_DH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_DHActionPerformed(evt);
            }
        });
        pnlNavigation_DH.add(btnPrevious_DH);

        btnNext_DH.setBackground(new java.awt.Color(255, 146, 64));
        btnNext_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext_DH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext_DH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext_DH.setFocusable(false);
        btnNext_DH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_DHActionPerformed(evt);
            }
        });
        pnlNavigation_DH.add(btnNext_DH);

        btnLast_DH.setBackground(new java.awt.Color(255, 146, 64));
        btnLast_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast_DH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast_DH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast_DH.setFocusable(false);
        btnLast_DH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_DHActionPerformed(evt);
            }
        });
        pnlNavigation_DH.add(btnLast_DH);

        tbl_DH.setBackground(new java.awt.Color(255, 146, 64));
        tbl_DH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_DH.setForeground(new java.awt.Color(61, 61, 61));
        tbl_DH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã đơn hàng", "Ngày đặt hàng", "Mã khách hàng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DH.setGridColor(java.awt.Color.black);
        tbl_DH.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tbl_DH.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tbl_DH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_DH.getTableHeader().setReorderingAllowed(false);
        tbl_DH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_DHMousePressed(evt);
            }
        });
        sroll_DH.setViewportView(tbl_DH);

        javax.swing.GroupLayout pnl_Sub_DHLayout = new javax.swing.GroupLayout(pnl_Sub_DH);
        pnl_Sub_DH.setLayout(pnl_Sub_DHLayout);
        pnl_Sub_DHLayout.setHorizontalGroup(
            pnl_Sub_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sroll_DH)
            .addGroup(pnl_Sub_DHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_DHLayout.createSequentialGroup()
                        .addComponent(pnlTitle_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMa_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(pnl_Sub_DHLayout.createSequentialGroup()
                        .addComponent(btnXoa_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMeo_DH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNavigation_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_Sub_DHLayout.createSequentialGroup()
                        .addComponent(pnlInfor_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPic_DH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_Sub_DHLayout.setVerticalGroup(
            pnl_Sub_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Sub_DHLayout.createSequentialGroup()
                .addGroup(pnl_Sub_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_DHLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTitle_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_Sub_DHLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(pnlMa_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic_DH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfor_DH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlNavigation_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Sub_DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa_DH)
                        .addComponent(lblMeo_DH)))
                .addGap(7, 7, 7)
                .addComponent(sroll_DH, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_DonHangLayout = new javax.swing.GroupLayout(pnl_DonHang);
        pnl_DonHang.setLayout(pnl_DonHangLayout);
        pnl_DonHangLayout.setHorizontalGroup(
            pnl_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(pnl_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_DH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_DonHangLayout.setVerticalGroup(
            pnl_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(pnl_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sub_DH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("QUẢN LÝ ĐƠN HÀNG", pnl_DonHang);

        pnl_ThongKe.setForeground(new java.awt.Color(205, 255, 255));
        pnl_ThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_ThongKe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pnl_ThongKe.setPreferredSize(new java.awt.Dimension(907, 552));

        pnl_Sub_TK.setBackground(new java.awt.Color(61, 61, 61));

        lblTitle_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle_TK.setForeground(new java.awt.Color(255, 209, 84));
        lblTitle_TK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistics.png"))); // NOI18N
        lblTitle_TK.setText("DANH SÁCH THỐNG KÊ");
        lblTitle_TK.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle_TK.setIconTextGap(15);

        pnlPic_TK.setBackground(new java.awt.Color(61, 61, 61));

        lblPic_TK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistics 256px.png"))); // NOI18N

        javax.swing.GroupLayout pnlPic_TKLayout = new javax.swing.GroupLayout(pnlPic_TK);
        pnlPic_TK.setLayout(pnlPic_TKLayout);
        pnlPic_TKLayout.setHorizontalGroup(
            pnlPic_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_TKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPic_TKLayout.setVerticalGroup(
            pnlPic_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPic_TKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic_TK, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlInfor_TK.setBackground(new java.awt.Color(61, 61, 61));

        lblNam_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblNam_TK.setForeground(new java.awt.Color(255, 255, 169));
        lblNam_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblNam_TK.setText("Năm:");

        txtNam_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtNam_TK.setForeground(new java.awt.Color(255, 146, 64));
        txtNam_TK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDoanhThu_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDoanhThu_TK.setForeground(new java.awt.Color(255, 255, 169));
        lblDoanhThu_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblDoanhThu_TK.setText("Doanh thu (VND): ");

        txtDoanhThu_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtDoanhThu_TK.setForeground(new java.awt.Color(255, 146, 64));
        txtDoanhThu_TK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblBanNhieuNhat_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBanNhieuNhat_TK.setForeground(new java.awt.Color(255, 255, 169));
        lblBanNhieuNhat_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblBanNhieuNhat_TK.setText("Bán nhiều nhất:");

        txtBanNhieuNhat_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtBanNhieuNhat_TK.setForeground(new java.awt.Color(255, 146, 64));
        txtBanNhieuNhat_TK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblBanItNhat_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBanItNhat_TK.setForeground(new java.awt.Color(255, 255, 169));
        lblBanItNhat_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblBanItNhat_TK.setText("Bán ít nhất:");

        txtBanItNhat_TK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtBanItNhat_TK.setForeground(new java.awt.Color(255, 146, 64));
        txtBanItNhat_TK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBanItNhat_TK.setText("SP0000");

        javax.swing.GroupLayout pnlInfor_TKLayout = new javax.swing.GroupLayout(pnlInfor_TK);
        pnlInfor_TK.setLayout(pnlInfor_TKLayout);
        pnlInfor_TKLayout.setHorizontalGroup(
            pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_TKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBanNhieuNhat_TK, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(lblBanItNhat_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNam_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDoanhThu_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBanNhieuNhat_TK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNam_TK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDoanhThu_TK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(txtBanItNhat_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlInfor_TKLayout.setVerticalGroup(
            pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfor_TKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNam_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNam_TK, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoanhThu_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoanhThu_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBanNhieuNhat_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBanNhieuNhat_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfor_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBanItNhat_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBanItNhat_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnlNavigation_TK.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation_TK.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst_TK.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst_TK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst_TK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst_TK.setFocusable(false);
        btnFirst_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst_TKActionPerformed(evt);
            }
        });
        pnlNavigation_TK.add(btnFirst_TK);

        btnPrevious_TK.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevious_TK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevious_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevious_TK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevious_TK.setFocusable(false);
        btnPrevious_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_TKActionPerformed(evt);
            }
        });
        pnlNavigation_TK.add(btnPrevious_TK);

        btnNext_TK.setBackground(new java.awt.Color(255, 146, 64));
        btnNext_TK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext_TK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext_TK.setFocusable(false);
        btnNext_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_TKActionPerformed(evt);
            }
        });
        pnlNavigation_TK.add(btnNext_TK);

        btnLast_TK.setBackground(new java.awt.Color(255, 146, 64));
        btnLast_TK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast_TK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast_TK.setFocusable(false);
        btnLast_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast_TKActionPerformed(evt);
            }
        });
        pnlNavigation_TK.add(btnLast_TK);

        tbl_TK.setBackground(new java.awt.Color(255, 146, 64));
        tbl_TK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_TK.setForeground(new java.awt.Color(61, 61, 61));
        tbl_TK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Năm", "Doanh thu", "Bán nhiều nhất", "Bán ít nhât"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_TK.setGridColor(java.awt.Color.black);
        tbl_TK.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tbl_TK.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tbl_TK.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_TK.getTableHeader().setReorderingAllowed(false);
        tbl_TK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_TKMousePressed(evt);
            }
        });
        scroll_TK.setViewportView(tbl_TK);

        javax.swing.GroupLayout pnl_Sub_TKLayout = new javax.swing.GroupLayout(pnl_Sub_TK);
        pnl_Sub_TK.setLayout(pnl_Sub_TKLayout);
        pnl_Sub_TKLayout.setHorizontalGroup(
            pnl_Sub_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_TK)
            .addGroup(pnl_Sub_TKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Sub_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPic_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Sub_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_TKLayout.createSequentialGroup()
                        .addGap(0, 379, Short.MAX_VALUE)
                        .addComponent(pnlNavigation_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlInfor_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_Sub_TKLayout.setVerticalGroup(
            pnl_Sub_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Sub_TKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle_TK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Sub_TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Sub_TKLayout.createSequentialGroup()
                        .addComponent(pnlInfor_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlNavigation_TK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlPic_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_TK, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_ThongKeLayout = new javax.swing.GroupLayout(pnl_ThongKe);
        pnl_ThongKe.setLayout(pnl_ThongKeLayout);
        pnl_ThongKeLayout.setHorizontalGroup(
            pnl_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Sub_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_ThongKeLayout.setVerticalGroup(
            pnl_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Sub_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabs.addTab("THỐNG KÊ", pnl_ThongKe);

        pnlHeader.setBackground(new java.awt.Color(61, 61, 61));

        btnDangXuat.setBackground(new java.awt.Color(255, 146, 64));
        btnDangXuat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 169));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/log-out.png"))); // NOI18N
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        lblInfor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblInfor.setForeground(new java.awt.Color(217, 217, 217));
        lblInfor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/information.png"))); // NOI18N
        lblInfor.setText("Thông tin chi tiết");
        lblInfor.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblClock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 255, 169));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clock.png"))); // NOI18N
        lblClock.setText("13:30:50");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfor)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfor)
                    .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SPActionPerformed
        if (checkSP()) {
            themSP();
        }
    }//GEN-LAST:event_btnThem_SPActionPerformed

    private void btnSua_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_SPActionPerformed
        suaSP();
    }//GEN-LAST:event_btnSua_SPActionPerformed

    private void btnXoa_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_SPActionPerformed
        xoaSP();
    }//GEN-LAST:event_btnXoa_SPActionPerformed

    private void btnMoi_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi_SPActionPerformed
        btnSua_SP.setEnabled(false);
        btnXoa_SP.setEnabled(false);
        btnMoi_SP.setEnabled(false);
        btnThem_SP.setEnabled(true);
        txtMa_SP.setFocusable(true);
        tbl_SP.setRowSelectionAllowed(false);
        clearFormSP();
    }//GEN-LAST:event_btnMoi_SPActionPerformed

    private void btnFirst_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_SPActionPerformed
        firstSP();
    }//GEN-LAST:event_btnFirst_SPActionPerformed

    private void btnPrevious_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_SPActionPerformed
        prevSP();
    }//GEN-LAST:event_btnPrevious_SPActionPerformed

    private void btnNext_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_SPActionPerformed
        nextSP();
    }//GEN-LAST:event_btnNext_SPActionPerformed

    private void btnLast_SpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_SpActionPerformed
        lastSP();
    }//GEN-LAST:event_btnLast_SpActionPerformed

    private void btnThem_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_CLActionPerformed
        if (checkCL() && checkTenChungLoai()) {
            insertCL();
        }
    }//GEN-LAST:event_btnThem_CLActionPerformed

    private void btnSua_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_CLActionPerformed
        if (checkCL()) {
            if (checkSuaTenCL()) {
                updateCL();
            } else {
                checkTenChungLoai();
                updateCL();
            }
        }
    }//GEN-LAST:event_btnSua_CLActionPerformed

    private void btnXoa_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_CLActionPerformed
        if (checkCL()) {
            deleteCL();
        }
    }//GEN-LAST:event_btnXoa_CLActionPerformed

    private void btnMoi_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi_CLActionPerformed
        clearCL();
    }//GEN-LAST:event_btnMoi_CLActionPerformed

    private void btnFirst_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_CLActionPerformed
        firstCL();
    }//GEN-LAST:event_btnFirst_CLActionPerformed

    private void btnPrevious_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_CLActionPerformed
        previousCL();
    }//GEN-LAST:event_btnPrevious_CLActionPerformed

    private void btnNext_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_CLActionPerformed
        nextCL();
    }//GEN-LAST:event_btnNext_CLActionPerformed

    private void btnLast_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_CLActionPerformed
        lastCL();
    }//GEN-LAST:event_btnLast_CLActionPerformed

    private void btnThem_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_NVActionPerformed
        if (checkNV()) {
            savẹNhanvien();
        }
    }//GEN-LAST:event_btnThem_NVActionPerformed

    private void btnSua_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_NVActionPerformed
        if (checkNV()) {
            updateNhanvien();
        }
    }//GEN-LAST:event_btnSua_NVActionPerformed

    private void btnXoa_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_NVActionPerformed
        if (checkNV() && admin()) {
            deleteNhanvien();
        }
    }//GEN-LAST:event_btnXoa_NVActionPerformed

    private void btnMoi_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi_NVActionPerformed
        newNhanVien();
    }//GEN-LAST:event_btnMoi_NVActionPerformed

    private void btnFirst_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_NVActionPerformed
        FirstNV();
    }//GEN-LAST:event_btnFirst_NVActionPerformed

    private void btnPrevious_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_NVActionPerformed
        PrevNV();
    }//GEN-LAST:event_btnPrevious_NVActionPerformed

    private void btnNext_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_NVActionPerformed
        nextNV();
    }//GEN-LAST:event_btnNext_NVActionPerformed

    private void btnLast_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_NVActionPerformed
        LastNV();
    }//GEN-LAST:event_btnLast_NVActionPerformed

    private void btnFirst_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_KHActionPerformed
        firstKH();
    }//GEN-LAST:event_btnFirst_KHActionPerformed

    private void btnPrevioust_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevioust_KHActionPerformed
        prevKH();
    }//GEN-LAST:event_btnPrevioust_KHActionPerformed

    private void btnNext_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_KHActionPerformed
        nextKH();
    }//GEN-LAST:event_btnNext_KHActionPerformed

    private void btnLast_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_KHActionPerformed
        lastKH();
    }//GEN-LAST:event_btnLast_KHActionPerformed

    private void btnFirst_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_HDActionPerformed
        firstHD();
    }//GEN-LAST:event_btnFirst_HDActionPerformed

    private void btnPrevioust_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevioust_HDActionPerformed
        previousHD();
    }//GEN-LAST:event_btnPrevioust_HDActionPerformed

    private void btnNext_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_HDActionPerformed
        nextHD();
    }//GEN-LAST:event_btnNext_HDActionPerformed

    private void btnLast_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_HDActionPerformed
        lastHD();
    }//GEN-LAST:event_btnLast_HDActionPerformed

    private void btnXoa_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_HDActionPerformed
        deleteHD();
    }//GEN-LAST:event_btnXoa_HDActionPerformed

    private void btnFirst_DHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_DHActionPerformed
        firstDH();
    }//GEN-LAST:event_btnFirst_DHActionPerformed

    private void btnPrevious_DHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_DHActionPerformed
        previousDH();
    }//GEN-LAST:event_btnPrevious_DHActionPerformed

    private void btnNext_DHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_DHActionPerformed
        nextDH();
    }//GEN-LAST:event_btnNext_DHActionPerformed

    private void btnLast_DHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_DHActionPerformed
        lastDH();
    }//GEN-LAST:event_btnLast_DHActionPerformed

    private void btnXoa_DHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_DHActionPerformed
        xoaDH();
    }//GEN-LAST:event_btnXoa_DHActionPerformed

    private void btnFirst_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst_TKActionPerformed
        firstTK();
    }//GEN-LAST:event_btnFirst_TKActionPerformed

    private void btnPrevious_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_TKActionPerformed
        prevTK();
    }//GEN-LAST:event_btnPrevious_TKActionPerformed

    private void btnNext_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_TKActionPerformed
        nextTK();
    }//GEN-LAST:event_btnNext_TKActionPerformed

    private void btnLast_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast_TKActionPerformed
        lastTK();
    }//GEN-LAST:event_btnLast_TKActionPerformed

    private void tbl_SPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SPMousePressed
        btnSua_SP.setEnabled(true);
        btnXoa_SP.setEnabled(true);
        btnMoi_SP.setEnabled(true);
        btnThem_SP.setEnabled(false);
        txtMa_SP.setFocusable(false);
        tbl_SP.setRowSelectionAllowed(true);
        indexSP = tbl_SP.rowAtPoint(evt.getPoint());
        editSP();
    }//GEN-LAST:event_tbl_SPMousePressed

    private void btnSua_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_KHActionPerformed
        if (checkKH())
            updateKH();
    }//GEN-LAST:event_btnSua_KHActionPerformed

    private void tbl_KHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KHMousePressed
        indexKH = tbl_KH.getSelectedRow();
        fillFromTableKH();
    }//GEN-LAST:event_tbl_KHMousePressed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.setVisible(false);
        new DangNhapJDialog(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void tbl_CLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CLMousePressed
        indexCL = tbl_CL.getSelectedRow();
        fillFromTableCL(indexCL);
        btnSua_CL.setEnabled(true);
        btnXoa_CL.setEnabled(true);
        btnThem_CL.setEnabled(false);
    }//GEN-LAST:event_tbl_CLMousePressed

    private void btnTim_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTim_SPActionPerformed
        timSP();
    }//GEN-LAST:event_btnTim_SPActionPerformed

    private void tbl_DHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DHMousePressed
        indexDH = tbl_DH.rowAtPoint(evt.getPoint());
        editDH();
        if (evt.getClickCount() == 2) {
            String madh = txtMa_DH.getText();
            ChiTietDonHang dhct = dhctDao.selectById(madh);
            ChiTietDonHangFrame frameDHCT = new ChiTietDonHangFrame(dhct.getMaDH());
            frameDHCT.setVisible(true);
        }
    }//GEN-LAST:event_tbl_DHMousePressed

    private void tbl_NVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NVMousePressed
        indexNV = tbl_NV.rowAtPoint(evt.getPoint());
        editNV();
        btnThem_NV.setEnabled(false);
        btnSua_NV.setEnabled(true);
        btnXoa_NV.setEnabled(true);
    }//GEN-LAST:event_tbl_NVMousePressed

    private void tbl_TKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKMousePressed
        indexTK = tbl_TK.getSelectedRow();
        fillFromThongKe();
    }//GEN-LAST:event_tbl_TKMousePressed

    private void tbl_HDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HDMousePressed
        indexHD = tbl_HD.getSelectedRow();
        fillFromTableHD(indexHD);
        if (evt.getClickCount() == 2) {
            openFrameCTHD();
        }
    }//GEN-LAST:event_tbl_HDMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnThem_SP.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnReset_SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_SPActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_SP.getModel();
        model.setRowCount(0);
        spList = spDao.selectAll();
        for (SanPham sp : spList) {
            Object[] row = {
                sp.getMaSP(),
                sp.getTenSP(),
                sp.getSoLuong(),
                sp.getGiaThanh(),
                sp.getMaCL()
            };
            model.addRow(row);
        }
    }//GEN-LAST:event_btnReset_SPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnFirst_CL;
    private javax.swing.JButton btnFirst_DH;
    private javax.swing.JButton btnFirst_HD;
    private javax.swing.JButton btnFirst_KH;
    private javax.swing.JButton btnFirst_NV;
    private javax.swing.JButton btnFirst_SP;
    private javax.swing.JButton btnFirst_TK;
    private javax.swing.JButton btnLast_CL;
    private javax.swing.JButton btnLast_DH;
    private javax.swing.JButton btnLast_HD;
    private javax.swing.JButton btnLast_KH;
    private javax.swing.JButton btnLast_NV;
    private javax.swing.JButton btnLast_Sp;
    private javax.swing.JButton btnLast_TK;
    private javax.swing.JButton btnMoi_CL;
    private javax.swing.JButton btnMoi_NV;
    private javax.swing.JButton btnMoi_SP;
    private javax.swing.JButton btnNext_CL;
    private javax.swing.JButton btnNext_DH;
    private javax.swing.JButton btnNext_HD;
    private javax.swing.JButton btnNext_KH;
    private javax.swing.JButton btnNext_NV;
    private javax.swing.JButton btnNext_SP;
    private javax.swing.JButton btnNext_TK;
    private javax.swing.JButton btnPrevious_CL;
    private javax.swing.JButton btnPrevious_DH;
    private javax.swing.JButton btnPrevious_NV;
    private javax.swing.JButton btnPrevious_SP;
    private javax.swing.JButton btnPrevious_TK;
    private javax.swing.JButton btnPrevioust_HD;
    private javax.swing.JButton btnPrevioust_KH;
    private javax.swing.JButton btnReset_SP;
    private javax.swing.JButton btnSua_CL;
    private javax.swing.JButton btnSua_KH;
    private javax.swing.JButton btnSua_NV;
    private javax.swing.JButton btnSua_SP;
    private javax.swing.JButton btnThem_CL;
    private javax.swing.JButton btnThem_NV;
    private javax.swing.JButton btnThem_SP;
    private javax.swing.JButton btnTim_SP;
    private javax.swing.JButton btnXoa_CL;
    private javax.swing.JButton btnXoa_DH;
    private javax.swing.JButton btnXoa_HD;
    private javax.swing.JButton btnXoa_NV;
    private javax.swing.JButton btnXoa_SP;
    private javax.swing.JComboBox<String> cboChungLoai_SP;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel lblBanItNhat_TK;
    private javax.swing.JLabel lblBanNhieuNhat_TK;
    private javax.swing.JLabel lblChungLoai_SP;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblDoanhThu_TK;
    private javax.swing.JLabel lblDonViGia_DH;
    private javax.swing.JLabel lblDonViGia_HD;
    private javax.swing.JLabel lblGia_SP;
    private javax.swing.JLabel lblGioiTinh_KH;
    private javax.swing.JLabel lblGioiTinh_NV;
    private javax.swing.JLabel lblHoTen_NV;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblMaKH_DH;
    private javax.swing.JLabel lblMaNV_HD;
    private javax.swing.JLabel lblMa_CL;
    private javax.swing.JLabel lblMa_DH;
    private javax.swing.JLabel lblMa_HD;
    private javax.swing.JLabel lblMa_KH;
    private javax.swing.JLabel lblMa_NV;
    private javax.swing.JLabel lblMa_SP;
    private javax.swing.JLabel lblMatKhau_KH;
    private javax.swing.JLabel lblMatKhau_NV;
    private javax.swing.JLabel lblMeo_DH;
    private javax.swing.JLabel lblMeo_HD;
    private javax.swing.JLabel lblMieuTa_CL;
    private javax.swing.JLabel lblNam_TK;
    private javax.swing.JLabel lblNgayDangKy_KH;
    private javax.swing.JLabel lblNgayDatHang_DH;
    private javax.swing.JLabel lblNgayLap_HD;
    private javax.swing.JLabel lblNgaySinh_KH;
    private javax.swing.JLabel lblNgaySinh_NV;
    private javax.swing.JLabel lblPic_CL;
    private javax.swing.JLabel lblPic_DH;
    private javax.swing.JLabel lblPic_HD;
    private javax.swing.JLabel lblPic_NV;
    private javax.swing.JLabel lblPic_SP;
    private javax.swing.JLabel lblPic_TK;
    private javax.swing.JLabel lblSoLuong_SP;
    private javax.swing.JLabel lblTen_CL;
    private javax.swing.JLabel lblTen_KH;
    private javax.swing.JLabel lblTen_SP;
    private javax.swing.JLabel lblTitle_CL;
    private javax.swing.JLabel lblTitle_DH;
    private javax.swing.JLabel lblTitle_HD;
    private javax.swing.JLabel lblTitle_KH;
    private javax.swing.JLabel lblTitle_NV;
    private javax.swing.JLabel lblTitle_SP;
    private javax.swing.JLabel lblTitle_TK;
    private javax.swing.JLabel lblTongTien_DH;
    private javax.swing.JLabel lblTongTien_HD;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPanel pnlInfor_CL;
    private javax.swing.JPanel pnlInfor_DH;
    private javax.swing.JPanel pnlInfor_HD;
    private javax.swing.JPanel pnlInfor_KH;
    private javax.swing.JPanel pnlInfor_NV;
    private javax.swing.JPanel pnlInfor_TK;
    private javax.swing.JPanel pnlMa_DH;
    private javax.swing.JPanel pnlMa_HD;
    private javax.swing.JPanel pnlMa_KH;
    private javax.swing.JPanel pnlMainBtn_CL;
    private javax.swing.JPanel pnlMainBtn_NV;
    private javax.swing.JPanel pnlMainBtn_SP;
    private javax.swing.JPanel pnlNavigation_CL;
    private javax.swing.JPanel pnlNavigation_DH;
    private javax.swing.JPanel pnlNavigation_HD;
    private javax.swing.JPanel pnlNavigation_KH;
    private javax.swing.JPanel pnlNavigation_NV;
    private javax.swing.JPanel pnlNavigation_SP;
    private javax.swing.JPanel pnlNavigation_TK;
    private javax.swing.JPanel pnlPic_CL;
    private javax.swing.JPanel pnlPic_DH;
    private javax.swing.JPanel pnlPic_HD;
    private javax.swing.JPanel pnlPic_KH;
    private javax.swing.JPanel pnlPic_NV;
    private javax.swing.JPanel pnlPic_SP;
    private javax.swing.JPanel pnlPic_TK;
    private javax.swing.JPanel pnlTimKiem_SP;
    private javax.swing.JPanel pnlTitle_CL;
    private javax.swing.JPanel pnlTitle_DH;
    private javax.swing.JPanel pnlTitle_HD;
    private javax.swing.JPanel pnlTitle_KH;
    private javax.swing.JPanel pnlTitle_NV;
    private javax.swing.JPanel pnlTitle_SP;
    private javax.swing.JPanel pnl_ChungLoai;
    private javax.swing.JPanel pnl_DonHang;
    private javax.swing.JPanel pnl_HoaDon;
    private javax.swing.JPanel pnl_KhachHang;
    private javax.swing.JPanel pnl_NhanVien;
    private javax.swing.JPanel pnl_SanPham;
    private javax.swing.JPanel pnl_Sub_CL;
    private javax.swing.JPanel pnl_Sub_DH;
    private javax.swing.JPanel pnl_Sub_HD;
    private javax.swing.JPanel pnl_Sub_KH;
    private javax.swing.JPanel pnl_Sub_NV;
    private javax.swing.JPanel pnl_Sub_SP;
    private javax.swing.JPanel pnl_Sub_TK;
    private javax.swing.JPanel pnl_ThongKe;
    private javax.swing.ButtonGroup rdoGioiTinh_KH;
    private javax.swing.ButtonGroup rdoGioiTinh_NV;
    private javax.swing.JRadioButton rdoNam_KH;
    private javax.swing.JRadioButton rdoNam_NV;
    private javax.swing.JRadioButton rdoNu_KH;
    private javax.swing.JRadioButton rdoNu_NV;
    private javax.swing.JScrollPane scrollMieuTa_CL;
    private javax.swing.JScrollPane scroll_CL;
    private javax.swing.JScrollPane scroll_HD;
    private javax.swing.JScrollPane scroll_KH;
    private javax.swing.JScrollPane scroll_NV;
    private javax.swing.JScrollPane scroll_SP;
    private javax.swing.JScrollPane scroll_TK;
    private javax.swing.JScrollPane sroll_DH;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_CL;
    private javax.swing.JTable tbl_DH;
    private javax.swing.JTable tbl_HD;
    private javax.swing.JTable tbl_KH;
    private javax.swing.JTable tbl_NV;
    private javax.swing.JTable tbl_SP;
    private javax.swing.JTable tbl_TK;
    private javax.swing.JLabel txtBanItNhat_TK;
    private javax.swing.JLabel txtBanNhieuNhat_TK;
    private javax.swing.JLabel txtDoanhThu_TK;
    private javax.swing.JTextField txtGia_SP;
    private javax.swing.JTextField txtHoTen_NV;
    private javax.swing.JTextField txtMaKH_DH;
    private javax.swing.JTextField txtMaNV_HD;
    private javax.swing.JTextField txtMa_CL;
    private javax.swing.JLabel txtMa_DH;
    private javax.swing.JLabel txtMa_HD;
    private javax.swing.JLabel txtMa_KH;
    private javax.swing.JTextField txtMa_NV;
    private javax.swing.JTextField txtMa_SP;
    private javax.swing.JTextField txtMatKhau_KH;
    private javax.swing.JTextField txtMatKhau_NV;
    private javax.swing.JTextArea txtMieuTa_CL;
    private javax.swing.JLabel txtNam_TK;
    private javax.swing.JTextField txtNgayDangKy_KH;
    private javax.swing.JTextField txtNgayDatHang_DH;
    private javax.swing.JTextField txtNgayLap_HD;
    private javax.swing.JTextField txtNgaySinh_KH;
    private javax.swing.JTextField txtNgaySinh_NV;
    private javax.swing.JTextField txtSoLuong_SP;
    private javax.swing.JTextField txtTen_CL;
    private javax.swing.JTextField txtTen_KH;
    private javax.swing.JTextField txtTen_SP;
    private javax.swing.JTextField txtTim_SP;
    private javax.swing.JLabel txtTongTien_DH;
    private javax.swing.JLabel txtTongTien_HD;
    // End of variables declaration//GEN-END:variables

    private void clockRun() {
        CLockThread cl = new CLockThread(lblClock);
        Thread t = new Thread(cl);
        t.start();
    }

    // Begin Khach hang code
    private void loadToTableKH() {
        DefaultTableModel khTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        khTableModel.setColumnIdentifiers(new Object[]{"Mã khách hàng", "Mật khẩu", "Tên khách hàng", "Giới tính", "Ngày đăng ký", "Ngày sinh"});
        khList = khDao.selectAll();
        for (KhachHang kh : khList) {
            if (kh.isGioiTinh() == true) {
                khTableModel.addRow(new Object[]{kh.getMaKH(), kh.getMatKhau(), kh.getTenKH(), "Nam", XDate.toString(kh.getNgayDangKy(), "dd/MM/yyyy"), XDate.toString(kh.getNgaySinh(), "dd/MM/yyyy")});
            } else {
                khTableModel.addRow(new Object[]{kh.getMaKH(), kh.getMatKhau(), kh.getTenKH(), "Nữ", XDate.toString(kh.getNgayDangKy(), "dd/MM/yyyy"), XDate.toString(kh.getNgaySinh(), "dd/MM/yyyy")});

            }
        }
        tbl_KH.setModel(khTableModel);
    }

    private void fillFromTableKH() {
        txtMa_KH.setText(khList.get(indexKH).getMaKH());
        txtNgaySinh_KH.setText(XDate.toString(khList.get(indexKH).getNgaySinh(), "dd/MM/yyyy"));
        txtTen_KH.setText(khList.get(indexKH).getTenKH());
        txtMatKhau_KH.setText(khList.get(indexKH).getMatKhau());
        txtNgayDangKy_KH.setText(XDate.toString(khList.get(indexKH).getNgayDangKy(), "dd/MM/yyyy"));
        if (khList.get(indexKH).isGioiTinh() == true) {
            rdoNam_KH.setSelected(true);
        } else {
            rdoNu_KH.setSelected(true);
        }
    }

    private void updateKH() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMa_KH.getText());
        kh.setMatKhau(txtMatKhau_KH.getText());
        kh.setNgaySinh(XDate.toDate(txtNgaySinh_KH.getText(), "dd/MM/yyyy"));
        kh.setNgayDangKy(XDate.toDate(txtNgayDangKy_KH.getText(), "dd/MM/yyyy"));
        kh.setTenKH(txtTen_KH.getText());
        if (rdoNam_KH.isSelected()) {
            kh.setGioiTinh(true);
        } else {
            kh.setGioiTinh(false);
        }
        khDao.update(kh);
        MsgBox.alert(null, "Sửa thông tin khách hàng thành công");
        loadToTableKH();
        tbl_KH.setRowSelectionInterval(indexKH, indexKH);
    }

    private void nextKH() {
        if (indexKH == khList.size() - 1) {
            firstKH();
            return;
        }
        indexKH++;
        fillFromTableKH();
        tbl_KH.setRowSelectionInterval(indexKH, indexKH);
    }

    private void prevKH() {
        if (indexKH == 0) {
            lastKH();
            return;
        } else if (indexKH == -1) {
            indexKH++;
            fillFromTableKH();
            tbl_KH.setRowSelectionInterval(indexKH, indexKH);
            return;
        }
        indexKH--;
        fillFromTableKH();
        tbl_KH.setRowSelectionInterval(indexKH, indexKH);
    }

    private void firstKH() {
        indexKH = 0;
        fillFromTableKH();
        tbl_KH.setRowSelectionInterval(indexKH, indexKH);
    }

    private void lastKH() {
        indexKH = khList.size() - 1;
        fillFromTableKH();
        tbl_KH.setRowSelectionInterval(indexKH, indexKH);
    }

    private boolean checkKH() {
        boolean check = true;

        if (indexKH == -1) {
            MsgBox.alert(null, "Bạn chưa chọn khách hàng để sửa");
            return false;
        }

        if (txtTen_KH.getText().trim().length() == 0) {
            MsgBox.alert(null, "Bạn không được để trống tên khách hàng");
            check = false;
        }

        if (txtMatKhau_KH.getText().trim().length() == 0) {
            MsgBox.alert(null, "Bạn không được để trống mật mã khách hàng");
            check = false;
        }

        if (txtNgaySinh_KH.getText().trim().length() == 0) {
            MsgBox.alert(null, "Bạn không được để trống ngày sinh");
            check = false;
        }

        return check;
    }
    // End Khach hang code

    // Begin San pham code
    private boolean checkSP() {
        if (txtMa_SP.getText().length() == 0 || txtMa_SP.getText().length() > 10) {
            MsgBox.alert(this, "Không Được Để Trống Mã SP");
            txtMa_SP.requestFocus();
            return false;
        }

        if (txtTen_SP.getText().length() == 0 || txtTen_SP.getText().length() > 50) {
            MsgBox.alert(this, "Không Được Để Trống Tên SP");
            txtTen_SP.requestFocus();
            return false;
        }

        if (txtSoLuong_SP.getText().equals("0")) {
            MsgBox.alert(this, "Vui lòng nhập số lượng");
            txtSoLuong_SP.requestFocus();
            return false;
        }
        if (txtGia_SP.getText().equals("0.0")) {
            MsgBox.alert(this, "Vui lòng nhập đơn giá");
            txtGia_SP.requestFocus();
            return false;
        }
        return true;
    }

    private void loadToTableSP() {
        DefaultTableModel model = (DefaultTableModel) tbl_SP.getModel();
        model.setRowCount(0);
        spList.removeAll(spList);
        String keyword = txtTim_SP.getText();
        spList = spDao.selectByKeyword(keyword);
        for (SanPham sp : spList) {
            Object[] row = {
                sp.getMaSP(),
                sp.getTenSP(),
                sp.getSoLuong(),
                sp.getGiaThanh(),
                (String)JdbcHelper.value("SELECT TENCL FROM SANPHAM sp INNER JOIN CHUNGLOAI cl ON sp.MACL = cl.MACL WHERE MASP LIKE ? ", sp.getMaSP())
            };
            model.addRow(row);
        }
    }

    private void editSP() {
        String maSP = (String) tbl_SP.getValueAt(this.indexSP, 0);
        tbl_SP.setRowSelectionInterval(indexSP, indexSP);
        SanPham sp = spDao.selectById(maSP);
        if (sp != null) {
            setFormSP(sp);
        }
    }

    private void setFormSP(SanPham sp) {
        txtMa_SP.setText(sp.getMaSP());
        txtTen_SP.setText(sp.getTenSP());
        txtSoLuong_SP.setText(String.valueOf(sp.getSoLuong()));
        txtGia_SP.setText(String.valueOf(sp.getGiaThanh()));
        /*cboChungLoai_SP.setToolTipText(sp.getMaCL());
        cboChungLoai_SP.setSelectedItem(clDao.selectById(sp.getMaCL()));*/
        cboChungLoai_SP.setSelectedItem(tbl_SP.getValueAt(indexSP, 4));
    }

    private void fillFromTableSP(int index) {
        tbl_SP.setRowSelectionAllowed(true);
        txtMa_SP.setText(spList.get(index).getMaSP());
        txtTen_SP.setText(spList.get(index).getTenSP());
        txtSoLuong_SP.setText(String.valueOf(spList.get(index).getSoLuong()));
        txtGia_SP.setText(String.valueOf(spList.get(index).getGiaThanh()));
        cboChungLoai_SP.setToolTipText(spList.get(index).getMaCL());
        cboChungLoai_SP.setSelectedItem(clDao.selectById(spList.get(index).getMaCL()));
        tbl_SP.setRowSelectionInterval(indexSP, indexSP);
    }

    private void fillCboSP() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChungLoai_SP.getModel();
        model.removeAllElements();
        model.addElement(null);
        List<ChungLoai> list = clDao.selectAll();
        for (ChungLoai cl : list) {
            model.addElement(cl.getTenCL());
        }
    }

    private void clearFormSP() {
        txtMa_SP.setText("");
        txtTen_SP.setText("");
        txtSoLuong_SP.setText("");
        txtGia_SP.setText("");
        cboChungLoai_SP.setSelectedIndex(0);
        indexSP = -1;
    }

    private SanPham getFromSP() {
        SanPham sp = new SanPham();
        sp.setMaSP(txtMa_SP.getText());
        sp.setTenSP(txtTen_SP.getText());
        sp.setSoLuong(Integer.parseInt(txtSoLuong_SP.getText()));
        sp.setGiaThanh(Float.parseFloat(txtGia_SP.getText()));
        sp.setMaCL((String) JdbcHelper.value("SELECT MACL FROM CHUNGLOAI WHERE TENCL LIKE ?", (String)cboChungLoai_SP.getSelectedItem()));
        return sp;
    }

    private void resetFormSP() {
        clearFormSP();
        loadToTableSP();
        fillCboSP();
    }

    private void timSP() {
        this.loadToTableSP();
        this.clearFormSP();
        this.indexSP = -1;
    }

    private void firstSP() {
        indexSP = 0;
        fillFromTableSP(indexSP);
    }

    private void prevSP() {
        tbl_SP.setRowSelectionAllowed(true);
        indexSP--;
        if (indexSP < 0) {
            indexSP = spList.size() - 1;
        }
        tbl_SP.setRowSelectionInterval(indexSP, indexSP);
        fillFromTableSP(indexSP);
    }

    private void nextSP() {
        indexSP++;
        if (indexSP > spList.size() - 1) {
            indexSP = 0;
        }
        tbl_SP.setRowSelectionInterval(indexSP, indexSP);
        fillFromTableSP(indexSP);
    }

    private void lastSP() {
        indexSP = tbl_SP.getRowCount() - 1;
        fillFromTableSP(indexSP);
    }

    private void themSP() {
        SanPham model = getFromSP();
        try {
            spDao.insert(model);
            loadToTableSP();
            clearFormSP();
            MsgBox.alert(this, "Thêm sản phẩm thành công.");
        } catch (Exception e) {
            MsgBox.alert(this, "Sản phẩm đã tồn tại!");
        }
    }

    private void suaSP() {
        SanPham model = getFromSP();
        try {
            spDao.update(model);
            loadToTableSP();
            MsgBox.alert(this, "Cập nhật sản phẩm thành công.");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật sản phẩm thất bại!" + e.toString());
        }
    }

    private void xoaSP() {

        if (MsgBox.confirm(this, "Bạn muốn xóa sản phẩm này chứ?")) {
            String maSP = txtMa_SP.getText();
            String tenSP = txtTen_SP.getText();
            try {
                spDao.delete(maSP);
                loadToTableSP();
                clearFormSP();
                MsgBox.alert(this, "Xóa sản phẩm \"" + tenSP + "\" thành công.");
            } catch (Exception e) {
                MsgBox.alert(this, "Sản phẩm không thể xóa do lỗi \n" + e.toString());
            }
        }
    }

    // End San pham code
    // Begin Don hang code
    private void loadToTableDH() {
        DefaultTableModel model = (DefaultTableModel) tbl_DH.getModel();
        model.setRowCount(0);
        dhList = dhDao.selectAll();
        for (DonHang dh : dhList) {
            Object[] row = {
                dh.getMaDH(),
                dh.getNgayDatHang(),
                dh.getMaKH(),
                dh.getTongTien()
            };
            model.addRow(row);
        }
    }

    private void editDH() {
        String maDH = (String) tbl_DH.getValueAt(this.indexDH, 0);
        DonHang dh = dhDao.selectById(maDH);
        if (dh != null) {
            setFormDH(dh);
        }
    }

    private void setFormDH(DonHang dh) {
        txtMa_DH.setText(dh.getMaDH());
        txtMaKH_DH.setText(dh.getMaKH());
        txtNgayDatHang_DH.setText(String.valueOf(dh.getNgayDatHang()));
        txtTongTien_DH.setText(String.valueOf(dh.getTongTien()));
    }

    private void clearFormDH() {
        DonHang dh = new DonHang();
        dh.setMaDH(dh.getMaDH());
        dh.setNgayDatHang(dh.getNgayDatHang());
        dh.setMaKH(dh.getMaKH());
    }

    private void nextDH() {
        indexDH++;
        if (indexDH > dhList.size() - 1) {
            indexDH = 0;
        }
        tbl_DH.setRowSelectionInterval(indexDH, indexDH);
        fillFromTableDH(indexDH);
    }

    private void previousDH() {
        tbl_DH.setRowSelectionAllowed(true);
        indexDH--;
        if (indexDH < 0) {
            indexDH = dhList.size() - 1;
        }
        tbl_DH.setRowSelectionInterval(indexDH, indexDH);
        fillFromTableDH(indexDH);
    }

    private void lastDH() {
        indexDH = tbl_DH.getRowCount() - 1;
        fillFromTableDH(indexDH);
    }

    private void firstDH() {
        indexDH = 0;
        fillFromTableDH(indexDH);
    }

    private void fillFromTableDH(int index) {
        tbl_DH.setRowSelectionAllowed(true);
        txtMa_DH.setText(dhList.get(index).getMaDH());
        txtMaKH_DH.setText(dhList.get(index).getMaKH());
        txtNgayDatHang_DH.setText(XDate.toString(dhList.get(index).getNgayDatHang(), "dd/MM/YYYY"));
        txtTongTien_DH.setText(String.valueOf(dhList.get(index).getTongTien()));
        tbl_DH.setRowSelectionInterval(indexDH, indexDH);
    }

    private void xoaDH() {
        if (MsgBox.confirm(this, "Bạn muốn xóa đơn hàng này chứ?")) {
            String maDH = txtMa_DH.getText();
            try {
                dhDao.delete(maDH);
                loadToTableDH();
                clearFormDH();
                MsgBox.alert(this, "Xóa đơn hàng \"" + maDH + "\" thành công.");
            } catch (Exception e) {
                MsgBox.alert(this, "Đơn hàng không thể xóa do lỗi \n" + e.toString());
            }
        }
    }

    // End Don hang code
    // Begin Chung loai code
    private void loadToTableCL() {
        DefaultTableModel clTableModel = (DefaultTableModel) tbl_CL.getModel();
        clTableModel.setRowCount(0);
        clList = clDao.selectAll();
        for (ChungLoai cl : clList) {
            Object[] row = {
                cl.getMaCL(),
                cl.getTenCL(),
                cl.getMieuTa(),};
            clTableModel.addRow(row);
        }
        btnThem_CL.setEnabled(false);
        btnSua_CL.setEnabled(false);
        btnXoa_CL.setEnabled(false);
        txtMa_CL.setFocusable(false);
    }

    private void fillFromTableCL(int index) {
        tbl_CL.setRowSelectionAllowed(true);
        txtMa_CL.setText(clList.get(index).getMaCL());
        txtTen_CL.setText(clList.get(index).getTenCL());
        txtMieuTa_CL.setText(clList.get(index).getMieuTa());
        tbl_CL.setRowSelectionInterval(index, index);
    }

    private void clearCL() {
        txtMa_CL.setText("");
        txtTen_CL.setText("");
        txtMieuTa_CL.setText("");
        btnThem_CL.setEnabled(true);
        btnSua_CL.setEnabled(false);
        btnXoa_CL.setEnabled(false);
        tbl_CL.setRowSelectionAllowed(false);
        txtMa_CL.setFocusable(true);
        indexCL = -1;
    }

    private void insertCL() {
        ChungLoai clitem = new ChungLoai(txtMa_CL.getText(), txtTen_CL.getText(), txtMieuTa_CL.getText());
        clDao.insert(clitem);
        loadToTableCL();
        for (ChungLoai cl : clList) {
            if (txtMa_CL.getText().equals(cl.getMaCL())) {
                indexCL = clList.indexOf(cl);
                fillFromTableCL(indexCL);
                break;
            }
        }
        btnSua_CL.setEnabled(true);
        btnXoa_CL.setEnabled(true);
        resetFormSP();
    }

    private void updateCL() {
        ChungLoai clitem = new ChungLoai(txtMa_CL.getText(), txtTen_CL.getText(), txtMieuTa_CL.getText());
        clDao.update(clitem);
        loadToTableCL();
        for (ChungLoai cl : clList) {
            if (txtMa_CL.getText().equals(cl.getMaCL())) {
                indexCL = clList.indexOf(cl);
                fillFromTableCL(indexCL);
                break;
            }
        }
        btnSua_CL.setEnabled(true);
        btnXoa_CL.setEnabled(true);
        resetFormSP();
    }

    private void deleteCL() {
        clDao.delete(txtMa_CL.getText());
        loadToTableCL();
        resetFormSP();
    }

    private void firstCL() {
        indexCL = 0;
        tbl_CL.setRowSelectionAllowed(true);
        fillFromTableCL(0);
    }

    private void nextCL() {
        tbl_CL.setRowSelectionAllowed(true);
        indexCL++;
        if (indexCL > clList.size() - 1) {
            indexCL = 0;
        }
        fillFromTableCL(indexCL);
    }

    private void previousCL() {
        tbl_CL.setRowSelectionAllowed(true);
        indexCL--;
        if (indexCL < 0) {
            indexCL = clList.size() - 1;
        }
        fillFromTableCL(indexCL);
    }

    private void lastCL() {
        tbl_CL.setRowSelectionAllowed(true);
        indexCL = clList.size() - 1;
        fillFromTableCL(indexCL);
    }

    private boolean checkTenChungLoai() {
        for (ChungLoai cl : clList) {
            if (txtTen_CL.getText().equals(cl.getTenCL())) {
                MsgBox.alert(this, "Không Được Thêm Vì Trùng Tên Chủng Loại !");
                return false;
            }
        }
        return true;
    }

    private boolean checkSuaTenCL() {
        if (txtTen_CL.getText().equals(clList.get(indexCL).getTenCL())) {
            return true;
        }
        return false;
    }

    private boolean checkCL() {
        if (txtMa_CL.getText().length() == 0 || txtMa_CL.getText().length() > 10) {
            MsgBox.alert(this, "Không Được Để Trống Mã CL");
            return false;
        }

        if (txtTen_CL.getText().length() == 0 || txtTen_CL.getText().length() > 50) {
            MsgBox.alert(this, "Không Được Để Trống Tên CL");
            return false;
        }

        if (txtMieuTa_CL.getText().length() == 0 || txtMieuTa_CL.getText().length() > 100) {
            MsgBox.alert(this, "Không Được Để Trống Miêu Tả CL");
            return false;
        }
        return true;
    }

    // End Chung loai code
    // Begin Nhan vien code
    private void loadToTableNV() {
        DefaultTableModel model = (DefaultTableModel) tbl_NV.getModel();
        model.setRowCount(0);
        try {
            nvList = nvDao.selectAll();
            for (NhanVien nv : nvList) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.isGioiTinh() ? "nữ" : "nam",
                    XDate.toString(nv.getNgaySinh(), "dd/MM/YYYY"),
                    nv.isVaiTro() ? "admin" : "nhanvien"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void setNhanVien(NhanVien nv) {
        txtMa_NV.setText(nv.getMaNV());
        txtMatKhau_NV.setText(nv.getMatKhau());
        txtHoTen_NV.setText(nv.getHoTen());
        rdoNu_NV.setSelected(nv.isGioiTinh());
        rdoNam_NV.setSelected(!nv.isGioiTinh());
//        rdoAdmin.setSelected(nv.isVaiTro());
//        rdoNhanvien.setSelected(!nv.isVaiTro());
        txtNgaySinh_NV.setText(XDate.toString(nv.getNgaySinh(), "dd/MM/yyyy"));
    }

    private NhanVien getNhanVien() {
        NhanVien model = new NhanVien();
        model.setMaNV(txtMa_NV.getText());
        model.setMatKhau(new String(txtMatKhau_NV.getText()));
        model.setHoTen(txtHoTen_NV.getText());
        model.setNgaySinh(XDate.toDate(txtNgaySinh_NV.getText(), "dd/MM/yyyy"));
        model.setGioiTinh(rdoNu_NV.isSelected());
        //model.setVaiTro(rdoAdmin.isSelected());
        return model;
    }

    private void editNV() {
        try {
            tbl_NV.setRowSelectionAllowed(true);
            String manv = (String) tbl_NV.getValueAt(this.indexNV, 0);
            NhanVien model = nvDao.selectById(manv);
            if (model != null) {
                setNhanVien(model);
                tbl_NV.setRowSelectionInterval(indexNV, indexNV);
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn" + e.toString());
        }
    }

    private void newNhanVien() {
        txtMa_NV.setText(null);
        txtMatKhau_NV.setText(null);
        txtHoTen_NV.setText(null);
        txtNgaySinh_NV.setText(null);
        indexNV = -1;
        btnThem_NV.setEnabled(true);
        btnSua_NV.setEnabled(false);
        btnXoa_NV.setEnabled(false);
        tbl_NV.setRowSelectionAllowed(false);
    }

    private void savẹNhanvien() {
        NhanVien model = getNhanVien();
        try {
            nvDao.insert(model);
            newNhanVien();
            loadToTableNV();
            MsgBox.alert(this, "Thêm thành công");
        } catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Thêm thất bại!", "", 0);
        }
    }

    private void updateNhanvien() {
        NhanVien model = getNhanVien();
        try {
            nvDao.update(model);
            loadToTableNV();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại!", "", 0);
        }
    }

    private void deleteNhanvien() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xoá người này")) {
            String manv = txtMa_NV.getText();
            try {
                nvDao.delete(manv);
                newNhanVien();
                loadToTableNV();
                MsgBox.alert(this, "Xoá thành công");
            } catch (Exception e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(this, "Xoá thất bại!", "", 0);
            }
        }
    }

    private boolean admin() {
        if (nvList.get(indexNV).isVaiTro() == true) {
            JOptionPane.showMessageDialog(this, "Không được xoá Admin!", "", 0);
            return false;
        }
        return true;
    }

    private boolean checkNV() {
        
        if (txtMa_NV.getText().equals("") || txtMatKhau_NV.getText().equals("") || txtHoTen_NV.getText().equals("") || txtNgaySinh_NV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống thông tin!", "", 0);
            return false;
        }
        
        ngaySinh = XDate.toDate(txtNgaySinh_NV.getText(), "dd/MM/yyyy");
        int age = XDate.now().getYear() - ngaySinh.getYear();
        if (age < 18) {
            JOptionPane.showMessageDialog(this, "Bạn chưa đủ 18 tuổi!", "", 0);
            return false;
        }
        return true;
    }

    private void FirstNV() {
        indexNV = 0;
        editNV();
    }

    private void LastNV() {
        indexNV = tbl_NV.getRowCount() - 1;
        editNV();
    }

    private void PrevNV() {
        indexNV--;
        if (indexNV < 0) {
            indexNV = tbl_NV.getRowCount() - 1;
        }
        editNV();
    }

    private void nextNV() {
        indexNV++;
        if (indexNV > tbl_NV.getRowCount() - 1) {
            indexNV = 0;
        }
        editNV();
    }

    // End Nhan vien code
    // Begin Hoa don code
    private void loadToTableHD() {
        initHD();
        DefaultTableModel hdTableModel = (DefaultTableModel) tbl_HD.getModel();
        hdTableModel.setRowCount(0);
        hdList = hdDao.selectAll();
        for (HoaDon hd : hdList) {
            Object[] row = {
                hd.getMaHD(),
                hd.getNgayLapHD(),
                hd.getMaNV(),
                hd.getTongTien()
            };
            hdTableModel.addRow(row);
        }
    }

    private void initHD() {
        txtMa_HD.setFocusable(false);
        txtMaNV_HD.setFocusable(false);
        txtNgayLap_HD.setFocusable(false);
        txtTongTien_HD.setFocusable(false);
    }

    private void fillFromTableHD(int index) {
        txtMa_HD.setText(hdList.get(index).getMaHD());
        txtMaNV_HD.setText(hdList.get(index).getMaNV());
        txtNgayLap_HD.setText(String.valueOf(hdList.get(index).getNgayLapHD()));
        txtTongTien_HD.setText(String.valueOf(hdList.get(index).getTongTien()));
        tbl_HD.setRowSelectionInterval(index, index);
    }

    private void deleteHD() {
        hdDao.delete(txtMa_HD.getText());
        loadToTableHD();
    }

    private void firstHD() {
        indexHD = 0;
        fillFromTableHD(0);
    }

    private void nextHD() {
        indexHD++;
        if (indexHD > hdList.size() - 1) {
            indexHD = 0;
        }
        fillFromTableHD(indexHD);
    }

    private void previousHD() {
        indexHD--;
        if (indexHD < 0) {
            indexHD = hdList.size() - 1;
        }
        fillFromTableHD(indexHD);
    }

    private void lastHD() {
        indexHD = hdList.size() - 1;
        fillFromTableHD(indexHD);
    }

    private void openFrameCTHD() {
        String mahd = txtMa_HD.getText();
        if (!(mahd.length() == 0)) {
            ChiTietHoaDon cthd = new ChiTietHoaDonDAO().selectById(mahd);
            ChiTietHoaDonFrame CTHDFrame = new ChiTietHoaDonFrame(cthd.getMaHD());
            CTHDFrame.setVisible(true);
        } else {
            MsgBox.alert(this, "Vui Lòng Chọn 1 HD Để Xem Chi Tiết !");
        }
    }

    // End Hoa don code
    // Begin Thong ke code
    private void loadToTableTK() {
        DefaultTableModel model = (DefaultTableModel) tbl_TK.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list = tkDao.getThongKe();
            for (Object[] objects : list) {
                model.addRow(objects);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void fillFromThongKe() {
        txtNam_TK.setText(Integer.toString((Integer) tbl_TK.getValueAt(indexTK, 0)));
        txtDoanhThu_TK.setText(Double.toString((Double) tbl_TK.getValueAt(indexTK, 1)));
        txtBanNhieuNhat_TK.setText(Integer.toString((Integer) tbl_TK.getValueAt(indexTK, 2)));
        txtBanItNhat_TK.setText(Integer.toString((Integer) tbl_TK.getValueAt(indexTK, 3)));
        tbl_TK.setRowSelectionInterval(indexTK, indexTK);
    }

    private void firstTK() {
        indexTK = 0;
        fillFromThongKe();
    }

    private void lastTK() {
        indexTK = tbl_TK.getRowCount() - 1;
        fillFromThongKe();
    }

    private void nextTK() {
        indexTK++;
        if (indexTK > tbl_TK.getRowCount() - 1) {
            indexTK = 0;
        }
        fillFromThongKe();
    }

    private void prevTK() {
        indexTK--;
        if (indexTK < 0) {
            indexTK = tbl_NV.getRowCount() - 1;
        }
        fillFromThongKe();
    }
    // End Thong ke code

    private void init() {
        this.setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        clockRun();
        loadToTableSP();
        fillCboSP();
        loadToTableKH();
        loadToTableCL();
        loadToTableDH();
        loadToTableNV();
        loadToTableHD();
        loadToTableTK();
    }
}
