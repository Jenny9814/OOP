/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class GiaoDichVang extends QuanLiGiaoDich {
    private String loaiVang;
    
    Scanner scanner = new Scanner(System.in);

    public GiaoDichVang() {
        super();
        loaiVang = "";
    }

    public GiaoDichVang(String loaiVang) {
        super();
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(String loaiVang, String maGD, String ngayGD, float donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    public void nhapTTGiaoDich(){
        super.nhapThongTinGiaoDich();
        System.out.print("Nhập loại vàng: ");
        loaiVang = scanner.nextLine();
    }
    public double thanhTien(){
        return this.soLuong * this.donGia;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{"+super.toString() + "loaiVang=" + loaiVang + '}' +"Thành tiền: " +thanhTien();
    }
    
    
}
