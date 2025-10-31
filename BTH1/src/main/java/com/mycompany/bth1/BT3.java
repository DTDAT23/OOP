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
public class BT3 {
    public static void main(String[] BT3){
        Scanner in=new Scanner(System.in);
        
        System.out.print("Nhap thang: ");
        int m = in.nextInt();
        
        System.out.print("Nhap nam: ");
        int n = in.nextInt();
        
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang "+m+" co 31 ngay");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Thang "+ m + " co 30 ngay");
            case 2:
                if((n%400==0)||(n%4==0&&n%100!=0)){
                    System.out.println("Thang 2 co 29 ngay");
                }
                else{
                    System.out.println("Thang 2 co 28 ngay");
                }
        }
    }
}
