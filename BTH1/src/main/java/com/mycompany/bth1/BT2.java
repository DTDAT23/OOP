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
public class BT2 {
    public static void main(String[] BT2){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao ban kinh hinh tron: ");
        double r=scanner.nextDouble();
        
        double s= Math.pow(r, 2)*Math.PI;
        double c=2*r*Math.PI;
        
        System.out.println("Dien tich hinh tron ban kinh "+r+" la: "+s);
        System.out.println("Chu vi hinh tron ban kinh "+r+" la: "+c);
    }
}
