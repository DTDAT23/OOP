/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap;

import java.util.Date;

/**
 *
 * @author tiend
 */
public class SanPhamKhuyenMai extends SanPham{
    private double giaGiam;
    public SanPhamKhuyenMai(String tenSP, Date ngayNhapKho, double donGia, int soLuongTonKho, double giaGiam){
        super(tenSP,ngayNhapKho,donGia,soLuongTonKho);
        this.giaGiam = giaGiam;
    }

    @Override
    public double giaTriTonKho() {
        return super.giaTriTonKho()*(1-(this.giaGiam/100)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString()+String.format(", %.0f", this.giaGiam); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
