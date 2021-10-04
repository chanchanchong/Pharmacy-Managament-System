
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Pharmacist extends javax.swing.JFrame {

    /**
     * Creates new form Pharmacist
     */
    public Pharmacist() {
        initComponents();
        SelectPharmacist();
    }
    
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    DefaultTableModel df;
    
    public void SelectPharmacist(){
        try{
          Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacydb", "root", "");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from pharmacist");
           
          df = (DefaultTableModel)PharmaTable.getModel();
          df.setRowCount(0);
          while(Rs.next()){
              df.addRow(new Object[]{
                Rs.getString("PharmaID"),
                Rs.getString("PharmaName"),
                Rs.getString("PharmaGender")
            });
          }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PharmaIdtxt = new javax.swing.JTextField();
        PharmaNametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PharmaPasstxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PharmaGenderCb = new javax.swing.JComboBox<>();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PharmaTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(141, 84, 163));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(65, 65, 65));
        jLabel11.setText("X");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(154, 154, 154));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(141, 84, 163));
        jLabel2.setText("MANAGE PHARMACIST");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(141, 84, 163));
        jLabel4.setText("PHAR ID");

        PharmaIdtxt.setBackground(new java.awt.Color(65, 65, 65));
        PharmaIdtxt.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        PharmaIdtxt.setForeground(new java.awt.Color(141, 84, 163));

        PharmaNametxt.setBackground(new java.awt.Color(65, 65, 65));
        PharmaNametxt.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        PharmaNametxt.setForeground(new java.awt.Color(141, 84, 163));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(141, 84, 163));
        jLabel5.setText("NAME");

        PharmaPasstxt.setBackground(new java.awt.Color(65, 65, 65));
        PharmaPasstxt.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        PharmaPasstxt.setForeground(new java.awt.Color(141, 84, 163));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(141, 84, 163));
        jLabel6.setText("PASSWORD");

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(141, 84, 163));
        jLabel8.setText("GENDER");

        PharmaGenderCb.setBackground(new java.awt.Color(65, 65, 65));
        PharmaGenderCb.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        PharmaGenderCb.setForeground(new java.awt.Color(141, 84, 163));
        PharmaGenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));

        AddButton.setBackground(new java.awt.Color(141, 84, 163));
        AddButton.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        AddButton.setText("ADD");
        AddButton.setBorder(null);
        AddButton.setBorderPainted(false);
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(141, 84, 163));
        EditButton.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        EditButton.setText("EDIT");
        EditButton.setBorder(null);
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(141, 84, 163));
        DeleteButton.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.setBorder(null);
        DeleteButton.setBorderPainted(false);
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(141, 84, 163));
        ClearButton.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        ClearButton.setText("CLEAR");
        ClearButton.setBorder(null);
        ClearButton.setBorderPainted(false);
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        PharmaTable.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        PharmaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PharmaTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        PharmaTable.setSelectionBackground(new java.awt.Color(141, 84, 163));
        PharmaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PharmaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PharmaTable);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(141, 84, 163));
        jLabel3.setText("PHARMACIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PharmaIdtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(PharmaNametxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PharmaPasstxt)
                            .addComponent(PharmaGenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel2)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(389, 389, 389))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PharmaPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PharmaIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PharmaNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8))
                    .addComponent(PharmaGenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(65, 65, 65));
        jLabel10.setText("X");

        jLabel19.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(65, 65, 65));
        jLabel19.setText("BILLING");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(65, 65, 65));
        jLabel18.setText("PHARMACIST");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(65, 65, 65));
        jLabel17.setText("MEDICINE");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(65, 65, 65));
        jLabel16.setText("CATEGORY");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel19)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addGap(9, 9, 9))))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 571, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 340, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
       if(PharmaIdtxt.getText().isEmpty() || PharmaNametxt.getText().isEmpty() || PharmaPasstxt.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Missing Information");
       }else{
        try{
           // Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacydb", "root", "");
            PreparedStatement add= Con.prepareStatement("insert into pharmacist values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(PharmaIdtxt.getText()));
            add.setString(2, PharmaNametxt.getText());
            add.setString(3, PharmaPasstxt.getText());
            add.setString(4, PharmaGenderCb.getSelectedItem().toString());
            int row = add.executeUpdate();

            PharmaIdtxt.setText("");
            PharmaNametxt.setText("");
            PharmaPasstxt.setText("");
            PharmaGenderCb.setSelectedItem(0);
            Con.close();
            SelectPharmacist();
            JOptionPane.showMessageDialog(this, "Seller Added Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void PharmaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PharmaTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)PharmaTable.getModel();
        int myIndex = PharmaTable.getSelectedRow();
        PharmaIdtxt.setText(model.getValueAt(myIndex,0).toString());
        PharmaNametxt.setText(model.getValueAt(myIndex,1).toString());
        PharmaPasstxt.setText(model.getValueAt(myIndex,2).toString());
    }//GEN-LAST:event_PharmaTableMouseClicked

    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        // TODO add your handling code here:
        PharmaIdtxt.setText("");
        PharmaNametxt.setText("");
        PharmaPasstxt.setText("");
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
        if(PharmaIdtxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Pharmacist to be Deleted");
        }else{
            try{
                 Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacydb", "root", "");
                 String id = PharmaIdtxt.getText();
                 String query = "Delete from pharmacist where PharmaID="+id;
                 Statement del = Con.createStatement();
                 del.executeUpdate(query);
                 SelectPharmacist();
                 JOptionPane.showMessageDialog(this, "Pharmacist deleted Successfully");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        // TODO add your handling code here:
        if(PharmaIdtxt.getText().isEmpty() || PharmaNametxt.getText().isEmpty() || PharmaPasstxt.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Missing Information");
       }else{
        try{
           // Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacydb", "root", "");
            String query = "Update pharmacist set PharmaName='"+PharmaNametxt.getText()+"'"+",PharmaPass='"+PharmaPasstxt.getText()+"'"+",PharmaGender='"+PharmaGenderCb.getSelectedItem().toString()+"'"+"where PharmaID="+PharmaIdtxt.getText();
            Statement update = Con.createStatement();
            update.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Pharmacist Update");
            PharmaIdtxt.setText("");
            PharmaNametxt.setText("");
            PharmaPasstxt.setText("");
            PharmaGenderCb.setSelectedItem(0);
            Con.close();
            SelectPharmacist();
        }catch(Exception e){
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        new BillingPoint().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        new Pharmacist().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        new Drugs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JComboBox<String> PharmaGenderCb;
    private javax.swing.JTextField PharmaIdtxt;
    private javax.swing.JTextField PharmaNametxt;
    private javax.swing.JTextField PharmaPasstxt;
    private javax.swing.JTable PharmaTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
