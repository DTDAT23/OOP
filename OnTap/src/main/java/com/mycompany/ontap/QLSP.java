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
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class QLSP {
    private ArrayList<SanPham> ds;
    
    public QLSP(String path){
        ds = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            File f = new File(path);
            Scanner sc = new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            
            while(sc.hasNextLine()){
                String[] info = sc.nextLine().trim().split(", ");
                SanPham sp = null;
                if(info.length == 4){
                    sp = new SanPham(info[0],df.parse(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]));
                }
                else{
                    sp = new SanPhamKhuyenMai(info[0],df.parse(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]),Integer.parseInt(info[4]));
                }
                ds.add(sp);
            }
            sc.close();
        }catch(FileNotFoundException | ParseException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void them(SanPham sp, String path){
        ds.add(sp);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            FileWriter f = new FileWriter(path, true);
            PrintWriter writer = new PrintWriter(f);
            if(sp instanceof SanPhamKhuyenMai){
                writer.printf("\n%s, %s, %d, %d, %d",sp.getTenSP(),df.format(sp.getNgayNhapKho()),sp.getDonGia(),sp.getSoLuongTonKho(),((SanPhamKhuyenMai) sp).getGiaGiam());
            }
            else
                writer.printf("\n%s, %s, %d, %d",sp.getTenSP(),df.format(sp.getNgayNhapKho()),sp.getDonGia(),sp.getSoLuongTonKho());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(SanPham sp : ds){
            s+=sp+"\n";
        }
        return s;
    }
    
    public void locTheoKyTu(char k){
        ds.stream().filter(a -> 
                Character.toLowerCase(a.getTenSP().charAt(0)) == Character.toLowerCase(k)).forEach(a -> System.out.println(a)); 
    }
    
    public void xoaCapNhat(SanPham s, String path){
        try{
            ArrayList<String> ghiChu = new ArrayList<>();
            SimpleDateFormat nt = new SimpleDateFormat("dd/MM/yyyy");
            File f = new File(path);
            Scanner sc = new Scanner(f);
            for (int i = 0; i < 3; i++) {
                ghiChu.add(sc.nextLine());
            }
            sc.close();//Dong doc 3 dong dau lai
            ds.remove(s);
            FileWriter file = new FileWriter(path,false);
            PrintWriter wr = new PrintWriter(file);
            for (String hd: ghiChu) {
                wr.println(hd);
            }
            for (int i = 0; i < ds.size(); i++) {
                if(ds.get(i) instanceof SanPhamKhuyenMai){
                    SanPhamKhuyenMai spkm = (SanPhamKhuyenMai)ds.get(i);
                    wr.printf("%s, %s, %d, %d, %d",
                            ds.get(i).getTenSP(), 
                            nt.format(ds.get(i).getNgayNhapKho()),
                            ds.get(i).getDonGia(),
                            ds.get(i).getSoLuongTonKho(),
                            spkm.getGiaGiam());
                }
                else {
                    wr.printf("%s, %s, %d, %d",
                            ds.get(i).getTenSP(),
                            nt.format(ds.get(i).getNgayNhapKho()),
                            ds.get(i).getDonGia(),
                            ds.get(i).getSoLuongTonKho());
                }
                if(i<ds.size()-1){ //Kiem tra neu chua phai dong cuoi thi van xuong dong
                    wr.println(); 
                }
            }
            wr.close();//Dong ghi file lai 
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
