package com.supermarket.ENTITY;

import java.util.Date;

public class DonHang {

    private String maDH;
    private Date ngayDatHang;
    private String maKH;
    private float tongTien;

    public DonHang() {
    }

    public DonHang(String maDH, Date ngayDatHang, String maKH) {
        this.maDH = maDH;
        this.ngayDatHang = ngayDatHang;
        this.maKH = maKH;
    }

    public DonHang(String maDH, Date ngayDatHang, String maKH, float tongTien) {
        this.maDH = maDH;
        this.ngayDatHang = ngayDatHang;
        this.maKH = maKH;
        this.tongTien = tongTien;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
}
