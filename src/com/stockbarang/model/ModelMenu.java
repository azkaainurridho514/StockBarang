package com.stockbarang.model;
public class ModelMenu {
     public static enum MenuType{
        MENU, EMPTY
    }
    public void setName(String name){
        this.name = name;
    } 
    public String getName(){
        return this.name;
    }
    public void setType(MenuType type){
        this.type = type;
    }
    public MenuType getType(){
        return this.type; 
    }
    public ModelMenu(String name, MenuType type){
        this.name = name;
         this.type = type;
    }
    public ModelMenu(){}
    private String name;
     private MenuType type;
}
