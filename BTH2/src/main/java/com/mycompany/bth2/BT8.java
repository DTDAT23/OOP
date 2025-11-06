/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT8 {
    public static class CauThu{
        private String HoTen;
        private String ViTri;
        private long SoAo;
        private String CLB;
        
        CauThu(String hoten, String vtri, long soao, String clb){
            this.HoTen = hoten;
            this.ViTri  = vtri;
            this.SoAo = soao;
            this.CLB = clb;
        }

        public String getHoTen() {
            return HoTen;
        }

        public void setHoTen(String HoTen) {
            this.HoTen = HoTen;
        }

        public String getViTri() {
            return ViTri;
        }

        public void setViTri(String ViTri) {
            this.ViTri = ViTri;
        }

        public long getSoAo() {
            return SoAo;
        }

        public void setSoAo(long SoAo) {
            this.SoAo = SoAo;
        }

        public String getCLB() {
            return CLB;
        }

        public void setCLB(String CLB) {
            this.CLB = CLB;
        }

        @Override
        public String toString() {
            return String.format("\n%s, %s, %d, %s", this.HoTen, this.ViTri, this.SoAo, this.CLB);
        }      
    }
    
    public static class DoiTuyenQuocGia{
        private ArrayList<CauThu> dsct;
        
        DoiTuyenQuocGia(String duongdanfile){
            dsct = new ArrayList<>();
            
            try{
                File f = new File(duongdanfile);
                Scanner sc = new Scanner(f);
                
                sc.nextLine();
                while(sc.hasNextLine()){
                    String line = sc.nextLine().trim();
                    String[] parks = line.split(",");
                    
                    dsct.add(new CauThu(parks[0], parks[1],Long.parseLong(parks[2]),parks[3]));
                }
                
                sc.close();
            }
            catch(FileNotFoundException ex){
                System.out.println("Khong the doc file\n");
            }
        }
        
        public void getCTCLB(String tenclb){
            for(CauThu ct: dsct){
                if(ct.getCLB().equalsIgnoreCase(tenclb))
                    System.out.println(ct);
            }
        }
        
        public void getCTVTri(String vitri){
            for(CauThu ct: dsct){
                if(ct.getViTri().equalsIgnoreCase(vitri))
                    System.out.println(ct);
            }
        }
        
        public void getCTVTri(String vitri, int soct){
            int i = 0;
            System.out.println(vitri+":\n");
            for(CauThu ct: dsct){
                if(ct.getViTri().equalsIgnoreCase(vitri)){
                    System.out.println(ct.getHoTen());
                    i++;
                }
                if(i==soct) break;
            }
        }
        
        public void getDoiHinhThiDau(int TM, int CB, int CM, int ST){
            System.out.printf("Doi hinh thi dau:%d-%d-%d-%d", TM, CB, CM, ST);
            getCTVTri("thu mon", TM);
            getCTVTri("Hau ve", CB);
            getCTVTri("tien ve", CM);
            getCTVTri("Tien dao", ST);
                    
        }
    }
}
