/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sepatuvolution;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
//import org.apache.commons.dbutils.DbUtils;
import net.proteanit.sql.DbUtils;









public class Customers extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    DefaultTableModel model = null;
    
    public Customers() {
        initComponents();
        DisplayCustomer();
    }

private void DisplayCustomer()
{
    try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        Statement St = (Statement) Con.createStatement();
        Rs = St.executeQuery("Select * from tb_customer");
        CustomersTable.setModel(DbUtils.resultSetToTableModel(Rs));
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
        CustNameTb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        AddressTb = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomersTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        PhoneTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 230, 237));

        jPanel2.setBackground(new java.awt.Color(39, 55, 77));

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 230, 237));
        jLabel4.setText("Customers");
        jLabel4.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel4.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 230, 237));
        jLabel5.setText("Name");
        jLabel5.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel5.setMinimumSize(new java.awt.Dimension(456, 256));

        CustNameTb.setBackground(new java.awt.Color(82, 109, 130));
        CustNameTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        CustNameTb.setForeground(new java.awt.Color(255, 255, 255));
        CustNameTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustNameTb.setBorder(null);
        CustNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustNameTbActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 153, 153));
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(221, 230, 237));
        jLabel16.setText("Address");
        jLabel16.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel16.setMinimumSize(new java.awt.Dimension(456, 256));

        AddressTb.setBackground(new java.awt.Color(82, 109, 130));
        AddressTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        AddressTb.setForeground(new java.awt.Color(255, 255, 255));
        AddressTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AddressTb.setBorder(null);
        AddressTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTbActionPerformed(evt);
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

        CustomersTable.setBackground(new java.awt.Color(82, 109, 130));
        CustomersTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        CustomersTable.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        CustomersTable.setForeground(new java.awt.Color(255, 255, 255));
        CustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Phone"
            }
        ));
        CustomersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomersTable.setRowHeight(30);
        CustomersTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        CustomersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustomersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomersTable);

        jLabel17.setBackground(new java.awt.Color(255, 153, 153));
        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(221, 230, 237));
        jLabel17.setText("Phone");
        jLabel17.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel17.setMinimumSize(new java.awt.Dimension(456, 256));

        PhoneTb.setBackground(new java.awt.Color(82, 109, 130));
        PhoneTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        PhoneTb.setForeground(new java.awt.Color(255, 255, 255));
        PhoneTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PhoneTb.setBorder(null);
        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(327, 327, 327))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 109, 130));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Shoes");
        jLabel3.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel3.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(82, 109, 130));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Users");
        jLabel8.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel8.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel10.setBackground(new java.awt.Color(255, 153, 153));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(82, 109, 130));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Customers");
        jLabel10.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel10.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel12.setBackground(new java.awt.Color(255, 153, 153));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(82, 109, 130));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Billing");
        jLabel12.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel12.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel14.setBackground(new java.awt.Color(255, 153, 153));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(82, 109, 130));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Logout");
        jLabel14.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel14.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void CustNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustNameTbActionPerformed

    private void AddressTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTbActionPerformed
    private void Clear()
    {
        CustNameTb.setText("");
        AddressTb.setText("");
        PhoneTb.setText("");
    }
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(CustNameTb.getText().isEmpty()||AddressTb.getText().isEmpty()||PhoneTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("update  tb_customer set CustName=?,CustAdd=?,CustPhone=? where CustId=?");
                Add.setInt(4,Key);
                Add.setString(1, CustNameTb.getText());
                Add.setString(2, AddressTb.getText());
                Add.setString(3,PhoneTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Updated");
                Con.close();
                DisplayCustomer();
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
         Rs1 = St1.executeQuery("select Max(CustId) from tb_customers");
         Rs1.next();
         ItemId = Rs1.getInt(1)+1;
    }catch (Exception e){
        
    }
}
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(CustNameTb.getText().isEmpty()||AddressTb.getText().isEmpty()||PhoneTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                CountIt();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into tb_customer values(?,?,?,?)");
                
                Add.setInt(1,ItemId);
                Add.setString(2, CustNameTb.getText());
                Add.setString(3, AddressTb.getText());
                Add.setString(4,PhoneTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Added");
                Con.close();
                DisplayCustomer();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if(Key == 0)
        {
            JOptionPane.showMessageDialog(this,"Select a Customer");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("Delete from  tb_customer where CustId=?");
                Add.setInt(1,Key);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Deleted");
                Con.close();
                DisplayCustomer();
                Clear();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTbActionPerformed
int Key=0;
    private void CustomersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CustomersTable.getModel();
        int Myindex = CustomersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        CustNameTb.setText(model.getValueAt(Myindex, 1).toString());
        AddressTb.setText(model.getValueAt(Myindex, 2).toString());
        PhoneTb.setText(model.getValueAt(Myindex, 3).toString());

    }//GEN-LAST:event_CustomersTableMouseClicked

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTb;
    private javax.swing.JTextField CustNameTb;
    private javax.swing.JTable CustomersTable;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
