/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth1;

/**
 *
 * @author tiend
 */
public class CauThu {
    private String hoten;
    private String vitri;
    private long soao;
    private String clb;
    
    CauThu(String hoten, String vitri, long soao, String clb) {
        this.hoten = hoten;
        this.vitri = vitri;
        this.soao = soao;
        this.clb = clb;
    }

    @Override
    public String toString() {
        return this.hoten + ", " + this.vitri + ", " + this.soao + ", " + this.clb +"\n";
    }
}
