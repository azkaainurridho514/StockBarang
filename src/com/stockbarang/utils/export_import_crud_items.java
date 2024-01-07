/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.stockbarang.utils;

import com.formdev.flatlaf.IntelliJTheme;
import com.stockbarang.db.ConnectDB;
import com.stockbarang.db.Query;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author asus
 */
public class export_import_crud_items extends javax.swing.JFrame {

    ConnectDB conn;
    Statement st;
    ResultSet re;
    Query q;
    String action = "";
    String id = "";
    String table = "";
    String port_id = "";
     String items_id = "";
    public export_import_crud_items(String ids, String type) {
//        IntelliJTheme.setup(export_import_crud_items.class.getResourceAsStream("/template.theme.json"));
        conn = new ConnectDB();
        initComponents();
        if(type.equals("")){
            this.dispose();
        }
        if(ids.equals("")){
            action = "add";
        }else if(!ids.equals("")){
            action = "update";
            id = ids;
            getItemsByID(ids);
        }else {
            action = "add";
        }
        table = type;
        category();
        place();
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
        frameJ = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        categoryInput = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        hargaInput = new javax.swing.JTextField();
        placeInput = new javax.swing.JComboBox<>();
        namaInput = new javax.swing.JTextField();
        stockInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        frameJ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setText("Place");

        jLabel3.setText("Stock");

        jLabel2.setText("Harga");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel4.setText("Category");

        jLabel1.setText("Nama");

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameJLayout = new javax.swing.GroupLayout(frameJ);
        frameJ.setLayout(frameJLayout);
        frameJLayout.setHorizontalGroup(
            frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameJLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(placeInput, 0, 241, Short.MAX_VALUE)
                    .addComponent(categoryInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockInput)
                    .addComponent(hargaInput)
                    .addComponent(namaInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameJLayout.createSequentialGroup()
                        .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(frameJLayout.createSequentialGroup()
                        .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameJLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan)
                .addGap(55, 55, 55))
        );
        frameJLayout.setVerticalGroup(
            frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameJLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnSimpan))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(frameJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        try{
            String s = "select * from "+table+" ORDER BY "+table+"_id DESC LIMIT 1"; 
            
            st = conn.con.createStatement();
            re = st.executeQuery(s);
            while(re.next()){
               port_id = re.getString(table+"_id");
            }
                try{
                    String s2 = "select * from items ORDER BY items_id DESC LIMIT 1"; 
                    st = conn.con.createStatement();
                    re = st.executeQuery(s2);
                    while(re.next()){
                       items_id = re.getString("items_id");
                    }

                    try {
                    if("".equals(namaInput.getText()) || "".equals(hargaInput.getText()) || "".equals(stockInput.getText())){
                        JOptionPane.showMessageDialog(null, "Data harus terisi semua!");
                    }else{
                        String category = categoryInput.getSelectedItem().toString();
                        String place = placeInput.getSelectedItem().toString();

                        if(JOptionPane.showConfirmDialog(null, "Sudah benar?") ==  0){
                            if(action.equals("add") || action.equals("")){
                                String column = "'"+ category.charAt(0) +category.charAt(1) +category.charAt(2) +"', '"+ place.charAt(0) +place.charAt(1) +place.charAt(2) +"','"+ namaInput.getText() +"', '"+ hargaInput.getText() +"', '"+ stockInput.getText() +"'"; 
                                String column2 = "'"+port_id+"','"+items_id+"','"+ category.charAt(0) +category.charAt(1) +category.charAt(2) +"','"+ place.charAt(0)+place.charAt(1)+place.charAt(2)+"','"+stockInput.getText()+"'";
                                String sql = q.insertItems(column);
                                String sql2 = q.insertImportExportItems(table, column2);
                                System.out.println("==========");
                                System.out.println(sql);
                                System.out.println("==========");
                                System.out.println("==========");
                                System.out.println(sql2);
                                System.out.println("==========");
                                st.execute(sql);
                                st.execute(sql2);
                                
                                   
                            }
                        }
                        namaInput.setText("");
                        hargaInput.setText("");
                        stockInput.setText("");
                        JOptionPane.showMessageDialog(null, action.equals("add") || action.equals("") ?"Berhasil di simpan!":"Berhasil di ubah!");
                    }
                }
                catch(Exception e){
                    System.out.print(e);
                    JOptionPane.showMessageDialog(null,action.equals("add") || action.equals("") ? "Terjadi kesalahan saat menambahkan data": "Terjadi kesalahan saat mengubah data");
                }
            }
            catch(Exception e){
            System.out.print(e);
            }
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void getItemsByID(String id){
        try {
            String sql = q.getAllWhereId("items", id);
            st = conn.con.createStatement();
            re = st.executeQuery(sql);
            
            while(re.next()){
                String k1 = re.getString("items_name");
                String k2 = re.getString("items_stock");
                String k3 = re.getString("items_price");
                
                namaInput.setText(k1);
                stockInput.setText(k2);
                hargaInput.setText(k3);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void category(){
        String sql = q.getAny("category", "category_id, category_name");
       
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            st = conn.con.createStatement();
            re = st.executeQuery(sql);
            while(re.next()){
                String k1 = re.getString("category_id") + "  , " + re.getString("category_name");
                model.addElement(k1);
            }
             categoryInput.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan!");
        }
    }
    private void place(){
        String sql = q.getAny("place", "place_id, place_name");
       
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            st = conn.con.createStatement();
            re = st.executeQuery(sql);
            while(re.next()){
                String k1 = re.getString("place_id") + "  , " + re.getString("place_name");
                model.addElement(k1);
            }
             placeInput.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan!");
        }
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
            java.util.logging.Logger.getLogger(export_import_crud_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(export_import_crud_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(export_import_crud_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(export_import_crud_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new export_import_crud_items("", "").setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> categoryInput;
    private javax.swing.JPanel frameJ;
    private javax.swing.JTextField hargaInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField namaInput;
    private javax.swing.JComboBox<String> placeInput;
    private javax.swing.JTextField stockInput;
    // End of variables declaration//GEN-END:variables
}
