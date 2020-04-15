/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_baitap4;

/**
 *
 * @author FPT
 */
public class Main {
    public static void main(String[] args) {
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        XeNoiThanh  nt = new XeNoiThanh(12, 40, "001","Nguyen Thi Be" , "GH67", 100000);
        XeNgoaiThanh xnt = new XeNgoaiThanh("Vinh Long", 60, "009", "Tran Van Tai", "K87", 500000);
        
        ql.themChuyenXe(nt);
        ql.themChuyenXe(xnt);
        
        ql.inDS();
        
        System.out.println("Tong doanh thu noi thanh: "+ql.doanhThuNoiThanh());
        System.out.println("Tong doanh thu ngoai thanh: "+ql.doanhThuNgoaiThanh());
    }
}
