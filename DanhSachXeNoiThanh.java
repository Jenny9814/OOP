/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class DanhSachXeNoiThanh implements Serializable {
    ArrayList<ChuyenXeNoiThanh> listxenoi;

    public DanhSachXeNoiThanh() {
        listxenoi = new ArrayList<>();
    }
    // Thêm 1 xe nội thành vào trong list
    public boolean themMotXeNoiThanh(ChuyenXeNoiThanh xenoi){
        // Chọn mã chuyến làm khóa
        if(this.listxenoi.contains(xenoi)){
            return false;
        }
        else{
            this.listxenoi.add(xenoi);
            return true;
        }
    }
    // Overide lại phương thức equals trong ChuyenXeNoiThanh ở chỗ mã số chuyến vì đặt mã số chuyến là khóa chính

    @Override
    public String toString() {
        String st = "";
        for(int i = 0;i<this.listxenoi.size();i++){
            st+= this.listxenoi.get(i).toString() + "\n";
        }
        return st;
    }
    
    
}
