package over.view;

import over.controller.BackgroundImage;
import over.controller.LoginController;
import over.model.pojo.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Login extends JFrame {

    private final Image backgroundImage;
    private List<Component> componentList;
    private LoginController loginController;
    
    public Login() {                
        backgroundImage = BackgroundImage.request();
        
        initComponents();

        componentList = new ArrayList<>();
        componentList.add(txtUser);
        componentList.add(txtPassword);
        componentList.add(btnLogin);

        loginController = new LoginController(componentList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        loginPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, null);
            }
        };
        northFiller = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        lblLogo = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        southFiller = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Holiwallet v0.1 - Inicio de sesión");
        setMinimumSize(new java.awt.Dimension(300, 450));
        setName("frmLogin"); // NOI18N
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setMinimumSize(new java.awt.Dimension(300, 450));
        loginPanel.setName("loginPanel"); // NOI18N
        loginPanel.setPreferredSize(new java.awt.Dimension(300, 450));
        loginPanel.setLayout(new java.awt.GridBagLayout());

        northFiller.setName("northFiller"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        loginPanel.add(northFiller, gridBagConstraints);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/over/resources/img/login/holiday_shield.png"))); // NOI18N
        lblLogo.setName("lblLogo"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        loginPanel.add(lblLogo, gridBagConstraints);

        lblUser.setText("Usuario");
        lblUser.setName("lblUser"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        loginPanel.add(lblUser, gridBagConstraints);

        txtUser.setMinimumSize(new java.awt.Dimension(200, 30));
        txtUser.setName("txtUser"); // NOI18N
        txtUser.setPreferredSize(new java.awt.Dimension(200, 30));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        loginPanel.add(txtUser, gridBagConstraints);

        lblPassword.setText("Clave");
        lblPassword.setName("lblPassword"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        loginPanel.add(lblPassword, gridBagConstraints);

        txtPassword.setMinimumSize(new java.awt.Dimension(200, 30));
        txtPassword.setName("txtPassword"); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(200, 30));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        loginPanel.add(txtPassword, gridBagConstraints);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/over/resources/img/login/login.png"))); // NOI18N
        btnLogin.setText("Entrar");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogin.setName("btnLogin"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        loginPanel.add(btnLogin, gridBagConstraints);

        southFiller.setName("southFiller"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        loginPanel.add(southFiller, gridBagConstraints);

        getContentPane().add(loginPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String userName = txtUser.getText();
            String userPassword = loginController.encryptPassword(txtPassword.getPassword());

            User user = new User(userName, userPassword);

            if (loginController.login(user)) {
                new Dashboard(user).setVisible(true);
                this.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta");
        }
        catch(Exception e) {            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        loginController.setFocus(evt);
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        loginController.setFocus(evt);
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        loginController.setFocus(evt);
    }//GEN-LAST:event_btnLoginKeyPressed

    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel loginPanel;
    private javax.swing.Box.Filler northFiller;
    private javax.swing.Box.Filler southFiller;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}