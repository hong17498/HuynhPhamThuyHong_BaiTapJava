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
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSales;

    public SinhVienBiz(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
        return (2*diemMarketing + diemSales)/3;
    }
}
