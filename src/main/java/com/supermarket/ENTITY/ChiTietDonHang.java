package com.supermarket.ENTITY;

public class ChiTietDonHang {

    private int soLuong;
    private float thanhTien;
    private String maSP;
    private String maDH;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(int soLuong, float thanhTien, String maSP, String maDH) {
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.maSP = maSP;
        this.maDH = maDH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

}
