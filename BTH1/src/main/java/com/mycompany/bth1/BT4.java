/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth1;

import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT4 {
    public static boolean KtraSNT(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(1.0*n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] BT4){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=in.nextInt();
        
        if(KtraSNT(n)) System.out.println(n+" la so nguyen to");
        else System.out.println(n+" khong phai la so nguyen to");
    }
}