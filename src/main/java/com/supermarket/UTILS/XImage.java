package com.supermarket.UTILS;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("/icon/logo 64px.png");
        return new ImageIcon(url).getImage();
    }

}
