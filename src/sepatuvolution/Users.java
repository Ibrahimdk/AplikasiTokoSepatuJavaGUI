/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sepatuvolution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ibrahim Mahardhika
 */
public class Users extends javax.swing.JFrame {
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    DefaultTableModel model = null;
    
    private void DisplayUsers()
{
    try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        Statement St = (Statement) Con.createStatement();
        Rs = St.executeQuery("Select * from tb_user");
        UsersTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch (Exception e)
    {
        
    }
}

    public Users() {
        initComponents();
        DisplayUsers();
    }

    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        PasswordTb = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        txtShoes = new javax.swing.JLabel();
        txtUsers = new javax.swing.JLabel();
        txtCustomers = new javax.swing.JLabel();
        txtBilling = new javax.swing.JLabel();
        txtLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 230, 237));

        jPanel2.setBackground(new java.awt.Color(39, 55, 77));

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 230, 237));
        jLabel4.setText("Users");
        jLabel4.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel4.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 230, 237));
        jLabel5.setText("Name");
        jLabel5.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel5.setMinimumSize(new java.awt.Dimension(456, 256));

        UserName.setBackground(new java.awt.Color(82, 109, 130));
        UserName.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName.setBorder(null);
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 153, 153));
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(221, 230, 237));
        jLabel16.setText("Password");
        jLabel16.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel16.setMinimumSize(new java.awt.Dimension(456, 256));

        PasswordTb.setBackground(new java.awt.Color(82, 109, 130));
        PasswordTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        PasswordTb.setForeground(new java.awt.Color(255, 255, 255));
        PasswordTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordTb.setBorder(null);
        PasswordTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTbActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(244, 238, 224));
        editBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(82, 109, 130));
        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(244, 238, 224));
        addBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(82, 109, 130));
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(244, 238, 224));
        deleteBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(82, 109, 130));
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 153, 153));
        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(221, 230, 237));
        jLabel18.setText("User List");
        jLabel18.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel18.setMinimumSize(new java.awt.Dimension(456, 256));

        UsersTable.setBackground(new java.awt.Color(82, 109, 130));
        UsersTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        UsersTable.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        UsersTable.setForeground(new java.awt.Color(255, 255, 255));
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Password"
            }
        ));
        UsersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UsersTable.setRowHeight(30);
        UsersTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        UsersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(327, 327, 327))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(189, 189, 189))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtShoes.setBackground(new java.awt.Color(255, 153, 153));
        txtShoes.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        txtShoes.setForeground(new java.awt.Color(82, 109, 130));
        txtShoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtShoes.setText("Shoes");
        txtShoes.setMaximumSize(new java.awt.Dimension(456, 256));
        txtShoes.setMinimumSize(new java.awt.Dimension(456, 256));
        txtShoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtShoesMouseClicked(evt);
            }
        });

        txtUsers.setBackground(new java.awt.Color(255, 153, 153));
        txtUsers.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        txtUsers.setForeground(new java.awt.Color(82, 109, 130));
        txtUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUsers.setText("Users");
        txtUsers.setMaximumSize(new java.awt.Dimension(456, 256));
        txtUsers.setMinimumSize(new java.awt.Dimension(456, 256));
        txtUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsersMouseClicked(evt);
            }
        });

        txtCustomers.setBackground(new java.awt.Color(255, 153, 153));
        txtCustomers.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        txtCustomers.setForeground(new java.awt.Color(82, 109, 130));
        txtCustomers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCustomers.setText("Customers");
        txtCustomers.setMaximumSize(new java.awt.Dimension(456, 256));
        txtCustomers.setMinimumSize(new java.awt.Dimension(456, 256));
        txtCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCustomersMouseClicked(evt);
            }
        });

        txtBilling.setBackground(new java.awt.Color(255, 153, 153));
        txtBilling.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        txtBilling.setForeground(new java.awt.Color(82, 109, 130));
        txtBilling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtBilling.setText("Billing");
        txtBilling.setMaximumSize(new java.awt.Dimension(456, 256));
        txtBilling.setMinimumSize(new java.awt.Dimension(456, 256));
        txtBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBillingMouseClicked(evt);
            }
        });

        txtLogout.setBackground(new java.awt.Color(255, 153, 153));
        txtLogout.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        txtLogout.setForeground(new java.awt.Color(82, 109, 130));
        txtLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtLogout.setText("Logout");
        txtLogout.setMaximumSize(new java.awt.Dimension(456, 256));
        txtLogout.setMinimumSize(new java.awt.Dimension(456, 256));
        txtLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLogoutMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtShoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBilling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void PasswordTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTbActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(UserName.getText().isEmpty()||PasswordTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("update  tb_user set UName=?,UPass=? where UId=?");
                Add.setInt(3,Key);
                Add.setString(1,UserName.getText());
                Add.setString(2, PasswordTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Updated");
                Con.close();
                DisplayUsers();
                Clear();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_editBtnActionPerformed
int ItemId;
Statement St1 = null;
ResultSet Rs1 = null;
private void CountIt()
{
    try{
         St1 = Con.createStatement();
         Rs1 = St1.executeQuery("select Max(UId) from tb_customers");
         Rs1.next();
         ItemId = Rs1.getInt(1)+1;
    }catch (Exception e){
        
    }
}
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(UserName.getText().isEmpty()||PasswordTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                CountIt();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into tb_user values(?,?,?)");
                
                Add.setInt(1,ItemId);
                Add.setString(2, UserName.getText());
                Add.setString(3, PasswordTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Added");
                Con.close();
                DisplayUsers();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_addBtnActionPerformed
private void Clear ()
{
    UserName.setText("");
    PasswordTb.setText("");
    Key=0;
}
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
         if(Key == 0)
        {
            JOptionPane.showMessageDialog(this,"Select a User");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("Delete from  tb_user where UId=?");
                Add.setInt(1,Key);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Deleted");
                Con.close();
                DisplayUsers();
                Clear();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_deleteBtnActionPerformed
int Key = 0;
    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
        int Myindex = UsersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        UserName.setText(model.getValueAt(Myindex, 1).toString());
        PasswordTb.setText(model.getValueAt(Myindex, 2).toString());
        
    }//GEN-LAST:event_UsersTableMouseClicked

    private void txtShoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtShoesMouseClicked
        new Sepatu().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_txtShoesMouseClicked

    private void txtUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsersMouseClicked
        new Users().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_txtUsersMouseClicked

    private void txtCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCustomersMouseClicked
        new Customers().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_txtCustomersMouseClicked

    private void txtBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBillingMouseClicked
        new Billing().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_txtBillingMouseClicked

    private void txtLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogoutMouseClicked
        new Login().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_txtLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PasswordTb;
    private javax.swing.JTextField UserName;
    private javax.swing.JTable UsersTable;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtBilling;
    private javax.swing.JLabel txtCustomers;
    private javax.swing.JLabel txtLogout;
    private javax.swing.JLabel txtShoes;
    private javax.swing.JLabel txtUsers;
    // End of variables declaration//GEN-END:variables
}
