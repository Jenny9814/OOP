/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI5;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class KhachHangNuocNgoai extends QuanLiHoaDonTienDien {
    private String quocTich;
    Scanner scan = new Scanner(System.in);

    public KhachHangNuocNgoai() {
        super();
        quocTich = "";
    }

    public KhachHangNuocNgoai(String quocTich) {
        super();
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public double thanhTien(){
        return this.soLuong * this.donGia;
    }
    public void nhapTTKhachHang(){
        super.nhapThongTinKH();
        System.out.print("Nhập Quốc tịch: ");
        quocTich = scan.nextLine();
    }

    @Override
    public String toString() {
        String st = "";
        st+= super.toString();
        st+="Quốc tịch: " +quocTich + "\t";
        st+="Thành tiền: " +thanhTien() + "\t";
        return st;
    }
    
    
}
