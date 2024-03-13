package com.supermarket.UI;

import com.supermarket.DAO.ChiTietHoaDonDAO;
import com.supermarket.ENTITY.CLockThread;
import com.supermarket.ENTITY.ChiTietHoaDon;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ChiTietHoaDonFrame extends javax.swing.JFrame {
    
    private String maHD;
    private int index = -1;
    private ChiTietHoaDonDAO cthdDao = new ChiTietHoaDonDAO();
    private List<ChiTietHoaDon> cthdList = new ArrayList<>();
            
    public ChiTietHoaDonFrame() {
        initComponents();
        init();
    }
    
    public ChiTietHoaDonFrame(String mahd) {
        initComponents();
        this.maHD = mahd;
        this.setTitle("Chi Tiết Hoá Đơn Của Mã HD "+"'" + this.maHD + "'");
        init();
        txtMaHD.setText(this.maHD);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Sub = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        pnlPic = new javax.swing.JPanel();
        lblPic = new javax.swing.JLabel();
        pnlMaHD = new javax.swing.JPanel();
        lblMaHD = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JLabel();
        pnlInfor = new javax.swing.JPanel();
        lblMaSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JLabel();
        lblThanhTien = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        lblDonViGia = new javax.swing.JLabel();
        pnlNavigation = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tblCT = new javax.swing.JTable();

        setTitle("Hóa đơn chi tiết");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1085, 542));
        setUndecorated(true);
        setResizable(false);

        pnl_Sub.setBackground(new java.awt.Color(61, 61, 61));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });

        pnlPic.setBackground(new java.awt.Color(61, 61, 61));

        lblPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Money.png"))); // NOI18N

        pnlMaHD.setBackground(new java.awt.Color(61, 61, 61));

        lblMaHD.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblMaHD.setForeground(new java.awt.Color(255, 255, 169));
        lblMaHD.setText("Hóa đơn");

        txtMaHD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMaHD.setForeground(new java.awt.Color(255, 146, 64));
        txtMaHD.setText("HD0048");

        javax.swing.GroupLayout pnlMaHDLayout = new javax.swing.GroupLayout(pnlMaHD);
        pnlMaHD.setLayout(pnlMaHDLayout);
        pnlMaHDLayout.setHorizontalGroup(
            pnlMaHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaHD)
                .addGap(18, 18, 18)
                .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlMaHDLayout.setVerticalGroup(
            pnlMaHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaHDLayout.createSequentialGroup()
                .addGroup(pnlMaHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtMaHD))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPicLayout = new javax.swing.GroupLayout(pnlPic);
        pnlPic.setLayout(pnlPicLayout);
        pnlPicLayout.setHorizontalGroup(
            pnlPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPicLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPicLayout.setVerticalGroup(
            pnlPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );

        pnlInfor.setBackground(new java.awt.Color(61, 61, 61));

        lblMaSP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblMaSP.setForeground(new java.awt.Color(255, 255, 169));
        lblMaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblMaSP.setText("Mã sản phẩm:");

        txtMaSP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtMaSP.setForeground(new java.awt.Color(255, 146, 64));
        txtMaSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMaSP.setText("SPxxxx");

        lblSoLuong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(255, 255, 169));
        lblSoLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblSoLuong.setText("Số lượng:");

        txtSoLuong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(255, 146, 64));
        txtSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSoLuong.setText("0");

        lblThanhTien.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblThanhTien.setForeground(new java.awt.Color(255, 255, 169));
        lblThanhTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-touch.png"))); // NOI18N
        lblThanhTien.setText("Thành tiền:");

        txtThanhTien.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtThanhTien.setForeground(new java.awt.Color(255, 146, 64));
        txtThanhTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtThanhTien.setText("000");

        lblTongTien.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 255, 169));
        lblTongTien.setText("Tổng tiền:");

        txtTongTien.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(255, 146, 64));
        txtTongTien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTongTien.setText("57470.000");

        lblDonViGia.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDonViGia.setForeground(new java.awt.Color(255, 146, 64));
        lblDonViGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonViGia.setText("VND");

        javax.swing.GroupLayout pnlInforLayout = new javax.swing.GroupLayout(pnlInfor);
        pnlInfor.setLayout(pnlInforLayout);
        pnlInforLayout.setHorizontalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addComponent(lblTongTien)
                        .addGap(18, 18, 18)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDonViGia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInforLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblThanhTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonViGia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlNavigation.setBackground(new java.awt.Color(61, 61, 61));
        pnlNavigation.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst.setBackground(new java.awt.Color(255, 146, 64));
        btnFirst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.setFocusable(false);
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlNavigation.add(btnFirst);

        btnPrevious.setBackground(new java.awt.Color(255, 146, 64));
        btnPrevious.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevious.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevious.setFocusable(false);
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        pnlNavigation.add(btnPrevious);

        btnNext.setBackground(new java.awt.Color(255, 146, 64));
        btnNext.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlNavigation.add(btnNext);

        btnLast.setBackground(new java.awt.Color(255, 146, 64));
        btnLast.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.setFocusable(false);
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlNavigation.add(btnLast);

        tblCT.setBackground(new java.awt.Color(255, 146, 64));
        tblCT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblCT.setForeground(new java.awt.Color(61, 61, 61));
        tblCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Mã sản phẩm", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCT.setGridColor(new java.awt.Color(0, 0, 0));
        tblCT.setSelectionBackground(new java.awt.Color(255, 255, 169));
        tblCT.setSelectionForeground(new java.awt.Color(61, 61, 61));
        tblCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCTMousePressed(evt);
            }
        });
        scroll.setViewportView(tblCT);

        javax.swing.GroupLayout pnl_SubLayout = new javax.swing.GroupLayout(pnl_Sub);
        pnl_Sub.setLayout(pnl_SubLayout);
        pnl_SubLayout.setHorizontalGroup(
            pnl_SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
            .addGroup(pnl_SubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_SubLayout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_SubLayout.createSequentialGroup()
                        .addComponent(pnlInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_SubLayout.createSequentialGroup()
                        .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        pnl_SubLayout.setVerticalGroup(
            pnl_SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_SubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_SubLayout.createSequentialGroup()
                        .addComponent(pnlInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(pnl_SubLayout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        previous();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackMousePressed

    private void tblCTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTMousePressed
        index = tblCT.getSelectedRow();
        fillToForm(index);
    }//GEN-LAST:event_tblCTMousePressed

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
                new ChiTietHoaDonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel lblDonViGia;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPanel pnlMaHD;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlPic;
    private javax.swing.JPanel pnl_Sub;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblCT;
    private javax.swing.JLabel txtMaHD;
    private javax.swing.JLabel txtMaSP;
    private javax.swing.JLabel txtSoLuong;
    private javax.swing.JLabel txtThanhTien;
    private javax.swing.JLabel txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        loadToTableCTHD();
        txtMaHD.setFocusable(false);
        txtMaSP.setFocusable(false);
        txtSoLuong.setFocusable(false);
        txtThanhTien.setFocusable(false);
    }
    
    private void loadToTableCTHD(){
        DefaultTableModel cthdTableModel = (DefaultTableModel) tblCT.getModel();
        cthdTableModel.setRowCount(0);
        cthdList = cthdDao.SelectByMaHD(maHD);
        float tongTien = 0;
        for (ChiTietHoaDon cthd : cthdList) {
            Object[] row = {
                cthd.getMaSP(),
                cthd.getSoLuong(),
                cthd.getThanhTien()
            };
            cthdTableModel.addRow(row);
            tongTien += cthd.getThanhTien();
            
        }
        txtTongTien.setText(String.valueOf(tongTien));
    }
    
    private void fillToForm(int index){
        txtMaHD.setText(cthdList.get(index).getMaHD());
        txtMaSP.setText(cthdList.get(index).getMaSP());
        txtSoLuong.setText(String.valueOf(cthdList.get(index).getSoLuong()));
        txtThanhTien.setText(String.valueOf(cthdList.get(index).getThanhTien()));
        tblCT.setRowSelectionInterval(index, index);
    }
    
    private void first() {
        index = 0;
        fillToForm(0);
    }

    private void next() {
        index++;
        if (index > cthdList.size() - 1) {
            index = 0;
        }
        fillToForm(index);
    }

    private void previous() {
        index--;
        if (index < 0) {
            index = cthdList.size() - 1;
        }
        fillToForm(index);
    }

    private void last() {
        index = cthdList.size() - 1;
        fillToForm(index);
    }
    
}
