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
public class Category extends javax.swing.JFrame {

 
    public Category() {
        initComponents();
        DisplayCategories();
    }
Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    DefaultTableModel model = null;
    
    private void DisplayCategories()
{
    try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        Statement St = (Statement) Con.createStatement();
        Rs = St.executeQuery("Select * from tb_category");
        CategoriesTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch (Exception e)
    {
        
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CatNameTb = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoriesTable = new javax.swing.JTable();
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
        jLabel4.setText("Categories");
        jLabel4.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel4.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 230, 237));
        jLabel5.setText("Name");
        jLabel5.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel5.setMinimumSize(new java.awt.Dimension(456, 256));

        CatNameTb.setBackground(new java.awt.Color(82, 109, 130));
        CatNameTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        CatNameTb.setForeground(new java.awt.Color(255, 255, 255));
        CatNameTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CatNameTb.setBorder(null);
        CatNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatNameTbActionPerformed(evt);
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
        jLabel18.setText("Customer List");
        jLabel18.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel18.setMinimumSize(new java.awt.Dimension(456, 256));

        CategoriesTable.setBackground(new java.awt.Color(82, 109, 130));
        CategoriesTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        CategoriesTable.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        CategoriesTable.setForeground(new java.awt.Color(255, 255, 255));
        CategoriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        CategoriesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CategoriesTable.setRowHeight(30);
        CategoriesTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        CategoriesTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CategoriesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoriesTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(CatNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CatNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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
                .addGap(82, 82, 82)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(223, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatNameTbActionPerformed
private void Clear()
    {
        CatNameTb.setText("");
        
    }
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(CatNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("update  tb_category set ShoeDesc=? where CatId=?");
                Add.setInt(2,Key);
                Add.setString(1, CatNameTb.getText());
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Updated");
                Con.close();
                DisplayCategories();
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
         Rs1 = St1.executeQuery("select Max(CatId) from tb_category");
         Rs1.next();
         ItemId = Rs1.getInt(1)+1;
    }catch (Exception e){
        
    }
}
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(CatNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                CountIt();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into tb_category values(?,?)");
                
                Add.setInt(1,ItemId);
                Add.setString(2, CatNameTb.getText());
            
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Added");
                Con.close();
                DisplayCategories();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if(Key == 0)
        {
            JOptionPane.showMessageDialog(this,"Select a Category");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("Delete from  tb_category where CatId=?");
                Add.setInt(1,Key);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Deleted");
                Con.close();
                DisplayCategories();
                Clear();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_deleteBtnActionPerformed
int Key = 0;
    private void CategoriesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CategoriesTable.getModel();
        int Myindex = CategoriesTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        CatNameTb.setText(model.getValueAt(Myindex, 1).toString());
        
    }//GEN-LAST:event_CategoriesTableMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CatNameTb;
    private javax.swing.JTable CategoriesTable;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
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
