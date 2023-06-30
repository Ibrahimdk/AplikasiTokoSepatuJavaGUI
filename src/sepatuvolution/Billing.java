/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package sepatuvolution;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ibrahim Mahardhika
 */
public class Billing extends javax.swing.JFrame {

    
    public Billing() {
        initComponents();
        DisplaySepatu();
        GetCustomer();
        GetUser();
    }
    
     Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs2 = null;
    Statement St = null,St2 = null;
    DefaultTableModel model = null;
    
    private void DisplaySepatu()
{
    try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        St2 =(Statement) Con.createStatement();
        Rs2 = St2.executeQuery("Select * from tb_shoe");
        ProductTable.setModel(DbUtils.resultSetToTableModel(Rs2));
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        CustomerCb = new javax.swing.JComboBox<>();
        UserCb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        PriceTb = new javax.swing.JTextField();
        PnameTb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        AddBillBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        BillDate = new com.toedter.calendar.JDateChooser();
        txtTotal = new javax.swing.JLabel();
        txtTotal1 = new javax.swing.JLabel();
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
        jLabel4.setText("Billing");
        jLabel4.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel4.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 230, 237));
        jLabel5.setText("User Id");
        jLabel5.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel5.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel15.setBackground(new java.awt.Color(255, 153, 153));
        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(221, 230, 237));
        jLabel15.setText("Customer");
        jLabel15.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel15.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel16.setBackground(new java.awt.Color(255, 153, 153));
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(221, 230, 237));
        jLabel16.setText("Date");
        jLabel16.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel16.setMinimumSize(new java.awt.Dimension(456, 256));

        ResetBtn.setBackground(new java.awt.Color(244, 238, 224));
        ResetBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(82, 109, 130));
        ResetBtn.setText("CLEAR");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 153, 153));
        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(221, 230, 237));
        jLabel18.setText("Customer's Bill");
        jLabel18.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel18.setMinimumSize(new java.awt.Dimension(456, 256));

        ProductTable.setBackground(new java.awt.Color(82, 109, 130));
        ProductTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 230, 237)));
        ProductTable.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        ProductTable.setForeground(new java.awt.Color(255, 255, 255));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category", "Quantity", "Price"
            }
        ));
        ProductTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProductTable.setRowHeight(30);
        ProductTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        ProductTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        CustomerCb.setBackground(new java.awt.Color(82, 109, 130));
        CustomerCb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        CustomerCb.setForeground(new java.awt.Color(255, 153, 153));

        UserCb.setBackground(new java.awt.Color(82, 109, 130));
        UserCb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        UserCb.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(221, 230, 237));
        jLabel6.setText("Product");
        jLabel6.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel6.setMinimumSize(new java.awt.Dimension(456, 256));

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

        jLabel19.setBackground(new java.awt.Color(255, 153, 153));
        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(221, 230, 237));
        jLabel19.setText("Quantity");
        jLabel19.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel19.setMinimumSize(new java.awt.Dimension(456, 256));

        jLabel20.setBackground(new java.awt.Color(255, 153, 153));
        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(221, 230, 237));
        jLabel20.setText("Price");
        jLabel20.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel20.setMinimumSize(new java.awt.Dimension(456, 256));

        PrintBtn.setBackground(new java.awt.Color(244, 238, 224));
        PrintBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(82, 109, 130));
        PrintBtn.setText("PRINT");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

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

        PnameTb.setBackground(new java.awt.Color(82, 109, 130));
        PnameTb.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        PnameTb.setForeground(new java.awt.Color(255, 255, 255));
        PnameTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PnameTb.setBorder(null);
        PnameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnameTbActionPerformed(evt);
            }
        });

        BillTable.setBackground(new java.awt.Color(82, 109, 130));
        BillTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 230, 237)));
        BillTable.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        BillTable.setForeground(new java.awt.Color(255, 255, 255));
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Product", "Price", "Quantity", "Total"
            }
        ));
        BillTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BillTable.setRowHeight(30);
        BillTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        BillTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(BillTable);

        jLabel21.setBackground(new java.awt.Color(255, 153, 153));
        jLabel21.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(221, 230, 237));
        jLabel21.setText("Product List");
        jLabel21.setMaximumSize(new java.awt.Dimension(456, 256));
        jLabel21.setMinimumSize(new java.awt.Dimension(456, 256));

        AddBillBtn.setBackground(new java.awt.Color(244, 238, 224));
        AddBillBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        AddBillBtn.setForeground(new java.awt.Color(82, 109, 130));
        AddBillBtn.setText("ADD BILL");
        AddBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBillBtnActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(244, 238, 224));
        SaveBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(82, 109, 130));
        SaveBtn.setText("SAVE");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(221, 230, 237));
        txtTotal.setText("$$$$$");

        txtTotal1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtTotal1.setForeground(new java.awt.Color(221, 230, 237));
        txtTotal1.setText(" Grand Total :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserCb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerCb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AddBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(253, 253, 253))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(127, 127, 127)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal)))
                        .addGap(402, 402, 402))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerCb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserCb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal)
                    .addComponent(txtTotal1))
                .addGap(80, 80, 80))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void QtyTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTbActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed

    private void PnameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameTbActionPerformed
