/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stockbarang.db;

public class Query {
    public static String insertItems(String column){
        return "INSERT INTO items (items_category_id, items_place_id, items_name, items_price, items_stock) VALUES (" + column +")";
    }
    public static String insertPlace(String column){
        return "INSERT INTO place VALUES (null, '" + column +"');";
    }
    public static String insertCategory(String column){
        return "INSERT INTO category VALUES (null, '" + column +"');";
    }
    public static String deleteOneData(String table, String id){
        return "DELETE FROM " + table + " WHERE " + table + "_id = '" + id + "'";
    }
    public static String getAll(String table){
        return "SELECT * FROM " + table;
    }
    public static String getSearchByNameOneTable(String table, String search){
        return "SELECT * FROM " + table + " WHERE " + table + "_name LIKE '%" + search + "%'";
    }
    public static String getSearchImport(String search){
        return "SELECT * FROM import WHERE import_desc LIKE '%" + search + "%'";
    }
    public static String getSearchExport(String search){
        return "SELECT * FROM export WHERE export_desc LIKE '%" + search + "%'";
    }
    public static String getAllWhereId(String table, String id){
        return "SELECT * FROM " + table + " WHERE " + table + "_id = '" + id +"'";
    }
    public static String getRoleWhereId(String table, String id){
        return "SELECT role FROM " + table + " WHERE " + table + "_id = '" + id +"'";
    }
     public static String getAllWhereIdBeforeDelete(String from,String table, String id){
        return "SELECT * FROM " + from + " WHERE " + from + "_" + table + "_id = '" + id +"'";
    }
    public static String getAny(String table, String any){
        return "SELECT " + any + " FROM " + table;
    }
    public static String updateItemsWhereId(String table, String id, String column){
        return "UPDATE " + table + " SET " + column + " WHERE " + table + "_id = '" + id + "'";
    }
    public static String deleteWhereId(String table, String id){
        return "DELETE FROM " + table + " WHERE id = '" + id + "'";
    }
    public static String getAllWithJoin3TableSearchFromTableWithFilter(String fromTable, String table1, String table2, String search, int type){
        String filter = type == 0
                        ? fromTable + "_name"
                        : type == 1 
                           ? fromTable + "_price"
                           : type == 2 
                             ? table1 + "_name"
                             : type == 3
                               ? table2 + "_name" 
                                : fromTable + "_name";
        return "SELECT * " + "FROM " + fromTable + "\n" +
                "LEFT JOIN " + table1 + " ON " + table1 + "." + table1 + "_id = " + fromTable + "." + fromTable + "_"  + table1 + "_id \n" +
                "LEFT JOIN " + table2 + " ON " + table2 + "." + table2 + "_id = " + fromTable + "." + fromTable + "_"  + table2 + "_id"
                + " WHERE " + filter + " LIKE '%" + search + "%'";
    }
    public static String getAllWithJoin3Table(String fromTable, String table1, String table2){
        return "SELECT * " +"FROM " + fromTable + "\n" +
                "LEFT JOIN " + table1 + " ON " + table1 + "." + table1 + "_id = " + fromTable + "." + fromTable + "_"  + table1 + "_id \n" +
                "LEFT JOIN " + table2 + " ON " + table2 + "." + table2 + "_id = " + fromTable + "." + fromTable + "_"  + table2 + "_id";
    }
    public static String getAllWithJoin2Table(String fromTable, String table1, String table2){
        return "SELECT * " +"FROM " + fromTable + "\n" +
               "LEFT JOIN " + table1 + " ON " + table1 + "." + table1 + "_id = " + fromTable + "." + fromTable + "_"  + table1 + "_id";
    }
    public static String getWithJoin2TableWhereId(String fromTable, String table1, String id){
        return "SELECT * " + "FROM " + fromTable + "\n" +
               "LEFT JOIN " + table1 + " ON " + table1 + "." + table1 + "_id = " + fromTable + "." + fromTable + "_"  + table1 + "_id \n" +
               "WHERE " + table1 + "." + table1 + "_id = " + id;
    }
    public static String getWithJoin3TableWhereId(String fromTable, String table1, String table2, String id1, String id2){
        return "SELECT * " + "FROM " + fromTable + "\n" +
               "LEFT JOIN " + table1 + " ON " + table1 + "." + table1 + "_id = " + fromTable + "." + fromTable + "_"  + table1 + "_id \n" +
               "LEFT JOIN " + table2 + " ON " + table2 + "." + table2 + "_id = " + fromTable + "." + fromTable + "_"  + table2 + "_id \n" +
               "WHERE " + table1 + "." + table1 + "_id = " + id1 + " AND " + table2 + "." + table2 + "_id = " + id2;
    }
    public static String getWithJoin4TableWhereAnotherId(String fromTable, String to, String id, String table1, String table2, String table3){
        return "SELECT * " + "FROM " + fromTable + "\n" +
               "LEFT JOIN " + table1 + " ON " + table1 + "." + table1 + "_id = " + fromTable + "." + fromTable + "_"  + table1 + "_id \n" +
               "LEFT JOIN " + table2 + " ON " + table2 + "." + table2 + "_id = " + fromTable + "." + fromTable + "_"  + table2 + "_id \n" +
               "LEFT JOIN " + table3 + " ON " + table3 + "." + table3 + "_id = " + fromTable + "." + fromTable + "_"  + table3 + "_id \n" +
               "WHERE " + fromTable + "." + fromTable + "_" + to + "_id = " + id;
    }
}
