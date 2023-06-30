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
public class Sepatu extends javax.swing.JFrame {
   
 
    public Sepatu() {
        initComponents();
        DisplaySepatu();
        GetCategories();
    }
    
   Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    DefaultTableModel model = null;
    
    private void DisplaySepatu()
{
    try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        Statement St  = (Statement) Con.createStatement();
        Rs = St.executeQuery("Select * from tb_shoe");
        ShoesTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch (Exception e)
    {
        
    }
}
    private void GetCategories()
    {
        try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        Statement St = (Statement) Con.createStatement();
        Rs = St.executeQuery("Select * from tb_category");
        while(Rs.next())
        {
            int CatId = Rs.getInt("CatId");
            CatCb.addItem(String.valueOf(CatId));
        }
        }
        catch (Exception e){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ShoesNameTb = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShoesTable = new javax.swing.JTable();
        CatCb = new javax.swing.JComboBox<>();
        PriceTb = new javax.swing.JTextField();
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
        jLabel4.setText("Manage Shoes");
        jLabel4.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel4.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 230, 237));
        jLabel5.setText("Name");
        jLabel5.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel5.setMinimumSize(new java.awt.Dimension(456, 256));

        ShoesNameTb.setBackground(new java.awt.Color(82, 109, 130));
        ShoesNameTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        ShoesNameTb.setForeground(new java.awt.Color(255, 255, 255));
        ShoesNameTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ShoesNameTb.setBorder(null);
        ShoesNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoesNameTbActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 153, 153));
        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(221, 230, 237));
        jLabel15.setText("Category");
        jLabel15.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel15.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel16.setBackground(new java.awt.Color(255, 153, 153));
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(221, 230, 237));
        jLabel16.setText("Quantity");
        jLabel16.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel16.setMinimumSize(new java.awt.Dimension(456, 256));

        QtyTb.setBackground(new java.awt.Color(82, 109, 130));
        QtyTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        QtyTb.setForeground(new java.awt.Color(255, 255, 255));
        QtyTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QtyTb.setBorder(null);
        QtyTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyTbActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 153, 153));
        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(221, 230, 237));
        jLabel17.setText("Price");
        jLabel17.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel17.setMinimumSize(new java.awt.Dimension(456, 256));

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
        jLabel18.setText("Product List");
        jLabel18.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel18.setMinimumSize(new java.awt.Dimension(456, 256));

        ShoesTable.setBackground(new java.awt.Color(82, 109, 130));
        ShoesTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 230, 237)));
        ShoesTable.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        ShoesTable.setForeground(new java.awt.Color(255, 255, 255));
        ShoesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "Category", "Quantity", "Price"
            }
        ));
        ShoesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShoesTable.setRowHeight(30);
        ShoesTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        ShoesTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ShoesTable.setSurrendersFocusOnKeystroke(true);
        ShoesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShoesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ShoesTable);

        CatCb.setBackground(new java.awt.Color(82, 109, 130));
        CatCb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        CatCb.setForeground(new java.awt.Color(255, 255, 255));

        PriceTb.setBackground(new java.awt.Color(82, 109, 130));
        PriceTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(255, 255, 255));
        PriceTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PriceTb.setBorder(null);
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ShoesNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceTb)))
                    .addComponent(jScrollPane1))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShoesNameTb)
                            .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ShoesNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoesNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShoesNameTbActionPerformed

    private void QtyTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTbActionPerformed
private void Clear()
    {
        ShoesNameTb.setText("");
        QtyTb.setText("");
        CatCb.setSelectedIndex(-1);
        PriceTb.setText("");
    }
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(ShoesNameTb.getText().isEmpty()||QtyTb.getText().isEmpty()||CatCb.getSelectedIndex()==-1||PriceTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("update  tb_shoe set SName=?,SCat=?,Sqty=?,Sprice=? where SId=?");
                Add.setInt(5,Key);
                Add.setString(1, ShoesNameTb.getText());
                Add.setString(2, CatCb.getSelectedItem().toString());
                Add.setString(3,QtyTb.getText());
                Add.setString(4,PriceTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Shoes Updated");
                Con.close();
                DisplaySepatu();
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
         Rs1 = St1.executeQuery("select Max(SId) from tb_shoe");
         Rs1.next();
         ItemId = Rs1.getInt(1)+1;
    }catch (Exception e){
        
    }
}
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
         if(ShoesNameTb.getText().isEmpty()||QtyTb.getText().isEmpty()||CatCb.getSelectedIndex()==-1||PriceTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                CountIt();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into tb_shoe values(?,?,?,?,?)");
                
                Add.setInt(1,ItemId);
                Add.setString(2, ShoesNameTb.getText());
                Add.setInt(3, Integer.valueOf(CatCb.getSelectedItem().toString()));
                Add.setInt(4,Integer.valueOf(QtyTb.getText()));
                Add.setInt(5,Integer.valueOf(PriceTb.getText()));
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Added");
                Con.close();
                DisplaySepatu();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
         if(Key == 0)
        {
            JOptionPane.showMessageDialog(this,"Select a Shoes");
        }  else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("Delete from  tb_shoe where SId=?");
                Add.setInt(1,Key);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Shoes Deleted");
                Con.close();
                DisplaySepatu();
                Clear();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed
int Key = 0;
    private void ShoesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShoesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ShoesTable.getModel();
        int Myindex = ShoesTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        ShoesNameTb.setText(model.getValueAt(Myindex, 1).toString());
        CatCb.setSelectedItem(model.getValueAt(Myindex, 2).toString());
        QtyTb.setText(model.getValueAt(Myindex, 3).toString());
        PriceTb.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_ShoesTableMouseClicked

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
            java.util.logging.Logger.getLogger(Sepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sepatu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JTextField ShoesNameTb;
    private javax.swing.JTable ShoesTable;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
