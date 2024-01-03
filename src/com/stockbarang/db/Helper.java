package com.stockbarang.db;

import java.text.NumberFormat;
import java.util.Locale;

public class Helper {
    public static String convertToRupiah(String a){
        double angka = Double.parseDouble(a);
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(angka);
    }
}
