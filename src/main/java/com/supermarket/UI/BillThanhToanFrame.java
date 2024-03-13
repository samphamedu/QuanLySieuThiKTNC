package com.supermarket.UI;
import com.supermarket.ENTITY.BillThanhToan;
import com.supermarket.UTILS.XDate;
import java.util.ArrayList;
import com.supermarket.UTILS.XDate;
import com.supermarket.UTILS.XImage;

import java.util.List;
import javax.security.auth.x500.X500Principal;
import javax.swing.table.DefaultTableModel;

public class BillThanhToanFrame extends javax.swing.JDialog {
    
    List<BillThanhToan> billThanhToan = new ArrayList<>();
    String maHD, tenNV;
    float tongTien;

    public BillThanhToanFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    
    public BillThanhToanFrame(List<BillThanhToan> bill, String maHD, String tenNV, float tongTien) {
        initComponents();
        this.billThanhToan = bill;
        this.maHD = maHD;
        this.tenNV = tenNV;
        this.tongTien = tongTien;
        this.setTitle("Ma HD " + this.maHD);
        txtNgayBan.setText(XDate.toString(XDate.now(), "dd/MM/yyyy"));
        init();
    }
    
    private void init(){
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        loadToTable();
    }
    
    private void loadToTable(){
        DefaultTableModel tbl = (DefaultTableModel) tblCont.getModel();
        tbl.setRowCount(0);
        for (BillThanhToan bill : billThanhToan) {
            Object[] row = {
                bill.getTenSP(),
                bill.getGiaSP(),
                bill.getSoLuong(),
                bill.getThanhTien()
            };
            tbl.addRow(row);
        }
        lblHD.setText(maHD);
        txtThuNgan.setText(tenNV);
        txtTong.setText(String.valueOf(tongTien));
        txtTra.setText(String.valueOf(tongTien));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Bill = new javax.swing.JPanel();
        pnlInfor = new javax.swing.JPanel();
        lblSupermarket = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblDiaChiTT = new javax.swing.JLabel();
        lblHotline = new javax.swing.JLabel();
        lblNgayBan = new javax.swing.JLabel();
        txtNgayBan = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblHD = new javax.swing.JLabel();
        lblThuNgan = new javax.swing.JLabel();
        txtThuNgan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCont = new javax.swing.JTable();
        pnlThanhToan = new javax.swing.JPanel();
        lblTong = new javax.swing.JLabel();
        txtTong = new javax.swing.JLabel();
        lblDonVi1 = new javax.swing.JLabel();
        lblGiam = new javax.swing.JLabel();
        txtGiam = new javax.swing.JLabel();
        lblTra = new javax.swing.JLabel();
        txtTra = new javax.swing.JLabel();
        lblDonVi2 = new javax.swing.JLabel();
        lblDonVi = new javax.swing.JLabel();
        lblCamOn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));

        pnl_Bill.setBackground(new java.awt.Color(255, 255, 255));

        pnlInfor.setBackground(new java.awt.Color(255, 255, 255));

        lblSupermarket.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSupermarket.setText("Supermarket");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo 64px.png"))); // NOI18N

        lblDiaChi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDiaChi.setText("Địa chỉ: Số 53, Sư Vạn Hạnh,");

        lblDiaChiTT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDiaChiTT.setText("Quận 10, TP Hồ Chỉ Minh");

        lblHotline.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblHotline.setText("Hotline: 0909 777 888");

        lblNgayBan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNgayBan.setText("Ngày bán:");

        txtNgayBan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgayBan.setText("XX/XX/202X");

        javax.swing.GroupLayout pnlInforLayout = new javax.swing.GroupLayout(pnlInfor);
        pnlInfor.setLayout(pnlInforLayout);
        pnlInforLayout.setHorizontalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(lblDiaChiTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHotline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addComponent(lblSupermarket)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addComponent(lblNgayBan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addComponent(lblSupermarket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDiaChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDiaChiTT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHotline)
                        .addGap(18, 18, 18)
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayBan)
                            .addComponent(txtNgayBan))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("HÓA ĐƠN BÁN HÀNG");

        lblHD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHD.setText("HDXXXXX");

        lblThuNgan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblThuNgan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThuNgan.setText("Thu ngân:");

        txtThuNgan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtThuNgan.setText("Nguyen Van X");

        tblCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblCont.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblCont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Tên sản phẩm", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCont.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblCont);

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContentLayout.createSequentialGroup()
                        .addComponent(lblThuNgan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThuNgan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThuNgan)
                    .addComponent(txtThuNgan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlThanhToan.setBackground(new java.awt.Color(255, 255, 255));

        lblTong.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTong.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTong.setText("Tổng tiền hàng:");

        txtTong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTong.setText("XXX.XXXX");

        lblDonVi1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDonVi1.setText("VND");

        lblGiam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGiam.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGiam.setText("Giảm giá:");

        txtGiam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGiam.setText("000.0000");

        lblTra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTra.setText("Tiền phải trả:");

        txtTra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTra.setText("XXX.XXXX");

        lblDonVi2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDonVi2.setText("VND");

        lblDonVi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDonVi.setText("VND");

        javax.swing.GroupLayout pnlThanhToanLayout = new javax.swing.GroupLayout(pnlThanhToan);
        pnlThanhToan.setLayout(pnlThanhToanLayout);
        pnlThanhToanLayout.setHorizontalGroup(
            pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThanhToanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGiam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThanhToanLayout.createSequentialGroup()
                        .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDonVi1))
                    .addGroup(pnlThanhToanLayout.createSequentialGroup()
                        .addComponent(txtTra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDonVi2))
                    .addGroup(pnlThanhToanLayout.createSequentialGroup()
                        .addComponent(txtGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDonVi)))
                .addGap(18, 18, 18))
        );
        pnlThanhToanLayout.setVerticalGroup(
            pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTong)
                    .addComponent(txtTong)
                    .addComponent(lblDonVi1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGiam)
                    .addComponent(txtGiam)
                    .addComponent(lblDonVi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTra)
                    .addComponent(lblDonVi2)
                    .addComponent(txtTra))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblCamOn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCamOn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamOn.setText("Xin chân thành cảm ơn quý khách, hẹn gặp lại!");

        javax.swing.GroupLayout pnl_BillLayout = new javax.swing.GroupLayout(pnl_Bill);
        pnl_Bill.setLayout(pnl_BillLayout);
        pnl_BillLayout.setHorizontalGroup(
            pnl_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCamOn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_BillLayout.setVerticalGroup(
            pnl_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_BillLayout.createSequentialGroup()
                .addComponent(pnlInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCamOn)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillThanhToanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillThanhToanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillThanhToanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillThanhToanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BillThanhToanFrame dialog = new BillThanhToanFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCamOn;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDiaChiTT;
    private javax.swing.JLabel lblDonVi;
    private javax.swing.JLabel lblDonVi1;
    private javax.swing.JLabel lblDonVi2;
    private javax.swing.JLabel lblGiam;
    private javax.swing.JLabel lblHD;
    private javax.swing.JLabel lblHotline;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNgayBan;
    private javax.swing.JLabel lblSupermarket;
    private javax.swing.JLabel lblThuNgan;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTong;
    private javax.swing.JLabel lblTra;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPanel pnlThanhToan;
    private javax.swing.JPanel pnl_Bill;
    private javax.swing.JTable tblCont;
    private javax.swing.JLabel txtGiam;
    private javax.swing.JLabel txtNgayBan;
    private javax.swing.JLabel txtThuNgan;
    private javax.swing.JLabel txtTong;
    private javax.swing.JLabel txtTra;
    // End of variables declaration//GEN-END:variables
}
