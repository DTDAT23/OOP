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
        
        DSPhanSo(PhanSo a){
            this.dsPhanSo.add(a);
        }
    }
}
