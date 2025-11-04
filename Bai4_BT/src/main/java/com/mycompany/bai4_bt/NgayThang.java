/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai4_bt;

import static java.lang.String.format;

/**
 *
 * @author tiend
 */
public class NgayThang {
    private long ngay, thang, nam;
    private int dinhdang;
    
    NgayThang(long ngay, long thang, long nam, int dinhdang){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.dinhdang= dinhdang;
    }
    
    public String dinhdang(){
        String s = "";
        if (this.dinhdang==1){
            s = String.format("%d-%d-%d", this.ngay, this.thang, this.nam);
        }
        if (this.dinhdang==2){
            s = String.format("%d.%d.%d", this.nam, this.thang, this.ngay);
        }
        if (this.dinhdang==3){
            s = String.format("%d-%d-%d", this.ngay, this.thang, this.nam);
        }
        return s;
    }

    @Override
    public String toString() {
        return dinhdang();
    }
    
    
}
