/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.madhur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 91940
 */
public class Debit extends javax.swing.JFrame {

    Connection connection;
    PreparedStatement preparedStatement;
    private int id;
    private String pinVerify;
    private double balance;
    private double x;

    public Debit() throws ClassNotFoundException, SQLException {
        initComponents();
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhur", "root", "My$ql123");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        home_page = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ru = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        home_page2 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        send = new javax.swing.JButton();
        reciever_username = new javax.swing.JTextField();
        yu = new javax.swing.JLabel();
        sender_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Debit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        home_page.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        home_page.setText("Send Money");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        ru.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ru.setText("Reciever Username:-");

        amount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/madhur/rupee.png"))); // NOI18N

        home_page2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        home_page2.setText("Amount:-");

        cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        send.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        reciever_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        yu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        yu.setText("Your Username:-");

        sender_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Pin:-");

        pin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yu)
                            .addComponent(ru)
                            .addComponent(home_page2)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sender_username)
                            .addComponent(reciever_username)
                            .addComponent(amount)
                            .addComponent(pin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(send)
                        .addGap(18, 18, 18)
                        .addComponent(cancel)
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home_page))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_page)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yu)
                            .addComponent(sender_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ru)
                            .addComponent(reciever_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(home_page2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(send))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        try {
            // TODO add your handling code here:
            Menu menu = new Menu();
            menu.show();
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelActionPerformed

    public void findUserId() throws ClassNotFoundException, SQLException {
        try {
            preparedStatement = connection.prepareStatement("select id from user where username = ?");
            preparedStatement.setString(1, sender_username.getText());
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void pinVerification() throws SQLException {
        preparedStatement = connection.prepareStatement("select pin from user where username = ?");
        preparedStatement.setString(1, sender_username.getText());
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            pinVerify = rs.getString("pin");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username");
        }
    }

    public void balanceCheck() throws SQLException {
        preparedStatement = connection.prepareStatement("select account_balance from user where username = ?");
        preparedStatement.setString(1, sender_username.getText());
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            balance = rs.getDouble("account_balance");
            String amt = amount.getText();
            x = Double.parseDouble(amt);
            if (balance - x >= 0) {
                balance = balance - x;
                preparedStatement = connection.prepareStatement("update user set account_balance = ? where username = ?");
                preparedStatement.setDouble(1, balance);
                preparedStatement.setString(2, sender_username.getText());
                preparedStatement.executeUpdate();
            } else {
                JOptionPane.showMessageDialog(this, "insufficient balance");
            }
        }
    }

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        try {
            balanceCheck();
            pinVerification();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (pinVerify.equals(pin.getText())) {
            if (balance - x >= 0) {
                try {
                    findUserId();
                    String q = "insert into transaction(reciever_name,amount,userid) values(?,?,?)";
                    preparedStatement = connection.prepareStatement(q);
                    preparedStatement.setString(1, reciever_username.getText());
                    preparedStatement.setString(2, amount.getText());
                    preparedStatement.setInt(3, id);

                    preparedStatement.executeUpdate();
                    Menu menu = new Menu();
                    menu.show();
                    dispose();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect pin");
        }
    }//GEN-LAST:event_sendActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

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
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Debit().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel home_page;
    private javax.swing.JLabel home_page2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pin;
    private javax.swing.JTextField reciever_username;
    private javax.swing.JLabel ru;
    private javax.swing.JButton send;
    private javax.swing.JTextField sender_username;
    private javax.swing.JLabel yu;
    // End of variables declaration//GEN-END:variables
}
