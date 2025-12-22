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
    private static int dem = 0;
    private String maSP;
    private String tenSP;
    private Date ngayNhapKho;
    private int donGia;
    private int soLuongTonKho;
    
    {
        if(this.dem>9999){
            throw new IllegalArgumentException("Vuot qua so luong san pham!");
        }
        dem++;
        this.maSP = String.format("SP-%04d", dem);
    }

    public SanPham(String tenSP, Date ngayNhapKho, int donGia, int soLuongTonKho) {
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

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
    
    public int giaTriTK(){
        return this.soLuongTonKho*this.donGia;
    }
    
    public int soSanh(SanPham s){
        return Integer.compare(this.giaTriTK(), s.giaTriTK());
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Ma san pham: %s\nTen san pham: %s\nNgay nhap kho: %s\nDon gia: %d\nSo luong ton kho: %d", 
                this.maSP,
                this.tenSP,
                df.format(this.ngayNhapKho),
                this.donGia,
                this.soLuongTonKho);
    }
}
