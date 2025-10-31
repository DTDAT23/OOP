/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

import com.mycompany.bth2.BT4.PhanSo;
import java.util.ArrayList;

/**
 *
 * @author tiend
 */
public class BT5 {
    public class DSPhanSo{
        private ArrayList<PhanSo> dsPhanSo;
        
        DSPhanSo(){
            this.dsPhanSo = new ArrayList<>();
        }
        
        public void addPhanSo(PhanSo a){
            this.dsPhanSo.add(a);
        }
        
        public void removePhanSO(PhanSo b){
            this.dsPhanSo.remove(b);
        }
        
        public PhanSo tinhTongPS(){
            PhanSo p = new PhanSo();
            for(PhanSo a: dsPhanSo){
                p.congPS(a);
            }
            return p.rutgon();
        }
        
        public void sortDSPS(){
            dsPhanSo.sort((a,b)->a.soSanhPS(b));
        }

        public void hienThi() {
        if (dsPhanSo.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("Danh sách phân số:");
        for (PhanSo p : dsPhanSo) {
            System.out.print(p + "  ");
        }
        System.out.println();
    }
        
        
    }
}
