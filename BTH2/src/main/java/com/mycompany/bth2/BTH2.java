/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bth2;

import com.mycompany.bth2.BT2.Diem;
import com.mycompany.bth2.BT3.DoanThang;
import com.mycompany.bth2.BT4.PhanSo;
import com.mycompany.bth2.BT5.DSPhanSo;
import com.mycompany.bth2.BT6.HocSinh;

/**
 *
 * @author tiend
 */
public class BTH2 {

    public static void main(String[] args) {
        //Bai 2
//        Diem d1 = new Diem(1.2,2.0);
//        System.out.print(d1);
//        Diem d2 = new Diem(2.0, 1.5);
//        System.out.println((double) d1.tinhKhoangCach(d2));

//            //Bai 3
//            DoanThang dt1 = new DoanThang(1.2,2.0, 2.0,1.5);
//            DoanThang dt2 = new DoanThang(2.1,1.4,1.0,7.0);
//            
//            System.out.println("Doan thang d1: "+dt1);
//            
//            System.out.printf("Do dai doan thang d1: %f\n", dt1.doDaiDT());
//            
//            Diem td = dt1.timTrungDiem();
//            
//            System.out.println("Trung diem doan thang dt1 la: " + td);
//            
//            
//            
//            if(dt1.isSongSong(dt2)){
//                System.out.println("Hai doan thang nay song song");
//            }
//            else System.out.println("Khong song song");

//            //Bai 4
//            PhanSo ps1 = new PhanSo(12,18);
//            PhanSo ps2 = new PhanSo(1,7);
//            System.out.println(ps1.rutgon());
//            System.out.println(ps2);
//            
//            PhanSo psc = ps1.congPS(ps2);
//            System.out.println(psc);
//            System.out.println(ps1.rutgon().soSanhPS(ps2));

//        //Bai 5
//        DSPhanSo ds = new DSPhanSo();
//        ds.addPhanSo(new PhanSo(2, 3));
//        ds.addPhanSo(new PhanSo(5, 9));
//        ds.addPhanSo(new PhanSo(1, 2));
//
//        ds.hienThi();
//
//        System.out.println("Tổng các phân số = " + ds.tinhTongPS());
//
//        ds.sortDSPS();
//        System.out.println("Sau khi sắp xếp tăng dần:");
//        ds.hienThi();

            //Bai 6
            HocSinh hs1 = new HocSinh("Nguyen Van A", "01/01/2007", "Vung Tau", 8.5, 7.5, 9.0);
            System.out.println(hs1);
            System.out.printf("Tuoi hien tai la: %d\n", hs1.getTuoi());
    }
}
