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
public class XeNoiThanh extends ChuyenXe{
    int soTuyen;
    int soKm;

    public XeNoiThanh() {
    }

    public XeNoiThanh(int soTuyen, int soKm, String maSo, String hoTen, String soXe, double doanhThu) {
        super(maSo, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("So tuyen: "+soTuyen);
        System.out.println("So km di duoc: "+soKm);
    }
    
    
}
