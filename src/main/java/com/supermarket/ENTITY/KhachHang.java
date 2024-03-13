package com.supermarket.ENTITY;

import java.util.Date;

public class KhachHang {
    private String maKH;
    private String matKhau;
    private String tenKH;
    private boolean gioiTinh;
    private Date ngayDangKy;
    private Date ngaySinh;

    public KhachHang() {
    }

    public KhachHang(String maKH, String matKhau, String tenKH, boolean gioiTinh, Date ngayDangKy, Date ngaySinh) {
        this.maKH = maKH;
        this.matKhau = matKhau;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngayDangKy = ngayDangKy;
        this.ngaySinh = ngaySinh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
