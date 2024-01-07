package com.stockbarang.form;

import com.stockbarang.db.ConnectDB;
import com.stockbarang.db.Helper;
import com.stockbarang.db.Query;
import com.stockbarang.model.Auth;
import com.stockbarang.utils.category_crud;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author asus
 */
public class category extends javax.swing.JPanel  {

    ConnectDB conn;
    Statement st;
    ResultSet re;
    Query q;
    Helper helper;
    JComboBox comboBox = new JComboBox();
    private DefaultComboBoxModel model;
    DefaultCellEditor defaultCellEditor;
    String user_id = "";
    String user_name = "";
    String user_role = "";
    public category() {
        initComponents();
        conn = new ConnectDB();
        user_id = Auth.getUserID();
        user_name = Auth.getUser();
        user_role = Auth.getUserRole();
        getCategory();
        
    }
    
    private void getCategory(){
        Object header[] = {"ID", "NAME"};
        DefaultTableModel data = new DefaultTableModel(null,header);
        tableData.setModel(data);
        try {
            String sql = q.getAny("category", "category_id, category_name");
            st = conn.con.createStatement();
            re = st.executeQuery(sql);
            while(re.next()){
                String k0 = re.getString("category_id");
                String k1 = re.getString("category_name");
                
                Object k[] = {k0, k1};
                data.addRow(k);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terkadi kesalahan saat memuat data!");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        cmdAdd = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setOpaque(false);

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "Name", "Stock All", "Price", "Category", "Place"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setPreferredWidth(20);
            tableData.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        cmdAdd.setText("Add");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(print)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        
        if(user_name.equals("") || user_id.equals("")){
            JOptionPane.showMessageDialog(null, "ANDA HARUS LOGIN DAHULU!");
        }else{
            if(tableData.getSelectedColumn() != -1){
                int selectedRow = tableData.getSelectedRow();
                String id = tableData.getValueAt(selectedRow, 0).toString();
                new category_crud("update", id).setVisible(true);
            }
        }
        
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed

        if(user_name.equals("") || user_id.equals("")){
            JOptionPane.showMessageDialog(null, "ANDA HARUS LOGIN DAHULU!");
        }else{
            new category_crud("add", "").setVisible(true);
        }
    }//GEN-LAST:event_cmdAddActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        getCategory();
    }//GEN-LAST:event_refreshActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        
        if(user_name.equals("") || user_id.equals("")){
            JOptionPane.showMessageDialog(null, "ANDA HARUS LOGIN DAHULU!");
        }else{
            if(tableData.getSelectedColumn() != -1){
                int selectedRow = tableData.getSelectedRow();
                String id = tableData.getValueAt(selectedRow, 0).toString();
                String name = tableData.getValueAt(selectedRow, 1).toString();
                try{
                    if(JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus "+ name +"?") ==  0){
                        String sql = q.deleteOneData("category", id);
                        st = conn.con.createStatement();
                        st.execute(sql);
                        getCategory();
                        JOptionPane.showMessageDialog(null, "Berhasil di hapus");
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
         try {
            tableData.print();
        } catch (PrinterException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
