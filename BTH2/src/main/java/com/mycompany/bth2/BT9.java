/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author tiend
 */
public class BT9 {
    public static class CauHoi{
        private String NoiDung;
        private String LuaChon[] = new String[4];
        private String DapAn;
        
        CauHoi(String nd,String luachon[], String dapan){
            this.NoiDung=nd;
            this.LuaChon = luachon;
            this.DapAn = dapan;
        }
        
        public String getDapAn(){ return this.DapAn; }

        @Override
        public String toString() {
            String s = this.NoiDung;
            for (int i = 0; i < this.LuaChon.length; i++) {
                s+="\n"+LuaChon[i];
            }
            //s+=this.DapAn;
            return s;
        }
        
        
    }
    
    public static class BoCauHoi{
       private ArrayList<CauHoi> dsch = new ArrayList<>();
        
       public void docBoCauHoi(int x){
            try{
                File f = new File("D:\\CauHoi\\cau"+x+".txt");
                Scanner sc = new Scanner(f);
                
                while(sc.hasNextLine()){
                    String line = sc.nextLine().trim();
                    String luaChon[] = new String[4];
                    for (int i = 0; i < 4; i++) {
                        luaChon[i] = sc.nextLine().trim();
                    }
                    String da = sc.nextLine().trim();
                    
                    dsch.add(new CauHoi(line,luaChon,da));
                }
                sc.close();
            }
            catch(FileNotFoundException ex){
                System.out.println("Khong doc duoc file\n");
            }
        }
        
       public void setCauHoi(CauHoi qs){
//           {
//               stt++;
//           }
           int i = dsch.size() +1;
           try{
               FileWriter fo = new FileWriter("D:\\CauHoi\\cau"+i+".txt",true);
               PrintWriter so = new PrintWriter(fo);
               
               so.println(qs);
               dsch.add(qs);
               so.close();
           }
           catch(IOException ex){
               System.out.println("Khong the ghi file\n");
           }
       }
       
       public void LuyenThi(){
           Scanner sc = new Scanner(System.in);
           int soCH = 0;//So luong cau hoi
           String cautrl;
           for (int i = 0; i < 5; i++) {
               System.out.println("\n"); //Tao khoang trang cho man hinh trong bot
           }
           
           //Nhap so luong
           do {
               System.out.printf("Nhap so luong cau hoi: (0-%d)",dsch.size());
               soCH = sc.nextInt();
               sc.nextLine();
               
               if(soCH<=0){
                   System.out.println("So luong khong the bang 0, hay nhap lai!");
               }
               if(soCH>=dsch.size()){
                   System.out.println("So luong dang lon hon, hay nhap lai!");
               }
           } while (soCH<=0||soCH>=dsch.size());
           
           int i = 0;
           
           Set<Integer> dsDaHoi = new HashSet<>();
           while(i < soCH){
               int random =(int) (Math.random() * soCH);
               if(dsDaHoi.contains(random)) continue;
               dsDaHoi.add(random);
                   do {
                       System.out.println(dsch.get(random));
                       System.out.print("Nhap cau tra loi: ");
                       cautrl = sc.nextLine();
                       if(!dsch.get(random).getDapAn().equalsIgnoreCase(cautrl)){
                           System.out.println("Ban da tra loi sai!");
                       }
                       else{
                           System.out.println("Ban da dung!");
                       }
                   } while (!dsch.get(random).getDapAn().equalsIgnoreCase(cautrl));
               i++;
            }
           System.out.println("Ban da lam xong!");
       }
    }
}
