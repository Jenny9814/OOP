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
public class QuanLiHoaDonTienDien {
    protected String maKH,hoTen,ngayHD;
    protected int soLuong;
    protected double donGia;
    
    Scanner sc = new Scanner(System.in);

    public QuanLiHoaDonTienDien() {
        maKH = "";
        hoTen = "";
        ngayHD = "";
        soLuong = 0;
        donGia = 0.0;
    }

    public QuanLiHoaDonTienDien(String maKH, String hoTen, String ngayHD, int soLuong, double donGia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayHD = ngayHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void nhapThongTinKH(){
        System.out.print("Nhập Mã khách hàng: ");
        maKH = sc.nextLine();
        System.out.print("Nhập Họ và tên khách hàng: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập Ngày ra hóa đơn: ");
        ngayHD = sc.nextLine();
        System.out.print("Nhập Số KW tiêu thụ : ");
        soLuong  = sc.nextInt();
        System.out.print("Nhập Đơn giá: ");
        donGia = sc.nextDouble();
    }

    @Override
    public String toString() {
        String st = "";
        st+= "Mã KH: " +maKH + "\t";
        st+= "Họ và tên KH: " +hoTen + "\t";
        st+= "Ngày ra hóa đơn: " +ngayHD + "\t";
        st+= "Số KW tiêu thụ: " +soLuong + "\t";
        st+= "Đơn giá: " +donGia + "\t";
        
        return st;
    }
    
}
