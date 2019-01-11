/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI6;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class HoaDonTheoNgay extends QuanLiHoaDonThuePhong{
    private double soNgayThue;
    Scanner scan = new Scanner(System.in);

    public HoaDonTheoNgay() {
        super();
        soNgayThue = 0.0;
    }

    public HoaDonTheoNgay(double soNgayThue) {
        super();
        this.soNgayThue = soNgayThue;
    }

    public double getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(double soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    
    public double thanhTien(){
        if(this.soNgayThue >=1 && this.soNgayThue <= 7){
            return this.soNgayThue * this.donGia;
        }
        else{
            return (this.soNgayThue - 7 ) * this.donGia * 0.2 + this.soNgayThue*this.donGia;
        }
    }
    public void nhapTTKhachHang(){
        super.nhapThongTinKhachHang();
        System.out.print("Nhập số ngày thuê: ");
        soNgayThue = scan.nextDouble();
    }

    @Override
    public String toString() {
        String st = "";
        st+= super.toString();
        st+= "Số ngày thuê: " +soNgayThue + "\t";
        st+= "Thành tiền: " +thanhTien() + "\t";
        return st;
    }
    
    
}
