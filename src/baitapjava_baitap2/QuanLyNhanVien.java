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
public class QuanLyNhanVien implements IQuanLy{
    NhanVien[] NV = new NhanVien[20];
    int n = 0;

    @Override
    public void them(NhanVien nv) {
        NV[n] = new NhanVien();
        NV[n] = nv;
        n++;    
    }

    @Override
    public void inDS() {
        for(int i = 0; i < n; i++){
            System.out.println("Nhan vien thu "+i);
            NV[i].getThongTin();
        }
    }

    void getThongTin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
