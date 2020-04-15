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
public class ChuyenXe {
    String maSo;
    String hoTen;
    String soXe;
    double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSo, String hoTen, String soXe, double doanhThu) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    public void hienThiTT(){
        System.out.println("Ma so chuyen xe: "+maSo);
        System.out.println("Ho ten tai xe: "+hoTen);
        System.out.println("So xe: "+soXe);
        System.out.println("Doanh thu: "+doanhThu);
    }
}