int n = 1;
int row = 0;
int txtTot = 0;

    private void AddBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBillBtnActionPerformed
        //menambahkan data ke dalam bill
        if(PnameTb.getText().isEmpty()||QtyTb.getText().isEmpty()||PriceTb.getText().isEmpty())
        {
            
        }else {
        int tot = Integer.valueOf(PriceTb.getText())*Integer.valueOf(QtyTb.getText());
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        model.addRow(new Object[] {n, PnameTb.getText(), PriceTb.getText(), QtyTb.getText(), tot});
        txtTot = txtTot + tot;
        txtTotal.setText("Rp "+txtTot);
        n++;
        row++;
        }
        
    }//GEN-LAST:event_AddBillBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        try {
            //BillTable.print(JTable.PrintMode.NORMAL, null, null);
            BillTable.print();
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_PrintBtnActionPerformed
int ItemId;
Statement St1 = null;
ResultSet Rs1 = null;
private void CountIt()
{
    try{
         St1 = Con.createStatement();
         Rs1 = St1.executeQuery("select Max(BNum) from tb_bill");
         Rs1.next();
         ItemId = Rs1.getInt(1)+1;
    }catch (Exception e){
        
    }
}
//akan tersimpan pada 
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(CustomerCb.getSelectedIndex() == -1 || UserCb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this,"Missing Info");
        }  else {
            try {
                //CountIt();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into tb_bill  values(?,?,?,?,?)");
                
                Add.setInt(1,ItemId);
                Add.setString(2, BillDate.getDate().toString());
                Add.setInt(3, Integer.valueOf(CustomerCb.getSelectedItem().toString()));
                Add.setInt(4,Integer.valueOf(UserCb.getSelectedItem().toString()));
                Add.setInt(5,txtTot);
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Bill Saved Sucessfully!");
                Con.close();
                //DisplaySepatu();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        } 
    }//GEN-LAST:event_SaveBtnActionPerformed
     private void GetUser()
    {
        try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        Statement St = (Statement) Con.createStatement();
        Rs = St.executeQuery("Select * from tb_user");
        while(Rs.next())
        {
            int UId = Rs.getInt("UId");
           UserCb.addItem(String.valueOf(UId));
        }
        }
        catch (Exception e){
            
        }
    }
    private void GetCustomer()
    {
        try {
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sepatudb","root","");
        Statement St = (Statement) Con.createStatement();
        Rs = St.executeQuery("Select * from tb_customer");
        while(Rs.next())
        {
            int CatId = Rs.getInt("CustId");
           CustomerCb.addItem(String.valueOf(CatId));
        }
        }
        catch (Exception e){
            
        }
    }
    int Key = 0;
int Stock = 0;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
      DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
      
        int Myindex = ProductTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        PnameTb.setText(model.getValueAt(Myindex, 1).toString());
        Stock = Integer.valueOf(model.getValueAt(Myindex, 3).toString());
        //QtyTb.setText(model.getValueAt(Myindex, 3).toString());
        PriceTb.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBillBtn;
    private com.toedter.calendar.JDateChooser BillDate;
    private javax.swing.JTable BillTable;
    private javax.swing.JComboBox<String> CustomerCb;
    private javax.swing.JTextField PnameTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> UserCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotal1;
    // End of variables declaration//GEN-END:variables
}
