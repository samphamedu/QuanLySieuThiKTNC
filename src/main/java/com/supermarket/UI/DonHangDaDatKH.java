package com.supermarket.UI;

import com.supermarket.ENTITY.DonHang;
import com.supermarket.UTILS.JdbcHelper;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XDate;
import com.supermarket.UTILS.XImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DonHangDaDatKH extends javax.swing.JFrame {

    private String maKh;
    private List<DonHang> listDH = new ArrayList<>();
    private int index;

    public DonHangDaDatKH() {
        initComponents();
        init();
    }

    public DonHangDaDatKH(String maKh) {
        initComponents();
        this.maKh = maKh;
        init();
        this.setTitle("Đơn hàng đã đặt của khách hàng " + this.maKh);
    }
    
    public DonHangDaDatKH(String maKh, String str) {
        initComponents();
        this.maKh = maKh;
        init();
        this.setTitle("Đơn hàng đã đặt của khách hàng " + this.maKh);
        index = tblDSDHDD.getRowCount()-1;
        tblDSDHDD.setRowSelectionInterval(index, index);
        fillFromTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnMHChinh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSDHDD = new javax.swing.JTable();
        pnlPic = new javax.swing.JPanel();
        lblPic = new javax.swing.JLabel();
        pnlInfor = new javax.swing.JPanel();
        lblMaDH = new javax.swing.JLabel();
        lblNgayDatHang = new javax.swing.JLabel();
        lblMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JLabel();
        txtNgayDatHang = new javax.swing.JLabel();
        txtMaDH = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        lblMeo_HD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách đơn hàng đã đặt");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        pnlMain.setBackground(new java.awt.Color(61, 61, 61));
        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTitle.setFont(new java.awt.Font("Barlow Condensed", 1, 25)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 169));
        lblTitle.setText("DANH SÁCH ĐƠN HÀNG ĐÃ ĐẶT");

        btnMHChinh.setBackground(new java.awt.Color(255, 146, 64));
        btnMHChinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMHChinh.setForeground(new java.awt.Color(255, 255, 169));
        btnMHChinh.setText("Màn hình chính");
        btnMHChinh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMHChinh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMHChinh.setFocusable(false);
        btnMHChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMHChinhActionPerformed(evt);
            }
        });

        tblDSDHDD.setBackground(new java.awt.Color(255, 146, 64));
        tblDSDHDD.setForeground(new java.awt.Color(255, 255, 169));
        tblDSDHDD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSDHDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDSDHDDMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSDHDD);

        pnlPic.setBackground(new java.awt.Color(61, 61, 61));

        lblPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Money.png"))); // NOI18N

        javax.swing.GroupLayout pnlPicLayout = new javax.swing.GroupLayout(pnlPic);
        pnlPic.setLayout(pnlPicLayout);
        pnlPicLayout.setHorizontalGroup(
            pnlPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPicLayout.setVerticalGroup(
            pnlPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInfor.setBackground(new java.awt.Color(61, 61, 61));

        lblMaDH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblMaDH.setForeground(new java.awt.Color(255, 255, 169));
        lblMaDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblMaDH.setText("Mã đơn hàng:");

        lblNgayDatHang.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblNgayDatHang.setForeground(new java.awt.Color(255, 255, 169));
        lblNgayDatHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblNgayDatHang.setText("Ngày đặt hàng:");

        lblMaKH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblMaKH.setForeground(new java.awt.Color(255, 255, 169));
        lblMaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblMaKH.setText("Mã khách hàng:");

        txtMaKH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtMaKH.setForeground(new java.awt.Color(255, 146, 64));
        txtMaKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMaKH.setText("KHxxx");

        txtNgayDatHang.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtNgayDatHang.setForeground(new java.awt.Color(255, 146, 64));
        txtNgayDatHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNgayDatHang.setText("dd/MM/yyyy");

        txtMaDH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtMaDH.setForeground(new java.awt.Color(255, 146, 64));
        txtMaDH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMaDH.setText("DHxxx");

        lblTongTien.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 255, 169));
        lblTongTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblTongTien.setText("Tổng tiền:");

        txtTongTien.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(255, 146, 64));
        txtTongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTongTien.setText("000");

        javax.swing.GroupLayout pnlInforLayout = new javax.swing.GroupLayout(pnlInfor);
        pnlInfor.setLayout(pnlInforLayout);
        pnlInforLayout.setHorizontalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNgayDatHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaDH, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)))
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(txtNgayDatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(txtMaDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addComponent(lblMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNgayDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInforLayout.createSequentialGroup()
                        .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblMeo_HD.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblMeo_HD.setForeground(new java.awt.Color(255, 255, 169));
        lblMeo_HD.setText("Mẹo: Double click để xem thông tin chi tiết, nhé!");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblMeo_HD))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(pnlPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMHChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnMHChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(lblMeo_HD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMHChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMHChinhActionPerformed
        this.setVisible(false);
        new KhachHangFrame(maKh).setVisible(true);
    }//GEN-LAST:event_btnMHChinhActionPerformed

    private void tblDSDHDDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSDHDDMousePressed
        this.index = tblDSDHDD.getSelectedRow();
        if(evt.getClickCount()==2){
            new ChiTietDonHangFrame(listDH.get(index).getMaDH()).setVisible(true);
        }else{
            fillFromTable();
        }   
    }//GEN-LAST:event_tblDSDHDDMousePressed

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
                new DonHangDaDatKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMHChinh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaDH;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMeo_HD;
    private javax.swing.JLabel lblNgayDatHang;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlPic;
    private javax.swing.JTable tblDSDHDD;
    private javax.swing.JLabel txtMaDH;
    private javax.swing.JLabel txtMaKH;
    private javax.swing.JLabel txtNgayDatHang;
    private javax.swing.JLabel txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        loadToTable();
    }

    private void loadToTable() {
        DefaultTableModel model = (DefaultTableModel) tblDSDHDD.getModel();
        model.setRowCount(0);
        try {
            ResultSet rs = JdbcHelper.query("select * from DONHANG WHERE MAKH LIKE ?", maKh);
            while (rs.next()) {
                DonHang dh = new DonHang(rs.getString(2), rs.getDate(3), maKh);
                double tongTien = (Double) JdbcHelper.value("SELECT SUM(THANHTIEN) FROM CHITIETDONHANG WHERE MADH LIKE ? ", dh.getMaDH());
                listDH.add(dh);
                model.addRow(new Object[]{dh.getMaDH(), XDate.toString(dh.getNgayDatHang(), "dd/MM/yyyy"), dh.getMaKH(), tongTien});
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DonHangDaDatKH.class.getName()).log(Level.SEVERE, null, ex);
        }

        tblDSDHDD.setModel(model);
    }

    private void fillFromTable() {
        txtMaDH.setText(listDH.get(index).getMaDH());
        txtMaKH.setText(listDH.get(index).getMaKH());
        txtNgayDatHang.setText((String) tblDSDHDD.getValueAt(index, 1));
        txtTongTien.setText(Double.toString(((Double) tblDSDHDD.getValueAt(index, 3))));
    }
}
