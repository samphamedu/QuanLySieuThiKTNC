package com.supermarket.ENTITY;

public class ChiTietHoaDon {
    private int soLuong;
    private double thanhTien;
    private String maHD;
    private String maSP;

    public ChiTietHoaDon() {
    }
    
    

    public ChiTietHoaDon(int soLuong, double thanhTien, String maHD, String maSP) {
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.maHD = maHD;
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    
    
}
