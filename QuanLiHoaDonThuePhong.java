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
public class QuanLiHoaDonThuePhong {
    protected String maHD, ngayHD, tenKH, maP;
    protected double donGia;
    
    Scanner sc = new Scanner(System.in);

    public QuanLiHoaDonThuePhong() {
        maHD = "";
        ngayHD = "";
        tenKH = "";
        maP = "";
        donGia = 0.0;
    }

    public QuanLiHoaDonThuePhong(String maHD, String ngayHD, String tenKH, String maP, double donGia) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKH = tenKH;
        this.maP = maP;
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void nhapThongTinKhachHang(){
        System.out.print("Nhập Mã hóa đơn: ");
        maHD = sc.nextLine();
        System.out.print("Nhập Ngày hóa đơn: ");
        ngayHD = sc.nextLine();
        System.out.print("Nhập Tên khách hàng: ");
        tenKH = sc.nextLine();
        System.out.print("Nhập Mã phòng: ");
        maP = sc.nextLine();
        System.out.print("Nhập Đơn giá: ");
        donGia = sc.nextDouble();
    }

    @Override
    public String toString() {
        String st = "";
        st+= "Mã hóa đơn: " +maHD + "\t";
        st+= "Ngày hóa đơn: "+ngayHD + "\t";
        st+= "Tên khách hàng: " +tenKH + "\t";
        st+= "Mã phòng: "  +maP + "\t";
        st+= "Đơn giá: " +donGia + "\t";
        return st;
    }
    
    
}
