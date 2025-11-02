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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT7 {
    public static class QuocGia{
        private String tennuoc;
        private String thudo;
        private long danso; //trieu nguoi
        private double dientich; // ngan km2
        
        QuocGia(String ten, String thuDo,long danSo, double dienTich ){
            this.tennuoc=ten;
            this.thudo = thuDo;
            this.danso = danSo;
            this.dientich = dienTich;
        }

        public String getTennuoc() {
            return tennuoc;
        }

        public void setTennuoc(String tennuoc) {
            this.tennuoc = tennuoc;
        }

        public String getThudo() {
            return thudo;
        }

        public void setThudo(String thudo) {
            this.thudo = thudo;
        }

        public long getDanso() {
            return danso;
        }

        public void setDanso(long danso) {
            this.danso = danso;
        }

        public double getDientich() {
            return dientich;
        }

        public void setDientich(double dientich) {
            this.dientich = dientich;
        }

        @Override
        public String toString() {
            return this.tennuoc +", "+this.thudo+", "+this.danso+"(trieu nguoi)"+", "+this.dientich+"(ngan km2)\n";
        }
        
        
    }
    
    public static class ThanhTich{
        private int hcdong;
        private int hcbac;
        private int hcvang;
        
        ThanhTich(int vang, int bac, int dong){
            this.hcvang = vang;
            this.hcbac = bac;
            this.hcdong = dong;
        }

        public int getHcdong() {
            return hcdong;
        }

        public void setHcdong(int hcdong) {
            this.hcdong = hcdong;
        }

        public int getHcbac() {
            return hcbac;
        }

        public void setHcbac(int hcbac) {
            this.hcbac = hcbac;
        }

        public int getHcvang() {
            return hcvang;
        }

        public void setHcvang(int hcvang) {
            this.hcvang = hcvang;
        }

        @Override
        public String toString() {
            return "HC vang: "+this.hcvang+", "+"HC bac: "+this.hcbac+", "+"HC dong: "+this.hcdong+"\n";
        }
        
        
    }
    
    public static class OlympicTokyo{
        private static int slqg;
        private ArrayList<QuocGia> dsqg;
        private ArrayList<ThanhTich> dstt;
        
        OlympicTokyo(){
            dsqg = new ArrayList<>();
            dstt = new ArrayList<>();
            
            try{
                File fqg = new File("D:\\OOP\\datalab\\Top20TokyoInfo.txt");
                File ftt = new File("D:\\OOP\\datalab\\Top20Tokyo.txt");
                
                Scanner sqg = new Scanner(fqg);
                Scanner stt = new Scanner(ftt);
                //Doc file QG
                sqg.nextLine();
                stt.nextLine();
                slqg = Integer.parseInt(stt.nextLine().trim());
                String[] dsQG=stt.nextLine().trim().split(",");
                ArrayList<String> thanhtich = new ArrayList<>();
                
                //doc file thanh tich
                for (int i = 0; i < slqg; i++) {
                    thanhtich.add(stt.nextLine().trim());
                }
                
                while(sqg.hasNextLine()){
                    String line = sqg.nextLine().trim();
                    String[] parks = line.split(",");
                    
                    dsqg.add(new QuocGia(parks[0],parks[1],Long.parseLong(parks[2]),Double.parseDouble(parks[3])));
                    for(int i = 0;i< slqg;i++){
                        if(parks[0].equalsIgnoreCase(dsQG[i])){
                            String lines = thanhtich.get(i);
                            String[] tt = lines.split(",");
                            dstt.add(new ThanhTich(Integer.parseInt(tt[0]),Integer.parseInt(tt[1]),Integer.parseInt(tt[2])));
                        }
                    }
                }
                
                sqg.close();
                stt.close();
            }
            catch(FileNotFoundException e){
                System.out.println("Khong doc file duoc");
            }
        }
        
        public void showDS(){
            for (int i = 0; i < slqg; i++) {
                System.out.println(dsqg.get(i)+""+dstt.get(i));
            }
        }
        
        public void timKiem(String tenQG){
            for (int i = 0; i < slqg; i++) {
                if(dsqg.get(i).getTennuoc().equalsIgnoreCase(tenQG)){
                    System.out.println(dsqg.get(i)+""+dstt.get(i));
                    return;
                }
            }
            System.out.printf("\nKhong tim thay %s", tenQG);
        }
        
        public void showDS(int V){
            boolean isLon = false;
            for (int i = 0; i < slqg; i++) {
                if(dstt.get(i).getHcvang()>=V){
                    System.out.println(dsqg.get(i)+""+dstt.get(i));
                    isLon = true;
                }
            }
            if(!isLon) System.out.printf("Khong co quoc gia nao co so hc vang lon hon %d", V);
        }
        
        public void inTapTin(String tenQG, String tenTapTin){
            try{
                FileWriter fo = new FileWriter(tenTapTin,true);
                PrintWriter si = new PrintWriter(fo);
                
                for (int i = 0; i < slqg; i++) {
                    if(dsqg.get(i).getTennuoc().equalsIgnoreCase(tenQG)){
                        si.println(dsqg.get(i)+""+dstt.get(i));
                    }
                }
                si.close(); 
            }
            catch(IOException ex){
                System.out.println("khong the ghi file");
            }
        }
    }
}
