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
public class BT1 {
    public static void main(String[] BT1){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten: ");
        System.out.print("Nhap ten: ");
        String n=scanner.nextLine();
        
        System.out.print("Nhap tuoi: ");
        int m = scanner.nextInt();
        
//        System.out.println("Xin chao "+n+", ban "+m+ " tuoi");

        System.out.printf("Xin chao %s, ban %d tuoi\n", n, m); //s:string, d:int - Stringformat
    }
}
