package com.supermarket.UI;

import com.supermarket.UTILS.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class ChaoJDialog extends javax.swing.JDialog {

    private Timer t;
    
    public ChaoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(594, 247));
        setResizable(false);

        lblLogo.setBackground(new java.awt.Color(255, 146, 64));
        lblLogo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(61, 61, 61));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo 128px.png"))); // NOI18N
        lblLogo.setText("Group 5 | HỆ THỐNG QUẢN LÝ SIÊU THỊ");
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogo.setIconTextGap(30);
        lblLogo.setOpaque(true);
        lblLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblLogo, java.awt.BorderLayout.CENTER);

        progressBar.setBackground(new java.awt.Color(255, 255, 169));
        progressBar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        progressBar.setForeground(new java.awt.Color(61, 61, 61));
        progressBar.setBorder(null);
        progressBar.setStringPainted(true);
        getContentPane().add(progressBar, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                ChaoJDialog dialog = new ChaoJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblLogo;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
private void condition() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = progressBar.getValue();
                if (value < 100) {
                    progressBar.setValue(value + 10);
                } else {
                    t.stop();
                    ChaoJDialog.this.dispose();
                    new DangNhapJDialog(null, rootPaneCheckingEnabled).setVisible(true);
                }
            }
        };
        t = new Timer(200, listener);
        t.start();
    }
    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        condition();
    }
}
