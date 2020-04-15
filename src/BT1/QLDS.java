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
public class QLDS implements IQLDS{
    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }

    /**
     *
     */
    QLDS() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for(int i=0; i<dsCaNhan.size(); i++){
            if(dsCaNhan.get(i).getHoTen().equals(ten))
                dsCaNhan.remove(i);
        }
        return 1;
    }

    @Override
    public void inDS() {
        for(int i=0; i<dsCaNhan.size(); i++){
             dsCaNhan.get(i).HienThiTT(); 
        }
          
    }
    
}
