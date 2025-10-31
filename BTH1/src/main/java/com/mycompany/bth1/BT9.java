/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT9 {
    static class SinhVien{
        long mssv = 0;
        String name = "Chua ro";
        String ngaySinh = "00/00/0000";
        double dtb = 0.0;
        
        public SinhVien(long a, String b, String c, double d){
            this.mssv = a;
            this.name = b;
            this.ngaySinh = c;
            this.dtb = d;
        }

        @Override
        public String toString() {
            String s = mssv + "," + name + ","+ ngaySinh + "," + dtb;
            return s;
        }
        
    }
    
//    static void themCuoiSV(SinhVien[] s, int n){
//        Scanner nhap = new Scanner(System.in);
//        if(n==0){
//            System.out.print("Nhap ma so sinh vien: ");
//            s[n].mssv = nhap.nextLong();
//
//            System.out.print("Nhap ho ten sinh vien: ");
//            s[n].name = nhap.nextLine();
//
//            System.out.print("Nhap ngay sinh: ");
//            s[n].ngaySinh = nhap.nextLine();
//
//            System.out.print("Diem trung binh: ");
//            s[n].dtb = nhap.nextDouble();
//        }
//        else{
//            System.out.print("Nhap ma so sinh vien: ");
//            s[++n].mssv = nhap.nextLong();
//
//            System.out.print("Nhap ho ten sinh vien: ");
//            s[++n].name = nhap.nextLine();
//
//            System.out.print("Nhap ngay sinh: ");
//            s[++n].ngaySinh = nhap.nextLine();
//
//            System.out.print("Diem trung binh: ");
//            s[++n].dtb = nhap.nextDouble();
//        }
//
//    }
    
//    static void xuatDS(SinhVien[] s, int n){
//        for(int i = 0; i< n; i++){
//            System.out.println(s[i]);
//        }
//    }
    
    public static void main(String[] BT9){
        ArrayList<SinhVien> dssv = new ArrayList<>(); 
        Scanner input= new Scanner(System.in);
        long mssv;
        String name, ngaySinh;
        double dtb;
        int luaChon;
        do{
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Tim kiem sinh vien moi");
            System.out.println("0. Thoat khoi menu");
            
            System.out.print("Nhap lua chon:");
            luaChon = input.nextInt();
            
            switch(luaChon){
                case 1:
                    System.out.print("Nhap mssv");
                    mssv = input.nextLong();
                    input.nextLine();
                    System.out.print("Nhap ho ten");
                    name = input.nextLine();
                    System.out.print("Nhap mssv");
                    ngaySinh = input.nextLine();
                    System.out.print("Nhap mssv");
                    dtb = input.nextDouble();
                    SinhVien sv = new SinhVien(mssv, name, ngaySinh, dtb);
                    dssv.add(sv);
                    break;
                case 2:
                    dssv.forEach(sv1 -> System.out.println(sv1));
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Nhap sv can xoa: ");
                    name = input.nextLine();
                    
                    for(SinhVien s: dssv){
                        if(s.equals(name)){
                            dssv.remove(s);
                        }
                    }
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong hop le!");
            }
        }while(luaChon!=0);
    }
}
