/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_baitap4;

import java.util.ArrayList;

/**
 *
 * @author FPT
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    
    public void themChuyenXe(ChuyenXe cx){
        dsChuyenXe.add(cx);
    }
    
    public void inDS(){
        for(int i=0; i<dsChuyenXe.size(); i++)
            dsChuyenXe.get(i).hienThiTT();
    }
    public double doanhThuNoiThanh(ChuyenXe XeNoiThanh){
        double doanhThu = 0;
        for(int i=0; i<dsChuyenXe.size(); i++){
            if(dsChuyenXe.get(i) == XeNoiThanh)
                doanhThu += dsChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    public double doanhThuNgoaiThanh(ChuyenXe XeNgoaiThanh){
        double doanhThu = 0;
        for(int i=0; i<dsChuyenXe.size(); i++){
            if(dsChuyenXe.get(i) == XeNgoaiThanh)
                doanhThu += dsChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    public double tongDoanhThu(){
        double doanhThu = 0;
        for(int i=0; i<dsChuyenXe.size(); i++){
            doanhThu = dsChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }

    String doanhThuNoiThanh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String doanhThuNgoaiThanh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
