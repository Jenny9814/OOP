/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class QuanLiSach {
    protected String maSach;
    protected String ngayNhap;
    protected float donGia;
    protected int soLuong;
    protected String NXB;
    
    Scanner sc = new Scanner(System.in);

    public QuanLiSach() {
        maSach = "";
        ngayNhap = "";
        donGia = 0.0f;
        soLuong = 0;
        NXB = "";
    }

    public QuanLiSach(String maSach, String ngayNhap, float donGia, int soLuong, String NXB) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.NXB = NXB;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }
    
    public void nhapThongTinSach(){
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("Nhập ngày nhập(dd/MM/yyyy) : ");
        ngayNhap = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextFloat();
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
        System.out.println("Nhập nhà xuất bản: ");
        NXB = sc.next();
    }

    @Override
    public String toString() {
        return "QuanLiSach{" + "maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong + ", NXB=" + NXB + '}';
    }
    
    
    
    
}
