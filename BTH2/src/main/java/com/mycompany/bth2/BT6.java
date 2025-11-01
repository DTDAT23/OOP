/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author tiend
 */
public class BT6 {
    public static class HocSinh{
        private static int xxxx = 0;
        
        private String mssv;
        private String hoten;
        private String ngaySinh;
        private String quequan;
        private double diemT, diemV, diemA;
        
        HocSinh(String hoTen, String ngaySinh, String queQuan, double diemT, double diemV, double diemA){
            xxxx++;
            this.mssv = String.format("HS-%04d", xxxx);
            this.hoten = hoTen;
            this.ngaySinh = ngaySinh;
            this.quequan = queQuan;
            this.diemT=diemT;
            this.diemV = diemV;
            this.diemA = diemA;
        }

        public String getMssv() {
            return mssv;
        }

        public void setMssv(String mssv) {
            this.mssv = mssv;
        }

        public String getHoten() {
            return hoten;
        }

        public void setHoten(String hoten) {
            this.hoten = hoten;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public String getQuequan() {
            return quequan;
        }

        public void setQuequan(String quequan) {
            this.quequan = quequan;
        }

        public double getDiemT() {
            return diemT;
        }

        public void setDiemT(double diemT) {
            this.diemT = diemT;
        }

        public double getDiemV() {
            return diemV;
        }

        public void setDiemV(double diemV) {
            this.diemV = diemV;
        }

        public double getDiemA() {
            return diemA;
        }

        public void setDiemA(double diemA) {
            this.diemA = diemA;
        }

        @Override
        public String toString() {
            return this.mssv + ", "+this.hoten+", "+this.ngaySinh+", "+this.quequan+", "+this.diemT+", "+this.diemV+", "+this.diemA+"\n";
        }
        
        public int getTuoi(){
            LocalDate today = LocalDate.now();
            String[] ngaysinh = this.ngaySinh.split("/");
            return today.getYear() - Integer.parseInt(ngaysinh[2]);
        }
    }
}
