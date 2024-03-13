package com.supermarket.ENTITY;

public class SanPhamExtend extends SanPham{
    private String tenCl;

    public SanPhamExtend(String maSP, String tenSP, int soLuong, float giaThanh, String maCL, String tenCl) {
        super(maSP, tenSP, soLuong, giaThanh, maCL);
        this.tenCl = tenCl;
    }

    
    public String getTenCl() {
        return tenCl;
    }

    public void setTenCl(String tenCl) {
        this.tenCl = tenCl;
    }
}
