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
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongGio;
    
    public NhanVien() {
    }
    
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGio) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGio = tongGio;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;    }


    public String getDiaChi() {
        return diaChi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongGio(int tongGio) {
        this.tongGio = tongGio;
    }
    
    public double getTienLuong() {
        return tienLuong;
    }

    public int getTongGio() {
        return tongGio;
    }
    public void getThongTin(){
        System.out.println("Ten nhan vien: "+ten);
        System.out.println("\nTuoi nhan vien: "+tuoi);
        System.out.println("\nDia chi nhan vien: "+diaChi);
        System.out.println("\nTien luong nhan vien: "+tienLuong);
        System.out.println("\nTong so gio lam cua nhan vien: "+tinhThuong());
    }
    public double tinhThuong(){
        if(tongGio >= 100 && tongGio < 200)
            return tienLuong * 0.1;
        else if(tongGio >= 200)
            return tienLuong * 0.2;
        return 0;
    }
}