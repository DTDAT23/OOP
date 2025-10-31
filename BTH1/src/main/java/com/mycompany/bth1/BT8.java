/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT8 {
    public static void main(String[] BT8){
        Random generator = new Random(19999999);
        int n = generator.nextInt((100 - 0) + 1) + 0;
        
//        System.out.println("So ngau nhien la: "+n);
        Scanner cin = new Scanner(System.in);
        int x;
        do {
            System.out.print("So ban doan: ");
            x = cin.nextInt();
            if(x==n) {
                System.out.println("Ban da doan dung");
                return;
            }
            if (x>n) {
                System.out.println("So ban doan lon hon");
            }
            
            else {
                System.out.println("So ban doan nho hon");
            }
        } while (x!=n);
    }
}
