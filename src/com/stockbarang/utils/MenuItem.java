/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.stockbarang.utils;

import com.stockbarang.model.ModelMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author asus
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * Creates new form MenuItem
     */
    private boolean selected;
    private boolean over;
    public MenuItem(ModelMenu data) {
        initComponents();
        setOpaque(false);
        if(data.getType() == ModelMenu.MenuType.MENU){
           menu_name.setText(data.getName());
        }else{
           menu_name.setText(" ");
        }
    }   public void setSelected(boolean selected){
        this.selected = selected;
        repaint();
    }
    
    public void setOver(boolean over){
        this.over = over;
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        if(selected || over){
            Graphics2D g2 = (Graphics2D)grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255,255,255,80));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs); 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_name = new javax.swing.JLabel();

        menu_name.setBackground(new java.awt.Color(255, 255, 255));
        menu_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_name.setForeground(new java.awt.Color(255, 255, 255));
        menu_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_name, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel menu_name;
    // End of variables declaration//GEN-END:variables
}
