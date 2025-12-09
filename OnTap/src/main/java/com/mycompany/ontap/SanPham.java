/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tiend
 */
public class SanPham {
    private static int dem=0;
    private String maSP;
    private String tenSP;
    private Date ngayNhapKho;
    private double donGia;
    private int soLuongTonKho;
    {
        dem++;
        if(this.dem>9999)
            throw new IllegalArgumentException("San pham vuot qua so luong!");
        this.maSP = String.format("SP-%04d", dem);
    }

    public SanPham(String tenSP, Date ngayNhapKho, double donGia, int soLuongTonKho) {
        this.tenSP = tenSP;
        this.ngayNhapKho = ngayNhapKho;
        this.donGia = donGia;
        this.soLuongTonKho = soLuongTonKho;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        SanPham.dem = dem;
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

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
    
    public double giaTriTonKho(){
        return (this.soLuongTonKho*this.donGia);
    }
    
    public int soSanhGTTonKho(SanPham s){
        return Integer.compare((int)this.giaTriTonKho(), (int)s.giaTriTonKho());
    }

    @Override
    public String toString() {
        SimpleDateFormat nt = new SimpleDateFormat("dd/MM/yyyy");
        String ngaynhapkho = nt.format(this.ngayNhapKho);
        return String.format("%s, %s, %.0f, %d, %.0f", 
                this.tenSP,
                ngaynhapkho,
                this.donGia,
                this.soLuongTonKho,
                giaTriTonKho());
    }
    
    
}
