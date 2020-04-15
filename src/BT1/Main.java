/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author FPT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc lh = new LopHoc();
        HocSinh hs1 = new HocSinh("2", "Hat", "Le Van Tam", 8, "Binh Dinh", "01288455");
        HocSinh hs2 = new HocSinh("5", "Ve", "Nguyen Thi Dau", 11, "Nha Trang", "098466477");
        GiaoVien gv1 = new GiaoVien("Toan", "Toan Ly Hoa", "Cao Van Tai", 3, "Binh Dinh", "094747477");
        GiaoVien gv2 = new GiaoVien("Ly", "Toan Ly Hoa", "Cao Van Ba", 5, "Binh Dinh", "084654477");
       
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);
        
        lh.qldsHS.xoa("Le Van Tam");
        lh.qldsGV.xoa("Cao Van Tai");
        lh.inDSHS();
        lh.inDSGVGD();
    }
    
}
