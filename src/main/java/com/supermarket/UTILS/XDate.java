
package com.supermarket.UTILS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;

public class XDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

    public static Date toDate(String date, String pattern) {
        try {
            
            formater.applyPattern(pattern);
            return formater.parse(date);
        }catch(ParseException ex){    
            MsgBox.alert(null, "Bạn phải nhập đúng định dạng ngày/tháng/năm");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
        return null;
    }
    
    public static Date toDate(String date, String pattern, String Sth) throws Exception{               
        formater.applyPattern(pattern);
        return formater.parse(date);      
    }

    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }

    public static Date now() {
        return new Date();
    }

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    public static Date add(int days) {
        Date now = XDate.now();
        now.setTime(now.getTime() + days * 24 * 60 * 60 * 1000);
        return now;
    }

    ///Thang Test 
}
