/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Frame;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import com.function.*;

/**
 *
 * @author VC
 */
public class DlgRegister extends javax.swing.JDialog {
    
    DlgTag tag = new DlgTag(this);
    java.awt.Frame parent;
    /**
     * Creates new form DlgRegister
     */
    public DlgRegister(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public DlgRegister(java.awt.Frame login){
        super(login,"注册",true);
        initComponents();
        parent = login;
        this.setResizable(false);			//设置窗口不可放大缩小
        this.setDefaultCloseOperation (JDialog.DO_NOTHING_ON_CLOSE);
        com.function.Window.setWindowCenter(this);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                quit();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_userName = new javax.swing.JTextField();
        PF_userPwd = new javax.swing.JPasswordField();
        PF_pwdCheck = new javax.swing.JPasswordField();
        BTN_TAG = new javax.swing.JButton();
        BTN_Back = new javax.swing.JButton();
        LB_tag = new javax.swing.JLabel();
        BTN_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("用户名");

        jLabel2.setText("输入密码");

        jLabel3.setText("确认密码");

        BTN_TAG.setText("选择标签");
        BTN_TAG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_TAGMouseClicked(evt);
            }
        });

        BTN_Back.setText("返回");
        BTN_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_BackMouseClicked(evt);
            }
        });

        BTN_register.setText("注册");
        BTN_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_registerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(BTN_register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(BTN_Back)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(PF_userPwd)
                    .addComponent(PF_pwdCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_TAG)
                .addGap(46, 46, 46)
                .addComponent(LB_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PF_userPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(PF_pwdCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_TAG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_tag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Back)
                    .addComponent(BTN_register))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_BackMouseClicked
        // TODO add your handling code here:
        quit();
    }//GEN-LAST:event_BTN_BackMouseClicked

    private void BTN_TAGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_TAGMouseClicked
        // TODO add your handling code here:
        //this.setVisible(false);
        tag.taglist = "";
        LB_tag.setText("");
        tag.setVisible(true);
        LB_tag.setText(tag.taglist);
    }//GEN-LAST:event_BTN_TAGMouseClicked

    private void BTN_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_registerMouseClicked
        // TODO add your handling code here:
        if(!"".equalsIgnoreCase(TF_userName.getText())){                        //验证用户名输入
            String username = TF_userName.getText();
            if(!"".equalsIgnoreCase(String.valueOf(PF_userPwd.getPassword()))){  //验证密码输入
                String pwd= String.valueOf(PF_userPwd.getPassword());
                if(!"".equalsIgnoreCase(String.valueOf(PF_pwdCheck.getPassword()))){   //确认密码
                    String pcheck= String.valueOf(PF_pwdCheck.getPassword());
                    if(pcheck.equalsIgnoreCase(pwd)){
                        if(!"".equalsIgnoreCase(LB_tag.getText())){                 //标签选择确认
                            String res = com.function.UserManager.getUserManager().register(username, pwd,LB_tag.getText());
                            switch(res){
                            case "registerSuccess":
                                JOptionPane.showMessageDialog(null, "注册成功", "成功", JOptionPane.INFORMATION_MESSAGE);
                                this.setVisible(false);
                                parent.setVisible(true);
                                break;
                            case "registerFailed":
                                JOptionPane.showMessageDialog(null, "注册失败", "警告", JOptionPane.ERROR_MESSAGE);
                                break;
                            case "registerExist":
                                JOptionPane.showMessageDialog(null, "用户名已存在", "警告", JOptionPane.ERROR_MESSAGE);
                                break;
                            case "registerNull":
                                break;
                        }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "标签不能为空", "警告", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "两次输入密码不同", "警告", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "请再次输入密码", "警告", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "密码不为空", "警告", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "用户名不为空", "警告", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BTN_registerMouseClicked

     private void quit() {
		int flag = 0;
		String msg = "您 现 在 要 退 出 注 册 吗 ？";
		flag = JOptionPane.showConfirmDialog(null, msg, "提示", JOptionPane.YES_NO_OPTION);
		if(flag == JOptionPane.YES_OPTION) {
                    TF_userName.setText("");
                    PF_userPwd.setText("");
                    PF_pwdCheck.setText("");
                    this.setVisible(false);
                    parent.setVisible(true);
		}//End if(flag == JOptionPane.YES_OPTION)
	}
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgRegister dialog = new DlgRegister(new javax.swing.JFrame(), true);
                
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_TAG;
    private javax.swing.JButton BTN_register;
    private javax.swing.JLabel LB_tag;
    private javax.swing.JPasswordField PF_pwdCheck;
    private javax.swing.JPasswordField PF_userPwd;
    private javax.swing.JTextField TF_userName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
