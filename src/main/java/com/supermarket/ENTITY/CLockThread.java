package com.supermarket.ENTITY;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class CLockThread implements Runnable {

    JLabel clocklbl;

    public CLockThread(JLabel clocklbl) {
        this.clocklbl = clocklbl;
    }

    @Override
    public void run() {
        while (true) {
            Date d = new Date();
            SimpleDateFormat dfm = new SimpleDateFormat("hh:mm:ss aa");
            clocklbl.setText(dfm.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Lỗi");
            }
        }
    }

}
