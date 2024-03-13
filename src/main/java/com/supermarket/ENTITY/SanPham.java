package com.supermarket.ENTITY;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private float giaThanh;
    private String maCL;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, float giaThanh, String maCL) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.giaThanh = giaThanh;
        this.maCL = maCL;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    public String getMaCL() {
        return maCL;
    }

    public void setMaCL(String maCL) {
        this.maCL = maCL;
    }
}
