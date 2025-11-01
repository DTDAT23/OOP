/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT6 {
    public static class HocSinh{
        private static int xxxx = -1;
        
        private String mshs;
        private String hoten;
        private String ngaySinh;
        private String quequan;
        private double diemT, diemV, diemA;
        
        HocSinh(String hoTen, String ngaySinh, String queQuan, double diemT, double diemV, double diemA){
            xxxx++;
            this.mshs = String.format("HS-%04d", xxxx);
            this.hoten = hoTen;
            this.ngaySinh = ngaySinh;
            this.quequan = queQuan;
            this.diemT=diemT;
            this.diemV = diemV;
            this.diemA = diemA;
        }

        public String getMshs() {
            return mshs;
        }

        public void setMssv(String mshs) {
            this.mshs = mshs;
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
            return this.hoten+", "+this.ngaySinh+", "+this.quequan+", "+this.diemT+", "+this.diemV+", "+this.diemA+"\n";
        }
        
        public int getTuoi(){
            LocalDate today = LocalDate.now();
            String[] ngaysinh = this.ngaySinh.split("/");
            return today.getYear() - Integer.parseInt(ngaysinh[2]);
        }
        
        public double tinhDTB(){
            return (this.diemT+this.diemV+this.diemA)/3;
        }
        
        public String kqHocLuc(){
            if(tinhDTB()>=5){
                if(tinhDTB()>=6.5){
                    if(tinhDTB()>=8.0) return "Gioi";
                    return "Kha";
                }
                return "Trung binh";
            }
            return "Yeu";
        }
        
        public static class QLHS{
            private ArrayList<HocSinh> dshs;
            
            QLHS(){
                dshs = new ArrayList<>();
                
                try{
                    File f = new File("D:\\OOP\\datalab\\HocSinh.txt");
                    Scanner sc = new Scanner(f);
                    
                    while(sc.hasNextLine()){
                        String line = sc.nextLine().trim();
                        if(line.isEmpty()) {
                            continue;
                        }
                        String[] parks = line.split(", ");
                        
                        dshs.add(new HocSinh(parks[0],parks[1],parks[2],Double.parseDouble(parks[3]),Double.parseDouble(parks[4]),Double.parseDouble(parks[5])));
                    }
                    sc.close();
                }
                catch(FileNotFoundException e){
                    System.out.println("Khong doc duoc file\n");
                }
            }
            
            public void themHS(HocSinh s){
                dshs.add(s);
                
                try{
                    FileWriter fo = new FileWriter("D:\\OOP\\datalab\\HocSinh.txt", true);
                    PrintWriter oc = new PrintWriter(fo);
                    oc.println(s);
                    oc.close();
                }
                catch(IOException e){
                    System.out.println("Khong the ghi file\n");
                }
            }
            
            public void showDS(){
                for(HocSinh hs: dshs){
                    System.out.println(hs.getMshs());
                    System.out.println(hs);
                }
            }
            
            public void xoaHS(String msHS){
                for(HocSinh s: dshs){
                    if (s.getMshs().equalsIgnoreCase(msHS)) {
                        dshs.remove(s);
                    }
                }
            }
            
            public void sortDS(){
                dshs.sort((a,b)->Double.compare(b.tinhDTB(), a.tinhDTB()));
                
                int count = Math.min(5, dshs.size());
                System.out.println("\n5 hoc sinh co diem trung binh be nhat:\n");
                for (int i = dshs.size() - count; i < dshs.size(); i++) {
                    System.out.println(dshs.get(i));
                }
            }
        }
    }
}
