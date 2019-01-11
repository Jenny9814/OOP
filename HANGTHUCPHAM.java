/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class HANGTHUCPHAM {
    private String mahang;
    String tenhang;
    int dongia;
    String ngaysx;
    String ngayhh;

    public HANGTHUCPHAM(String mahang) {
        this.mahang = mahang;
    }

    public HANGTHUCPHAM(String mahang, String tenhang, int dongia, String ngaysx, String ngayhh) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.ngaysx = ngaysx;
        this.ngayhh = ngayhh;
    }

    public String getMahang() {
        return mahang;
       
    }

    public void setMahang(String mahang) {
        if(this.mahang != null ){
           this.mahang = mahang;
        }
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        if(this.tenhang != null) {
            this.tenhang = tenhang;
        }
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        if(this.dongia>0){
            this.dongia = dongia;
        }
    }

    public String getNgaysx() {
        return ngaysx;
    }

    public void setNgaysx(String ngaysx) {
        if(this.ngaysx != null) {
            this.ngaysx = ngaysx;
        }
    }

    public String getNgayhh() {
        return ngayhh;
    }

    public void setNgayhh(String ngayhh) {
        if(this.ngayhh != null){
            this.ngayhh = ngayhh;
        }
    }
    // Hỏi thầy =)) 
    public void kiemTraHetHan() throws ParseException{
       Date d1 = new Date();
       SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy");
       Date date = d2.parse(ngayhh);
       int i = d1.compareTo(date);
       if(i>=0) {
           System.out.println("Hết hạn");
       }
       else {
           System.out.println("Còn hạn");
       }
        
    }
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String st = "";
        st+= "\n Mã Hàng : " + mahang;
        st+= "\n Tên Hàng : " + tenhang;
        st+= "\n Đơn giá : " + nf.format(dongia);
        st+= "\n Ngày sản xuất : " + ngaysx;
        st+= "\n Ngày hết hạn : " + ngayhh;
        
        return st;
        
    }
    
}
