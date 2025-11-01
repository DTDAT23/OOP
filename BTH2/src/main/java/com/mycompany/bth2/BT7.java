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
                
                sqg.nextLine();
                while(sqg.hasNextLine()){
                    String line = sqg.nextLine().trim();
                    String[] parks = line.split(",");
                    
                    dsqg.add(new QuocGia(parks[0],parks[1],Long.parseLong(parks[2]),Double.parseDouble(parks[3])));
                }
            }
            catch(FileNotFoundException e){
                System.out.println("Khong doc file duoc");
            }
        }
    }
}
