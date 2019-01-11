/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7;

import java.util.Comparator;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class sapXepTheoMSSV implements Comparator<SINHVIEN> {

    @Override
    public int compare(SINHVIEN t, SINHVIEN t1) {
        if(t.getMSSV() > t1.getMSSV()){
                        return 1;
                    }
        else {
                  if(t.getMSSV() == t1.getMSSV()){
                               return 0;
                           }
                           else return -1;
                    }
                }
    } 
