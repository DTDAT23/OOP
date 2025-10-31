/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

import static java.lang.Math.sqrt;

/**
 *
 * @author tiend
 */
public class BT2 {
    public static class Diem{
        private double hoanhdo;
        private double tungdo;
        
        public Diem(double a, double b){
            this.hoanhdo = a;
            this.tungdo = b;
        }

        public double getHoanhdo() {
            return hoanhdo;
        }

        public void setHoanhdo(double hoanhdo) {
            this.hoanhdo = hoanhdo;
        }

        public double getTungdo() {
            return tungdo;
        }

        public void setTungdo(double tungdo) {
            this.tungdo = tungdo;
        }

        @Override
        public String toString() {
            return "( "+this.hoanhdo+", "+this.tungdo+" )";
        }
        
        public double tinhKhoangCach(Diem p){
            return Math.sqrt(Math.pow(this.hoanhdo-p.hoanhdo,2)+Math.pow(this.tungdo+p.tungdo, 2));
        }
    }
    
//    public static void main(String[] args) {
//        Diem d = new Diem(1.5, 1.1);
//    }
}
