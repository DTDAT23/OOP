/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tiend
 */
public class BT10 {
    public static void main(String[] BT10) throws FileNotFoundException{
        try{
            File fin = new File("numbers.txt");
        Scanner in = new Scanner(fin);
        
        String line = in.nextLine();
        String[] parks= line.split(" ");
        int tong = 0, min = Integer.MIN_VALUE;
        for (String n : parks) {
            int num = Integer.parseInt(n);
            tong += num;
            
            if(num > min) min = num;
        }
        
        System.out.printf("Trung binh la: %d\n", tong/10);
        
        System.out.printf("MAX la: %d\n", min);
        }
        catch(FileNotFoundException ex){
            System.out.println("Loi khong the mo file");
        }
    }
}
