package com.supermarket.UI;
import com.supermarket.DAO.NhanVienDAO;
import com.supermarket.DAO.KhachHangDAO;
import com.supermarket.ENTITY.NhanVien;
import com.supermarket.ENTITY.KhachHang;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XImage;
import javax.swing.JOptionPane;

public class DoiMatKhauJDialog extends javax.swing.JDialog {
    NhanVienDAO nvDao = new NhanVienDAO();
    KhachHangDAO khDao = new KhachHangDAO();

    public DoiMatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        initCombox();
    }
    
    private void initCombox() {
        cbbVaiTro.removeAllItems();
        String[] vaiTro = {"Nhân Viên", "Khách Hàng"};
        for (String vaitro : vaiTro) {
            cbbVaiTro.addItem(vaitro);
        }
    }

    private void doiMatKhau() {
        if (cbbVaiTro.getSelectedIndex() == 0) {
            DoiMatKhauNhanVien();
        } else {
            DoiMatKhauKhachHang();
        }
    }

    private void DoiMatKhauNhanVien() {
        String taikhoan = txtTenDangNhap.getText();
        String matkhau = new String(txtMatKhauCu.getPassword());
        String matkhaunew = new String(txtMatKhauMoi.getPassword());
        String matkhaucf = new String(txtNhapLaiMKM.getPassword());

        NhanVien nv = nvDao.selectById(taikhoan);
        if (nv == null) {
            JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại", "", 0);
        } else if (!matkhau.equalsIgnoreCase(nv.getMatKhau())) {
            JOptionPane.showMessageDialog(this, "Sai mật khẩu", "", 0);
        } else if (!matkhaucf.equalsIgnoreCase(matkhaunew)) {
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không đúng", "", 0);
        } else {
            nvDao.updatemk(matkhaunew, nv);
            MsgBox.alert(this, "Đổi mật khẩu thành công");
        }
    }

    private void DoiMatKhauKhachHang() {
        String taikhoan = txtTenDangNhap.getText();
        String matkhau = new String(txtMatKhauCu.getPassword());
        String matkhaunew = new String(txtMatKhauMoi.getPassword());
        String matkhaucf = new String(txtNhapLaiMKM.getPassword());

        KhachHang kh = khDao.selectById(taikhoan);
        if (kh == null) {
            JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại", "", 0);
        } else if (!matkhau.equalsIgnoreCase(kh.getMatKhau())) {
            JOptionPane.showMessageDialog(this, "Sai mật khẩu", "", 0);
        } else if (!matkhaucf.equalsIgnoreCase(matkhaunew)) {
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không đúng", "", 0);
        } else {
            khDao.updatemk(matkhaunew, kh);
            MsgBox.alert(this, "Đổi mật khẩu thành công");
        }
    }
    
    private boolean kiemtra(){
        if (txtTenDangNhap.getText().equals("") && txtMatKhauCu.getText().equals("") && txtMatKhauMoi.getText().equals("") && txtNhapLaiMKM.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "", 0);
            return false;
        }
        if (txtTenDangNhap.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập tên đăng nhập!", "", 0);
            return false;
        }
        if (txtMatKhauCu.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập mật khẩu cũ!", "", 0);
            return false;
        }
        if (txtMatKhauMoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập mật khẩu mới!", "", 0);
            return false;
        }
        if (txtNhapLaiMKM.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập lại mật khẩu!", "", 0);
            return false;
        }
        return true;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContain = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlInfor = new javax.swing.JPanel();
        lblVaiTro = new javax.swing.JLabel();
        cbbVaiTro = new javax.swing.JComboBox<>();
        lblTenDangNhap = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMatKhauCu = new javax.swing.JLabel();
        txtMatKhauCu = new javax.swing.JPasswordField();
        lblMatKhauMoi = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        lblNhapLaiMKM = new javax.swing.JLabel();
        txtNhapLaiMKM = new javax.swing.JPasswordField();
        pnlBtns = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JButton();
        btnDoiMK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đổi mật khẩu");
        setBackground(new java.awt.Color(61, 61, 61));
        setResizable(false);

        pnlContain.setBackground(new java.awt.Color(61, 61, 61));

        lblLogo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 169));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Change.png"))); // NOI18N
        lblLogo.setText("Đổi mật khẩu");
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogo.setIconTextGap(15);
        lblLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        pnlInfor.setBackground(new java.awt.Color(61, 61, 61));

        lblVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(255, 255, 169));
        lblVaiTro.setText("Vai trò");

        cbbVaiTro.setBackground(new java.awt.Color(255, 146, 64));
        cbbVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbVaiTro.setForeground(new java.awt.Color(255, 255, 169));
        cbbVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbVaiTro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbbVaiTro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbVaiTro.setFocusable(false);

        lblTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenDangNhap.setForeground(new java.awt.Color(255, 255, 169));
        lblTenDangNhap.setText("Tên đăng nhập");

        txtTenDangNhap.setBackground(new java.awt.Color(255, 146, 64));
        txtTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenDangNhap.setForeground(new java.awt.Color(255, 255, 169));
        txtTenDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMatKhauCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatKhauCu.setForeground(new java.awt.Color(255, 255, 169));
        lblMatKhauCu.setText("Mật khẩu cũ");

        txtMatKhauCu.setBackground(new java.awt.Color(255, 146, 64));
        txtMatKhauCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMatKhauCu.setForeground(new java.awt.Color(255, 255, 169));
        txtMatKhauCu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatKhauMoi.setForeground(new java.awt.Color(255, 255, 169));
        lblMatKhauMoi.setText("Mật khẩu mới");

        txtMatKhauMoi.setBackground(new java.awt.Color(255, 146, 64));
        txtMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMatKhauMoi.setForeground(new java.awt.Color(255, 255, 169));
        txtMatKhauMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNhapLaiMKM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNhapLaiMKM.setForeground(new java.awt.Color(255, 255, 169));
        lblNhapLaiMKM.setText("Nhập lại mật khẩu");

        txtNhapLaiMKM.setBackground(new java.awt.Color(255, 146, 64));
        txtNhapLaiMKM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNhapLaiMKM.setForeground(new java.awt.Color(255, 255, 169));
        txtNhapLaiMKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlInforLayout = new javax.swing.GroupLayout(pnlInfor);
        pnlInfor.setLayout(pnlInforLayout);
        pnlInforLayout.setHorizontalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVaiTro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenDangNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMatKhauCu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMatKhauMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNhapLaiMKM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatKhauMoi)
                    .addComponent(txtMatKhauCu)
                    .addComponent(txtTenDangNhap)
                    .addComponent(cbbVaiTro, 0, 272, Short.MAX_VALUE)
                    .addComponent(txtNhapLaiMKM))
                .addContainerGap())
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVaiTro)
                    .addComponent(cbbVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenDangNhap))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhauCu)
                    .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhauMoi)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhapLaiMKM)
                    .addComponent(txtNhapLaiMKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBtns.setBackground(new java.awt.Color(61, 61, 61));
        pnlBtns.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        btnDangNhap.setBackground(new java.awt.Color(255, 146, 64));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 169));
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

        btnDoiMK.setBackground(new java.awt.Color(255, 146, 64));
        btnDoiMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoiMK.setForeground(new java.awt.Color(255, 255, 169));
        btnDoiMK.setText("Đổi mật khẩu");
        btnDoiMK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDoiMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoiMK.setFocusable(false);
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });
        pnlBtns.add(btnDoiMK);

        javax.swing.GroupLayout pnlContainLayout = new javax.swing.GroupLayout(pnlContain);
        pnlContain.setLayout(pnlContainLayout);
        pnlContainLayout.setHorizontalGroup(
            pnlContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainLayout.createSequentialGroup()
                        .addComponent(pnlInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlContainLayout.setVerticalGroup(
            pnlContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainLayout.createSequentialGroup()
                .addGroup(pnlContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlContainLayout.createSequentialGroup()
                        .addComponent(pnlInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        this.setVisible(false);
        new DangNhapJDialog(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed
        if (kiemtra()) {
            doiMatKhau();
        }
    }//GEN-LAST:event_btnDoiMKActionPerformed

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
                DoiMatKhauJDialog dialog = new DoiMatKhauJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JComboBox<String> cbbVaiTro;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMatKhauCu;
    private javax.swing.JLabel lblMatKhauMoi;
    private javax.swing.JLabel lblNhapLaiMKM;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlBtns;
    private javax.swing.JPanel pnlContain;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLaiMKM;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
    }
}
