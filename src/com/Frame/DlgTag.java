/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Frame;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author VC
 */
public class DlgTag extends javax.swing.JDialog 
implements ItemListener
{
    String taglist = "";
    LinkedList<String>tag = new LinkedList<String>();
    int num_tag=0;
    /**
     * Creates new form DlgTag
     */
    public DlgTag(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public DlgTag(JDialog dialog){
        super(dialog,"选择标签",true);
        initComponents();
        
        
        JCB_act.addItemListener(this);// 加入监听
        JCB_adv.addItemListener(this);
        JCB_anime.addItemListener(this);
        JCB_black.addItemListener(this);
        JCB_child.addItemListener(this);
        JCB_crime.addItemListener(this);
        JCB_demo.addItemListener(this);
        JCB_doc.addItemListener(this);
        JCB_drama.addItemListener(this);
        JCB_fanta.addItemListener(this);
        JCB_love.addItemListener(this);
        JCB_music.addItemListener(this);
        JCB_plot.addItemListener(this);
        JCB_sca.addItemListener(this);
        JCB_tech.addItemListener(this);
        JCB_terri.addItemListener(this);
        JCB_war.addItemListener(this);
        JCB_west.addItemListener(this);
        
        this.setResizable(false);			//设置窗口不可放大缩小
        this.setDefaultCloseOperation (JDialog.DO_NOTHING_ON_CLOSE);
        com.function.Window.setWindowCenter(this);
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
        JCB_adv = new javax.swing.JCheckBox();
        JCB_anime = new javax.swing.JCheckBox();
        JCB_child = new javax.swing.JCheckBox();
        JCB_drama = new javax.swing.JCheckBox();
        JCB_fanta = new javax.swing.JCheckBox();
        JCB_love = new javax.swing.JCheckBox();
        JCB_plot = new javax.swing.JCheckBox();
        JCB_act = new javax.swing.JCheckBox();
        JCB_crime = new javax.swing.JCheckBox();
        JCB_sca = new javax.swing.JCheckBox();
        JCB_terri = new javax.swing.JCheckBox();
        JCB_tech = new javax.swing.JCheckBox();
        JCB_demo = new javax.swing.JCheckBox();
        JCB_war = new javax.swing.JCheckBox();
        JCB_music = new javax.swing.JCheckBox();
        JCB_doc = new javax.swing.JCheckBox();
        JCB_west = new javax.swing.JCheckBox();
        JCB_black = new javax.swing.JCheckBox();
        BTN_Confirm = new javax.swing.JButton();
        BTN_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("选择您喜欢的电影类型");

        JCB_adv.setText("冒险");

        JCB_anime.setText("动画");

        JCB_child.setText("儿童");

        JCB_drama.setText("喜剧");

        JCB_fanta.setText("奇幻");

        JCB_love.setText("爱情");

        JCB_plot.setText("剧情");

        JCB_act.setText("动作");

        JCB_crime.setText("犯罪");

        JCB_sca.setText("惊悚");

        JCB_terri.setText("恐怖");

        JCB_tech.setText("科幻");

        JCB_demo.setText("魔幻");

        JCB_war.setText("战争");

        JCB_music.setText("音乐");

        JCB_doc.setText("纪录片");

        JCB_west.setText("西部");

        JCB_black.setText("黑色");

        BTN_Confirm.setText("确认");
        BTN_Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ConfirmMouseClicked(evt);
            }
        });

        BTN_Back.setText("返回");
        BTN_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCB_child)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCB_adv)
                                    .addComponent(JCB_anime)
                                    .addComponent(JCB_drama)
                                    .addComponent(JCB_fanta)
                                    .addComponent(JCB_love))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCB_plot)
                                    .addComponent(JCB_act)
                                    .addComponent(JCB_crime)
                                    .addComponent(JCB_sca)
                                    .addComponent(JCB_terri)
                                    .addComponent(JCB_tech)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(BTN_Confirm)
                                .addGap(33, 33, 33)
                                .addComponent(BTN_Back))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCB_black)
                            .addComponent(JCB_west)
                            .addComponent(JCB_music)
                            .addComponent(JCB_war)
                            .addComponent(JCB_demo)
                            .addComponent(JCB_doc))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_adv)
                    .addComponent(JCB_plot)
                    .addComponent(JCB_demo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_anime)
                    .addComponent(JCB_act)
                    .addComponent(JCB_war))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_child)
                    .addComponent(JCB_crime)
                    .addComponent(JCB_music))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_drama)
                    .addComponent(JCB_sca)
                    .addComponent(JCB_doc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_fanta)
                    .addComponent(JCB_terri)
                    .addComponent(JCB_west))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_love)
                    .addComponent(JCB_tech)
                    .addComponent(JCB_black))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Confirm)
                    .addComponent(BTN_Back))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_BackMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BTN_BackMouseClicked

    private void BTN_ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ConfirmMouseClicked
        // TODO add your handling code here:
        if(!tag.isEmpty()){
            //String taglist = "";
            String end = tag.getLast();
            for(String str:tag){
                if(!str.equals(end)){
                    taglist += str+"|";
                }
                else
                    taglist +=str;
            }
//            String res = com.function.UserManager.getUserManager().register(user, pwd, taglist);
            System.out.println(taglist);
            this.setVisible(false);
        }
            else
                JOptionPane.showMessageDialog(null, "标签不能为空", "警告", JOptionPane.ERROR_MESSAGE);
        
        
    }//GEN-LAST:event_BTN_ConfirmMouseClicked

    

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
            java.util.logging.Logger.getLogger(DlgTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgTag dialog = new DlgTag(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_Confirm;
    private javax.swing.JCheckBox JCB_act;
    private javax.swing.JCheckBox JCB_adv;
    private javax.swing.JCheckBox JCB_anime;
    private javax.swing.JCheckBox JCB_black;
    private javax.swing.JCheckBox JCB_child;
    private javax.swing.JCheckBox JCB_crime;
    private javax.swing.JCheckBox JCB_demo;
    private javax.swing.JCheckBox JCB_doc;
    private javax.swing.JCheckBox JCB_drama;
    private javax.swing.JCheckBox JCB_fanta;
    private javax.swing.JCheckBox JCB_love;
    private javax.swing.JCheckBox JCB_music;
    private javax.swing.JCheckBox JCB_plot;
    private javax.swing.JCheckBox JCB_sca;
    private javax.swing.JCheckBox JCB_tech;
    private javax.swing.JCheckBox JCB_terri;
    private javax.swing.JCheckBox JCB_war;
    private javax.swing.JCheckBox JCB_west;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox jcb = (JCheckBox) e.getItem();// 将得到的事件强制转化为JCheckBox类
        String title = jcb.getText();
	if (jcb.isSelected()) {// 判断是否被选择
            tag.add(title);
            num_tag++;
            System.out.println(tag);
	} else {
            tag.remove(title);
            num_tag--;
            System.out.println(tag);
	}
    }
}
