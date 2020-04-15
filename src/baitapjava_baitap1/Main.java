/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_baitap1;

/**
 *
 * @author FPT
 */
public class Main {
    public static void main(String[] args){
        NhanVien nv1 = new NhanVien("Hoa", 20, "Binh Thuan", 50, 100);
        NhanVien nv2 = new NhanVien("Hong", 20, "Binh Dinh", 100, 300);
        System.out.println("Thong tin nhan vien thu nhat: ");
        nv1.getThongTin();
        System.out.println("Thong tin nhan vien thu hai: ");
        nv2.getThongTin();
    }
}
