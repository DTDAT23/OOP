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
public class SanPhamKhuyenMai extends SanPham {
    private int giaGiam;

    public SanPhamKhuyenMai(String tenSP, Date ngayNhapKho, int donGia, int soLuongTonKho, int giaGiam) {
        super(tenSP, ngayNhapKho, donGia, soLuongTonKho);
        this.giaGiam = giaGiam;
    }

    @Override
    public int giaTriTK() {
        return super.giaTriTK()*(1-this.giaGiam/100); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\nGia giam: %d", this.giaGiam); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getGiaGiam() {
        return giaGiam;
    }
}
