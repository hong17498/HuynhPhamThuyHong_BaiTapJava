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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;
   
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        if(getDiem() < 5) return "Yeu";
        else if(getDiem() >=5 && getDiem() < 6.5) return "Trung Binh";
        else if(getDiem() >=6.5 && getDiem() < 7.5) return "Kha";
        else if(getDiem() < 9 && getDiem() >= 7.5) return "Gioi";
        return "Xuat Sac";
    }
    public void xuat(){
        System.out.println("Ho ten sinh vien: "+hoTen);
        System.out.println("\nNganh hoc cua sinh vien: "+nganh);
        System.out.println("\nDiem cua sinh vien: "+getDiem());
        System.out.println("\nHoc luc cua sinh vien: "+getHocLuc());    
    }
    
}
