package com.supermarket.UI;

import com.supermarket.DAO.ChiTietDonHangDAO;
import com.supermarket.DAO.ChungLoaiDAO;
import com.supermarket.DAO.DonHangDAO;
import com.supermarket.DAO.SanPhamExtendDao;
import com.supermarket.ENTITY.CLockThread;
import com.supermarket.ENTITY.ChungLoai;
import com.supermarket.ENTITY.DonHang;
import com.supermarket.ENTITY.ChiTietDonHang;
import com.supermarket.ENTITY.SanPhamExtend;
import com.supermarket.UTILS.JdbcHelper;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XDate;
import com.supermarket.UTILS.XImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class KhachHangFrame extends javax.swing.JFrame {

    private String maKh;
    private int index;
    private float tongTien;
    private List<String> spBrought = new ArrayList<>();
    private SanPhamExtendDao spDao = new SanPhamExtendDao();
    private DonHangDAO dhDao = new DonHangDAO();
    private ChiTietDonHangDAO ctdhDAO = new ChiTietDonHangDAO();
    private DefaultTableModel donHangModel = new DefaultTableModel(new Object[]{"Sản phẩm", "Giá", "Số lượng", "Thành tiền"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public KhachHangFrame() {
        initComponents();
        init();
        this.maKh="KH001";
    }

    public KhachHangFrame(String maKh) {
        initComponents();
        init();
        this.maKh = maKh;
        this.setTitle("Chào mừng khách hàng " + this.maKh);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        lblDatHang = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblTenCL = new javax.swing.JLabel();
        cboCL = new javax.swing.JComboBox<>();
        btnLamMoiSP = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLamMoiDH = new javax.swing.JButton();
        btnDSDatHang = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        pnlHoaDon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonHang = new javax.swing.JTable();
        lblDSSP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSP = new javax.swing.JTable();
        lblTongHoaDon = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        btnDatHang = new javax.swing.JButton();
        lblChiTiet = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Khách hàng");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        pnlMain.setBackground(new java.awt.Color(61, 61, 61));
        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.setPreferredSize(new java.awt.Dimension(960, 570));

        lblDatHang.setFont(new java.awt.Font("Barlow Condensed", 1, 25)); // NOI18N
        lblDatHang.setForeground(new java.awt.Color(255, 255, 169));
        lblDatHang.setText("ĐẶT HÀNG");

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
        txtTenSP.setFocusable(false);

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(255, 255, 169));
        lblSoLuong.setText("Số lượng");

        txtSoLuong.setBackground(new java.awt.Color(255, 146, 64));
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(255, 255, 169));
        txtSoLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTenCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenCL.setForeground(new java.awt.Color(255, 255, 169));
        lblTenCL.setText("Tên chủng loại");

        cboCL.setBackground(new java.awt.Color(255, 146, 64));
        cboCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboCL.setForeground(new java.awt.Color(255, 255, 169));
        cboCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboCL.setFocusable(false);
        cboCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCLActionPerformed(evt);
            }
        });

        btnLamMoiSP.setBackground(new java.awt.Color(255, 146, 64));
        btnLamMoiSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLamMoiSP.setForeground(new java.awt.Color(255, 255, 169));
        btnLamMoiSP.setText("Làm mới");
        btnLamMoiSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLamMoiSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLamMoiSP.setFocusable(false);
        btnLamMoiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiSPActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 146, 64));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 169));
        btnThem.setText("Thêm vào đơn hàng");
        btnThem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.setFocusable(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLamMoiDH.setBackground(new java.awt.Color(255, 146, 64));
        btnLamMoiDH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLamMoiDH.setForeground(new java.awt.Color(255, 255, 169));
        btnLamMoiDH.setText("Làm mới đơn hàng");
        btnLamMoiDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLamMoiDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLamMoiDH.setFocusable(false);
        btnLamMoiDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiDHActionPerformed(evt);
            }
        });

        btnDSDatHang.setBackground(new java.awt.Color(255, 146, 64));
        btnDSDatHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDSDatHang.setForeground(new java.awt.Color(255, 255, 169));
        btnDSDatHang.setText("DS Đặt hàng");
        btnDSDatHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDSDatHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDSDatHang.setFocusable(false);
        btnDSDatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSDatHangActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(255, 146, 64));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 169));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setFocusable(false);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        pnlHoaDon.setBackground(new java.awt.Color(61, 61, 61));
        pnlHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 169)), "Đơn hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 169))); // NOI18N
        pnlHoaDon.setToolTipText("");

        tblDonHang.setBackground(new java.awt.Color(255, 146, 64));
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDSSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDSSP.setForeground(new java.awt.Color(255, 255, 169));
        lblDSSP.setText("Danh sách sản phẩm");

        tblDSSP.setBackground(new java.awt.Color(255, 146, 64));
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
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
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
        tblDSSP.getTableHeader().setReorderingAllowed(false);
        tblDSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDSSPMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSSP);

        lblTongHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTongHoaDon.setForeground(new java.awt.Color(255, 255, 169));
        lblTongHoaDon.setText("Tổng đơn hàng");

        lblTong.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        lblTong.setForeground(new java.awt.Color(255, 0, 51));
        lblTong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTong.setText("000");

        btnDatHang.setBackground(new java.awt.Color(255, 146, 64));
        btnDatHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDatHang.setForeground(new java.awt.Color(255, 255, 169));
        btnDatHang.setText("Đặt hàng");
        btnDatHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDatHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatHang.setFocusable(false);
        btnDatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatHangActionPerformed(evt);
            }
        });

        lblChiTiet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblChiTiet.setForeground(new java.awt.Color(255, 255, 169));
        lblChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/information.png"))); // NOI18N
        lblChiTiet.setText("Thông tin chi tiết");
        lblChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDSSP)
                .addGap(199, 199, 199))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblDatHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDSDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(btnLamMoiDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addComponent(lblTenCL)
                                        .addGap(39, 39, 39)
                                        .addComponent(cboCL, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLamMoiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblChiTiet)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17))))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTong, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTongHoaDon)
                                        .addGap(25, 25, 25))))))))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatHang)
                    .addComponent(lblClock))
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenCL)
                            .addComponent(cboCL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDSSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenSP))
                        .addGap(21, 21, 21)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoLuong))
                        .addGap(18, 18, 18)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoiDH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(lblTongHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblChiTiet)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDSDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
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

    private void cboCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCLActionPerformed
        clearTextField();
        filter();
    }//GEN-LAST:event_cboCLActionPerformed

    private void btnLamMoiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiSPActionPerformed
        resetSp();
        clearTextField();
    }//GEN-LAST:event_btnLamMoiSPActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (check()) {
            add();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLamMoiDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiDHActionPerformed
        clearTextField();
        resetDh();
    }//GEN-LAST:event_btnLamMoiDHActionPerformed

    private void btnDatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatHangActionPerformed
        order();
        this.setVisible(false);
        new DonHangDaDatKH(maKh, "Vừa mua hàng").setVisible(true);
    }//GEN-LAST:event_btnDatHangActionPerformed

    private void btnDSDatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSDatHangActionPerformed
        this.setVisible(false);
        new DonHangDaDatKH(maKh).setVisible(true);
    }//GEN-LAST:event_btnDSDatHangActionPerformed

    private void tblDSSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSPMousePressed
        clearTextField();
        fillFromTable();
    }//GEN-LAST:event_tblDSSPMousePressed

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
                new KhachHangFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDSDatHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDatHang;
    private javax.swing.JButton btnLamMoiDH;
    private javax.swing.JButton btnLamMoiSP;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboCL;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiTiet;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblDSSP;
    private javax.swing.JLabel lblDatHang;
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
        loadToCbo();
        loadToTableSP();
        loadToTableDH();
        CLockThread cl = new CLockThread(lblClock);
        Thread t = new Thread(cl);
        t.start();
    }

    private void loadToTableSP() {
        DefaultTableModel tblModel = (DefaultTableModel) tblDSSP.getModel();
        tblModel.setRowCount(0);
        List<SanPhamExtend> spAll = new ArrayList<>();
        spAll = spDao.selectAll();
        for (SanPhamExtend sp : spAll) {
            boolean brought = false;
            for (String str : spBrought) {
                if (sp.getTenSP().equals(str)) {
                    brought = true;
                    break;
                }
            }
            if (brought == false) {
                tblModel.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSoLuong(), sp.getGiaThanh(), sp.getTenCl()});
            }
        }
        tblDSSP.setModel(tblModel);
    }

    private void loadToCbo() {
        DefaultComboBoxModel cboModel = new DefaultComboBoxModel();
        ChungLoaiDAO dao = new ChungLoaiDAO();
        List<ChungLoai> clList = new ArrayList<>();
        clList = dao.selectAll();
        cboModel.addElement("Tất cả");
        for (ChungLoai cl : clList) {
            cboModel.addElement(cl.getTenCL());
        }
        cboCL.setModel(cboModel);
    }

    private void filter() {
        DefaultTableModel fillModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        fillModel.setColumnIdentifiers(new Object[]{"Mã SP", "Tên SP", "Số lượng", "Giá thành", "Tên chủng loại"});
        String tenCl = (String) cboCL.getSelectedItem();
        if (tenCl.equals("Tất cả")) {
            loadToTableSP();
        } else {
            List<SanPhamExtend> spAll = new ArrayList<>();
            spAll = spDao.selectAll();
            for (SanPhamExtend sp : spAll) {
                boolean brought = false;
                for (String str : spBrought) {
                    if (sp.getTenSP().equals(str)) {
                        brought = true;
                        break;
                    }
                }
                if (brought == false) {
                    if (sp.getTenCl().equals(tenCl)) {
                        fillModel.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSoLuong(), sp.getGiaThanh(), sp.getTenCl()});
                    }
                }
            }
            tblDSSP.setModel(fillModel);
        }
    }

    private void fillFromTable() {
        index = tblDSSP.getSelectedRow();
        String tenSp = (String) tblDSSP.getValueAt(index, 1);
        txtTenSP.setText(tenSp);
    }

    private boolean check() {
        String soLuong = txtSoLuong.getText();
        if (txtTenSP.getText().trim().length() > 0) {
            if (soLuong.trim().length() > 0) {
                try {
                    int soLuongNumber = Integer.parseInt(soLuong);
                    if (soLuongNumber > 0) {
                        if (soLuongNumber > (Integer) tblDSSP.getValueAt(index, 2)) {
                            MsgBox.alert(null, "Số lượng bạn nhập lớn hơn số lượng hàng còn hại trong kho của sản phẩm");
                            return false;
                        }
                    } else {
                        MsgBox.alert(null, "Bạn phải nhập số lượng là số nguyên lớn hơn 0");
                        return false;
                    }
                } catch (NumberFormatException ex) {
                    MsgBox.alert(null, "Bạn phải nhập số lượng là số nguyên");
                    return false;
                }
                return true;
            } else {
                MsgBox.alert(null, "Bạn chưa nhập số lượng");
                return false;
            }
        } else {
            MsgBox.alert(null, "Bạn chưa chọn sản phẩm");
            return false;
        }
    }

    private void loadToTableDH() {
        tblDonHang.setModel(donHangModel);
    }

    private void add() {
        String tenSp = (String) tblDSSP.getValueAt(index, 1);
        float giaThanh = (float) tblDSSP.getValueAt(index, 3);
        String soLuong = txtSoLuong.getText();
        float thanhTien = giaThanh * Float.parseFloat(soLuong);
        donHangModel.addRow(new Object[]{tenSp, giaThanh, txtSoLuong.getText(), thanhTien});
        spBrought.add(tenSp);
        resetSp();
        clearTextField();
        tongTien += thanhTien;
        lblTong.setText(Float.toString(tongTien));
    }

    private void clearTextField() {
        txtSoLuong.setText("");
        txtTenSP.setText("");
    }

    private void resetSp() {
        loadToTableSP();
        cboCL.setSelectedIndex(0);
    }

    private void resetDh() {
        donHangModel.setRowCount(0);
        spBrought.removeAll(spBrought);
        resetSp();
        tongTien = 0;
        lblTong.setText("000");
    }

    private void order() {
        if (tblDonHang.getRowCount() == 0) {
            MsgBox.alert(null, "Bạn chưa có sản phẩm nào trong giỏ hàng");
        } else {
            DonHang dh = new DonHang();
            dh.setNgayDatHang(XDate.now());
            dh.setMaKH(maKh);
            dhDao.insert(dh);
            String maDh = (String) JdbcHelper.value("SELECT TOP 1  MADH FROM DONHANG ORDER BY MADH DESC ");
            //MsgBox.alert(null,maDh );
            dh.setMaDH(maDh);
            for (int i = 0; i < tblDonHang.getRowCount(); i++) {
                ChiTietDonHang dhct = new ChiTietDonHang();
                int soLuong = Integer.parseInt((String) tblDonHang.getValueAt(i, 2));
                //float thanhTien = Float.parseFloat((String)tblDonHang.getValueAt(i, 3));
                float thanhTien = (Float) tblDonHang.getValueAt(i, 3);
                String tenSp = (String) tblDonHang.getValueAt(i, 0);
                /*MsgBox.alert(null, Integer.toString(soLuong));
                MsgBox.alert(null, Float.toString(thanhTien));*/
                dhct.setSoLuong(soLuong);
                dhct.setMaDH(maDh);
                dhct.setMaSP((String) JdbcHelper.value("SELECT MASP FROM SANPHAM WHERE TENSP LIKE ? ", tenSp));
                dhct.setThanhTien(thanhTien);
                ctdhDAO.insert(dhct);
                JdbcHelper.update("UPDATE SANPHAM SET SOLUONG -= ? WHERE TENSP = ?", soLuong, tenSp);
            }
            MsgBox.alert(null, "Đặt hàng thành công");
            resetDh();
        }
    }
}
