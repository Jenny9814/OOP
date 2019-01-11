/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI8;

import java.util.Comparator;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class sapXepTheoGiaThanh implements Comparator<CD> {

    @Override
    public int compare(CD t, CD t1) {
        if(t.getGia() < t1.getGia()){
                        return 1;
                    }
        else {
                  if(t.getGia() == t1.getGia()){
                               return 0;
                           }
                           else return -1;
                    }
                }
    }
