/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_baitap3;

/**
 *
 * @author FPT
 */
public class Main {
    public static void main(String[] args){
        SinhVienPoly p1 = new SinhVienIT(7, 8, 9, "Cao Van Mau", "Co khi");
        System.out.println("Thong tin sinh vien IT: ");
        p1.xuat();
        SinhVienPoly p2 = new SinhVienIT(7, 9, 9, "To Thi Lan", "Ke toan");
        System.out.println("Thong tin sinh vien Biz: ");
        p2.xuat();
    }
}
