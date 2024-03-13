package com.supermarket.UI;

import com.supermarket.DAO.KhachHangDAO;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XDate;
import static java.awt.Color.white;
import static java.awt.Color.yellow;
import java.util.Date;
import com.supermarket.ENTITY.KhachHang;
import static com.supermarket.UTILS.XDate.now;
import com.supermarket.UTILS.XImage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DangKyJDialog extends javax.swing.JDialog {

    KhachHangDAO dao = new KhachHangDAO();
    List<KhachHang> khachHangList = new ArrayList();
    private Date ngaySinh;

    public DangKyJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        khachHangList = dao.selectAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrGioiTinh = new javax.swing.ButtonGroup();
        pnl_DangKy = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlInfor = new javax.swing.JPanel();
        lblTenDangNhap = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblHoTen = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lblNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        pnlBtns = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng kí");
        setUndecorated(true);
        setResizable(false);

        pnl_DangKy.setBackground(new java.awt.Color(61, 61, 61));

        pnlLogo.setBackground(new java.awt.Color(61, 61, 61));

        lblLogo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 169));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/register 128px.png"))); // NOI18N
        lblLogo.setText("ĐĂNG KÝ");
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogo.setIconTextGap(15);
        lblLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInfor.setBackground(new java.awt.Color(61, 61, 61));

        lblTenDangNhap.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTenDangNhap.setForeground(new java.awt.Color(255, 255, 169));
        lblTenDangNhap.setText("Tên đăng nhập");

        txtTenDangNhap.setBackground(new java.awt.Color(255, 146, 64));
        txtTenDangNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTenDangNhap.setForeground(new java.awt.Color(255, 255, 169));

        lblMatKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(255, 255, 169));
        lblMatKhau.setText("Mật khẩu");

        txtMatKhau.setBackground(new java.awt.Color(255, 146, 64));
        txtMatKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 169));

        lblHoTen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(255, 255, 169));
        lblHoTen.setText("Họ và tên");

        txtHoVaTen.setBackground(new java.awt.Color(255, 146, 64));
        txtHoVaTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHoVaTen.setForeground(new java.awt.Color(255, 255, 169));

        lblGioiTinh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGioiTinh.setForeground(new java.awt.Color(255, 255, 169));
        lblGioiTinh.setText("Giới tính");

        rdoNam.setBackground(new java.awt.Color(61, 61, 61));
        bgrGioiTinh.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdoNam.setForeground(new java.awt.Color(255, 255, 169));
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        rdoNam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoNam.setFocusable(false);

        rdoNu.setBackground(new java.awt.Color(61, 61, 61));
        bgrGioiTinh.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdoNu.setForeground(new java.awt.Color(255, 255, 169));
        rdoNu.setText("Nữ");
        rdoNu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoNu.setFocusable(false);

        lblNgaySinh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNgaySinh.setForeground(new java.awt.Color(255, 255, 169));
        lblNgaySinh.setText("Ngày sinh");

        txtNgaySinh.setBackground(new java.awt.Color(255, 146, 64));
        txtNgaySinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgaySinh.setForeground(new java.awt.Color(255, 255, 169));

        pnlBtns.setBackground(new java.awt.Color(61, 61, 61));
        pnlBtns.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        btnDangNhap.setBackground(new java.awt.Color(255, 255, 169));
        btnDangNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 146, 64));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.setFocusable(false);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        pnlBtns.add(btnDangNhap);

        btnDangKy.setBackground(new java.awt.Color(255, 146, 64));
        btnDangKy.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDangKy.setForeground(new java.awt.Color(255, 255, 169));
        btnDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/click.png"))); // NOI18N
        btnDangKy.setText("Đăng ký");
        btnDangKy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangKy.setFocusable(false);
        btnDangKy.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDangKy.setIconTextGap(15);
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        pnlBtns.add(btnDangKy);

        javax.swing.GroupLayout pnlInforLayout = new javax.swing.GroupLayout(pnlInfor);
        pnlInfor.setLayout(pnlInforLayout);
        pnlInforLayout.setHorizontalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlInforLayout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(35, 35, 35)
                                .addComponent(rdoNu))
                            .addComponent(txtTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txtMatKhau)
                            .addComponent(txtHoVaTen)
                            .addComponent(txtNgaySinh))))
                .addContainerGap())
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenDangNhap))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(rdoNu)
                    .addComponent(rdoNam))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgaySinh))
                .addGap(27, 27, 27)
                .addComponent(pnlBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_DangKyLayout = new javax.swing.GroupLayout(pnl_DangKy);
        pnl_DangKy.setLayout(pnl_DangKyLayout);
        pnl_DangKyLayout.setHorizontalGroup(
            pnl_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DangKyLayout.createSequentialGroup()
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_DangKyLayout.setVerticalGroup(
            pnl_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DangKyLayout.createSequentialGroup()
                .addGroup(pnl_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlInfor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_DangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_DangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        this.setVisible(false);
        new DangNhapJDialog(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        boolean check = check();
        if (check == true) {
            int age = XDate.now().getYear() - ngaySinh.getYear();
            if (age >= 18) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(txtTenDangNhap.getText());
                kh.setTenKH(txtHoVaTen.getText());
                kh.setMatKhau(txtMatKhau.getText());
                if (rdoNam.isSelected() == true) {
                    kh.setGioiTinh(true);
                } else {
                    kh.setGioiTinh(false);
                }
                kh.setNgaySinh(ngaySinh);
                kh.setNgayDangKy(now());
                dao.insert(kh);
                MsgBox.alert(null, "Đăng ký thành công");
                this.setVisible(false);
                new DangNhapJDialog(null, rootPaneCheckingEnabled, kh.getMaKH(), kh.getMatKhau()).setVisible(true);
            } else {
                MsgBox.alert(null, "Bạn chưa đủ 18 tuổi để tạo tài khoản");
            }
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

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
            @Override
            public void run() {
                DangKyJDialog dialog = new DangKyJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgrGioiTinh;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JPanel pnlBtns;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnl_DangKy;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
    }

    private boolean check() {
        boolean check = true;

        if (txtTenDangNhap.getText().trim().length() == 0) {
            MsgBox.alert(null, "Bạn chưa nhập tên đăng nhập");
            check = false;
        } else {
            for (KhachHang kh : khachHangList) {
                if (txtTenDangNhap.getText().equals(kh.getMaKH())) {
                    MsgBox.alert(null, "Tên đăng nhập đã tồn tại");
                    check = false;
                    break;
                }
            }
        }

        if (txtMatKhau.getText().trim().length() == 0) {
            MsgBox.alert(null, "Bạn chưa nhập mật khẩu");
            check = false;
        } else {
            for (KhachHang kh : khachHangList) {
                if (txtMatKhau.getText().equals(kh.getMatKhau())) {
                    MsgBox.alert(null, "Mật khẩu đã tồn tại");
                    check = false;
                    break;
                }
            }
        }

        if (txtHoVaTen.getText().trim().length() == 0) {
            MsgBox.alert(null, "Bạn chưa nhập họ và tên");
            check = false;
        }

        if (txtNgaySinh.getText().trim().length() == 0) {
            MsgBox.alert(null, "Bạn chưa nhập ngày sinh");
            check = false;
        } else {
            try {
                ngaySinh = XDate.toDate(txtNgaySinh.getText(), "dd/MM/yyyy","Đăng ký");
            } catch (Exception ex) {
                MsgBox.alert(null, "Bạn phải nhập ngày sinh theo định dạng ngày/tháng/năm");
                check = false;
            }
        }
        return check;
    }
}
