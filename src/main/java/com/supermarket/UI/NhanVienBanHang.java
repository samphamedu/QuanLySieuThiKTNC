package com.supermarket.UI;

import com.supermarket.DAO.ChiTietHoaDonDAO;
import com.supermarket.DAO.ChungLoaiDAO;
import com.supermarket.DAO.HoaDonDAO;
import com.supermarket.DAO.SanPhamExtendDao;
import com.supermarket.ENTITY.CLockThread;
import com.supermarket.ENTITY.SanPhamExtend;
import com.supermarket.ENTITY.ChungLoai;
import com.supermarket.ENTITY.BillThanhToan;
import com.supermarket.ENTITY.HoaDon;
import com.supermarket.ENTITY.ChiTietHoaDon;
import com.supermarket.UTILS.JdbcHelper;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XDate;
import com.supermarket.UTILS.XImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class NhanVienBanHang extends javax.swing.JFrame {

    private SanPhamExtendDao spDao = new SanPhamExtendDao();
    private ChungLoaiDAO clDao = new ChungLoaiDAO();
    private ChiTietHoaDonDAO cthdDAO = new ChiTietHoaDonDAO();
    private HoaDonDAO hdDao = new HoaDonDAO();
    private List<String> spbought = new ArrayList<>();
    private DefaultTableModel modelHD = new DefaultTableModel(new Object[]{"Tên sản phẩm", "Giá", "Số lượng", "Thành tiền"}, 0);
    private int index;
    private float tongTien;
    private String manv, maHD;
    private List<BillThanhToan> billThanhToan = new ArrayList<>();

    public NhanVienBanHang() {
//        MsgBox.alert(null, "Bạn phải đăng nhập trước");
//        System.exit(0);
        initComponents();
        init();
        this.manv = "LoneWolf";
    }

    public NhanVienBanHang(String manv) {
        initComponents();
        init();
        this.manv = manv;
        this.setTitle("Màn Hình Nhân Viên " + this.manv);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        lblQuayThanhToan = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnThemHD = new javax.swing.JButton();
        btnResetHD = new javax.swing.JButton();
        lblTenCL = new javax.swing.JLabel();
        cbbCL = new javax.swing.JComboBox<>();
        btnResetDSSP = new javax.swing.JButton();
        lblDSSP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSP = new javax.swing.JTable();
        pnlHoaDon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonHang = new javax.swing.JTable();
        lblTongHoaDon = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        btnIn = new javax.swing.JButton();
        lblChiTiet = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Màn Hình Chính(Nhân Viên Bán Hàng)");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        pnlMain.setBackground(new java.awt.Color(61, 61, 61));
        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.setPreferredSize(new java.awt.Dimension(960, 570));

        btnDangXuat.setBackground(new java.awt.Color(255, 146, 64));
        btnDangXuat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 169));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/log-out.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setToolTipText("");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setFocusable(false);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        lblQuayThanhToan.setFont(new java.awt.Font("Barlow Condensed", 1, 25)); // NOI18N
        lblQuayThanhToan.setForeground(new java.awt.Color(255, 255, 169));
        lblQuayThanhToan.setText("QUẦY THANH TOÁN");

        lblClock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 255, 169));
        lblClock.setText("11:30:30PM");

        lblTenSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenSP.setForeground(new java.awt.Color(255, 255, 169));
        lblTenSP.setText("Tên sản phẩm");

        txtTenSP.setBackground(new java.awt.Color(255, 146, 64));
        txtTenSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenSP.setForeground(new java.awt.Color(255, 255, 169));
        txtTenSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTenSP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenSP.setEnabled(false);
        txtTenSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenSPKeyReleased(evt);
            }
        });

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(255, 255, 169));
        lblSoLuong.setText("Số lượng");

        txtSoLuong.setBackground(new java.awt.Color(255, 146, 64));
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(255, 255, 169));
        txtSoLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnThemHD.setBackground(new java.awt.Color(255, 146, 64));
        btnThemHD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnThemHD.setForeground(new java.awt.Color(255, 255, 169));
        btnThemHD.setText("Thêm vào hoá đơn");
        btnThemHD.setToolTipText("");
        btnThemHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemHD.setFocusable(false);
        btnThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHDActionPerformed(evt);
            }
        });

        btnResetHD.setBackground(new java.awt.Color(255, 146, 64));
        btnResetHD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetHD.setForeground(new java.awt.Color(255, 255, 169));
        btnResetHD.setText("Làm mới");
        btnResetHD.setToolTipText("");
        btnResetHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnResetHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetHD.setFocusable(false);
        btnResetHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetHDActionPerformed(evt);
            }
        });

        lblTenCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenCL.setForeground(new java.awt.Color(255, 255, 169));
        lblTenCL.setText("Tên chủng loại");

        cbbCL.setBackground(new java.awt.Color(255, 146, 64));
        cbbCL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbbCL.setForeground(new java.awt.Color(255, 255, 169));
        cbbCL.setToolTipText("");
        cbbCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbCL.setFocusable(false);
        cbbCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCLActionPerformed(evt);
            }
        });

        btnResetDSSP.setBackground(new java.awt.Color(255, 146, 64));
        btnResetDSSP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetDSSP.setForeground(new java.awt.Color(255, 255, 169));
        btnResetDSSP.setText("Làm mới");
        btnResetDSSP.setToolTipText("");
        btnResetDSSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnResetDSSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetDSSP.setFocusable(false);
        btnResetDSSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDSSPActionPerformed(evt);
            }
        });

        lblDSSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDSSP.setForeground(new java.awt.Color(255, 255, 169));
        lblDSSP.setText("Danh sách sản phẩm");

        tblDSSP.setBackground(new java.awt.Color(255, 146, 64));
        tblDSSP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblDSSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Giá thành", "Tên chủng loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDSSPMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSSP);

        pnlHoaDon.setBackground(new java.awt.Color(61, 61, 61));
        pnlHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 169)), "Hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 169))); // NOI18N
        pnlHoaDon.setToolTipText("");

        tblDonHang.setBackground(new java.awt.Color(255, 146, 64));
        tblDonHang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblDonHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sản phẩm", "Giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDonHang.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblDonHang);

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTongHoaDon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTongHoaDon.setForeground(new java.awt.Color(255, 255, 169));
        lblTongHoaDon.setText("Tổng hoá đơn");

        lblTong.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        lblTong.setForeground(new java.awt.Color(255, 146, 64));
        lblTong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTong.setText("000");

        btnIn.setBackground(new java.awt.Color(255, 146, 64));
        btnIn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIn.setForeground(new java.awt.Color(255, 255, 169));
        btnIn.setText("In hoá đơn");
        btnIn.setToolTipText("");
        btnIn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIn.setFocusable(false);
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        lblChiTiet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblChiTiet.setForeground(new java.awt.Color(255, 255, 169));
        lblChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/information.png"))); // NOI18N
        lblChiTiet.setText("Thông tin chi tiết");
        lblChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChiTiet.setFocusable(false);
        lblChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319)
                .addComponent(lblQuayThanhToan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(lblSoLuong)
                                .addGap(33, 33, 33))
                            .addComponent(lblTenSP, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txtTenSP)))
                    .addComponent(btnResetHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                            .addComponent(lblTenCL)
                            .addGap(39, 39, 39)
                            .addComponent(cbbCL, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnResetDSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblChiTiet)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTong, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)))
                        .addGap(201, 201, 201))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDSSP)
                .addGap(199, 199, 199))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuayThanhToan)
                    .addComponent(lblClock))
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenCL)
                            .addComponent(cbbCL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResetDSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDSSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenSP))
                        .addGap(21, 21, 21)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoLuong))
                        .addGap(18, 18, 18)
                        .addComponent(btnThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnResetHD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTongHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lblChiTiet)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCLActionPerformed
        loadTheocombo();
        clearTextField();
    }//GEN-LAST:event_cbbCLActionPerformed

    private void btnResetDSSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDSSPActionPerformed
        resetDSSP();
    }//GEN-LAST:event_btnResetDSSPActionPerformed

    private void btnThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHDActionPerformed
        if (checkThemVaoHoaDon()) {
            add();
            resetDSSP();
            clearTextField();
        };
    }//GEN-LAST:event_btnThemHDActionPerformed

    private void btnResetHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetHDActionPerformed
        resetHD();
    }//GEN-LAST:event_btnResetHDActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        if (checkInHoaDon()) {
            printHD();
            BillThanhToanFrame billFrame = new BillThanhToanFrame(billThanhToan, maHD, manv, tongTien);
            billThanhToan.clear();
            resetHD();
            JOptionPane.showMessageDialog(this, "In hoá đơn thành công");
            billFrame.setVisible(true);          
        };

    }//GEN-LAST:event_btnInActionPerformed

    private void tblDSSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSPMousePressed
        index = tblDSSP.getSelectedRow();
        fillFromtable();
    }//GEN-LAST:event_tblDSSPMousePressed

    private void txtTenSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenSPKeyReleased

    }//GEN-LAST:event_txtTenSPKeyReleased

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.setVisible(false);
        new DangNhapJDialog(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
                new NhanVienBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnResetDSSP;
    private javax.swing.JButton btnResetHD;
    private javax.swing.JButton btnThemHD;
    private javax.swing.JComboBox<String> cbbCL;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiTiet;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblDSSP;
    private javax.swing.JLabel lblQuayThanhToan;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenCL;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTong;
    private javax.swing.JLabel lblTongHoaDon;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTable tblDSSP;
    private javax.swing.JTable tblDonHang;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        CLockThread cl = new CLockThread(lblClock);
        Thread t = new Thread(cl);
        t.start();
        fillComboSP();
        loadTableSP();
        loadToTableDH();
    }

    private void fillComboSP() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbCL.getModel();
        model.addElement("Tất cả");
        List<ChungLoai> clmodel = clDao.selectAll();
        try {
            for (ChungLoai cl : clmodel) {
                model.addElement(cl.getTenCL());
            }

        } catch (Exception e) {
            System.out.println("Truy Vấn thất bại" + e.toString());
        }

    }

    private void loadTableSP() {
        DefaultTableModel model = (DefaultTableModel) tblDSSP.getModel();
        model.setRowCount(0);
        List<SanPhamExtend> spList = new ArrayList<>();
        try {
            spList = spDao.selectAll();
            for (SanPhamExtend sp : spList) {
                boolean brought = false;
                for (String str : spbought) {
                    if (sp.getTenSP().equals(str)) {
                        brought = true;
                        break;
                    }
                }
                if (brought == false) {
                    Object[] row = {
                        sp.getMaSP(),
                        sp.getTenSP(),
                        sp.getSoLuong(),
                        sp.getGiaThanh(),
                        sp.getTenCl()
                    };
                    model.addRow(row);
                }
            }
            tblDSSP.setModel(model);
        } catch (Exception e) {
            System.out.println("Truy vấn thất bại" + e.toString());
        }
    }

    private void loadTheocombo() {
        DefaultTableModel model = (DefaultTableModel) tblDSSP.getModel();
        model.setRowCount(0);
        String tencl = (String) cbbCL.getSelectedItem();
        List<SanPhamExtend> spList = new ArrayList<>();
        try {
            if (tencl.equals("Tất cả")) {
                loadTableSP();
                return;
            }
            spList = spDao.selectAll();
            for (SanPhamExtend sp : spList) {
                if (sp.getTenCl().equalsIgnoreCase(tencl)) {
                    boolean brought = false;
                    for (String str : spbought) {
                        if (sp.getTenSP().equals(str)) {
                            brought = true;
                            break;
                        }
                    }
                    if (brought == false) {
                        Object[] row = {
                            sp.getMaSP(),
                            sp.getTenSP(),
                            sp.getSoLuong(),
                            sp.getGiaThanh(),
                            sp.getTenCl()
                        };
                        model.addRow(row);
                    }
                }
            }
            tblDSSP.setModel(model);
        } catch (Exception e) {
            System.out.println("Truy vấn thất bại" + e.toString());
        }
    }

    private void fillFromtable() {
        String tensp = (String) tblDSSP.getValueAt(index, 1);
        txtTenSP.setText(tensp);
    }

    public boolean checkThemVaoHoaDon() {
        boolean check = true;
        if (txtTenSP.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm trước", "", 0);
            return false;
        }
        if (txtSoLuong.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng trước khi thêm đơn hàng!", "", 0);
            return false;
        }
        try {
            int soluong = Integer.parseInt(txtSoLuong.getText());
            int soLuongHangConLai = (Integer) tblDSSP.getValueAt(index, 2);
            if (soluong > 0) {
                if (soluong > soLuongHangConLai) {
                    JOptionPane.showMessageDialog(this, "Số lượng bán ra không được lớn hơn số lượng có trong kho!", "", 0);
                    check = false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Số lượng không được nhập số âm!", "", 0);
                check = false;
            }
            return check;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng!", "", 0);
            check = false;
            return check;
        }
    }

    private void loadToTableDH() {
        tblDonHang.setModel(modelHD);
    }

    private void add() {
        String tensp = (String) tblDSSP.getValueAt(index, 1);
        float giathanh = (float) tblDSSP.getValueAt(index, 3);
        String soluong = txtSoLuong.getText();
        float thanhtien = giathanh * Float.parseFloat(soluong);
        modelHD.addRow(new Object[]{tensp, giathanh, soluong, thanhtien});
        loadTableSP();
        cbbCL.setSelectedIndex(0);
        tongTien += thanhtien;
        lblTong.setText(Float.toString(tongTien));
        spbought.add(tensp);
        resetDSSP();
        clearTextField();
    }

    private boolean checkInHoaDon() {
        if (tblDonHang.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa có sản phẩm nào!", "", 0);
            return false;
        }
        return true;
    }

    private void clearTextField() {
        txtTenSP.setText("");
        txtSoLuong.setText("");
    }

    private void resetDSSP() {
        loadTableSP();
        cbbCL.setSelectedIndex(0);
        clearTextField();
    }

    private void resetHD() {
        clearTextField();
        spbought.removeAll(spbought);
        modelHD.setRowCount(0);
        resetDSSP();
        tongTien = 0;
        lblTong.setText("000");
    }

    private void printHD() {
        HoaDon hd = new HoaDon();
        hd.setNgayLapHD(XDate.now());
        hd.setMaNV(manv);
        hdDao.insert(hd);
        String maHD = (String) JdbcHelper.value("select top 1 MAHD from HOADON order by MAHD desc");
        //hd.setMaHD(maHD);
        this.maHD = maHD;
        //MsgBox.alert(null, maHD);
        //MsgBox.alert(null, "Test thêm hóa đơn");
        for (int i = 0; i < tblDonHang.getRowCount(); i++) {
            try {
                ChiTietHoaDon hdct = new ChiTietHoaDon();
                String tensp = (String) tblDonHang.getValueAt(i, 0);
                //MsgBox.alert(null, "tensp");
                int soluong = Integer.parseInt((String) tblDonHang.getValueAt(i, 2));
                //MsgBox.alert(null, "soluong");
                float thanhtien = (Float) tblDonHang.getValueAt(i, 3);
                //MsgBox.alert(null, "Thành tiền");
                float gia = (Float)tblDonHang.getValueAt(i, 1);
                //MsgBox.alert(null, "giá");
                hdct.setMaHD(maHD);
                hdct.setSoLuong(soluong);
                hdct.setThanhTien(thanhtien);
                hdct.setMaSP((String) JdbcHelper.value("select MASP from SANPHAM where TENSP = ?", tensp));
                billThanhToan.add(new BillThanhToan(tensp, gia, soluong, thanhtien));
                cthdDAO.insert(hdct);
                JdbcHelper.update("UPDATE SANPHAM SET SOLUONG -= ? WHERE TENSP = ?", soluong, tensp);
            } catch (Exception e) {
                System.out.println("lỗi" + e.toString());
            }
        }
    }
}
