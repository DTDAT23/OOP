/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

/**
 *
 * @author tiend
 */
public class BT4 {
    public static class PhanSo{
        private int tuso;
        private int mauso;
        
        private static int slPhanSo;
        
        PhanSo(){
            this.tuso = 0;
            this.mauso =1;
        }
        
        PhanSo(int tu, int mau){
            this.tuso = tu;
            this.mauso = mau;
        }
        
        public static int UCLN(int a, int b){
            a = Math.abs(a);
            b = Math.abs(b);
            
            while(b!=0){
                int temp = b;
                b=a%b;
                a=temp;
            }
            return a;
        }

        public int getTuso() {
            return tuso;
        }

        public void setTuso(int tuso) {
            this.tuso = tuso;
        }

        public int getMauso() {
            return mauso;
        }

        public void setMauso(int mauso) {
            this.mauso = mauso;
        }
        
        public PhanSo rutgon(){
            return new PhanSo((this.tuso)/(PhanSo.UCLN(this.tuso, this.mauso)),(this.mauso)/(PhanSo.UCLN(this.tuso, this.mauso)));
        }
        
        public PhanSo congPS(PhanSo p){
            return new PhanSo((this.tuso*p.mauso+this.mauso*p.tuso),(this.mauso*p.mauso)).rutgon();
        }
        
        public PhanSo truPS(PhanSo p){
            return new PhanSo((this.tuso*p.mauso-this.mauso*p.tuso),(this.mauso*p.mauso)).rutgon();
        }
        
        public PhanSo nhanPS(PhanSo p){
            return new PhanSo((this.tuso*p.tuso),(this.mauso*p.mauso)).rutgon();
        }
        
        public PhanSo chiaPS(PhanSo p){
            return new PhanSo((this.tuso*p.mauso),(this.mauso*p.tuso)).rutgon();
        }
        
        public int soSanhPS(PhanSo p){
            int trai = this.tuso*p.mauso;
            int phai = this.mauso*p.tuso;
            
            if(trai>phai) return 1;
            if(trai<phai) return -1;
            
            return 0;
        }

        @Override
        public String toString() {
            return this.tuso+"/"+this.mauso;
        }
        
        
    }
}
