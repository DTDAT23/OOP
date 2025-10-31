/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT13 {

    public static void main(String[] BT13) {
        ArrayList<CauThu> dsct = new ArrayList<>();
        int diemTD=0, diemHV=0, diemTV=0, diemTM=0, diemCT=0;

        try {
            File fin = new File("D:\\OOP\\datalab\\DoiTuyenQuocGiaVN.txt");
            Scanner sc = new Scanner(fin);
            sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parks = line.split(",");

                if (parks.length < 4) {
                    System.out.println("⚠️ Dòng không hợp lệ: " + line);
                    continue;
                }

                CauThu ct = new CauThu(parks[0], parks[1], Long.parseLong(parks[2]), parks[3]);
                //cau a
//                System.out.println(ct);
//                dsct.add(ct);
                //cau b
//                if(Long.parseLong(parks[2])<20){
//                    System.out.println(ct);
//                    dsct.add(ct);
//                }
//                  cau c
//                if(parks[1].equalsIgnoreCase("tien dao")) diemTD++;
//                if(parks[1].equalsIgnoreCase("tien ve")) diemTV++;
//                if(parks[1].equalsIgnoreCase("hau ve")) diemHV++;
//                if(parks[1].equalsIgnoreCase("thu mon")) diemTM++;
                //Cau d
                String[] hoten=parks[0].split(" ");
                if(hoten[0].equalsIgnoreCase("nguyen")&&parks[3].equalsIgnoreCase("clb ha noi")) diemCT++;
            }
            //cau a - b
            System.out.println("So luong cau thu la: "+ dsct.size());
            //cau c
            System.out.printf("Tien dao: %d nguoi - Tien ve: %d nguoi - Hau ve: %d nguoi - Thu mon: %d nguoi", diemTD, diemTV, diemHV, diemTM);
            //cau d
            System.out.printf("So luong cau thu yeu cau la: %d", diemCT);
        } catch (FileNotFoundException ex) {
            System.out.println("Loi khong the mo file");
        }
    }
}
