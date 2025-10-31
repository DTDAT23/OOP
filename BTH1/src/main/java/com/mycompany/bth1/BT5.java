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
public class BT5 {
    public static boolean isSNT(int n){
        if(n < 2) return false;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    
    public static void inPut(int a[], int n){
        Scanner cin = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = cin.nextInt();
        }
    }
    
    public static void outPut(int a[], int n){
        for(int i = 0; i<n;i++){
            System.out.println("a[" +i+" ] ="+a[i]);
        }
    }
    
    public static int tinhTong(int a[], int n){
        int tong=0;
        for(int i = 0; i< n;i++){
            if(isSNT(a[i])){
                tong += a[i];
            }
        }
        return tong;
    }
    
    public static int timKiem(int a[], int n, int x){
        for (int i = 0; i < n; i++) {
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] BT5){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Nhap mang: ");
        inPut(a, n);
        
        System.out.println("Xuat mang: ");
        outPut(a, n);
        
        System.out.println("Tong so nguyen to: " + tinhTong(a, n));
        
        System.out.println("Tim kiem gia tri 6 nam o vi tri: "+timKiem(a, n, 6));
    }
}
