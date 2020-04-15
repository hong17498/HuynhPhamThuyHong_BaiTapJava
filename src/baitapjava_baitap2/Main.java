/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_baitap2;
import baitapjava_baitap1.NhanVien;
/**
 *
 * @author FPT
 */
public class Main {
    public static void main(String[] args){
        QuanLyNhanVien DS = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Nam", 20, "Gia Lai", 100, 250);
        NhanVien nv2 = new NhanVien("Lan", 30, "Ca Mau", 60, 150);
        NhanVien nv3 = new NhanVien("Mai", 35, "Lam Dong", 55.2, 110);
        NhanVien nv4 = new NhanVien("Cuc", 25, "Ninh Thuan", 77.5, 330);
        NhanVien nv5 = new NhanVien("Thang", 22, "Binh Thuan", 80, 450);
        
        DS.them(nv1);
        DS.them(nv2);
        DS.them(nv3);
        DS.them(nv4);
        DS.them(nv5);
        
        for(int i = 0; i < 5 ; i++){
            System.out.println("Nhan vien thu: "+i);
            DS.NV[i].getThongTin();
        }
    }
}
