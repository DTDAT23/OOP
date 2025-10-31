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
public class BT6 {
    public static void xuatDathuc(int[] a, int n){
        System.out.print("f(x)=");
        for (int i = 0; i < n; i++) {
            if (i!=n-1) {
                System.out.printf("%d.x^%d + ", a[i], i);
            }
            else {
                System.out.printf("%d.x^%d", a[i], i);
            }
        }
    }
    
    public static void main(String[] BT6){
        Scanner cin = new Scanner(System.in);
    
        System.out.print("Nhap n: ");
        int n = cin.nextInt();
        
        System.out.print("Nhap x: ");
        int x = cin.nextInt();
        
        int a[] = new int[n+1];
        
        BT5.inPut(a, n+1);
        
        xuatDathuc(a, n+1);
        System.out.println();
        
        double f=a[0];
        
        for (int j = 1; j < n+1; j++) {
            f+=a[j]*Math.pow(x*1.0, j);
        }
        
        System.out.println("f("+x+")=" + f);
    }
}
