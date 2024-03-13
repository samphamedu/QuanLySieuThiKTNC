package com.supermarket.ENTITY;

import java.util.Date;

public class NhanVien {
    private String maNV;
    private String matKhau;
    private String hoTen;
    private boolean gioiTinh;
    private Date ngaySinh;
    private boolean vaiTro;

    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String hoTen, boolean gioiTinh, Date ngaySinh, boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.vaiTro = vaiTro;
    }

    public NhanVien(String maNV, String matKhau, String hoTen, boolean gioiTinh, Date ngaySinh) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public NhanVien(String maNV, String matKhau, boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
}
