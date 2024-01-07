/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stockbarang.model;

/**
 *
 * @author asus
 */
public class Auth {
    private static String username = "";
    private static String user_id = "";
    private static String user_role = "";
    public static void setUser(String name){
        Auth.username = name;
    } 
    public static String getUser(){
        return username;
    }
    public static void setUserRole(String role){
        Auth.user_role = role;
    } 
    public static String getUserRole(){
        return user_role;
    }
    public static void setUserID(String id){
        Auth.user_id = id;
    } 
    public static String getUserID(){
        return user_id;
    }
}
