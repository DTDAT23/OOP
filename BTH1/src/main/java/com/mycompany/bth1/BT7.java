/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT7 {
    public static void main(String[] BT7){
        Scanner nhap = new Scanner(System.in);
        
        String Ho, tenLot, Ten;
        
        System.out.print("Nhap ho: ");
        Ho = nhap.nextLine();
        
        System.out.print("Nhap tenLot: ");
        tenLot = nhap.nextLine();
        
        System.out.print("Nhap Ten: ");
        Ten = nhap.nextLine();
        
        System.out.println("Xin chao, " + Ho + tenLot + Ten);
        
        String s = Ho+" " +" "+tenLot+" " + Ten;
        
        
        int dem =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                dem++;
            }
        }
        System.out.printf("So ky tu viet hoa la: %d\n", dem);
        
        char cHo= Character.toLowerCase(Ho.charAt(0));
        char cTlot = Character.toLowerCase(tenLot.charAt(0));
        
        String[] works = tenLot.split(" ");
        
        String gm = Ten.toLowerCase()+"." + cHo + cTlot +"@ou.edu.vn";
        System.out.println(gm);
        
        String gmup = Ten.toLowerCase()+"." + cHo + cTlot +"@gmail.com";
        System.out.println(gmup);
        
//        String s = works.subString(3);
    }
}
