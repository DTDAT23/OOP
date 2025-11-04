/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4_bt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class main {

    public static void main(String[] args) {
//       NgayThang s = new NgayThang(12,03,2006,2);
//       System.out.println(s);
//       
//       HoTen a = new HoTen("Nguyen Van","A", 1);
//       System.out.println(a);
//       
//       SinhVien sv = new SinhVien(a, s,"CNTT","Vung Tau");

       
       ArrayList<SinhVien> dssv = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       int luachonDinhDang = 0;
       System.out.print("Nhap lua chon dinh dang: ");
       luachonDinhDang = sc.nextInt();
       sc.nextLine();
               
       System.out.println("Nhap vao 5 sinh  vien:\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ho lot: ");
            String holot = sc.nextLine();
            System.out.print("Nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap ngay sinh: ");
            long ngay = sc.nextLong();
            System.out.print("Nhap thang: ");
            long thang = sc.nextLong();
            System.out.print("Nhap nam sinh: ");
            long nam = sc.nextLong();
            sc.nextLine();
            System.out.print("Nhap nganh: ");
            String nganh = sc.nextLine();
            System.out.print("Nhap que quan: ");
            String noisinh = sc.nextLine();
            
            SinhVien sv = new SinhVien(new HoTen(holot,ten,luachonDinhDang), new NgayThang(ngay, thang, nam, luachonDinhDang),nganh, noisinh);
            dssv.add(sv);
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(dssv.get(i));
        }
       
    }
}
