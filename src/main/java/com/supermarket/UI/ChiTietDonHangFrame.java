package com.supermarket.UI;

import com.supermarket.DAO.ChiTietDonHangDAO;
import com.supermarket.ENTITY.ChiTietDonHang;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ChiTietDonHangFrame extends javax.swing.JFrame {

    private int index = -1;
    private String maDH;
    private ChiTietDonHangDAO ctdhDao = new ChiTietDonHangDAO();
    private List<ChiTietDonHang> ctdhList = new ArrayList<>();
    private float tongTien;

    public ChiTietDonHangFrame() {
        initComponents();
        init();
    }

    public ChiTietDonHangFrame(String madh) {
        initComponents();
        this.maDH = madh;
        
//        this.setTitle("Chi Tiết Đơn Hàng Của Mã DH " + "'" + this.maDH + "'");
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Sub = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        pnlMaDH = new javax.swing.JPanel();
        lblMaDH = new javax.swing.JLabel();
        txtMaDH = new javax.swing.JLabel();
        pnlPic = new javax.swing.JPanel();
        lblPic = new javax.swing.JLabel();
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

        setTitle("Đơn hàng chi tiết");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        pnl_Sub.setBackground(new java.awt.Color(61, 61, 61));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });

        pnlMaDH.setBackground(new java.awt.Color(61, 61, 61));

        lblMaDH.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblMaDH.setForeground(new java.awt.Color(255, 255, 169));
        lblMaDH.setText("Đơn hàng:");

        txtMaDH.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMaDH.setForeground(new java.awt.Color(255, 146, 64));
        txtMaDH.setText("DH0004");

        javax.swing.GroupLayout pnlMaDHLayout = new javax.swing.GroupLayout(pnlMaDH);
        pnlMaDH.setLayout(pnlMaDHLayout);
        pnlMaDHLayout.setHorizontalGroup(
            pnlMaDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaDHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaDH)
                .addGap(18, 18, 18)
                .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlMaDHLayout.setVerticalGroup(
            pnlMaDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaDHLayout.createSequentialGroup()
                .addGroup(pnlMaDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaDH, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtMaDH))
                .addContainerGap())
        );

        pnlPic.setBackground(new java.awt.Color(61, 61, 61));

        lblPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/shopping-bag.png"))); // NOI18N

        javax.swing.GroupLayout pnlPicLayout = new javax.swing.GroupLayout(pnlPic);
        pnlPic.setLayout(pnlPicLayout);
        pnlPicLayout.setHorizontalGroup(
            pnlPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPicLayout.setVerticalGroup(
            pnlPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPicLayout.createSequentialGroup()
                .addContainerGap()
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
        txtTongTien.setText("000");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGroup(pnl_SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_SubLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack))
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
        prev();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblCTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTMousePressed
        index = tblCT.getSelectedRow();
        fillFromTable();
    }//GEN-LAST:event_tblCTMousePressed

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackMousePressed

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
                new ChiTietDonHangFrame().setVisible(true);
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
    private javax.swing.JLabel lblMaDH;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPanel pnlMaDH;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlPic;
    private javax.swing.JPanel pnl_Sub;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblCT;
    private javax.swing.JLabel txtMaDH;
    private javax.swing.JLabel txtMaSP;
    private javax.swing.JLabel txtSoLuong;
    private javax.swing.JLabel txtThanhTien;
    private javax.swing.JLabel txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        loadToTable();
        txtMaDH.setText(maDH);
        for(int i = 0; i<tblCT.getSelectedRow();i++){
            tongTien+= (Float)tblCT.getValueAt(i, 2);
        }
    }

    private void loadToTable() {
        DefaultTableModel model = (DefaultTableModel) tblCT.getModel();
        model.setRowCount(0);
        String madh = this.maDH;
        ctdhList = ctdhDao.selectByKeyword(madh);
        float tongTien = 0;
        for (ChiTietDonHang ctdh : ctdhList) {
            Object[] row = {
                ctdh.getMaSP(),
                ctdh.getSoLuong(),
                ctdh.getThanhTien()
            };
            model.addRow(row);
            tongTien += ctdh.getThanhTien();
        }
        txtTongTien.setText(String.valueOf(tongTien));
    }
    
    private void fillFromTable(){
        txtMaSP.setText((String) tblCT.getValueAt(index, 0));
        txtSoLuong.setText(Integer.toString((Integer)tblCT.getValueAt(index, 1)));
        txtThanhTien.setText((Float.toString((Float)tblCT.getValueAt(index, 2))));
    }
    
    private void next(){
        if(index == tblCT.getRowCount()-1){
            first();
            return;
        }
        index++;
        tblCT.setRowSelectionInterval(index, index);
        fillFromTable();
    }
    
    private void first(){
        index = 0;
        tblCT.setRowSelectionInterval(index, index);
        fillFromTable();
    }
    
    private void last(){
        index = tblCT.getRowCount()-1;
        tblCT.setRowSelectionInterval(index, index);
        fillFromTable();
    }
    
    private void prev(){
        switch (index) {
            case -1:
                index =0;
                tblCT.setRowSelectionInterval(index, index);
                fillFromTable();
                break;
            case 0:
                last();
                break;
            default:
                index --;
                tblCT.setRowSelectionInterval(index, index);
                fillFromTable();
                break;
        }
    }
}
