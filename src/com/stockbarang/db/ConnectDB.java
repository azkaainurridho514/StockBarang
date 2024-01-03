/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stockbarang.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public Connection con;
    
    public ConnectDB(){
        String id,pass,driver,url;
        id="root";
        pass="";
        driver="com.mysql.cj.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/stock_barang";
        
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url,id,pass);
        }
        catch(Exception e){
            System.out.println("|===================================|");
            System.out.println("|========== KONEKSI GAGAL ==========|");
            System.out.println("|===================================|");
            System.out.println(e);
        }  
    }
    public static void main(String[]args){
            ConnectDB k = new ConnectDB();
    }
}