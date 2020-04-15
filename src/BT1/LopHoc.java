/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author FPT
 */
public class LopHoc {
    QLDS qldsHS = new QLDS();
    QLDS qldsGV = new QLDS();
    ArrayList<HocSinh> hocSinh = new ArrayList<>();
    ArrayList<GiaoVien> giaoVienGD = new ArrayList<>();
    GiaoVien giaoVienCN = new GiaoVien();
    
    public LopHoc(){
        
    }
    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    public int themGVGD(GiaoVien gv){
        qldsGV.them(gv);
        return 1;
    }
    public void inDSHS(){
        qldsHS.inDS();
    }
    public void inDSGVGD(){
        qldsGV.inDS();
    }
}
