/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.stockbarang.component;

import com.stockbarang.event.EventMenuSelected;
import com.stockbarang.model.ModelMenu;
import com.stockbarang.utils.ListMenu;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ListSelectionModel;

/**
 *
 * @author asus
 */
public class Navbar extends javax.swing.JPanel {

    /**
     * Creates new form 
     */
    private EventMenuSelected event; 
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenu.addEventMenuSelected(event);
    }
    public Navbar() {
        initComponents();
        listMenu.setOpaque(false);
        listMenu.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listMenu.setAlignmentY(RIGHT_ALIGNMENT);
        listMenu.setLayoutOrientation(listMenu.HORIZONTAL_WRAP);
        listMenu.setVisibleRowCount(-1);
        
        
        init();
    }
    private void init(){
        listMenu.addItem(new ModelMenu("DASHBOARD",  ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("STOCK",  ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("PLACE", ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("CATEGORY", ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("EXPORT", ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("IMPORT", ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("LOGIN / REGISTER", ModelMenu.MenuType.MENU));
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMenu = new com.stockbarang.utils.ListMenu<>();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        Color g = new Color(0,0,0);
//         g2.setPaint(new Color(244,244,11));
//        g2.setBackground(new Color(36,52,80));
//        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
//        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.stockbarang.utils.ListMenu<String> listMenu;
    // End of variables declaration//GEN-END:variables
}
