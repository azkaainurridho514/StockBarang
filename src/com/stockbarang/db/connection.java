/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stockbarang.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author asus
 */
public class connection {
     Connection con;
    
    public connection(){
        String id,pass,driver,url;
        id="root";
        pass="";
        driver="com.mysql.cj.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/stockbarang";
        
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url,id,pass);
            System.out.println("Database is connected");
        }
        catch(Exception e){
            System.out.println(""+e.getLocalizedMessage());
        }  
    }
    public static void main(String[]args){
            connection k = new connection();
    }
}
