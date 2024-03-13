/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

/**
 *
 * @author trinh duy bao
 */
public class ChungLoai {

    private String maCL;
    private String tenCL;
    private String mieuTa;

    public ChungLoai() {
    }
    
    /*@Override
    public String toString() {
        return this.tenCL;
    }
    
    @Override
    public boolean equals(Object obj) {
        ChungLoai other = (ChungLoai) obj;
        return other.getMaCL().equals(this.getMaCL());
    }*/

    public ChungLoai(String maCL, String tenCL, String mieuTa) {
        this.maCL = maCL;
        this.tenCL = tenCL;
        this.mieuTa = mieuTa;
    }

    public String getMaCL() {
        return maCL;
    }

    public void setMaCL(String maCL) {
        this.maCL = maCL;
    }

    public String getTenCL() {
        return tenCL;
    }

    public void setTenCL(String tenCL) {
        this.tenCL = tenCL;
    }

    public String getMieuTa() {
        return mieuTa;
    }

    public void setMieuTa(String mieuTa) {
        this.mieuTa = mieuTa;
    }
}
