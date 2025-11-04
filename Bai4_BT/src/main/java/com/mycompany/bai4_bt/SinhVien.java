/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai4_bt;

/**
 *
 * @author tiend
 */
public class SinhVien {
    private HoTen Ten;
    private NgayThang NSinh;
    private String Nganh, NoiSinh;
    
    SinhVien(HoTen ten, NgayThang nsinh, String nganh, String noisinh){
        this.Ten = ten;
        this.NSinh = nsinh;
        this.Nganh = nganh;
        this.NoiSinh = noisinh;
    }

    @Override
    public String toString() {
        String s = "\n================";
        s += this.Ten + ", "+ this.NSinh+", "+this.Nganh+", "+this.NoiSinh+"\n";
        return s;
    }
    
    
}
