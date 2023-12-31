/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stockbarang.utils;

import com.stockbarang.event.EventMenuSelected;
import com.stockbarang.model.ModelMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author asus
 */
public class ListMenu <E extends Object> extends JList<E> {
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    private EventMenuSelected event;
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
    }
    public ListMenu() {
        
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    int index = locationToIndex(e.getPoint());
                    Object o = model.getElementAt(index);
                    if(o instanceof ModelMenu){
                        ModelMenu menu = (ModelMenu) o;
                        if(menu.getType() == ModelMenu.MenuType.MENU){
                            selectedIndex = index;
                            if(event != null){
                                event.selected(index);
                            }
                        }
                    } else{
                        selectedIndex = index;
                    }  
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();
            }
            
            
            
        });
        
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                if(index != overIndex){
                    Object o = model.getElementAt(index);
                    if(o instanceof ModelMenu){
                        ModelMenu menu = (ModelMenu) o;
                        if(menu.getType() == ModelMenu.MenuType.MENU){
                            overIndex = index;
                        }else{
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }
            
            
            
        });
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                ModelMenu data;
                if(o instanceof ModelMenu){
                    data = (ModelMenu)o;
                }else{
                    data = new ModelMenu(o+"", ModelMenu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                setAlignmentY(item.CENTER_ALIGNMENT);
                return item;
            }
        };
    }
    
     public void addItem(ModelMenu data){
        model.addElement(data);
    }
}
