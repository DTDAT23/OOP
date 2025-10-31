/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

import com.mycompany.bth2.BT2.Diem;

/**
 *
 * @author tiend
 */
public class BT3 {

    public static class DoanThang {

        private Diem d1;
        private Diem d2;

        public DoanThang(double x1, double y1, double x2, double y2) {
            this.d1 = new Diem(x1,y1);
            this.d2 = new Diem(x2,y2);
        }

        public Diem getD1() {
            return d1;
        }

        public void setD1(Diem d1) {
            this.d1 = d1;
        }

        public Diem getD2() {
            return d2;
        }

        public void setD2(Diem d2) {
            this.d2 = d2;
        }

        @Override
        public String toString() {
            return "["+ d1 +", "+ d2 +"]";
        }
        
        public double doDaiDT(){
            return this.d1.tinhKhoangCach(this.d2);
        }
        
        public Diem timTrungDiem(){
            return new Diem((this.d1.getHoanhdo()+this.d2.getHoanhdo())/2,(this.d1.getTungdo()+this.d2.getTungdo())/2);
        }
        
        public boolean isSongSong(DoanThang p){
            return ((this.d1.getHoanhdo()-this.d2.getHoanhdo())/(this.d1.getTungdo()-this.d2.getTungdo()))==((p.d1.getHoanhdo()-p.d2.getHoanhdo())/(p.d1.getTungdo()-p.d2.getTungdo()));
        }
    }
}
