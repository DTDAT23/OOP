/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai4_bt;

/**
 *
 * @author tiend
 */
public class HoTen {
    private String HoLot, Ten;
    private int dinhdang;
    
    HoTen(String holot, String ten, int dinhdang){
        this.HoLot = holot;
        this.Ten = ten;
        this.dinhdang = dinhdang;
    }
    
    public String setDinhDang(){
        String s = "";
        
        if(this.dinhdang == 1){
            s = String.format("%s %s",this.HoLot.toUpperCase(), this.Ten.toUpperCase());
        }
        if(this.dinhdang == 2){
            s = String.format("%s %s",this.HoLot.toLowerCase(), this.Ten.toUpperCase());
        }
        
        return s;
    }

    @Override
    public String toString() {
        return setDinhDang();
    }
    
    
}
