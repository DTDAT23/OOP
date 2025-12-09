/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class Test {

    public static class DSSP {

        private ArrayList<SanPham> dsSP;
        private SimpleDateFormat nt = new SimpleDateFormat("dd/MM/yyyy");

        public DSSP() {
            dsSP = new ArrayList<>();
        }

        public void read() throws ParseException {
            try {
                File f = new File("D:\\OOP\\OnTap\\src\\SanPham.txt");
                Scanner sc = new Scanner(f);
                for (int i = 0; i < 2; i++) {
                    sc.nextLine();
                }
                while (sc.hasNextLine()) {
                    String line = sc.nextLine().trim();
                    String[] info = line.split("\\s*,\\s*");
                    Date ngayThang = nt.parse(info[1]);
                    SanPham sp;
                    if (info.length == 4) {
                        sp = new SanPham(info[0], ngayThang, Double.parseDouble(info[2]), Integer.parseInt(info[3]));
                    } else {
                        sp = new SanPhamKhuyenMai(info[0], ngayThang, Double.parseDouble(info[2]), Integer.parseInt(info[3]), Double.parseDouble(info[4]));
                    }
                    dsSP.add(sp);
                }
                sc.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Khong doc duoc file!");
            }
        }

        public void them(SanPham sp) {
            try {
                FileWriter fout = new FileWriter("D:\\OOP\\OnTap\\src\\SanPham.txt");
                PrintWriter sc = new PrintWriter(fout);
                dsSP.add(sp);
                sc.print(sp);
            } catch (IOException ex) {
                System.out.println("Khong the ghi file!");
            }
        }

        @Override
        public String toString() {
            String s = "";
            for(SanPham sp: dsSP){
                s = s + "\n"+String.valueOf(sp.getMaSP())+", "+String.valueOf(sp);
            }
            return s; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        public void sapXep(){
            dsSP.sort((a,b)->b.soSanhGTTonKho(a));
        }
        
        public void locSP(char kyTu){
            dsSP.stream().filter(a -> a.getTenSP().charAt(0) == kyTu)
                    .forEach(a -> System.out.println(a));
        }
        
        public void locSPTK(int n){
            dsSP.stream().filter(a -> a.getSoLuongTonKho() > n)
                    .forEach(a -> System.out.println(a));
        }
        
        public void ghiTop5(){
            try {
                FileWriter fout = new FileWriter("D:\\OOP\\OnTap\\src\\Top5.txt");
                PrintWriter sc = new PrintWriter(fout);
                sapXep();
                for (int i = 0; i < 5; i++) {
                    sc.print("\n"+dsSP.get(i));
                }
                sc.close();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        
    }
    
    public static void main(String[] args) throws ParseException {
        DSSP l1 = new DSSP();
        l1.read();

        System.out.println("========Danh Sach San Pham=========\n");
        System.out.println(l1);
        System.out.println("\n========Danh Sach San Pham Sau Khi Sap Xep=========");
        l1.sapXep();
        System.out.println(l1);
        System.out.println("\n========Danh Sach San Pham Top 5=========");
        l1.ghiTop5();
    }
}
